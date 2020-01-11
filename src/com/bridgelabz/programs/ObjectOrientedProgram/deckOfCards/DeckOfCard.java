
package com.bridgelabz.programs.ObjectOrientedProgram.deckOfCards;

import java.util.Random;

import com.bridgelabz.programs.utility.OopsUtil;



public class DeckOfCard 
{	
	
	public static void main(String[] args) 
	{
		DeckOfCardMethods deckOfCardMethod = new DeckOfCardMethods();
		String[]  suit  = {"Clubs", "Diamonds", "Hearts", "Spades"} ;
		String [] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"} ;
		String [] deckOfCard = OopsUtil.createDeckOfcard(suit, rank);
		deckOfCardMethod.randomCard(deckOfCard);
		deckOfCardMethod.distributeCardAndPrint(deckOfCard);
	//	deckOfCardMethod.addToQueue(deckOfCard, distributeCard);
	}

}
