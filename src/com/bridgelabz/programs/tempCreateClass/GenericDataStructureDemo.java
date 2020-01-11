package com.bridgelabz.programs.tempCreateClass;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class GenericDataStructureDemo < T > 
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
	
	Node head;
	
	Node tail;
	
	public   void  readFile( String  fileLocation  , T wordToCheck ) throws IOException 
	{	
		
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
			}
			else 
			{
				tail.next = newNode;
				tail = newNode ;
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
		
		FileOutputStream outputStream = new FileOutputStream( file );
		
		BufferedWriter bufferWriter = new BufferedWriter( new OutputStreamWriter( outputStream ) ) ;
		
		while ( CurrentToStoreInFile != null  ) 
		{
			
		
		//	String WordToStore = String.valueOf( CurrentToStoreInFile.data );
			bufferWriter.write( String.valueOf( CurrentToStoreInFile.data ) ) ;
			bufferWriter.newLine();
			CurrentToStoreInFile =  CurrentToStoreInFile.next ;
		}
		bufferWriter.close() ;
	}
	
	public  < T > void addNewNodeAtLast( T data )
	{	
		Node newNode = new Node( data ) ;
		//Node current = head ;
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
	public static void main (String args[]) throws Exception 
	{
		String fileLocation = "/home/admin1/vad.txt" ;
		GenericDataStructureDemo < Integer  > genericLinkedList = new GenericDataStructureDemo < Integer  > ( ) ;
		genericLinkedList.readFile(fileLocation , 3 );
		genericLinkedList.display ( ) ;
	}
}
