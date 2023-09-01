package com.main;

import java.util.List;

import com.dao.Hrdao;
import com.dao.HrdaoImpl;
import com.dao.MySqlConnection;
import com.model.Department;
import com.model.Employee;

public class HRApplication {

	public static void main(String[] args) {
		MySqlConnection connection=new MySqlConnection();
		connection.getConnection();
		Hrdao hrdao=new HrdaoImpl();
		List<Department> departments=hrdao.readAllDepartments();
		//System.out.println(departments.size());
		for (Department department : departments) {
			System.out.println(department.getDept_id());
			System.out.println(department.getDept_name());
			List<Employee> AllEmployees=department.getEmployees();
		}
	}
}
