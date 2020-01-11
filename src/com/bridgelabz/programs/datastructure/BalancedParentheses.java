package com.bridgelabz.programs.datastructure;

public class BalancedParentheses 
{
	int stackMaxSize ;
	long [] arrayStack ;
	int top ;
	
	BalancedParentheses ( int  maxSize )
	{
		stackMaxSize = maxSize ;
		arrayStack  =  new long[stackMaxSize] ;
		top = -1 ;
	}
	
	public void push (long  data ) 
	{   top = top + 1 ;
		arrayStack[ top ] = (long) data ; 
	}
	public long pop () 
	{	
		return arrayStack[ top -- ] ;
	}
	public long peek () 
	{
		return arrayStack[ top ] ;
	}
	
		public boolean isEmpty () 
		{
		return top == -1 ;
		}
	public boolean checkParentheses ( String expression) 
	{    int count = 0 ;
		BalancedParentheses  newStack = new BalancedParentheses ( 10 ) ;
		for( int i = 0 ; i < expression.length() ; i++) 
		{
			char charAtString = expression.charAt( i ) ;
			if ( ( charAtString == '(' )  ) 
			{
				newStack.push( expression.charAt( i )  ) ;
			}
			else if (  (charAtString == ')') ) 
			{	
				
				newStack.pop() ;
				
			}	
		
		}
		
		
	
	return newStack.isEmpty();
		
		
		
	}
	
	public static void main(String[] args) 
	{
		//(5+)6∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3)
		
		BalancedParentheses  newStack = new BalancedParentheses ( 5 ) ;
		//newStack.push( 2 ) ;
		//newStack.push( 5 ) ;
		//newStack.pop() ; 
		String expression = "(5+)6∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3)" ;
		boolean checkArithmaticExpression = newStack.checkParentheses( expression ) ; 
		
		if ( checkArithmaticExpression == true ) 
		{
		System.out.println( " Arithmetic Expression is balanced " ) ;	
		}
		else 
		{
			System.out.println( " not valid " ) ;	
		}
	/*	while ( !newStack.isEmpty() ) 
		 {
			 System.out.println( newStack.pop() ) ;
		 }*/
		 //	System.out.println( newStack ) ;
	}

}
