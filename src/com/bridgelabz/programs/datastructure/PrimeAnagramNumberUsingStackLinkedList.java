package com.bridgelabz.programs.datastructure;

public class PrimeAnagramNumberUsingStackLinkedList 
{		
	class Node 
	{
	 int data ;
	 Node next ;
	 
	}
	
	 Node top ;
	 PrimeAnagramNumberUsingStackLinkedList() 
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
	  
	       
	        top = (top).next ; 
	 
	 
	    }
	    public void display() 
	    { 
	        
	            Node temp = top ; 
	            while ( temp != null ) 
	            { 
	  
	               
	                System.out.println(  temp.data ) ; 
	  
	                
	                temp = temp.next ; 
	            } 
	      
	    }
	
	    
	    public static  void  checkAnagram( int [] arrayToStorePrimeNumber  ) 
	    {  
	    	PrimeAnagramNumberUsingStackLinkedList primeNumberStore =  new PrimeAnagramNumberUsingStackLinkedList() ;
	    	
	    	for(int i = 0 ; i < arrayToStorePrimeNumber.length ; i++ ) 
	    	{
	    		int NumberToCheckCount = arrayToStorePrimeNumber[ i ] ;
	    		int remind1;
	    		int sum = 0 ;
	    		while ( NumberToCheckCount  > 0 ) 
				{
					 remind1 = NumberToCheckCount  % 10 ;
					 sum = ( sum * 10 ) + remind1 ;
					 NumberToCheckCount  = NumberToCheckCount  / 10 ;
				}
	    		
	    		for ( int j = 0  ; j < arrayToStorePrimeNumber.length ; j++ ) 
	    		{
	    			if ( sum == arrayToStorePrimeNumber[j] ) 
	    			{
	    				primeNumberStore.push(  arrayToStorePrimeNumber[j]) ;
	    			}
	    		}
	    	}
	    
	    }

	public static void main(String[] args) 
	{	
		PrimeAnagramNumberUsingStackLinkedList primeNumberStore =  new PrimeAnagramNumberUsingStackLinkedList() ;
		
		int number = 1000 ;	
		int arrayToStorePrimeNumber [] = new int [400] ;
		int storeOnLocation = 0 ;
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
			
				arrayToStorePrimeNumber [storeOnLocation] =  numberIterator ;
				//primeNumberStore.push( numberIterator ) ;
				storeOnLocation++ ;
			}
		}
		primeNumberStore.checkAnagram( arrayToStorePrimeNumber ) ;
		primeNumberStore.display() ;
	}
	
}
