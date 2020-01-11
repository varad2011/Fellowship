package com.bridgelabz.programs.datastructure;



public class PrimeAnagramNumberCheckUsingStack 
{
		
	
	class Node 
	{
	 int data ;
	 Node next ;
	 
	}
	
	 Node top ;
	 PrimeAnagramNumberCheckUsingStack() 
	    { 
	        this.top = null ; 
	    } 
	 public  void  push( int data ) 
	 {
		 Node temporary = new Node() ;
		 
		
			 temporary.data = data ; 
			  
		        
		     temporary.next = top ; 
		  
		     top = temporary ; 
		 
	 }
	 
	  
	    public void pop() 
	    {
	        if ( top == null ) 
	        { 
	            System.out.print( "stack is empty" ) ; 
	            return ; 
	        } 
	  
	       
	        top = top.next ; 
	 
	 
	    }
	    public void display() 
	    { 
	        
	        if (top == null) { 
	            System.out.println( " Stack Underflow " ) ; 
	            
	        } 
	        else 
	        { 
	            Node temp = top ; 
	            while ( temp != null ) 
	            { 
	            	
	               
	                System.out.println(  temp.data ) ; 
	  
	               
	                temp = temp.next ; 
	            } 
	        } 
	    }
	
	   public void arrayToStore( int array[] ) 
	   {
		   PrimeAnagramNumberCheckUsingStack   newPrimeNumberClass1 = new PrimeAnagramNumberCheckUsingStack   () ;
		   Node  current  = top ;
		  // int array[] = new int [1000] ;
		   for( int i = array.length-1 ;i>0 ;i--) 
		   {
			   newPrimeNumberClass1.push(array[i]);
			  // System.out.println( array[i]);
		   }
		   
	   }
	    
	    
	public static void main(String[] args)
	
	{		
		PrimeAnagramNumberCheckUsingStack   newPrimeNumberClass = new PrimeAnagramNumberCheckUsingStack   () ;
		int array[] = new int [1000] ;
		int number = 1000 ;	
		int i = 0 ;
		for ( int numberIterator = 2 ;  numberIterator < number ;  numberIterator++ ) 
		{	
			boolean primeNumberCheckFlag = true ;
			for ( int devidingNumber = 2 ; devidingNumber <= numberIterator / 2 ; devidingNumber++ ) 
			{
				if ( numberIterator % devidingNumber == 0 ) 
				{
					primeNumberCheckFlag = false ;
					break;	
				}
				else 
				{
					primeNumberCheckFlag = true ;
				}			
			}
			if ( primeNumberCheckFlag == true ) 
			{
			
				 array[i] = numberIterator ;
				 
				 newPrimeNumberClass.push( numberIterator ) ;
				 i++ ;
				
			}
		}
		
		//newPrimeNumberClass.arrayToStore(array);
		newPrimeNumberClass.display();
	}

}
