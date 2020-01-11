package com.bridgelabz.programs.basiccore;

import java.util.Scanner;

public class LeapYear 
{

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter year ");
		int year=scanner.nextInt();
		if((year>999)&&(year<10000))
		{
			if((year%4==0)||((year%100==0)&&(year%400==0))) 
			{
				System.out.println("given year "+year+" is leap year");
			}
			else 
			{
				System.out.println("Given year "+year+" is not leap year");
			}
			
		}
		else {
			System.out.println("wrong year is enter");
		}

	}

}
