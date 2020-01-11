package com.bridgelabz.programs.datastructure;

import java.util.Scanner;

public class BankCashCounter  
{	

	String  queue[] = new String[ 3 ] ;
	int size ;
	int  front ;
	int rear  ;
	
	public void enQueue (String data ) 
	{
		queue[ rear ] = data ;
		rear = rear + 1 ;
		size = size + 1 ;
	}
	public void display ( ) 
	{
		for ( int i = 0 ; i < size ; i++ ) 
		{
			System.out.println( queue[front + i] ) ;
		}
	}
	public String deQueueFront () 
	{  
		
		String data = queue[ front ] ;
		front = front + 1 ;
		size = size -1 ;
		
		return data  ;
	}
	public String  deQueueRear() 
	{
		String data =  queue[ rear -1 ] ;
		rear = rear - 1 ;
		size = size - 1 ;
		
		return data ;
	
	}
	

	public static void main(String[] args) 
	{ 
		BankCashCounter queue = new BankCashCounter() ;
		int amount = 100 ; 
		 String userInput ;
		Scanner scanner = new Scanner ( System.in ) ;
		queue.enQueue( "varad" ) ;
		queue.enQueue( "sharad" ) ;
		queue.enQueue( "raju" ) ;
		queue.display ( ) ;
		int size1 = queue.size ;
		for(int i = 0  ; i <= size1 ; i++  )
		{	
			
			if ( amount > 0 ) 
			{
				System.out.println(" welcome  do u want to credit cash press yes  and  No to withdraw");
				
				 userInput = scanner.nextLine() ;
				
			
			switch (userInput)
			{
			case "yes"	:
				System.out.println( " enter amount " ) ;
				
				int amountTo = scanner.nextInt() ;
			
				amount = amount + amountTo	;
			
				queue.deQueueFront() ;
				break ;
				
			case "no"	:
				System.out.println( " enter amount " ) ;
				int amountTo1 = scanner.nextInt() ;
			
					
					amount = amount - amountTo1 ; 
				
					queue.deQueueFront() ;
				break;	
			}
			
		
			}
		
		}	
	

	}

}
