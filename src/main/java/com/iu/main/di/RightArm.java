package com.iu.main.di;

import org.springframework.stereotype.Component;

@Component("arm2") // rightArm의 bean의 이름이 바뀜
public class RightArm implements Arm {

	@Override
	public void punch() {
		System.out.println("오른쪽 펀치");
	}

}
