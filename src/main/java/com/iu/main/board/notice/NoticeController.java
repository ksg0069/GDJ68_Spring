package com.iu.main.board.notice;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.iu.main.board.BoardDTO;
import com.iu.main.util.Pager;

@Controller
@RequestMapping("/notice/*")
public class NoticeController {
	
	@Autowired
	private NoticeService noticeService;
	
	@ModelAttribute("board") //reuestmapping 실행되기전에 실행되서 모델에다가 이름은:board value:notice
	public String getBoardName() {
		return "NOTICE";
	}
	
	//list
	@RequestMapping(value = "list", method = RequestMethod.GET )
	public ModelAndView getList(ModelAndView mv,Pager pager)throws Exception{		
		List<BoardDTO> ar = noticeService.getList(pager);
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
	public String setAdd(NoticeDTO noticeDTO,MultipartFile [] photos, HttpSession session )throws Exception{
		
		int result = noticeService.setAdd(noticeDTO,photos,session);
		
		return "redirect:./list";

				
	}
	//detail
	@RequestMapping(value = "detail", method = RequestMethod.GET)
	public String getDtail(NoticeDTO noticeDTO, Model model)throws Exception{
		
		BoardDTO boardDTO = noticeService.getDetail(noticeDTO);
		model.addAttribute("dto",boardDTO);
		
		return "board/detail";
		
	}
	
	//update
	@RequestMapping(value = "update", method = RequestMethod.GET)
	public String setUpdate(NoticeDTO noticeDTO, Model model)throws Exception{
		BoardDTO boardDTO = noticeService.getDetail(noticeDTO);
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
