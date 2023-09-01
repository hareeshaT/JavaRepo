package com.dao;

import java.util.List;

import com.model.Department;

public interface Hrdao {
	public abstract List<Department> readAllDepartments();
}
