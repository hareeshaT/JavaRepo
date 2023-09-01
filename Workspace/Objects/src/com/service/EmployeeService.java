package com.service;

import com.model.Employee;

public class EmployeeService {
	public String getEmployeeName(Employee employee) {
		return employee.getEmpName();
	}
	
	public char getEmployeeGender(Employee employee) {
		return employee.getGender();
	}
	
	public double getEmployeeSalary(Employee employee) {
		return employee.getSalary();
	}
	
	public int getEmployeeId(Employee employee) {
		return employee.getEmpId();
	}
	
	public double getEmployeeTotalSalary(Employee employee,Employee employee2) {
		return (employee.getSalary()+employee2.getSalary());
	}
	
	public String getEmployeeMaxSalary(Employee employee,Employee employee2) {
		if(employee.getSalary()>employee2.getSalary()){
			return employee.getEmpName();
		}
		else {
			return employee2.getEmpName();
		}
	}
	
	public double getTotalSalryofEmp(Employee[] emparr) {
		double sum=0;
		for (int i = 0; i < emparr.length; i++) {
			//System.out.println(emp);
			sum+=emparr[i].getSalary();
		}
		return sum;
	}
	
	public double getSalryofgivenEmp(Employee[] emparr,String name) {
		double sal=0;
		for(Employee emp:emparr) {
			if(emp.getEmpName()==name) {
				sal= emp.getSalary();
			}
		}
		return sal;
	}
	
	public boolean isEmpThere(Employee[] emparr,String name) {
		boolean isEmp=false;
		for(Employee emp:emparr) {
			if(emp.getEmpName()==name) {
				isEmp= true;
			}
		}
		return isEmp;
	}
	
	public int genderMaleCnt(Employee[] emparr) {
		int cnt=0;
		for (int i = 0; i < emparr.length; i++) {
			if(emparr[i].getGender()=='M') {
				cnt++;
			}
		}
		return cnt;
	}
	
	public int[] genderCnt(Employee[] emparr) {
		int malecnt=0;
		int femalecnt=0;
		int[] cntarr=new int[2];
		for (int i = 0; i < emparr.length; i++) {
			if(emparr[i].getGender()=='M') {
				malecnt++;
			}
			else {
				femalecnt++;
			}
		}
		cntarr[0]=malecnt;
		cntarr[1]=femalecnt;
		
		return cntarr;
	}
	
	public Employee highSalary(Employee[] emparr) {
		Employee maxObject=emparr[0];
		for (int i = 0; i < emparr.length; i++) {
			if(emparr[i].getSalary()>maxObject.getSalary()) {
				//System.out.println(emparr[i].getEmpName());
				maxObject=emparr[i];
			}
		}
		return maxObject;
	}
	public boolean login(String userName,String Password) {
		boolean output=false;
		if(userName.equalsIgnoreCase("Hareesha")) {
			if(Password.equals("Haree@455")) {
				output=true;
		}
		}
		else {
			output=false;
		}
		return output;
	}
	
	public boolean loginState(String userName,String Password, Employee[] employees) {
		boolean op=false;
		for (int i = 0; i < employees.length; i++) {
			if(employees[i].getUserName().equalsIgnoreCase(userName)) {
				if(employees[i].getPassword().equals(Password)) {
					op=true;
				}
				break;
			}
			else {
				op=false;
			}
		}
		return op;
	}

}
