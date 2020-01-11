package com.bridgelabz.programs.tempCreateClass;

public class GenericClass<T> 
{
	private T name;
	public T getName()
	{
		return name;
	}
	public void setName( T name ) 
	{
		this.name = name ;
	}
	public static void main( String[] args ) 
	{
		GenericClass< String >  genericString = new GenericClass<String>() ;
		genericString.setName( "varad" ) ;
		
		GenericClass classGeneric = new GenericClass() ;
		classGeneric.setName( "varad" ) ;
		classGeneric.setName( 12 ) ;
		
	}

}
