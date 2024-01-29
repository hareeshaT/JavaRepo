package com.main;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.model.Employee;
import com.model.Employee2;

public class MainApp {

	public static void main(String[] args) {
		Employee2 empl=new Employee2(10,"Haree",20000f,'M');
		Employee2 emp2=new Employee2(12,"Navi",200000f,'F');
		Employee2 emp3=new Employee2(15,"Chandu",100000f,'m');
		Employee2 emp4=new Employee2(18,"Rani",140000f,'f');
		
		Set set= new HashSet();
		Map<Integer,Employee2> map = new HashMap();
		set.add(empl);
		set.add(emp2);
		set.add(emp3);
		set.add(emp4);
		set.add(98);
		map.put(1, emp2);
		map.put(2, emp3);
		
		
		
		
	}

}
