package com.bridgelabz.programs.junittest;

import java.util.Scanner;

public class VendingMachine 
{	
	public static void vendingMachineCalculation(int notes) 
	{	
		int remind , number ;
		int storeNotes[] = { 1 , 2 , 5 , 10 , 20 , 50 , 100 , 500 , 1000 } ;
		for ( int notesCheck = storeNotes.length-1 ; notesCheck >= 0 ; notesCheck-- ) 
		{
			if ( notes / storeNotes[notesCheck] > 0 ) 
			{ 
				 remind = notes % storeNotes [ notesCheck ] ;
				 number = notes / storeNotes [ notesCheck ] ;
				System.out.println ( "change note" + storeNotes [notesCheck]
									+"*"+number);
				if ( remind == 0 ) 
				{
					break ;
				}
				else 
				{	
					notes = remind ;
				}	
			}
			
		}
		
	}
	public static void main(String[] args) 
	{
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter amount ");
		int rs=scanner.nextInt();
		VendingMachine.vendingMachineCalculation(rs);

	}

}
