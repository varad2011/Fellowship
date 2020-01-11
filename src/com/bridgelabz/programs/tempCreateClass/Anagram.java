package com.bridgelabz.programs.tempCreateClass;

import java.text.Collator;
import java.util.Arrays;

public class Anagram {

	public static void  angramCheck( ) 
	{
	 int number = 17 ;
	 int arr[ ][ ] = new int [0][100] ;
	
		 
	 		int count = 0 ;
			int temp = number ;
			int temp1 = number ;
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
			
			 for( int i = 0 ; i< arr.length ; i++ ) 
			 {
				 String string1 = String.valueOf( sum1 ) ;
				 String string2 = String.valueOf( i ) ;
				 if( string1 == string2 ) 
				 {
					System.out.println("anagram " ) ; 
				 }
			 }
	}
	
	
	public static void main(String[] args) 
	{

		 int number = 17 ;
		 int arr[ ] = {  711 } ;
		 

			int temp2 = number ;
			int remind1 ;
			int sum = 0 ;
			while ( temp2 > 0 ) //palindrome number check
			{
				remind1 = temp2 % 10 ;
				 sum = ( sum * 10 ) + remind1 ;
				 temp2 = temp2 / 10 ;
			}
			
			 
			for(int i = 0 ; i< arr.length ; i++ )
			{
				if(sum == arr[i]) 
				{
				System.out.println(" angram ") ;	
				}
			}
					 
				
				
	
		

	}

}
