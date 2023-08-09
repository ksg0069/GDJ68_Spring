package com.iu.main.bookComment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/bookComment/*")
public class BookCommentController {
	
	@Autowired
	private BookCommentService bookCommentService;
	
	@GetMapping("list")
	public String getList(BookCommentDTO bookCommentDTO, Model model)throws Exception{
		List<BookCommentDTO> ar = bookCommentService.getList(bookCommentDTO);
		model.addAttribute("list",ar);
		
		return "bookComment/list";
		
	}
	
	

}
