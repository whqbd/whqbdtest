package com.eachonline.demo.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

import com.eachonline.demo.mode.Student;
import com.eachonline.demo.service.StudentService;
import com.eachonline.demo.util.Result;

@Controller
@RequestMapping("/student")
public class StudentControl {

	@Autowired
	private StudentService studentServcie;
	
	@RequestMapping(value="/queryAll",method=RequestMethod.GET)
	@ResponseBody
	public Result queryAll(){
		Result result=new Result();
		List<Student> list=studentServcie.getStudentAll();
		result.setRetCode(200);
		result.setMsg("ok");
		result.setRetObj(list);
		return result;
	}
	@RequestMapping("index")
	public ModelAndView getStudent(){
		
		return new ModelAndView("../index");
	}
}
