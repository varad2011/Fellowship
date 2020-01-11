package com.bridgelabz.programs.algorithms;

import java.util.Scanner;

public class FindUserGNumber 
{ 	 
	public static void UserEnterNumber( ) 
	{	Scanner scanner = new Scanner(System.in ) ; 
		int storeNumber = 20 ;
		int middleIndex = storeNumber / 2 ;
		int conditionCheck  ;
	
		do
		{
			System.out.println( " Is there user guess number is ->  " + middleIndex + "\n"+"  press 1 to conform  if lower than that number then press 0 or for higher press 2" ) ;
			conditionCheck = scanner.nextInt() ;
			
			   if( conditionCheck == 1 ) 
			   {
				   break;
			   }
			
				
				if ( conditionCheck == 0 ) 
				{
					middleIndex = middleIndex / 2 ;
				}
				else 
				{
					middleIndex = middleIndex + 1 ;
				}
			
		}
		while ( conditionCheck != 1 ) ;
		if( conditionCheck == 1 ) 
		{
			System.out.println( "user guess number is " + middleIndex) ;
		}
	}

	public static void main(String[] args) 
	{
		FindUserGNumber.UserEnterNumber();
		
	}
	

}
