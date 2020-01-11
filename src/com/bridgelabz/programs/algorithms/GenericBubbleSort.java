package com.bridgelabz.programs.algorithms;

public class GenericBubbleSort 
{

	public static void main(String[] args) 
	{   Integer unSortArray [] = {  3 , 4 , 2 , 8 , 1 , 9 } ;
		GenericBubbleSort.bubbleSort(unSortArray);
		GenericBubbleSort.display(unSortArray);
	}
	public static < T > void display ( T [] arrayToDisplay) 
	{
			for( T iterator : arrayToDisplay ) 
			{
				System.out.println(iterator);
			}
	}
	public static < T extends Comparable < T > > void bubbleSort( T [] unSortArray )
	{
		for(int i = 0 ; i < unSortArray.length ; i++ ) 
		{
			for( int j = 1 ; j < unSortArray.length ; j++ ) 
			{
				if( ( unSortArray[j] ).compareTo( unSortArray[j-1] ) > 0) 
				{
					T tempStoreElement =  unSortArray[j] ;
					unSortArray[ j ] = unSortArray[ j - 1 ] ;
					unSortArray[ j - 1 ] = tempStoreElement ; 
				}
			}
		}
	}

}
