package com.main;

import com.model.Employee;
import com.service.EmployeeService;

public class HRApplication {

	public static void main(String[] args) {
		//Employee employee=new Employee();
		//Employee employee2=new Employee();
		/*employee.setEmpId(1487);
		employee.setEmpName("Hareesha");
		employee.setGender('F');
		employee.setSalary(100000);
		
		employee2.setEmpId(1485);
		employee2.setEmpName("Chandu");
		employee2.setGender('M');
		employee2.setSalary(200000);*/
		
		Employee[] employeeArray=new Employee[4];
		employeeArray[0]= new Employee(1487,"Hareesha",100000,'F',"Hareesha","Haree@455");
		employeeArray[1]= new Employee(1485,"Chandu",1200000,'M',"chandu","chandu#1902");
		employeeArray[2]= new Employee(1484,"Naveena",400000,'F',"NAVEENA","Navi!789");
		employeeArray[3]= new Employee(1488,"Ramu",300000,'M',"Ramu","ramu@123");
		
	
		EmployeeService employeeService=new EmployeeService();
		
		/*System.out.println(employeeService.getEmployeeName(employee));
		System.out.println(employeeService.getEmployeeGender(employee));
		System.out.println(employeeService.getEmployeeSalary(employee));
		System.out.println(employeeService.getEmployeeId(employee));
		System.out.println("Sum of both employees salary is "+employeeService.getEmployeeTotalSalary(employee,employee2));
		System.out.println("employee "+employeeService.getEmployeeMaxSalary(employee,employee2)+" is getting highest salary");*/
		/*System.out.println("Sum of all employees Salaries is "+employeeService.getTotalSalryofEmp(employeeArray));
		System.out.println("The salary of Hareesha is "+employeeService.getSalryofgivenEmp(employeeArray,"Hareesha"));
		
		boolean isemp=employeeService.isEmpThere(employeeArray,"Amma");
		if(isemp==true) {
			System.out.println("Found the Employee");
		}
		else if(isemp==false) {
			System.out.println("No such user found");
		}
		boolean isemp1=employeeService.isEmpThere(employeeArray,"Hareesha");
		if(isemp1==true) {
			System.out.println("Found the Employee");
		}
		else if(isemp1==false) {
			System.out.println("No such user found");
		}
		//System.out.println("Male Count: "+employeeService.genderMaleCnt(employeeArray));
		
		int[] cntarr=new int[2];
		cntarr=employeeService.genderCnt(employeeArray);
		for (int i = 0; i < cntarr.length; i++) {
			if(i==0) {
				System.out.print("Male Count: ");
			}
			else {
				System.out.print("Female Count: ");
			}
			
			System.out.println(cntarr[i]);
		}
		
		Employee highSalPerson=employeeService.highSalary(employeeArray);
		System.out.println(highSalPerson.getEmpName()+" is getting highest salary");
		
		boolean output=employeeService.login("hareesha", "Haree@455");
		if(output==true) {
			System.out.println("Congrats, you have logged in");
		}
		else {
			System.out.println("Sorry, Incorrect username/password");
		}*/
		
		boolean loginStatus=employeeService.loginState("Hareesha", "Haree@455", employeeArray);
		if(loginStatus==true) {
			System.out.println("Congrats, you have logged in");
		}
		else {
			System.out.println("Sorry, Incorrect username/password");
		}
		
	}
}
