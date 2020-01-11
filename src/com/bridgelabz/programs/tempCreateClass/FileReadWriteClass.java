package com.bridgelabz.programs.tempCreateClass;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadWriteClass {

	public static void main( String[] args ) throws IOException 
	{
		String locationOfFile = "/home/admin1/vad.txt" ;
		FileReadWriteClass.bufferReadFile( locationOfFile ) ;
	}
	public static void bufferReadFile ( String fileToRead ) throws IOException 
	{
		File file = new File( fileToRead ) ;
		FileReader fileReader = new FileReader( file ) ;
		BufferedReader bufferReader = new BufferedReader( fileReader ) ;
		String word  = bufferReader.readLine() ;
		while ( ( word ) != null ) 
		{
			System.out.println( word ) ;
			word = bufferReader.readLine() ;
		}
	}

}
