package com.iu.main.bankBook;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/bankbook/*")
public class BankBookController {
	
	@Autowired // 의존성있는 멤버변수 주입 
	private BankBookService bankBookService;
	
	@RequestMapping(value="/list", method = RequestMethod.GET)
	public String getList() throws Exception{
		System.out.println("list");
		bankBookService.service();
		
		return "bankbook/list";
		
	}
	
	@RequestMapping(value="/detail")
	public String getDtail() throws Exception{
		System.out.println("detail");
		
		return "bankbook/detail";
		
	}
	
	@RequestMapping(value="/add")
	public String getAdd() throws Exception{
		System.out.println("Add");
		
		return "bankbook/add";
		
	}
	
	@RequestMapping(value="/update")
	public String getUpdate() throws Exception{
		System.out.println("Add");
		
		return "bankbook/update";
		
	}
	
	

}
