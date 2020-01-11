package com.bridgelabz.programs.datastructure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Scanner;



public class UnOrderList 
{
	  static Node head;
	  static Node tail;
	public static class Node
	
	{
		String data ;
		Node next ;
		public Node( String data )
		
		{
			this.data = data ;
			this.next = null ;
		}
	}
	
	public static void add( String location , String word ) throws IOException 
	
	{	
		String tempStore ;
		File file = new File( location ) ;
		Scanner scanner = new Scanner( file ) ;
		
		FileReader fileReader = new FileReader( file ) ;
		BufferedReader bufferReader = new BufferedReader( fileReader ) ;
		tempStore  = bufferReader.readLine() ;
		
		while ( ( tempStore ) != null ) 
		
		{
			 	
				Node newNode = new Node( tempStore ) ;
				if( head == null )
				
				{
					head = newNode ;
				    tail = newNode ;
				}
				
				else 
				
				{
					tail.next = newNode ;
					tail = newNode ;
				}
				tempStore = bufferReader.readLine();
				
			
		}
		Node current = head ;
		Node temp = null ;
		
		while ( current.next != null ) 
		
		{
			if ( ( String.valueOf (current.data ) ).compareTo ( String.valueOf ( word ) )  == 0 )
			
			{	
				
			     temp.next = current.next ; 
			     current = null ;
				
				break ;
			}
			temp = current ;
			current = current.next ;
			
		}
		tail.data = word ; 
		
		bufferReader.close() ;
		
		Node CurrentToStoreInFile = head ;
		
		FileOutputStream outputStream = new FileOutputStream( file ) ;
		BufferedWriter bufferWriter = new BufferedWriter( new OutputStreamWriter( outputStream ) ) ;
		
		while ( CurrentToStoreInFile != null  ) 
		
		{
			bufferWriter.write( CurrentToStoreInFile.data ) ;
			bufferWriter.newLine() ;
			CurrentToStoreInFile =  CurrentToStoreInFile.next ;
		}
		bufferWriter.close() ;
	}
	
	public static void display() 
	
	{
		Node current = head ;
		
		while ( current != null ) 
		{
			System.out.println ( current.data ) ;
			current = current.next ;
		}
		
	}
	
	public static void main( String[] args ) throws Exception 
	
	{	

		
		UnOrderList.add( "/home/admin1/vad.txt" , "Store" ) ;
		UnOrderList.display() ;
		
		
	}

}
