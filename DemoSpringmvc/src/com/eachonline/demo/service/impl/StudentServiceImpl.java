package com.eachonline.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eachonline.demo.dao.StudentMapper;
import com.eachonline.demo.mode.Student;
import com.eachonline.demo.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentMapper studentMapper;
	
	@Override
	public Student getStudent(String studentID) {
		// TODO Auto-generated method stub
		return studentMapper.getStudent(studentID);
	}

	@Override
	public Student getStudentAndClass(String studentID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> getStudentAll() {
		// TODO Auto-generated method stub
		return studentMapper.getStudentAll();
	}

	@Override
	public int insertStudent(Student entity) {
		// TODO Auto-generated method stub
		int code=studentMapper.insertStudent(entity);
		return code;
	}

	@Override
	public int deleteStudent(Student entity) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateStudent(Student entity) {
		// TODO Auto-generated method stub
		return 0;
	}


}
