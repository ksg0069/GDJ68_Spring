package com.iu.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FrontController {
	
	//home
	// /주소가 왔을 때 실행, index.jsp
	
	@RequestMapping(value = "/")
	public String home() throws Exception {
		
		return "index";
		
	}
	//BankBookController
	//MemberController, get
	//주소 .do 삭제

}
