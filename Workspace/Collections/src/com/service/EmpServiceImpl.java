package com.service;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.model.Employee;

public class EmpServiceImpl implements EmpService {

	@Override
	public Employee createEmployee(Employee empl) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List readAllEmp() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee readEmployeeById(Employee emp, int empNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee readEmployeeById(Set Employee, int empNo) {
		Employee dummy=null;
		for (Iterator iterator = Employee.iterator(); iterator.hasNext();) {
			Employee object = (Employee) iterator.next();
			if(object.getEmpNo()==empNo) {
				dummy=object;
			}
		}
		return dummy;
	}

	@Override
	public Employee readEmployeeByName(Set Employee, String empName) {
		Employee dummy=null;
		for (Iterator iterator = Employee.iterator(); iterator.hasNext();) {
			Employee object = (Employee) iterator.next();
			if(object.getEmpName().equalsIgnoreCase(empName)) {
				dummy=object;
			}
		}
		return dummy;
	}

	@Override
	public int cntGender(Set Employee, char gender) {
		int count =0;
		for (Iterator iterator = Employee.iterator(); iterator.hasNext();) {
			Employee object = (Employee) iterator.next();
			if(object.getGender()== gender) {
				count+=1;
			}
		}
		return count;
	}

}
