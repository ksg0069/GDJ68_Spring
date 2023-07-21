package com.iu.main.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/student/*")
public class StudentController {
	
	@Autowired
	private StudentService studentService;

	@RequestMapping(value = "list", method = RequestMethod.GET)
	public ModelAndView getList(ModelAndView mv)throws Exception{
		List<StudentDTO> ar= studentService.getList();
		mv.addObject("list", ar);
		mv.setViewName("student/list");
		
		return mv;
		
	}
	@RequestMapping(value = "detail", method = RequestMethod.GET)
	public ModelAndView getDetail(ModelAndView mv) throws Exception{
		
		
		return mv;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
