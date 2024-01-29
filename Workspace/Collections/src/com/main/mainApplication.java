package com.main;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.model.Employee2;
import com.model.sortByNo;

public class mainApplication {

	public static void main(String[] args) {
		int[] numarray= {1,8,3,7,5};
		Arrays.sort(numarray);
		for (int i = 0; i < numarray.length; i++) {
			System.out.println(numarray[i]);
		}
		
		Employee2 empl=new Employee2(40,"Haree",20000f,'M');
		Employee2 emp4=new Employee2(30,"Rani",140000f,'f');
		Employee2 emp2=new Employee2(20,"Navi",200000f,'F');
		Employee2 emp3=new Employee2(10,"Chandu",100000f,'m');
		
		List<Employee2> employeeList=new ArrayList();
		employeeList.add(empl);
		employeeList.add(emp2);
		employeeList.add(emp3);
		employeeList.add(emp4);
		
		for (Employee2 employee2 : employeeList) {
			System.out.println("Before Sort: "+ employee2.getEmpNo());
		}
		Collections.sort(employeeList, new sortByNo());
		for (Employee2 employee2 : employeeList) {
			System.out.println("After Sort: "+ employee2.getEmpNo());
		}
	}

}
