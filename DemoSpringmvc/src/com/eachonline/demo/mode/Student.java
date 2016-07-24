package com.eachonline.demo.mode;

import java.io.Serializable;

public class Student implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4324812509655854565L;

	
	private int id;
	private String stuName;
	private int age;
	private int gender;
	private String address;
	
	
	
	public Student() {
		super();
	}

	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getStuName() {
		return stuName;
	}



	public void setStuName(String stuName) {
		this.stuName = stuName;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public int getGender() {
		return gender;
	}



	public void setGender(int gender) {
		this.gender = gender;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public Student(int id, String stuName, int age, int gender, String address) {
		super();
		this.id = id;
		this.stuName = stuName;
		this.age = age;
		this.gender = gender;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", stuName=" + stuName + ", age=" + age + ", gender=" + gender + ", address="
				+ address + "]";
	}
	
	
}
