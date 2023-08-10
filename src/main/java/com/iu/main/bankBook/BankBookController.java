package com.iu.main.bankBook;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.iu.main.bookComment.BookCommentDTO;
import com.iu.main.util.Pager;

@Controller
@RequestMapping("/bankbook/*")
public class BankBookController {
	
	@Autowired // 의존성있는 멤버변수 주입 
	private BankBookService bankBookService;
	
	//--- comment
	@GetMapping("commentList")
	public void getCommentList(BookCommentDTO bookCommentDTO, Pager pager, Model model)throws Exception{
		List<BookCommentDTO> ar = bankBookService.getCommentList(pager, bookCommentDTO);
		model.addAttribute("commentList", ar);
	}
	
	@RequestMapping(value="list", method = RequestMethod.GET)
	public String getList(Pager pager, Model model) throws Exception{ //bean 객체,request,파라미터이름과 같은 타입선언
		List<BankBookDTO> ar = bankBookService.getList(pager);
		model.addAttribute("list",ar);
		model.addAttribute("pager",pager);
		
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
	public String setAdd(BankBookDTO bankBookDTO, MultipartFile[] photos,HttpSession session ) throws Exception{
		
		int result = bankBookService.setAdd(bankBookDTO,photos,session);
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
