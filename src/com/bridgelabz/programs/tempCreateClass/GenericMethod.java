package com.bridgelabz.programs.tempCreateClass;

import java.util.Collection;

public class GenericMethod {
	public static <E> void genericMethod( E[] element ) 
	{
		for(int row = 0 ; row<element.length ; row++ ) 
		{
			System.out.println( element[row] ) ;
		}
	}
	public static <T> void collectionSort( T[] list , Collection<T> collection ) 
	{
		for ( T iteratorList : list) 
		{
			collection.add(iteratorList);
		}
	}
	public static void main(String[] args) 
	{
		Integer arrayList[] = { 1 , 5 , 4 , 3 , 7 , 8 , } ;
		String stringword[] = { "name" , "home0" , "old" , "high" } ;
		GenericMethod.genericMethod( stringword ) ;
		GenericMethod.genericMethod( arrayList ) ;
	}

}
