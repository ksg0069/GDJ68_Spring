package com.iu.main.errors;

import org.apache.ibatis.javassist.NotFoundException;
import org.springframework.beans.TypeMismatchException;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;

@RestControllerAdvice //예외처리 controller 
public class ErrorController {
	//app 내에서 발생한 모든 exception을 처리하는 controller 
	
	@ExceptionHandler(NoHandlerFoundException.class)
	public String frontError()throws Exception{
		
		return "errors/front_error";
	}
	
	@ExceptionHandler(NullPointerException.class)
	public String error1(){
		
		System.out.println("Nullpointer Exception 발생");
		return "errors/front_error";
	}
	
	@ExceptionHandler(TypeMismatchException.class)
	public void error2(){
		
	}
	
	@ExceptionHandler(Exception.class)
	public String error3(Exception exception){
		
		System.out.println(exception.getMessage());
		return "errors/front_error";
		
	}
	
	
	

}
