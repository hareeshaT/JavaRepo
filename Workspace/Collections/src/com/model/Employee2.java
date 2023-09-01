package com.model;

public class Employee2{
	private int empNo;
	private String empName;
	private float salary;
	private char gender;
	
	public Employee2() {
		super();
	}

	public Employee2(int empNo, String empName, float salary,char gender) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.salary = salary;
		this.gender=gender;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	/*
	 * @Override public int compareTo(Employee2 o) { int returnVal=0;
	 * if(this.empNo>o.empNo) { returnVal=1; } if(this.empNo<o.empNo) {
	 * returnVal=-1; } if(this.empNo==o.empNo) { returnVal=0; } return returnVal; }
	 */
	
}
