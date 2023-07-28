package com.iu.main.util;

import java.io.File;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileManger {
	
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
