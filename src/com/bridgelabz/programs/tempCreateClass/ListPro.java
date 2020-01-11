package com.bridgelabz.programs.tempCreateClass;

import java.util.ArrayList;
import java.util.List;

public class ListPro 
{
	public static void listCollection() 
	{
		List<String> newString=new ArrayList<String>();
		newString.add("M");
		newString.add("L");
		newString.add("H");
		newString.add(0,"Q");
		System.out.println(newString);
		newString.remove("L");
		System.out.println(newString);
		newString.set(0, "G");
		System.out.println(newString);
		newString.clear();
		System.out.println(newString);
	}
	
	
	public static void main(String[] args)
	{
		
	}
	

}
