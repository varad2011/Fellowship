package com.bridgelabz.programs.algorithms;

import java.util.Scanner;

public class PermutationOfString 
    
{	
	public static String getUserInputString () 
	{
		Scanner scanner = new Scanner(System.in) ;
		System.out.println ("enter String " );
		String userInput = scanner.nextLine() ;
		return userInput ;
	}
    public static char[] stringToChar ( String string ) 
    	{
    		char cha[] = new char [ string.length() ] ;
    		for ( int i = 0 ; i < string.length() ; i++ ) 
    		{
    			cha[i] = string.charAt(i) ;
    		}
    		return cha ;
    	}
	public static void permutation ( char[] cha , int numberOfFactor ) 
	{	char temp ;
		while( numberOfFactor != 0 ) 
		{
			for ( int i = 0 ; i < cha.length ; i++ ) 
			{
				for ( int j = 0 ; j < cha.length ; j++ ) 
				{
						temp = cha[i] ;
						cha[i] = cha[j] ;
						cha[j] = temp ;
						
						if ( i != j ) 
						{	
							System.out.println ( cha ) ;	
						
							numberOfFactor -- ;
	
						}
				}
				
			}
			
		}	
	
	}
	
	public static int numberCount ( char[] cha) 
	{	
		 
			int count = cha.length ;
			int number = 1 ;
			char temp ;
			while ( count > 0 ) 
			{
				number = number * ( count ) ;
				count -- ;
			}
	
		return number ;
	}

	public static void main(String[] args) 
	{	
		String userEnterString = PermutationOfString.getUserInputString() ;
		
		char[] cha = PermutationOfString.stringToChar ( userEnterString ) ;
		
		int numberOfFactor = PermutationOfString.numberCount ( cha ) ;
		
		PermutationOfString.permutation( cha , numberOfFactor ) ; 
		
	}
}

