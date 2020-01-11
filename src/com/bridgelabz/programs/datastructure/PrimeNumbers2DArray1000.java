package com.bridgelabz.programs.datastructure;

import java.util.Arrays;

public class PrimeNumbers2DArray1000 {

	public static void main(String[] args) 
	{
		int number = 1000;
		int primeNumber [][] = PrimeNumbers2DArray1000.primeNumberFind( number ) ;
		int array[][] = PrimeNumbers2DArray1000.finalangramList( primeNumber ) ;
		//int unAnagramArray[][] = PrimeNumbers2DArray1000.unAnagramNumbers( primeNumber ) ;
		System.out.println ( " Prime anagram Number are bellow " ) ;
		PrimeNumbers2DArray1000.display(  array   ) ;
		System.out.println(" prime not anagram number are bellow " ) ;
		//PrimeNumbers2DArray1000.display( unAnagramArray   ) ;
	}
	
	
	public static void display( int [][] array) 
	{
	 for(int row = 0 ; row < array.length ; row ++) 
	 {
		 for(int col = 0 ; col < array[row].length ; col ++ ) 
		 {
			if(array[row][col]== 0) 
			{
			 break ;	
			}
			 System.out.print( array[row][col] + " " ) ; 
		 }
		 System.out.println() ;
	 }
	}
	
	public static int [][] finalangramList ( int [][] primeNumbers) 
	{
		int arrayTostore[][] = new int [10][100] ;
		for( int i = 0 ; i < primeNumbers.length ; i ++ ) 
		{
			for( int j = 0 ; j< primeNumbers[i].length ; j++ ) 
			{
				int count = 0 ;
				int NumberToCheckCount = primeNumbers[ i ][ j ] ;
				int NumberToCheckCount2 = primeNumbers[ i ] [ j] ;
				int remind1 ;
				int sum = 0;
				
				while ( NumberToCheckCount  > 0 ) 
				{
					remind1 = NumberToCheckCount  % 10 ;
					 sum = ( sum * 10 ) + remind1 ;
					 NumberToCheckCount  = NumberToCheckCount  / 10 ;
				}
				
				
 				
				
				for ( int k = 0 ; k < primeNumbers.length  ; k++) 
				{
					for( int l = 0 ; l < primeNumbers[k].length ; l++  ) 
					{
						
						if ( primeNumbers[k][l] != 0  ) 
						{
							if ( primeNumbers[k][l] != primeNumbers[i][j] )
							{	
								int carry = sum % 100 ;
								int devident = sum / 100 ;
								int location = -1;
								if( sum == primeNumbers[k][l] )
								{ 
									do 
									{
										  
										location ++ ; 
									}
									
									
									  while (  arrayTostore[ devident ] [location ] != 0 ) ;
									
									arrayTostore[ devident ] [ location ] = sum ;
									
								}
								
							}
							
						}
						
					}
				}
				
			}
		}
		return arrayTostore ;
 	}
	
	
/*	public  static int [][] unAnagramNumbers ( int [][] primeNumbers )
	{
		int arrayTostoreUnAnagram[][] = new int [10][100] ;
		for( int i = 0 ; i < primeNumbers.length ; i ++ ) 
		{
			for( int j = 0 ; j< primeNumbers[i].length ; j++ ) 
			{
				int count = 0 ;
				int NumberToCheckCount = primeNumbers[ i ][ j ] ;
				int NumberToCheckCount2 = primeNumbers[ i ] [ j] ;
				int remind1 ;
				int sum = 0;
				
				while ( NumberToCheckCount  > 0 ) 
				{
					remind1 = NumberToCheckCount  % 10 ;
					 sum = ( sum * 10 ) + remind1 ;
					 NumberToCheckCount  = NumberToCheckCount  / 10 ;
				}
				
				
 				
				
				for ( int k = 0 ; k < primeNumbers.length  ; k++) 
				{
					for( int l = 0 ; l < primeNumbers[k].length ; l++  ) 
					{
						
						if ( primeNumbers[k][l] != 0  ) 
						{
							if(primeNumbers[k][l] != primeNumbers[i][j])
							{	
								int carry = sum % 100 ;
								int devident = sum / 100 ;
								int location = -1;
								if( sum != primeNumbers[k][l])
								{ 
								do 
									{
										  
										location ++ ; 
									}
									
									
								  while (  ( arrayTostoreUnAnagram[ devident ] [location ] )!= 0 ) ;
									
									arrayTostoreUnAnagram[ devident ] [ location ] = sum ;
									break ;
								}
								
							}
							
						}
						
					}
				}
				
			}
		}
		return arrayTostoreUnAnagram ;
 	}*/
	
			
	
	public static int [][] primeNumberFind( int rangeNumber ) 
	{
		int [] array = new int [rangeNumber ] ;
		int [] arr1 = new int [ 1000 ] ;
		int count = 0  ;
		int [][] arrayToStorePrimeNumber = new int [ rangeNumber / 100 ][ 100 ] ;
		int primeNumber = 0 ;
		
		for ( int numberIterator = 2 ;  numberIterator < array.length ;  numberIterator++ ) 
		{	
			boolean primeNumberCheckFlag = true ;
			for ( int devidingNumber = 2 ; devidingNumber <= numberIterator / 2 ; devidingNumber++ ) 
			{
				if ( numberIterator % devidingNumber == 0 ) 
				{
					primeNumberCheckFlag = false ;
					break;	
				}
				else 
				{
					primeNumberCheckFlag = true ;
				}			
			}
			if ( primeNumberCheckFlag == true ) 
			{
				
				
			  int carry = numberIterator % 100 ;
			  int devident = numberIterator / 100 ;
			  int i = -1;
			do {
				  
				 i++ ; 
			  }
			
			
			  while(  arrayToStorePrimeNumber[ devident ] [ i ] != 0) ;
			
			  arrayToStorePrimeNumber[ devident ] [ i ] = numberIterator ;
		
			  
			 
			   
			}		
		}
		
		return arrayToStorePrimeNumber;
	}
	

}
