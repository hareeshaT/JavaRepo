package com.main;

import com.model.Employee;
import com.model.childEmployee;

public class HrApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = new Employee();
		System.out.println(employee);
		Employee employee1 = new Employee();
		System.out.println(employee1);
		
		employee=null;
		System.out.println(employee);
		
		childEmployee childemp = new childEmployee();
	}

}
