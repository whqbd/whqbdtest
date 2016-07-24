package com.eachonline.demo.service;

import java.util.List;

import com.eachonline.demo.mode.Student;

public interface StudentService {

public Student  getStudent(String studentID);  
    
	/**
	 * 根据id查学生
	 * @param studentID
	 * @return
	 */
    public Student  getStudentAndClass(String studentID);  
    
    /**
     * 查询所有学生
     * @return
     */
    public List<Student > getStudentAll();  
     
    /**
     * 新增学生
     * @param entity
     */
    public int insertStudent(Student  entity);  
      
    /**
     * 删除学生
     * @param entity
     */
    public int deleteStudent(Student  entity);  
      
    /**
     * 跟新学生
     * @param entity
     */
    public int updateStudent(Student  entity);  
}
