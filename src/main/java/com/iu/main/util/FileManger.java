package com.iu.main.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.view.AbstractView;

import com.iu.main.file.FileDTO;

@Component
public class FileManger extends AbstractView{
	
	//fileDown
	@Override
	protected void renderMergedOutputModel(Map<String, Object> model, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		System.out.println("fileManager");
		String b = (String)model.get("board");
		FileDTO fileDTO = (FileDTO)model.get("file");
		
		//1. 파일 경로준비
		String path = "/resources/upload/"+b;
		path = request.getSession().getServletContext().getRealPath(path);
		
		//2. 파일객체 생성
		File file = new File(path, fileDTO.getFileName());
		
		//3. 총 파일의 크기
		response.setContentLength((int)file.length());
		
		//4. 다운시 파일이름을 지정 및 인코딩 설정
		String downName = fileDTO.getOriginalName();
		downName = URLEncoder.encode(downName, "UTF-8");
		
		//5.header 정보 설정
		response.setHeader("Content-Disposition", "attachment;fileName=\""+downName+"\"");
		response.setHeader("Content-Transfer-Encoding", "binary");
		
		//6. 전송
		FileInputStream is = new FileInputStream(file); //서버로 읽어들여라
		OutputStream os = response.getOutputStream(); //
		
		FileCopyUtils.copy(is, os);
		
		//7. 자원해제 연결된 역순으로 해제 해야함
		os.close();
		is.close();
		
		
	}
	
	
	//filedelete
	public Boolean fileDelete(FileDTO fileDTO, String path,HttpSession session )throws Exception{
		
		//1. 삭제할 폴더의 실제 경로
		
		path = session.getServletContext().getRealPath(path);
		
		File file = new File(path, fileDTO.getFileName());
		return file.delete();
		
	}
	

	//fileSave
	public String fileSave(String path, MultipartFile multipartFile, HttpSession session) throws Exception {
		
		//2. 실제 경로 알아오기
			//jsp : application
			//java : servletContext
			String realPath = session.getServletContext().getRealPath(path);
		
			System.out.println(realPath); // realPath : 운영체제가 생각하는 실제 경로
			
			File file = new File(realPath);
			
			if(!file.exists()) {
				
				file.mkdirs();
			}
				
			//3. 어떤이름으로 저장? 
			//3.1 시간을 이용
//				Calendar ca = Calendar.getInstance();  //시간을 이용해서 파일명 만듦 중복하지 않기 위해서 
//				long result = ca.getTimeInMillis();
//				file = new File(file, result+"_"+multipartFile.getOriginalFilename()); // upload한 파일명, 확장자를 가져오기 위해 getoriginalfilename 사용
			
			//3.2 API 사용
			String uId = UUID.randomUUID().toString();
			System.out.println(uId);
			
			uId = uId+"_"+multipartFile.getOriginalFilename();
			file = new File(file, uId); // (경로,어떤이름으로)
			
			
			//4. 파일을 저장
			//A. Spring에서 제공하는 API FileCopyUtils copy메서드
//				FileCopyUtils.copy(multipartFile.getBytes(), file); //파일의 2진데이터를 
			
			//B. MultipartFile의 transferTo 메서드
			multipartFile.transferTo(file); 
	
			return uId;
	
	}

}
