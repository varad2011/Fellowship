package com.bridgelabz.programs.datastructure;

import java.util.Scanner;

import com.bridgelabz.programs.datastructure.PrimeAnagramNumberCheckUsingStack.Node;



public class CalenderQueueWithTwoStack 
{
	class Node 
	{
	 String data ;
	 Node next ;
	 
	}
	
	 Node top ;
	
	
	 public void push1(String x) {
			Node temp = new Node();
			if (temp == null) {

				System.out.println(" overflow ");
			}

			temp.data = x;
			//temp.link = top;
			top = temp;
			temp.data = top.data ;
	 }
	 
	 public  void  push( String data ) ////
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
	    
	    public String pick() 
	    {   String data = top.data ;
	    	 if ( top == null ) 
		        { 
		            System.out.print( "stack is empty" ) ; 
		            
		        } 
		  
		       
		        top = top.next ; 
		        
		        return  data ;
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
			
			public void displaydata () 
			{ 
				
				 if ( top ==null ) 
				{
					 System.out.println( " list is emplty ") ;
				 }
				 else 
				 {	
					 Node current = top ;
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
	
			
			public void addToReverseStack ( ) 
			
			{
				String  storeCalender[][] = new String [5][7] ;
				CalenderQueueWithTwoStack queue1 = new CalenderQueueWithTwoStack();
				
				for(int i = storeCalender.length-1 ; i >=0 ; i-- ) 
				
				{
					for( int j =storeCalender[i].length-1 ; j >= 0 ; j-- ) 
					
					{
						storeCalender[i][j] = queue1.pick();
					
						System.out.println(storeCalender[i][j] );
					}
				}
			}
			
	public static void main(String[] args) 
	{
		CalenderQueueWithTwoStack queue = new CalenderQueueWithTwoStack  () ;
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
		System.out.println( "sun  mon  tue  wed  thu  fri  sat " ) ;  
		String [] weekday = { "sun" ,"mon" ,"tue" ,"wed","thu" ,"fri" ,"sat" } ;
		
		
			for( int i = 0 ; i< 1 ; i++ ) 
			{
				for( int j = 0 ; j < calender[i].length ; j++ ) 
				{
 	    		
					String storeInArray = String.valueOf( daynumber) ;
					if(j < dayWeek) 
					{
 	    			
						storeCalender[i][j] = "     " ;
						queue.push( "     " ) ;
					}
					else 
					{
						daynumber++ ;
	 	    		
						storeCalender[i][j] = "0"+storeInArray+"   " ;
						queue.push( "0"+storeInArray+"   " ) ;
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
	    		 
	    		
    					storeCalender[i][j] = "0"+storeInArray1+"   " ;
    					daynumber++ ;
    					queue.push("0"+storeInArray1+"   ");
	    			}
    			}
    			else 
    			{
    				
    				if ( month[ month1-1] >= daynumber ) 
	    			{	
	    		 
	    		
    					String word = ""+storeInArray1+"   " ;
    					storeCalender[i][j] = word ;
    					daynumber++ ;
    					queue.push(""+storeInArray1+"   ");
	    			}
    				
  	 			}
    			
    			
 	    		
 	    	}
 	    	
		}
		
		queue.addToReverseStack() ;
		
	//	queue.displaydata() ; 
    	
	}
}
