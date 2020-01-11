package com.bridgelabz.programs.logical;

import java.util.Random;
import java.util.Scanner;

public class Gambler {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner( System.in ) ;
		Random random = new Random( ) ;
		int randomNumber ;
		System.out.println( "enter the $stake" ) ;
		int stake = scanner.nextInt() ;
		System.out.println( "gamblerGoal" ) ;
		int gamblerGoal = scanner.nextInt( ) ;
		int numberOfWin = 0 ;
		int totalPlayCount = 0 ;
		int winPrice = 0 ;
		float perOfWin ;
		float perOfLoss ;
		while ( ( stake > 0 ) && ( gamblerGoal != numberOfWin ) ) 
		{	totalPlayCount++ ;
			randomNumber = random.nextInt ( 20 ) ;
			if ( randomNumber < 10 ) 
			{
				winPrice = winPrice + 10 ;
				numberOfWin++ ;
			}
			stake-- ;
			
		}
		perOfWin = ( float ) numberOfWin / totalPlayCount * 100 ;
		perOfLoss = ( float ) ( totalPlayCount - numberOfWin ) / totalPlayCount * 100 ;
			System.out.println ( "total play count" + totalPlayCount ) ;
			System.out.println ( "gambler win games" + numberOfWin ) ;
			System.out.println ( "gambler Percentage of Win " + perOfWin ) ;
			System.out.println ( "gambler Percentage of loss " + perOfLoss );
			
		
		

	}

}
