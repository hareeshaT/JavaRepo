package com.service;

import java.util.List;
import java.util.Set;

import com.model.Employee;

public interface EmpService {
	public abstract Employee createEmployee(Employee empl);
	public abstract List readAllEmp();
	public abstract Employee readEmployeeById(Employee emp,int empNo);
	public abstract Employee readEmployeeById(Set Employee,int empNo);
	public abstract Employee readEmployeeByName(Set Employee,String empName);
	public abstract int cntGender(Set Employee,char gender);
}
