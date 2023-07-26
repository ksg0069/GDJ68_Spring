package com.iu.main.notice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.iu.main.util.Pager;

@Controller
@RequestMapping("/notice/*")
public class NoticeController {
	
	@Autowired
	private NoticeService noticeService;
	
	//list
	@RequestMapping(value = "list", method = RequestMethod.GET )
	public ModelAndView getList(ModelAndView mv,Pager pager)throws Exception{		
		List<NoticeDTO> ar = noticeService.getList(pager);
		mv.addObject("list", ar);
		mv.addObject("pager", pager);
		mv.setViewName("board/list");
		
		return mv;
	
	//add
	}
	@RequestMapping(value = "add", method = RequestMethod.GET)
	public String setAdd()throws Exception{
		
		return "board/add";
	}
	
	@RequestMapping(value = "add", method = RequestMethod.POST)
	public String setAdd(NoticeDTO noticeDTO)throws Exception{
		
		int result = noticeService.setAdd(noticeDTO);
		
		return "redirect:./list";

				
	}
	//detail
	@RequestMapping(value = "detail", method = RequestMethod.GET)
	public String getDtail(NoticeDTO noticeDTO, Model model)throws Exception{
		
		noticeDTO =noticeService.getDetail(noticeDTO);
		model.addAttribute("dto",noticeDTO);
		
		return "board/detail";
		
	}
	
	//update
	@RequestMapping(value = "update", method = RequestMethod.GET)
	public String setUpdate(NoticeDTO noticeDTO, Model model)throws Exception{
		noticeDTO = noticeService.getDetail(noticeDTO);
		model.addAttribute("dto",noticeDTO);
		
		return "board/update";
	}
	
	@RequestMapping(value = "update", method = RequestMethod.POST)
	public String setUpdate(NoticeDTO noticeDTO)throws Exception{
		int result = noticeService.setUpdate(noticeDTO);
		
		return "redirect:./list";
	}
	
	//delete
	@RequestMapping(value = "delete", method = RequestMethod.GET)
	public String setdelete(NoticeDTO noticeDTO)throws Exception{
		int result = noticeService.setDelete(noticeDTO);
		
		return "redirect:./list";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
