package com.main;

import com.service.Address;
import com.service.StudentClass;

public class HasAddress {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address add=new Address(12,"Nellore","AP","India");
		StudentClass stdcls=new StudentClass(1,"Hareesha",add);
		
		System.out.println(stdcls.getStudentName());
		System.out.println(stdcls.getRollNum());
		System.out.println(stdcls.getStudentAdd().getStreetNum());
		System.out.println(stdcls.getStudentAdd().getCity());
		System.out.println(stdcls.getStudentAdd().getState());
		System.out.println(stdcls.getStudentAdd().getCountry());
	}

}
