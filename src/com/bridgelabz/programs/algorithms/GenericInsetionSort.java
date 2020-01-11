package com.bridgelabz.programs.algorithms;

public class GenericInsetionSort {

	public static void main(String[] args)
	{	
		String [] arrayToSort = { "d" , "e" , "c" , "a"  } ;
		Integer [] intAraayToSort = { 4 , 5 , 7 , 1 , 3 , 8 } ; 	
		GenericInsetionSort.sortArray( arrayToSort ) ;
		GenericInsetionSort.display( arrayToSort ) ;
	}
	public static <E> void display( E [] listDisplay ) 
	{
		for( int i = 0 ; i < listDisplay.length ; i++  ) 
		{
			System.out.println( listDisplay[i] ) ;
		}
	}
	public static < T extends Comparable < T > > void sortArray ( T [] arrayToSort) 
	{
		for ( int  i = 0 ; i < arrayToSort.length ; i++ ) 
		{
			for ( int   j = i+1 ; j < arrayToSort.length ; j++ ) 
			
			{
				if (  ( arrayToSort[ i ] .compareTo( arrayToSort[ j ] ) ) > 0 ) 
				{
					T temp = arrayToSort[ i ] ;
					arrayToSort[ i ] = arrayToSort[ j ] ;
					arrayToSort[ j] =  temp ;
				}
					
				
			}
		}
	}
}

