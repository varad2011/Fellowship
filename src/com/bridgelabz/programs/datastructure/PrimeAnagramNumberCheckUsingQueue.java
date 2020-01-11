package com.bridgelabz.programs.datastructure;

public class PrimeAnagramNumberCheckUsingQueue < T > 
{	
	 public class Node <  T > 
	{
		T data ;
		Node next ;
		
		public Node( T data ) 
		{
			this.data =  data  ;
			this.next = null ; 
			
		}
	}
	 	int size  = 0;
		Node  front ; 
		Node  rear  ;
		
		
		 public void equeue (T data)
		  {
			  Node newNode = new Node( data ) ;
			    if(front == null ) 
			    {
			     front = newNode ;
			     rear = newNode ;
			    }
			    else 
			    {
			    	rear.next  = newNode ;
			    	rear = newNode ;
			    }
		  }
		public void  dequeue ( ) 
		{   
			if( front == null ) 
			{
				System.out.println( " list is empty " ) ;	
			}
			else
			{
				if (rear == front ) 
				{
					rear = null ;
					front = null ;
				}
				else 
				{
					front = front.next ;
				}
			}

			
			 
			
		}
		
		public void displaydata () 
		{ 
			 Node current = front ;
			 if ( front == null ) 
			 {
				 System.out.println( " list is emplty ") ;
			 }
			 else 
			 {
				 while ( front != null ) 
				 {
					 System.out.println( front.data ) ;
					 front = front.next ;
				 }
			 }
 		}
		
	
	public static void main(String[] args) 
	
	{	
		PrimeAnagramNumberCheckUsingQueue < Integer > newPrimeNumberClass = new PrimeAnagramNumberCheckUsingQueue < Integer > () ;
		
		int number = 1000 ;	
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
			
				newPrimeNumberClass.equeue ( numberIterator ) ;
				
			}
		}
		newPrimeNumberClass.displaydata () ;
	}
	

}
