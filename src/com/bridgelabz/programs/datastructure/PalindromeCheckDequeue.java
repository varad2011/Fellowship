package com.bridgelabz.programs.datastructure;

import java.util.Scanner;

import com.bridgelabz.programs.datastructure.OrderList.Node;

public class PalindromeCheckDequeue 
{
	
	String  queue[] = new String[ 10 ] ;
	int size ;
	int front;
	int rear ;
	public void enQueue (String data ) 
	{
		queue[ rear ] = data ;
		rear = rear + 1 ;
		size = size + 1 ;
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
	
	public String userInput( ) 
	{
		Scanner scanner = new Scanner( System.in ) ;
		
		System.out.println( " enter String to check palindrome " ) ;
		String name = scanner.nextLine() ;
		
		return name ;
	}
	public static void main(String[] args) 
	{
		PalindromeCheckDequeue  newQueue = new PalindromeCheckDequeue () ;
		String word = newQueue.userInput() ;
		String reverseString = "" ;
		boolean anagramCheckFlag  = true ;
		for(int i = 0 ; i < word.length() ; i++ ) 
		{
			char stringChar = word.charAt( i ) ;
			
			newQueue.enQueue( String.valueOf ( stringChar ) ) ;
			
		}
		for ( int j = 0 ; j < word.length() ; j++ ) 
		{
			String charaFront = newQueue.deQueueFront() ;
			String charaRear =  newQueue.deQueueRear() ;
			if ( ( (charaFront ).compareToIgnoreCase( charaRear ) )  > 0 ) 
			{
				 anagramCheckFlag  = false ;
			}
			
		}
		System.out.println( reverseString ) ;
		
		if ( anagramCheckFlag == true  ) 
		{
			System.out.println( " Given String " +word+  " is palindrome" ) ;
		}
		else 
		{
			System.out.println(" Given String " + word +  "is Not palindrome" ) ;
		}
	}
	

}


