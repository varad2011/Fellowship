package com.bridgelabz.programs.ObjectOrientedProgram.deckOfCards;

import java.util.Arrays;
import java.util.Random;

import com.bridgelabz.programs.datastructure.LinkedList;
import com.bridgelabz.programs.utility.OopsUtil;

public class DeckOfCardMethods 
{
	LinkedList< String > newLinkedList = new LinkedList< String >() ;
	
	public  String[]  createDeckOfcard ( String[] suit ,String [] rank) 
	{
		String[] deckOfCard = new String[52] ;
		int number = 0 ;
		for( int i = 0 ; i < suit.length ; i++  )
		{
			for(int j = 0 ; j< rank.length ; j++ ) 
			{
				deckOfCard[number] = suit[i] + rank[j] ;
				number ++ ;
			}
		}
		return deckOfCard ;
	}
	
	public  void randomCard( String [] deckOfCard ) 
	{
		for( int i = 0 ; i< deckOfCard.length ; i++ )
		{
			String tempString = "" ;
			Random random = new Random() ;
			int randomNumber = random.nextInt(52);
			tempString = deckOfCard[randomNumber] ;
			deckOfCard[randomNumber] = deckOfCard[ 51- randomNumber] ;
			deckOfCard[51 - randomNumber] = tempString ;
 		}
	}
	
	public  void distributeCardAndPrint( String []deckOfCard) 
	{
		String [][] cardDistribute = new String[4][9] ;
		int count = 0 ;
		
		for( int i = 0 ; i < cardDistribute.length ; i++ ) 
		{	
			System.out.println("player "+(i+1)+" card : ") ;
			
			for( int j = 0 ; j< cardDistribute[i].length ; j++ ) 
			{
				cardDistribute[i][j] = deckOfCard[count] ;
				count ++ ;
				System.out.print(" " +cardDistribute[i][j] +"  ") ;
			}
			
			System.out.println();
		}
	}
		
	public  String [][]  distributeCard( String []deckOfCard) 
	{
		String [][] cardDistribute = new String[4][9] ;
		int count = 0 ;
		
		for( int i = 0 ; i < cardDistribute.length ; i++ ) 
		{	
			
			
			for( int j = 0 ; j< cardDistribute[i].length ; j++ ) 
			{
				cardDistribute[i][j] = deckOfCard[count] ;
				count ++ ;
			}
		
		}
		
		return cardDistribute ;
	}
	
	public  void sortArray ( int[] arrToSort ) 
	{
		for ( int row = 0 ; row < arrToSort.length ; row++ ) 
		{
			for ( int cell = 1 ; cell < arrToSort.length-row ; cell++ ) 
			{
				if( arrToSort[ cell ] < arrToSort[ cell - 1 ] ) 
				{
					int temp = arrToSort[ cell ] ;
					arrToSort[ cell ] = arrToSort[ cell - 1 ] ;
					arrToSort[ cell - 1 ] = temp ;
				}
			}
		}
	}
	
	public  void sortCard( String [][] distributeCard , String []card ) 
	{
		int array[] = new int [9] ;
		int l = 0;
		for( int i = 0 ; i < 1 ; i++ ) 
		{
			for( int j = 0 ; j < distributeCard[i].length ; j++ ) 
			{
				 int k = -1 ;
				do {
					k++ ; 
				}
				while(distributeCard[i][j] != (card[k]) );
				array[l] = k ;	
				l++ ;
			
			}   
		}
		OopsUtil.sortArray(array);
		int p = 0 ;
		for( int i = 0 ; i< 1 ; i++) 
		{
			for( int j = 0 ; j < distributeCard[i].length ; j++ ) 
			{
				distributeCard[i][j]= card[array[p]] ;
				p++ ;
			
			}
		}
	}

	public  void sortRowWise(int m[][]) 
	    { 
	        for (int i = 0; i < m.length; i++) 
	            Arrays.sort(m[i]); 
	    } 
	
	public  String [][] relaceMethodToString ( int [][] array)
	     {
		String [][] intToString = new String [4][9] ; 
		for( int i = 0 ; i < array.length ; i++ ) 
		{
			for( int j = 0 ; j < array[i].length ; j++ ) 
			{
				intToString[i][j] = Integer.toString(array[i][j]);
				intToString[i][j] = intToString[i][j].replaceAll("1","Clubs" );
				intToString[i][j] = intToString[i][j].replaceAll("2","Diamonds" );
				intToString[i][j] = intToString[i][j].replaceAll("3","Hearts" );
				intToString[i][j] = intToString[i][j].replaceAll("4","Spades" );
				intToString[i][j] = intToString[i][j].replaceAll("11","Jack" );
				intToString[i][j] = intToString[i][j].replaceAll("12","Queen" );
				intToString[i][j] = intToString[i][j].replaceAll("13","King" );
				intToString[i][j] = intToString[i][j].replaceAll("14","Ace" );
			}
		}	
		
		return intToString ;
	}
	
	public  int[][]  replaceMethodToInt (String [][] distributeCard  ) 
	{ 
		 int array[][] = new int [4][9] ;
		for( int i = 0 ; i < distributeCard.length ; i++ ) 
		{
			for( int j = 0 ; j < distributeCard[i].length ; j++ ) 
			{    
				distributeCard[i][j] = distributeCard[i][j].replaceAll("Clubs", "1");
				distributeCard[i][j] = distributeCard[i][j].replaceAll( "Diamonds", "2");
				distributeCard[i][j] = distributeCard[i][j].replaceAll("Hearts", "3");
				distributeCard[i][j] = distributeCard[i][j].replaceAll("Spades", "4");
				distributeCard[i][j] = distributeCard[i][j].replaceAll("Jack", "11");
				distributeCard[i][j] = distributeCard[i][j].replaceAll("Queen", "12");
				distributeCard[i][j] = distributeCard[i][j].replaceAll("King", "13");
				distributeCard[i][j] = distributeCard[i][j].replaceAll("Ace", "14");
			
				array[i][j] = Integer.parseInt(distributeCard[i][j] ) ;
			}
		}
		OopsUtil.sortRowWise(array);
		return array ;
	}	
		
	public void addToQueue (String[]  createDeckOfcard , String [][]  distributeCard ) 
	{
		int  i = 0 ;
		
		while(i<4) 
		{
			for(int j = 0 ; j < createDeckOfcard.length ; j++) 
			{
				for(int k = 0 ; k < distributeCard[i].length ; k++ ) 
				{
					if(createDeckOfcard[j].equalsIgnoreCase(distributeCard[i][k]) )
					{
						newLinkedList.addAtEnd(createDeckOfcard[j]);
					}
				}
			}
			i++ ;
		}
			
		
	}
	
	public void displayLinkedList () 
	{
		newLinkedList.deckDisplayNode();
	}
	public  void  displayCard(String [][] cardDistribute)
	{	
		for( int i = 0 ; i< cardDistribute.length ; i++  ) 
		{
			System.out.println("player "+(i+1)+" card : ") ;
			
			for( int j = 0 ; j< cardDistribute[i].length ; j++) 
			{
				System.out.print(" "+cardDistribute[i][j]+" ") ;
			}
			System.out.println();
		}
	}
	
}
