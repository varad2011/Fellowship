package com.bridgelabz.programs.algorithms;

public class Merge 
{	
	

	public static void sort(int[] arrToSort, int lowerIndex, int higherIndex ) 
	
	{
		
		if(lowerIndex < higherIndex) 
		
		{ 
			int middlePoint = lowerIndex +( higherIndex-lowerIndex) / 2;
			sort(arrToSort, lowerIndex, middlePoint) ;
			
		
			sort(arrToSort, middlePoint+1, higherIndex) ;	
			merge(arrToSort,lowerIndex,middlePoint,higherIndex);
			
			
		}
		
	}
	public static void merge(int[] arrToSort, int lowerIndex, int middlePoint, int higherIndex) {
		
		int sizeOfSubArray1 = middlePoint-lowerIndex+1 ;
		int sizeOfSubArray2 = higherIndex-middlePoint ;
		int subArray1 [] = new int [sizeOfSubArray1] ;
		int subArray2 [] = new int [sizeOfSubArray2] ;
		for(int i = 0 ; i <subArray1.length ; i++) 
		
		{
			subArray1 [i] = arrToSort [ i + lowerIndex];
		}
		
		for(int j = 0 ; j < subArray2.length ; j++) 
		
		{
			subArray2 [j] = arrToSort [middlePoint + 1 + j ];
		}
		
		int i = 0,j = 0;
		int k = lowerIndex;
		
		while((i<sizeOfSubArray1) && (j<sizeOfSubArray2)) 
		{
			  if (subArray1[i] <= subArray2[j]) 
	            { 
	                arrToSort[k] = subArray1[i]; 
	                i++; 
	            } 
	            else
	            { 
	                arrToSort[k] = subArray2[j]; 
	                j++; 
	            } 
	            k++; 
		}
		
        while (i < sizeOfSubArray1) 
        { 
            arrToSort[k] = subArray1[i]; 
            i++; 
            k++; 
        } 
  
       
        while (j < sizeOfSubArray2) 
        { 
            arrToSort[k] = subArray2[j]; 
            j++; 
            k++; 
        } 
	}
	
	public static void  printArray ( int[] arrayToPrint ) 
	{
		for(int i = 0 ; i < arrayToPrint.length ; i++) {
			System.out.print(arrayToPrint[i]+" ");
		}
	}
	public static void main(String arg[]) 
	
	{
	int arrToSort [] = {3,2,6,1,8,4,6};	
	Merge.sort(arrToSort, 0, arrToSort.length-1);
	Merge.printArray(arrToSort);
	}

	
	
}



	