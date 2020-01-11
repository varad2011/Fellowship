package com.bridgelabz.programs.datastructure;

import java.util.Scanner;

public class Calender
{  
	public static int  dayOfWeek(int day ,int month,int year) 
	{	
		
		
		
		int  y0,m0,x;
		int d0;  
		String weekday =null;

		y0=year-(14-month)/12;  
											
		x= y0 + y0 / 4 - y0 / 100 + y0 / 400 ; 
														
		m0 = month + 12 * ( ( 14 - month ) / 12 ) - 2 ; 
											
		d0 = ( day + x + ( 31 * m0 ) / 12 ) % 7 ;
		
		
		
		
		
		return d0;
	}
	
	public static void Printday(int d0 ) 
	{
		String weekday = null ;
	
		switch(d0)
		{
		
		case 0:
			weekday="sunday";
			break;
		case 1:
			weekday="monday";
			break;
		case 2:
			weekday="tuesday";
			break;
		case 3:
			weekday="wednesday";
			break;
		case 4:
			weekday="thusday";
			break;
		case 5:
			weekday="friday";
			break;
		case 6:
			weekday="saturday";
			break;
		}	
		
		System.out.println( weekday ) ;
	}
	

	public void print( String [][] array ) 
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
		Calender queue = new Calender() ;
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
		if(daynumber == 1) 
		{
			for( int i = 0 ; i< 1 ; i++ ) 
			{
				for( int j = 0 ; j < calender[i].length ; j++ ) 
				{
 	    		
					String storeInArray = String.valueOf( daynumber) ;
					if(j < dayWeek) 
					{
 	    			
						storeCalender[i][j] = "     " ;
					}
					else 
					{
						daynumber++ ;
	 	    		
						storeCalender[i][j] = "0"+storeInArray+"   " ;
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
	    		 
	    		
    					storeCalender[i][j] = "0"+storeInArray1+"   " ;
    					daynumber++ ;
	    				
	    			}
    			}
    			else 
    			{
    				
    				if ( month[ month1-1] >= daynumber ) 
	    			{	
	    		 
	    		
    					String word = ""+storeInArray1+"   " ;
    					storeCalender[i][j] = word ;
    					daynumber++ ;
	    				
	    			}
    				
  	 			}
    			
    			
 	    		
 	    	}
 	    	
		}
    	
    
		queue.print( storeCalender ) ;
	   
	   
	}
	
	    		 
	    
}
