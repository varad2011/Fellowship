package com.bridgelabz.programs.tempCreateClass;

public class StringtoCharCoversion 
{
	public static char[] tocharCon(String name) 
	{
		char[] stringChar=new char[name.length()];
		for(int i=0;i<name.length();i++) 
		{
			stringChar[i]=name.charAt(i);
		}
		return stringChar;
		
	}
	public static void main(String[] args) 
	{
		char ch[]=StringtoCharCoversion.tocharCon("name");
		for(int i=0;i<ch.length;i++) 
		{
			System.out.println(ch[i]);
		}
	}

}
