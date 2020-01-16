package com.bridgelabz.programs.designPattern.prototypePattern;

import java.util.List;

public class PrototypePatternTest {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.addData();
		Employee employee1 = (Employee) employee.clone();
		Employee employee2 = (Employee) employee.clone();
		List<String> list1 = employee1.getEmployeeList();
		list1.add("pravin");
		List<String> list2 = employee2.getEmployeeList();
		list2.remove("hanumant");
		
		System.out.println(employee.getEmployeeList());
		System.out.println(list1);
		System.out.println(list2);
	}

}
