package com.eachonline.demo.control;

import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
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
import com.eachonline.demo.util.UUIDUtils;

@Controller
@RequestMapping("/student")
public class StudentControl {
	
	private Logger logger =Logger.getLogger(StudentControl.class);
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
	
	@RequestMapping(value="/addStudent",method=RequestMethod.POST)
	public ModelAndView addStudent(HttpServletRequest request,HttpServletResponse response){
		Result result=new Result();
	
		try {
			String name=request.getParameter("name");
			String ageStr=request.getParameter("age");
			String genderStr=request.getParameter("gender");
			String address=request.getParameter("address");
			int age =Integer.valueOf(ageStr);
			int gender=Integer.valueOf(genderStr);
			Student student=new Student(UUIDUtils.uuid(),name,age,gender,address);
			int code=studentServcie.insertStudent(student);
			result.setRetCode(200);
			result.setMsg("ok");
			result.setRetObj(code);
			result.setSuccess(true);
			logger.error(">>>>>>>>>>>保存成功>>>code"+code);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			logger.error(">>>>>>>>>>>error>>>e"+e);
			e.printStackTrace();
			result.setRetCode(500);
			result.setMsg("e"+e);
			result.setSuccess(false);
		}
		return new ModelAndView("../../success");
	}
	
	@RequestMapping("index")
	public ModelAndView getStudent(){
		
		return new ModelAndView("../index");
	}
}
