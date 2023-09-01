package com.main;

import com.model.Student;

public class StudentApp {
	
	static int a=10;
	
	public static void repeatedcode(Student Obj) {
		System.out.println(Obj.getStudentNo());
		System.out.println(Obj.getStudentName());
		System.out.println(Obj.getAge());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student=new Student();
		StudentApp.repeatedcode(student);
		
		Student student2=new Student(123,"Haree",29);
		StudentApp.repeatedcode(student2);
		
		System.out.println(a);
	  
	}

}
