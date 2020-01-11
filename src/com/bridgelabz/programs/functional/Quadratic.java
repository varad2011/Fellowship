package com.bridgelabz.programs.functional;

import java.util.Scanner;

public class Quadratic
{
	
	public static void printQuadratic ( int a , int b , int c ) 
	{
		int delta = ( b * b - 4 * a * c ) ;
		int deltaAbs = Math.abs ( delta ) ;
		double deltaAbsSqrt = Math.sqrt ( deltaAbs ) ;
		double root1OfX = ( -b + deltaAbsSqrt ) / ( 2 * a ) ;
		double root2OfX = ( -b - deltaAbsSqrt ) / ( 2 * a ) ;
		System.out.println ( " root1 of x " + root1OfX ) ;
		System.out.println ( "root2 of x " + root2OfX ) ;
	}
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner ( System.in ) ;
		System.out.println ( "enter a value" ) ;
		int a = scanner.nextInt() ;
		System.out.println ( "enter b value" ) ;
		int b = scanner.nextInt() ;
		System.out.println ( "enter c value" ) ;
		int c = scanner.nextInt() ;
		
		Quadratic.printQuadratic( a, b, c ) ;
	}

}
