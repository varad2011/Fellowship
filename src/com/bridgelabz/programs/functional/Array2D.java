package com.bridgelabz.programs.functional;

import java.util.Scanner;

public class Array2D {

	public static void main(String[] args) 
	{
		
			Scanner scanner = new Scanner ( System.in ) ;
			System.out.println("enter row size") ;
		
			int rows = scanner.nextInt() ;
			System.out.println ( "enter col size" ) ;
			int cols = scanner.nextInt() ;
			System.out.println("enter nub") ;
			int arr[][] = new int [rows][cols] ;
			for ( int m = 0 ; m < arr.length ; m++ ) 
			{
				for ( int n = 0 ; n < arr[m].length ; n++ ) 
				{
					arr[m][n] = scanner.nextInt() ;
					System.out.print ( arr[m][n] ) ;
				}
				
				
			}
			
			
		

	}

}
