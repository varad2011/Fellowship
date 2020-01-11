package com.bridgelabz.programs.datastructure;

import java.util.Scanner;

public class CalenderQueue <T >
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
		 	int size  = 0 ;
			Node  front ; 
			Node  rear  ;
			
			
			 public void equeue ( T data )
			  {
				  Node newNode = new Node( data ) ;
				    if ( front == null ) 
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
					if ( rear == front ) 
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
					 
					 int count = 1 ;
					
					 while ( current != null ) 
					 {	
						
						 if(count  < 7 ) 
						 {
							 System.out.print( current.data ) ;
							 current = current.next ;
							 count = count + 1 ;
						 }
						 else 
						 {
							 
							 System.out.print( current.data ) ;
							 System.out.println();
							 current = current.next ;
							 count =  1 ;
						 }
						
					 }
				 }
			}	 
	
			public void print( T [][] array ) 
			{
				for ( int i = 0 ; i < array.length ; i++ ) 
				{
					for( int j = 0 ; j < array[i].length ; j++ ) 
					{
						if ( array[i][j] == null ) 
						{
						 break ;	
						}
						else 
						{
							System.out.print( array[i][j] ) ;
						}
								
					}
					System.out.println() ;
				}
			}
	public static void main(String[] args) 
	{
		
		CalenderQueue< String > queue = new CalenderQueue< String >() ;
		
		int[][] calender = new int[5][7] ;
		String [][] storeCalender = new String [5][7] ;
	    int[] month = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 } ; 
	    Scanner scanner = new Scanner( System.in ) ;
	    int day = 1 ;
	    System.out.println( " enter month" ) ;
	    int month1 = scanner.nextInt() ;
	    System.out.println( " enter yr " ) ;
	    int year = scanner.nextInt() ;
	    int  dayWeek = Calender.dayOfWeek( day , month1 , year) ; 
	    int daynumber = 1 ;
	    Calender.Printday(dayWeek);
	    String dayOfweek [] = { "sun" ,"mon", "tue" ,"wed","thu","fri","sat" } ;
	   
	    for(int k = 0 ; k < dayOfweek.length ; k++ ) 
	    {
	    	queue.equeue( dayOfweek[k] +"  ") ;
	    }
	    if(daynumber == 1) 
	    {
	    	 for( int i = 0 ; i< 1 ; i++ ) 
	 	    {
	 	    	for( int j = 0 ; j < calender[i].length ; j++ ) 
	 	    	{
	 	    		
	 	    		String storeInArray = String.valueOf( daynumber) ;
	 	    		
	 	    		if(j < dayWeek) 
	 	    		{
	 	    			queue.equeue( "     ");
	 	    		}
	 	    		else 
	 	    		{
	 	    			daynumber++ ;
		 	    		queue.equeue("0"+storeInArray+"   ") ;
	 	    		}
	 	    	}
	 	    }
	    }
	    
	   
	    	for( int i = 1 ; i< calender.length ; i++ ) 
	 	    {
	 	    	
	    		for( int j = 0 ; j < calender[i].length ; j++ ) 
	 	    	{  
	    			String storeInArray1 = String.valueOf( daynumber) ;
	    			if( daynumber < 10 )
	    			{
	    				if( month[month1-1] >= daynumber) 
		    			{	
		    		 
		    			queue.equeue( "0"+storeInArray1+"   " ) ;
		    			daynumber++ ;
		    				
		    			}
	    			}
	    			else 
	    			{

	    				if ( month[ month1-1] >= daynumber ) 
		    			{	
		    		 
		    			queue.equeue( ""+storeInArray1+"   " ) ;
		    			daynumber++ ;
		    				
		    			}
	    			}	
	 	    	}
	 	     }
	    	
	    	queue.displaydata();
	}

}
