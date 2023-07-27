package com.iu.main.di;

public class Robot {

	private String name;
	private Arm arm;  //클래스 멤버변수 로봇이 팔을 가지고 있다
	
	private static Robot robot;
	
	//Singleton
	private Robot() {
		//this.arm = new Arm();
		//결합도 높다(강하다) robot 소멸되면 arm 소멸
	}
	
	public static Robot getInstance() {
		if(robot==null) {
			Robot.robot = new Robot();
		}
		return Robot.robot;
	}
	
//	public Robot(Arm arm) {
//		this.arm = arm;
//		//결합도가 낮다(약하다)
//		//robot 소멸되도 arm 소멸 x
//		
//	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Arm getArm() {
		return arm;
	}
	public void setArm(Arm arm) {
		this.arm = arm;
	}

	
}
