package com.bridgelabz.programs.algorithms;

import java.util.Arrays;

public class BinarySearchWord 
{
	public static int checkRepeat( String[] arrToCheck , String word) 
	{
		int lowerIndex = 0 ;
		int higherIndex = arrToCheck.length - 1 ;
		while ( higherIndex >= lowerIndex) 
		{
			int middleIndex = lowerIndex + ( higherIndex - lowerIndex ) / 2;
			if ( word.compareTo( arrToCheck[middleIndex] ) == 0 ) 
			{
				return middleIndex ;
			}
			if( word.compareTo ( arrToCheck[middleIndex] ) > 0 ) 
			{
				lowerIndex =middleIndex + lowerIndex ;
			}
			else 
			{
				higherIndex =middleIndex - lowerIndex ;
			}
			
		}
		return 0 ;
	}
	public static void main(String[] args)
	{
		String wordList[] = { "pop" , "function" , "home" , "name" } ;
		 
		Arrays.parallelSort(wordList);
		
 		int result = BinarySearchWord.checkRepeat ( wordList , "name" ) ;
		if ( result == 0 ) 
		{
			System.out.println ( "element are not present" ) ;
		}
		else 
		{
			System.out.println( "elemnt is present at index " + result ) ;
		}
	}

}
