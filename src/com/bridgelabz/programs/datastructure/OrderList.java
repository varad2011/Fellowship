package com.bridgelabz.programs.datastructure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Scanner;

import com.bridgelabz.programs.tempCreateClass.GenericDataStructureDemo;



public class OrderList < T >
{

	class Node < T >
	{
		T data;
	 	Node next;
	 	Node( T data )
	 	{
	 		this.data =  data ;
	 		this.next = null ;
	 	}
	 	
	}
	int size ;
	Node head;
	
	Node tail;
	
	public   void  readFile( String  fileLocation  , T wordToCheck ) throws IOException 
	{	OrderList < Integer > newlist = new OrderList < Integer >() ;
		
		File file = new File( fileLocation ) ;
		FileReader fileReader = new FileReader( file ) ;
		BufferedReader bufferReader = new BufferedReader( fileReader ) ;
		String word =  bufferReader.readLine() ;
		
		while ( word != null ) 
		{
			Node newNode = new Node( word ) ;
			if( head == null  ) 
			{
				head = newNode ; 
				tail = newNode ;
				size++ ;
			}
			else 
			{
				tail.next = newNode;
				tail = newNode ;
				size++ ;
			}
			word = bufferReader.readLine() ;
			
		}
		Node current = head;
		Node tempStore = null ;
	 
		while( current.next != null ) 
		{
			if( ( (String.valueOf(current.data)).compareTo( String.valueOf( wordToCheck) ) ) == 0 ) 
			{
			 	tempStore.next = current.next ;
			 	current = null ;
			 	break ;
 			}
			else 
			{
				tempStore = current ;
				current = current.next ;	
			}
			
		}
		tail.data = wordToCheck ;
		
		Node CurrentToStoreInFile = head ;
		Node storeInArray = head ;
		FileOutputStream outputStream = new FileOutputStream( file );
		
		BufferedWriter bufferWriter = new BufferedWriter( new OutputStreamWriter( outputStream ) ) ;
		
		String  arrayToStore [] = new  String[ size ] ;
		
		for( int i = 0 ; i < arrayToStore.length ; i++ ) 
		{  if (storeInArray != null ) 
			{
			arrayToStore[i] = String.valueOf(storeInArray.data) ;
			storeInArray = storeInArray.next ;
			}
			
		}
		
		newlist.sortArray(arrayToStore);
		
		for( int j = 0 ; j < arrayToStore.length ; j++ ) 
		{
			bufferWriter.write( String.valueOf( arrayToStore[j] ) ) ;
			bufferWriter.newLine();
			//CurrentToStoreInFile =  CurrentToStoreInFile.next ;
		}
	/*	while ( CurrentToStoreInFile != null  ) 
		{
			
			
		
			bufferWriter.write( String.valueOf( CurrentToStoreInFile.data ) ) ;
			bufferWriter.newLine();
			CurrentToStoreInFile =  CurrentToStoreInFile.next ;
		}*/
		bufferWriter.close() ;
	}
	
	public  < T > void addNewNodeAtLast( T data )
	{	
		Node newNode = new Node( data ) ;
		
		if ( head == null ) 
		{
			head = newNode ;
			tail = newNode ;
		}
		else 
		{
			tail.next = newNode ;
			tail = newNode ;
			
			
			
		}
	}
	
	public  void display ( ) 
	{
		Node current = head ; 
		while ( current != null ) 
		{
			System.out.println( current.data ) ;
			current = current.next ; 
		}
	}
	
	public static < T extends Comparable < T > > void sortArray ( T [] arrayToSort) 
	{
		for ( int  i = 0 ; i < arrayToSort.length ; i++ ) 
		{
			for ( int   j = i+1 ; j < arrayToSort.length ; j++ ) 
			
			{
				if (  ( arrayToSort[ i ] .compareTo( arrayToSort[ j ] ) ) == 0 ) 
				{
					T temp = arrayToSort[ i ] ;
					arrayToSort[ i ] = arrayToSort[ j ] ;
					arrayToSort[ j] =  temp ;
				}
					
				
			}
		}
	}
	
	public static void main (String args[]) throws Exception 
	{
		String fileLocation = "/home/admin1/vad.txt" ;
		OrderList < Integer  > genericLinkedList = new OrderList < Integer > ( ) ;
		genericLinkedList.readFile(fileLocation , 3 );
		genericLinkedList.display ( ) ;
	}

}
