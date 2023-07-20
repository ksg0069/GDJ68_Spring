package com.iu.main.bankBook;

import java.lang.reflect.Method;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/bankbook/*")
public class BankBookController {
	
	@Autowired // 의존성있는 멤버변수 주입 
	private BankBookService bankBookService;
	
	@RequestMapping(value="list", method = RequestMethod.GET)
	public String getList() throws Exception{
		System.out.println("list");
		bankBookService.service();
		
		
		
		return "bankbook/list"; 
		
	}
	
	@RequestMapping(value="detail", method = RequestMethod.GET)
	public ModelAndView getDtail() throws Exception{
		System.out.println("detail");
		//Model(request와 비슷한 역할) + View(jsp의 경로), 
		ModelAndView mv = new ModelAndView();
		mv.addObject("num", 123); 
		
		mv.setViewName("bankbook/detail");
		
		return mv;
		
	}
	
	@RequestMapping(value="add", method = RequestMethod.GET)
	public ModelAndView getAdd(ModelAndView mv ) throws Exception{
		System.out.println("Add");
		int num=333;
		mv.addObject("num", num);
		mv.setViewName("bankbook/add");
		return mv;
		//return "bankbook/add";
		//view의 경로명이 없으면 URL주소가 경로명으로 대체 됨
	
	}
	@RequestMapping(value="add", method = RequestMethod.POST)  // post로 받을때는 redirect로 list로 다시 	가야함 리턴값: "redirect: 가야 할위치"
	public String getAdd(Model model,BankBookDTO bankBookDTO ) throws Exception{//파라미터 이름하고 해당 setter의 이름이랑 같아야함
		System.out.println("Add");
		int num=111;
		
		System.out.println(bankBookDTO.getBookName());
		System.out.println(bankBookDTO.getBookRate());
		System.out.println(bankBookDTO.getBookSale());
		
		for(int i=0; i<bankBookDTO.getSports().length; i++) {
			System.out.println(bankBookDTO.getSports()[i]);
			
		}
	
		
//		BankBookDTO bankBookDTO = new BankBookDTO(); // String bookName,Integer bookSale,Double bookRate, @RequestParam(name="bookRate", defaultValue = "1.0")Double book 매개변수를 똑같은 이름으로
//		System.out.println(bookName);
//		System.out.println(bookSale);
//		System.out.println(bookRate);
//		System.out.println("============");
//		bankBookDTO.setBookName(request.getParameter("bookName"));  // 내장객체 request 선언
//		bankBookDTO.setBookSale(Integer.parseInt(request.getParameter("bookSale")));
//		
//		System.out.println(request.getParameter("bookName"));
//		System.out.println(request.getParameter("bookSale"));
//		
//		String[] sports = request.getParameterValues("sports");
//		for(int i=0; i<sports.length; i++) {
//			System.out.println(sports[i]);
//			
//		}
		model.addAttribute("num", num);
		
		return "redirect:./list";
		
	}
	
	@RequestMapping(value="update", method = RequestMethod.GET)
	public String getUpdate() throws Exception{
		System.out.println("update");
		
		return "bankbook/update";
		
	}
	
	
	
	

}
