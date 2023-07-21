package com.iu.main.bankBook;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/bankbook/*")
public class BankBookController {
	
	@Autowired // 의존성있는 멤버변수 주입 
	private BankBookService bankBookService;
	
	@RequestMapping(value="list", method = RequestMethod.GET)
	public String getList(Model model) throws Exception{
		List<BankBookDTO> ar = bankBookService.getList();
		model.addAttribute("list",ar);
		
		return "bankbook/list";
		
	}
	
	@RequestMapping(value="detail", method = RequestMethod.GET)
	public ModelAndView getDetail(BankBookDTO  bankBookDTO, ModelAndView mv) throws Exception{
		
		bankBookDTO = bankBookService.getDetail(bankBookDTO); //스프링이 넘어온 dto를 자동 형변환 해줌 파라미터는 String 이므로
		mv.addObject("dto",bankBookDTO);
		mv.setViewName("bankbook/detail");
		
		return mv;
		
	}
	
	@RequestMapping(value="add")
	public String getAdd() throws Exception{
		System.out.println("Add");
		
		return "bankbook/add";
		
	}
	
	@RequestMapping(value="update")
	public String getUpdate() throws Exception{
		System.out.println("Add");
		
		return "bankbook/update";
		
	}
	
	

}
