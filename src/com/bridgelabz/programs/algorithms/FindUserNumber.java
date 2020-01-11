package com.bridgelabz.programs.algorithms;

import java.util.Scanner;

public class FindUserNumber 
{   

	public static void   checkNumber ( int[] arrayToStoreElement ,  int lowerIndex , int higherIndex , int middlePoint ) 
	{	
		Scanner scanner  = new Scanner ( System.in );
		System.out.println ( " think of a number is less that middle number" + middlePoint ) ;
		String userInput = scanner.nextLine() ;
		
		if ( middlePoint == 0 ) 
		{
		
			System.out.println ( " number is " + arrayToStoreElement[ middlePoint ] ) ;
		   
		}
		
		else if ( userInput.compareTo( "yes" ) == 0 ) 
		{	
			
			higherIndex = middlePoint-lowerIndex ;
			middlePoint = lowerIndex + ( higherIndex-lowerIndex ) / 2 ;
			checkNumber ( arrayToStoreElement ,lowerIndex , higherIndex , middlePoint ) ;
		}
		 else 
		 {
			lowerIndex = middlePoint + lowerIndex ;
			middlePoint = lowerIndex + ( higherIndex-lowerIndex ) / 2 ;
			checkNumber ( arrayToStoreElement ,lowerIndex , higherIndex , middlePoint ) ;
		 }
		
		
		
		//return arrayToStoreElement[ middlePoint ] ; 			
	}
	public static void middleFind (int [] arrayToStoreElement) 
	{
		int lowerIndex = 0 ;
		int  higherIndex = arrayToStoreElement.length - 1 ;
		int  middlePoint = lowerIndex + ( higherIndex-lowerIndex ) / 2 ;
		
		checkNumber (  arrayToStoreElement , lowerIndex , higherIndex ,  middlePoint ) ;
		
		
		
	}
	public static void main(String[] args) 
	{
		int [] enterNumber = { 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10 } ;
		
		 FindUserNumber.middleFind ( enterNumber ) ;
	}

}
