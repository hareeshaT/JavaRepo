package com.model;

public class Employee {
	private int EmpId;
	private String EmpName;
	private double salary;
	private char gender;
	private String UserName;
	private String Password;
	
	public Employee(int EmpId,String EmpName,double salary,char gender,String UserName,String Password) {
		this.EmpId=EmpId;
		this.EmpName=EmpName;
		this.salary=salary;
		this.gender=gender;
		this.UserName=UserName;
		this.Password=Password;
	}
	
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}
}
