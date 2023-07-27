package com.iu.main.member;

import java.io.File;
import java.util.Calendar;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;

@Service
public class MemberService {
		
	@Autowired //만들어진 객체 주입
	private MemberDAO memberDAO;
	

	
	//회원가입
	public int setJoin(MemberDTO memberDTO, MultipartFile multipartFile ,HttpSession session)throws Exception{
		//파일의 정보를 이용해서 HDD에 파일을 저장
		//1. 어디에 저장?
		String path = "/resources/upload/member/";
		
		//2. 실제 경로 알아오기
		//jsp : application
		//java : servletContext
		String realPath = session.getServletContext().getRealPath(path);
	
		System.out.println(realPath); // realPath : 운영체제가 생각하는 실제 경로
		
		File file = new File(realPath);
		
		if(!file.exists()) {
			
			file.mkdirs();

		Calendar ca = Calendar.getInstance();  //시간을 이용해서 파일명 만듦 중복하지 않기 위해서 
		long result = ca.getTimeInMillis();
		file = new File(file, result+"_"+multipartFile.getOriginalFilename()); // upload한 파일명
		
		//4. 파일을 저장
		//A. Spring에서 제공하는 API FileCopyUtils copy메서드
//		FileCopyUtils.copy(multipartFile.getBytes(), file); //파일의 2진데이터를 
		
		//B. MultipartFile의 transferTo 메서드
		multipartFile.transferTo(file); 
		
		return 0; //memberDAO.setJoin(memberDTO);
		}
	}
	
	
	public MemberDTO getLogin(MemberDTO memberDTO)throws Exception{
		
		return memberDAO.getLogin(memberDTO);
	}
	
	public int setMemberUpdate(MemberDTO memberDTO)throws Exception{
		
		return memberDAO.setMemberUpdate(memberDTO);
	}
}
