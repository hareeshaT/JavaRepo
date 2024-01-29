package com.model;

import java.util.Comparator;

public class sortByNo implements Comparator<Employee2>{
	Employee2 emp2=new Employee2();

	@Override
	public int compare(Employee2 o1, Employee2 o2) {
		int returnVal=0;
		if(o1.getEmpNo()>o2.getEmpNo()) {
			returnVal=1;
		}
		if(o1.getEmpNo()<o2.getEmpNo()) {
			returnVal=-1;
		}
		if(o1.getEmpNo()==o2.getEmpNo()) {
			returnVal=0;
		}
		return returnVal;
	}
	

}
