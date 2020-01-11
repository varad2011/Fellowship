package com.bridgelabz.programs.algorithms;

public class BubbleSorting 
{
	
	public static void printArray ( int [] arrToSort ) 
	{
		for(int i = 0;i < arrToSort.length ; i++) 
		{
			System.out.println(arrToSort[i]);
		}
	}
	public static void sortArray ( int[] arrToSort ) 
	{
		for ( int row = 0 ; row < arrToSort.length ; row++ ) 
		{
			for ( int cell = 1 ; cell < arrToSort.length-row ; cell++ ) 
			{
				
				if( arrToSort[ cell ] < arrToSort[ cell - 1 ] ) 
				{
					int temp = arrToSort[ cell ] ;
					arrToSort[ cell ] = arrToSort[ cell - 1 ] ;
					arrToSort[ cell - 1 ] = temp ;
					
					
				}
			}
		}
	}
	public static void main(String[] args) 
	{
		int arrToSort [] = {3,5,2,1,8,4} ;
		BubbleSorting.sortArray ( arrToSort) ;
		BubbleSorting.printArray(arrToSort);
		

	}

}
