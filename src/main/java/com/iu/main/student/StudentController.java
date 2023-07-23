package com.iu.main.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
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
	public ModelAndView getDetail(ModelAndView mv, StudentDTO studentDTO) throws Exception{
		
		studentDTO =studentService.getDetail(studentDTO);
		mv.addObject("dto", studentDTO); // attribute생성
		mv.setViewName("student/detail");  //이쪽 jsp로가라
		return mv;
	}
	
	@RequestMapping(value ="add", method = RequestMethod.GET)
	public void setAdd() throws Exception{
		
	}
	
	@RequestMapping(value ="add", method = RequestMethod.POST)
	public String setAdd(StudentDTO studentDTO)throws Exception{
		
		int result = studentService.setAdd(studentDTO);
		return "redirect:./list";
	
		
	}
	
	@RequestMapping(value ="update", method = RequestMethod.GET)
	public void setUpdate(StudentDTO studentDTO, Model model)throws Exception{
		
		studentDTO = studentService.getDetail(studentDTO);
		model.addAttribute("dto", studentDTO);
	}
	
	@RequestMapping(value ="update", method = RequestMethod.POST)
	public String setUpdate(StudentDTO studentDTO)throws Exception{
		
		int result = studentService.setUpdate(studentDTO);
		
		return "redirect:./detail?st_no="+studentDTO.getSt_no();
	}
	
	
	@RequestMapping(value ="delete", method = RequestMethod.GET)
	public String setdelete(StudentDTO studentDTO) throws Exception{
		int result = studentService.setDelete(studentDTO);
		
		return "redirect:./list";
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
