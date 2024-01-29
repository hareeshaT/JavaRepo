package com.main;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.model.Employee;
import com.service.EmpService;
import com.service.EmpServiceImpl;

public class HRApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee empl=new Employee(10,"Haree",20000f,'M');
		Employee emp2=new Employee(12,"Navi",200000f,'F');
		Employee emp3=new Employee(15,"Chandu",100000f,'m');
		Employee emp4=new Employee(18,"Rani",140000f,'f');
		
		Set coll = new HashSet();
		coll.add(empl);
		coll.add(emp2);
		
		EmpService empService=new EmpServiceImpl();
		
		Employee op=empService.readEmployeeById(coll, 10);
		if(op!=null) {
			System.out.println(op.getEmpName()+op.getEmpNo());
		}
		
		Employee Name=empService.readEmployeeByName(coll, "navi");
		if(Name!=null) {
			System.out.println(Name.getEmpNo()+Name.getEmpName());
		}
		
		int genderCnt=empService.cntGender(coll, 'M');
		System.out.println(genderCnt);
	}

}
