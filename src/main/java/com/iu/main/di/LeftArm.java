package com.iu.main.di;

import org.springframework.stereotype.Component;

@Component // 클래스명의 첫글자를 소문자로 바꾼것이 이름으로 지정된다
public class LeftArm implements Arm{

	@Override // 어노테이션
	public void punch() {
		
		System.out.println("왼쪽펀치");
	}
	
	

}
