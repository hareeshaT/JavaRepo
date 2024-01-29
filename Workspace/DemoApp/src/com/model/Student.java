package com.model;

public class Student {
	private long studentNo;
	private String studentName;
	private int age;
	
	public Student() {
		this.studentNo=100;
		this.studentName="Hareesha";
		this.age=20;
	}
	
	public Student(int studentNo,String studentName,int age) {
		this.studentNo=studentNo;
		this.studentName=studentName;
		this.age=age;
	}

	public long getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(long studentNo) {
		this.studentNo = studentNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
