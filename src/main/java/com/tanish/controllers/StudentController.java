package com.tanish.controllers;

import java.util.LinkedHashMap;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.tanish.entities.Branch;
import com.tanish.entities.Student;
import com.tanish.services.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@RequestMapping("add")
	public ModelAndView addStudent(@ModelAttribute ("student") Student student)
	{
		//Student student=new Student();
		LinkedHashMap<Integer,String> list=studentService.getAllBranch();
		
		System.out.println(list);
		ModelAndView mv=new ModelAndView("addStudent");
		mv.addObject("student",student);
		mv.addObject("blist", list);
		return mv;
	}
	
	@RequestMapping(name="saveStudent",method=RequestMethod.POST)
	public ModelAndView saveStudent(@Valid @ModelAttribute("student") Student student,BindingResult result)
	{
		if(result.hasErrors())
		{
			ModelAndView mv=new ModelAndView("redirect:add");
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@-----Errors--------------@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			return mv;
		}
		
		ModelAndView mv=new ModelAndView("successStudent");
		studentService.saveStudent(student);
		return mv;
	}
	
	@RequestMapping("addBranch")
	public ModelAndView addBranch()
	{
		ModelAndView mv=new ModelAndView("addBranch");
		return mv;
	}
	
	@RequestMapping("saveBranch")
	public String saveBranch(@ModelAttribute("branch") Branch branch)
	{
		studentService.addBranch(branch);
		return "branchAdded";
	}
}
