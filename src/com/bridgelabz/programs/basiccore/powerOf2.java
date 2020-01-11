package com.bridgelabz.programs.basiccore;

import java.util.Scanner;

public class powerOf2 
{

	public static void main(String[] args) 
	{   
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter number");
		int number =scanner.nextInt() ;
		int powOf2=1;
		for(int i=1;i<=number;i++) 
		{
			powOf2=2*i;
			if(powOf2<31) 
			{
				System.out.println("2* "+i+" = "+powOf2);
			}else
			{
				break;
			}
		}

	}

}
