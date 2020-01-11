package com.bridgelabz.programs.datastructure;



public class stack 
{
	
	class Node 
	{
	 int data ;
	 Node next ;
	 
	}
	
	 Node top ;
	 int size ;
	 public  void  push( int data ) 
	 {
		 Node temporary = new Node() ;
		 
		
			 temporary.data = data ; 
			  
		        
		     temporary.next = top ; 
		  
		     top = temporary ; 
		    
			size = size + 1 ;
		 
	 }
	 
	  
	    public void pop() 
	    {
	        if ( top == null ) 
	        
	        { 
	            System.out.print( "stack is empty" ) ; 
	            return ; 
	        } 
	  
	        top = top.next ; 
	        size = size -1 ;
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
	    
	    public int  getSize() 
	    {
	    	return size;
	    }
	    
	    public boolean isEmpty() 
	    
	    {
	    	return top == null ;
	    }
	    
	  
		
}		 
