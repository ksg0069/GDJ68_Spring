package com.iu.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.iu.main.di.Robot;

@Controller
public class FrontController {
	
	@Autowired   //멤버변수
	private Robot robot;
	
	
	//home
	// /주소가 왔을 때 실행, index.jsp
	
	public Robot getRobot() {
		return robot;
	}
	
//	@Autowired //생성자
//	public FrontController() {
//		// TODO Auto-generated constructor stub
//	}
//	
//	@Autowired // setter
//	public FrontController(Robot robot) {
//		this.robot=robot;
//		
//	}
//	
//	@Autowired
//	public void setRobot(Robot robot) {
//		this.robot = robot;
//	}


	@RequestMapping(value = "/")
	public String home() throws Exception {
		
		robot.getHead().name();
		robot.getLeftArm().punch();
		return "index";
		
	}
	//BankBookController
	//MemberController, get
	//주소 .do 삭제

}
