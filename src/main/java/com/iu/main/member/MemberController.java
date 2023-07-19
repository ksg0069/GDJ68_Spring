package com.iu.main.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member/*")
public class MemberController {
	
	@RequestMapping(value = "/join")
	public String getJoin() throws Exception{
		System.out.println("join");
		
		return "member/join";
	}
	
	@RequestMapping(value = "/login")
	public String getLogin() throws Exception{
		System.out.println("login");
		
		return "member/login";
	}
	
	@RequestMapping(value = "/mypage")
	public String getMypage() throws Exception{
		System.out.println("mypage");
		
		return "member/mypage";
	}
	
	

}
