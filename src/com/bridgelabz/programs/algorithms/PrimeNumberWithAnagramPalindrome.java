package com.bridgelabz.programs.algorithms;

public class PrimeNumberWithAnagramPalindrome 
{
	
	public static void  finalangramList ( int []arrayToStorePrimeNumbers) 
	{
	
		for( int i = 0 ; i < arrayToStorePrimeNumbers.length ; i ++ ) 
		{
				int count = 0 ;
				int NumberToCheckCount = arrayToStorePrimeNumbers[ i ] ;
				int NumberToCheckCount2 = arrayToStorePrimeNumbers[ i ]  ;
				int remind1 ;
				int sum = 0;
				
				while ( NumberToCheckCount  > 0 ) 
				{
					remind1 = NumberToCheckCount  % 10 ;
					 sum = ( sum * 10 ) + remind1 ;
					 NumberToCheckCount  = NumberToCheckCount  / 10 ;
				}
				
				
 				
				
				for ( int k = 0 ; k < arrayToStorePrimeNumbers.length  ; k++) 
				{
					
						
						if ( arrayToStorePrimeNumbers[k] != 0  ) 
						{
							if ( arrayToStorePrimeNumbers[k] != arrayToStorePrimeNumbers[i] )
							{	
								int carry = sum % 100 ;
								int devident = sum / 100 ;
								int location = -1;
								if( sum == arrayToStorePrimeNumbers[k] )
								{ 
								//	do 
								//	{
										  
								//		location ++ ; 
								//	}
									
									
									//  while (  arrayToStorePrimeNumbers[location ] != 0 ) ;
									
									System.out.println(sum);
									
								}
								
							}
							
						}
						
					}
				}
				
			}
		
		
	
	public static void palindromeCheck( int number ) 
	{
		int temp2 = number ;
		int remind1 ;
		int sum = 0 ;
		while ( temp2 > 0 ) 
		{
			remind1 = temp2 % 10 ;
			 sum = ( sum * 10 ) + remind1 ;
			 temp2 = temp2 / 10 ;
		}
		
		if ( sum == number ) 
		{
			System.out.println (  + sum ) ;
		}		
	}
	public static void main(String[] args) 
	{   int [] arrayToStorePrimeNumbers = new int[1000] ;
		int number = 1000 ;
		int j = 0 ;
		boolean primeFlag = true ;
		System.out.println ( "prime numbers bet." ) ;
		for ( int row = 2 ; row <= number ; row++ ) 
		{	
				for ( int row1 = 2 ; row1 <= row / 2 ; row1++ )  //check number is prime or not loop
				{    
					if ( row % row1 == 0 ) 
					{
						primeFlag = false ;
						break ;
					}
					else 
					{
						 primeFlag = true ;					
					}		
				}
			
				if ( primeFlag == true ) 
				{
					PrimeNumberWithAnagramPalindrome.palindromeCheck(row);
					arrayToStorePrimeNumbers[j]= row ;
					j++;
				//	PrimeNumberWithAnagramPalindrome . anagramCheck ( row ) ;
					
				}	
		}	
		
		 PrimeNumberWithAnagramPalindrome.finalangramList(arrayToStorePrimeNumbers); 
	}

}
