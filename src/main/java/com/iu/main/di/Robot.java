package com.iu.main.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component // -> new Robot()
public class Robot {


	private String name;
	
	@Autowired
	private Head head; // 로봇은 헤드를 가지고 있다 로봇은 헤드에 의존적이다
	
	@Autowired
	private Arm leftArm;
	
	@Autowired
	@Qualifier("arm2")
	private Arm arm;
	
	

	
	


	public Arm getLeftArm() {
		return leftArm;
	}
	public void setLeftArm(Arm leftArm) {
		this.leftArm = leftArm;
	}
	public Head getHead() {
		return head;
	}
	public void setHead(Head head) {
		this.head = head;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	
}
