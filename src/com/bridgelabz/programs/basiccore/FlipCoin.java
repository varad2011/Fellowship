package com.bridgelabz.programs.basiccore;

import java.util.Scanner;

public class FlipCoin {
	
	 public static void  coinFlip() 
	 {		
		 double headCount = 0 , tailCount = 0 ;
		 Scanner scanner = new Scanner ( System.in ) ;
		 System.out.println ( "enter number to flipCoin" ) ;
		 int number = scanner.nextInt() ;
		 for ( int i = 0 ; i < number ; i++)  
		 {
			 
			 double randomNumber = Math.random() ;
			 if ( randomNumber < 0.5 ) 
			 {
				 headCount++ ;
			 }
			 else 
			 {
				 tailCount++;
			 }
			// System.out.println( randomNumber ) ;
		 }

		 System.out.println( "tailcount" + (tailCount / number) * 100 + " headCount " + ( headCount / number ) * 100 ) ;
		 
	 }
	public static void main(String[] args) 
	{
		 FlipCoin.coinFlip() ;
	}

}
