package com.bridgelabz.programs.datastructure;

import java.util.Scanner;

public class Queue 

{	String  queue[] = new String[ 10 ] ;
	int size ;
	int front;
	int rear ;
	public void enQueueRear (String data ) 
	{
		queue[ rear ] = data ;
		rear = rear + 1 ;
		size = size + 1 ;
	}
	public void enQueueFront ( String data ) 
	{
		queue[ front ] = data ;
		
		size = size + 1 ;
		
	}
	public void display ( ) 
	{
		for ( int i = 0 ;i < size ; i++ ) 
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
		Queue newQueue = new Queue() ;
		
	
		
	}

}
