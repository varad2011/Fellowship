package com.bridgelabz.programs.algorithms;

public class InsertionSorting 
{

	public static void main(String[] args) 
	{
		String word[] =  { "m" , "e" , "a" , "b" } ;
		for ( int i = 0 ; i < word.length ; i++ ) 
		{
			for ( int j = i + 1 ; j < word.length ; j++ ) 
			{
				if ( word[ i ].compareToIgnoreCase ( word[j] ) > 0) 
				{
					String temp = word[i] ;
					word[i] = word[j] ;
					word[j] = temp ;
				}
				
			}
		}
		
	
	
		
		for ( int k = 0 ; k < word.length ; k++ ) 
		{
			System.out.println ( word[k] ) ;
		}
	}
	

}
