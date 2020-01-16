package com.bridgelabz.programs.designPattern.prototypePattern;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Cloneable {
	private List<String> emplyeeList ;

	public Employee() {
		emplyeeList = new ArrayList<String>();
	}
	public Employee(List<String> employeeList) 
	{
		this.emplyeeList = employeeList;
	}
	public void addData() {
		emplyeeList.add("varad");
		emplyeeList.add("hanumant");
		emplyeeList.add("rohan");
		emplyeeList.add("pranali");
	}
	public List<String> getEmployeeList() {
		return this.emplyeeList;
	}
	public Object clone() {
		List<String> tempString = new ArrayList<String>();
		for(String listName : this.getEmployeeList()) 
		{
			tempString.add(listName);
		}
		return new  Employee(tempString);
	}
	
}
