package com.bridgelabz.programs.functional;

import java.util.Scanner;

public class WindChill 
{
	public static void windChillCalculation(double v,double t) 
	{
		double windChill ;

		if ( ( ( v < 120 ) && ( v > 3 ) ) && ( t < 50 ) ) 
		{
			windChill = 35.74 + 0.6215 * t + ( 0.4275 * t + 35.75 ) * Math.pow ( v , 0.16 ) ;
			System.out.println( windChill ) ;
		}
		else
		{
			System.out.println ( "formula is not valied for enter value" ) ;
		}
		
	}
	public static void main(String[] args) 
	{
		
		Scanner scanner = new Scanner( System.in ) ;
		System.out.println ( "enter wind speed v(miles per hours)" ) ;
		double v = scanner.nextDouble() ;
		System.out.println ( "enter temp t (in fahrenheit )" ) ;
		double t = scanner.nextDouble() ;
		WindChill.windChillCalculation(v, t); 
			
	}

}
