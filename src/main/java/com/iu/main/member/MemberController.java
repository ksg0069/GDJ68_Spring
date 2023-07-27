package com.iu.main.member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/member/*")
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	
	//login form 이동
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String getLogin() throws Exception{
		
		return "member/login";
	}
	
	//db
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String getLogin(MemberDTO memberDTO, HttpSession session ) throws Exception{ //선언한 dto setter의 이름과 넘어온 파라미터의 이름이 같아야함, 
		memberDTO = memberService.getLogin(memberDTO);
		
		if(memberDTO != null) {
		session.setAttribute("member", memberDTO);
	
		}
		
		return "redirect:../";
	}
	
	//logout
	@RequestMapping(value = "logout", method = RequestMethod.GET)
	public String getLogout(HttpSession session)throws Exception{
		session.invalidate();
		return "redirect:../";
	}
	
	@RequestMapping(value = "mypage", method = RequestMethod.GET)
	public String getMypage() throws Exception{
		//session에서 꺼낼수 있기떄문에 dto 어트리뷰트 보낼 필요x
		return "member/mypage";
	}
 	
	//update
	@RequestMapping(value = "memberUpdate", method = RequestMethod.GET)
	public void setMemberUpdate()throws Exception{
		
	}
	
	@RequestMapping(value = "memberUpdate", method = RequestMethod.POST)
	public String setMemberUpdate(MemberDTO memberDTO, HttpSession session)throws Exception{
		
		MemberDTO sessionMember = (MemberDTO)session.getAttribute("member"); // setAttribute의값이  object 타입이므로 형변환 
		memberDTO.setId(sessionMember.getId());
		int result = memberService.setMemberUpdate(memberDTO); //db만 업데이트됨 
		
		if(result>0) {
			session.setAttribute("member", memberDTO);
		}
		
		return "redirect:./mypage";
	}
	
	//회원가입
	@RequestMapping(value = "join", method = RequestMethod.POST)
	public String getJoin(MemberDTO memberDTO, MultipartFile pic, HttpSession session) throws Exception{
		int result = memberService.setJoin(memberDTO, pic,session);
		System.out.println(pic.getName());
		System.out.println(pic.getOriginalFilename());
		System.out.println(pic.getSize());
		
		
		return "redirect:../";
	}
	
	@RequestMapping(value = "join", method = RequestMethod.GET)
	public String getJoin() throws Exception{
		
		
		return "member/join";
	}
	

	

	
	

}
