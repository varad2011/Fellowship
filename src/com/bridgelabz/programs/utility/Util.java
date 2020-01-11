package com.bridgelabz.programs.utility;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Util 
{	
	public static int scanner ( ) 
	{
		Scanner scanner = new Scanner(System.in);
		int scanNumber = scanner .nextInt() ;
		return scanNumber ;
	}
	public static String Scanner () 
	{
		Scanner scanner = new Scanner(System.in);
		String  scanNumber = scanner .nextLine() ;
		return scanNumber ;
	}
	
	public static boolean isPrime(int n) {
		if (n == 0 || n == 1) {
			return false;
		} else {
			for (int i = 2; i < n; i++) {
				if (n % i == 0) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static boolean isAnagram(String str1, String str2) {
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();

		if (str1.length() != str2.length() || str1.equals(str2)) {
			return false;
		} else {
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			if (Arrays.equals(arr1, arr2)) {
				return true;
			}
		}
		return false;
	}
	
	public static String dayOfWeek(int day ,int month,int year) 
	{	
		float y0,m0,x;
		int d0;  
		String weekday =null;

		y0=year-(14-month)/12;  
											
		x=y0+y0/4-y0/100+y0/400; 
														
		m0=month+12*((14-month)/12)-2; 
											
		d0=(int)(day+x+(31*m0)/12)%7;
		
		
		switch(d0)
		{
		case 0:
			weekday="sunday";
			break;
		case 1:
			weekday="monday";
			break;
		case 2:
			weekday="tuesday";
			break;
		case 3:
			weekday="wednesday";
			break;
		case 4:
			weekday="thusday";
			break;
		case 5:
			weekday="friday";
			break;
		case 6:
			weekday="saturday";
			break;
		
		}
		return weekday;
	}
	public static int temperaturConversion(int celsius,String unit) 
	{	int output=0;
		
		if(unit=="c") 
		{
			output=  (celsius*9/5)+32;
				
		}
		else if(unit=="f")
		{
			output=(celsius-32)*5/9;
		}
		
		return output;
	
	}
	public static double monthlyPayment () 
	{ 	double payment=0;
	
		Scanner scanner =new Scanner(System.in);
		int y,y1;
		float p,r;
		double r1;
		System.out.println("enter year");
		y=scanner.nextInt();
		System.out.println("Enter principal loan amount");
		p=scanner.nextFloat();
		System.out.println("Enter percent interest compounded monthly");
		r=scanner.nextFloat();
		y1=y*12;
		r1=r/(12*100);
		double mathFun=Math.pow((1+r1),(-y1));
		payment=(p*r1)/(1-mathFun);
		return payment;
	}
	
	
	public static BigInteger countBinarySearchTree(double node) {

		double a = 2 * node;
		double b = node + 1;
		BigInteger x = calculateNode(a);
		BigInteger y = calculateNode(b);
		BigInteger c = calculateNode(node);

		return x.divide(y.multiply(c));

	}

//	/*
//	 * public static double factorial(double i) { double fact = 1; while (i > 0) {
//	 * fact = fact * i; i--; } return fact;
//	 * 
//	 * }
//	 */
	public static BigInteger calculateNode(double number) {
		BigInteger factorial = BigInteger.ONE;

		for (double i = number; i > 0; i--) {
			factorial = factorial.multiply(BigInteger.valueOf((int) i));
		}

		return factorial;

	}
}
	

