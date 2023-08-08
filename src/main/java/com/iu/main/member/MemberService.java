package com.iu.main.member;

import java.io.File;
import java.util.Calendar;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;

import com.iu.main.util.FileManger;

@Service
public class MemberService {
		
	@Autowired //만들어진 객체 주입
	private MemberDAO memberDAO;
	
	@Autowired
	private FileManger fileManger;
	

	//id검증
	public MemberDTO getId(MemberDTO memberDTO)throws Exception{
		return memberDAO.getId(memberDTO);
	}
	
	//회원가입
	public int setJoin(MemberDTO memberDTO,MultipartFile multipartFile ,HttpSession session)throws Exception{
		//파일의 정보를 이용해서 HDD에 파일을 저장
		//1. 어디에 저장?
		String path = "/resources/upload/member/";
		
		int result = memberDAO.setJoin(memberDTO);
		if(!multipartFile.isEmpty()) {
		
			String fileName =fileManger.fileSave(path, multipartFile, session);
			
			MemberFileDTO memberFileDTO = new MemberFileDTO();
			memberFileDTO.setId(memberDTO.getId());
			memberFileDTO.setOriginalName(multipartFile.getOriginalFilename());
			memberFileDTO.setFileName(fileName);
			result= memberDAO.setFileJoin(memberFileDTO);
		
		}
	
		
		
		return result;
	}
	
	
	//로그인
	public MemberDTO getLogin(MemberDTO memberDTO)throws Exception{
		
		return memberDAO.getLogin(memberDTO);
	}
	
	public int setMemberUpdate(MemberDTO memberDTO)throws Exception{
		
		return memberDAO.setMemberUpdate(memberDTO);
	}
}
