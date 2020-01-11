package com.bridgelabz.programs.algorithms;

import java.util.Arrays;

public class Anagram {
    public static char[] tocharCon ( String string ) 
   
    {   
    	char arr[] = new char[ string.length () ] ;
    	for(int row = 0 ; row < string.length () ; row++ ) 
    	
    	{
    		arr[row] = string.charAt ( row ) ;
    	
    	}
    	
     	return arr ;
    }
    
    public static char[] sorting ( char[] ch ) 
    
    {
    	for ( int row = 0 ; row < ch.length ; row++) 
    	
    	{
    		
    		for ( int j = 1 ; j < ch.length ; j++ ) 
    	
    		{
    			if( ch[j] < ch[j-1] ) 
    		
    			{
    		
    				char temp = ch[j] ;
    				ch[j] = ch[j-1] ;
    				ch[j-1] = temp ;
    		
    			}
    		}
    	
    	
    	}
    	
    	return ch ;
    }
    
	public static void main(String[] args) 
	{
		String string1 = "ahbcmd" ;
		String string2 = "bdmhca" ;
		int count = 0 ;
		char arr[] = Anagram.tocharCon ( string1 ) ;
		char arr2[] = Anagram.tocharCon ( string2 ) ;
		Anagram.sorting ( arr ) ;
		Anagram.sorting( arr2) ;
		if ( arr.length == arr2.length ) 
		{
			
			for ( int row = 0 ; row < arr.length ; row++ ) 
			{
				if ( arr[row] != arr2[row] ) 
				{
					System.out.println ( " given String " + string1 + " and " + string2 + " two string are not anagram " ) ;
					break ;
				}
				else
				{
					count++ ;
				}
				
			}
			
			if ( count == arr.length ) 
			{
				System.out.println ( "given String " + string1 + " and " + string2 + " is anagram ") ;
				
		
			}
			
		}
		else 
		{
			System.out.println ( "given String " + string1 + " and " + string2 + " is not anagram" ) ;
		}
		
		

	}

}
