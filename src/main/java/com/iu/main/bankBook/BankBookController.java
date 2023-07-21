package com.iu.main.bankBook;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
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
	
	@RequestMapping(value="add", method = RequestMethod.GET)
	public String setAdd() throws Exception{
		return "bankbook/add";
		
	}
	
	@RequestMapping(value="add", method = RequestMethod.POST)
	public String setAdd(BankBookDTO bankBookDTO) throws Exception{
		
		int result = bankBookService.setAdd(bankBookDTO);
		return "redirect:./list";
		
	}
	
	

	
	@RequestMapping(value="update" ,method = RequestMethod.GET)
	public void setUpdate(BankBookDTO bankBookDTO,Model model) throws Exception{
		
		bankBookDTO = bankBookService.getDetail(bankBookDTO);
		model.addAttribute("dto", bankBookDTO);
		
		
	}
	
	@RequestMapping(value="update" ,method = RequestMethod.POST)
	public String setUpdate(BankBookDTO bankBookDTO) throws Exception{
		int result = bankBookService.setUpdate(bankBookDTO);
		
//		return "redirect:./list";
		return "redirect:./detail?bookNum="+bankBookDTO.getBookNum();
		
	}
	
	@RequestMapping(value = "delete", method = RequestMethod.GET)
	public String setDelete(Long bookNum) throws Exception{
		int result = bankBookService.setDelete(bookNum);
		
		return "redirect:./list";
	}
	
	
	

}
