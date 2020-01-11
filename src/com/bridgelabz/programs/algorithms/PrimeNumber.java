package com.bridgelabz.programs.algorithms;

public class PrimeNumber 
{
	

	public static void main(String[] args) 
	{
		int number = 1000 ;
		boolean primeFlag = true ;
		System.out.println ( "prime numbers bet." ) ;
		for ( int row = 2 ; row <= number ; row++ ) 
		{	
				for ( int row1 = 2 ; row1 <= row / 2 ; row1++ ) //check number is prime or not loop
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
					//System.out.println(row+" ");
					int count = 0 ;
					int temp = row ;
					int temp1 = row ;
					int temp2 = row ;
					int remind , remind1 ;
					int sum = 0 ;
					int sum1 = 0 ;
					int multi = 1 ;
					while ( temp > 0 )//anagram check count number
					{
					  
					  count++ ;
					  temp = temp / 10 ;
					 }
					
					while ( temp1 > 0 ) //anagram number check
					{
						remind = temp1 % 10 ;
						while ( count > 0 ) 
						{
							multi = multi * multi ;
							count-- ;
						}
						sum1 = multi + sum1 ;
						temp1 = temp1 / 10 ;				
					}
					if( sum1 == row ) 
					{
						System.out.println ( "given number is anagram" + sum1 ) ;
					}
					
					while(temp2>0) //palindrome number check
					{
						remind1=temp2%10;
						 sum=(sum*10)+remind1;
						 temp2=temp2/10;
					}
					
					if(sum==row) 
					{
					//	System.out.println("given number is palindrome "+sum);
					}		
				}		
		}			

	}

}
