package com.service;

public class StudentClass {
	private int rollNum;
	private String studentName;
	private Address studentAdd;
	
	public StudentClass(int rollNum, String studentName, Address studentAdd) {
		super();
		this.rollNum = rollNum;
		this.studentName = studentName;
		this.studentAdd = studentAdd;
	}

	public int getRollNum() {
		return rollNum;
	}

	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Address getStudentAdd() {
		return studentAdd;
	}

	public void setStudentAdd(Address studentAdd) {
		this.studentAdd = studentAdd;
	}
	
}
