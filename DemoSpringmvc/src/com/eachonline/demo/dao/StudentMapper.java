package com.eachonline.demo.dao;

import java.util.List;

import com.eachonline.demo.mode.Student;


public interface StudentMapper {
	public Student  getStudent(String studentID);  
    
    public Student  getStudentAndClass(String studentID);  
      
    public List<Student > getStudentAll();  
      
    public int insertStudent(Student  entity);  
      
    public int deleteStudent(Student  entity);  
      
    public int updateStudent(Student  entity);  
    
}
