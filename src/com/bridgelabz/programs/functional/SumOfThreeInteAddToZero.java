package com.bridgelabz.programs.functional;

import java.util.Scanner;

public class SumOfThreeInteAddToZero 
{
   public static int [] scannerUserInput() 
   {
	   Scanner scanner = new Scanner( System.in ) ;
		System.out.println( "enter size of arr" ) ;
		int sizeOfArray = scanner.nextInt() ;
		int arrToStoreElement[] = new int[ sizeOfArray ] ;
		for ( int cellNumber = 0 ; cellNumber < arrToStoreElement.length ; cellNumber++ ) 
		{
			arrToStoreElement[ cellNumber ] = scanner.nextInt() ;
			
		} 
		return arrToStoreElement;
   }
   public static void checkSunOfThreeIntergerNumber(int []arr) 
   {
	   int count = 0 ;
		
		for ( int i = 0 ; i < arr.length ; i++ ) 
		{
			for (int j = i + 1 ; j < arr.length ; j++) 
			{
				for (int k = j + 1 ; k < arr.length ; k++) 
				{
					if ( arr[i] + arr[j] + arr[k] == 0 ) 
					{
						System.out.println("distinct triples" + arr[i] + " + " + arr[j] + " + " + arr[k] + " =0" ) ;
						count++ ;
					}
				}
			}
		}
		System.out.println ( "number of distinct triples" +count ) ;
		

   }
	public static void main ( String[] args ) 
	{	
		int array[] = SumOfThreeInteAddToZero.scannerUserInput() ;
		SumOfThreeInteAddToZero.checkSunOfThreeIntergerNumber( array ) ;
	}	
}
