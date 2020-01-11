package com.bridgelabz.programs.ObjectOrientedProgram.deckOfCards;

import com.bridgelabz.programs.utility.OopsUtil;

public class DeckOfCard2 {

	public static void main(String[] args)
	{
		DeckOfCardMethods deckOfCardMethod = new DeckOfCardMethods();
		
		String[]  suit  = {"Clubs", "Diamonds", "Hearts", "Spades"} ;
		String [] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"} ;
		String [] deckOfCard = deckOfCardMethod.createDeckOfcard(suit, rank);
		String [] card  = deckOfCardMethod.createDeckOfcard(suit, rank);
		deckOfCardMethod.randomCard(deckOfCard);
		String [][] distributedCard = deckOfCardMethod.distributeCard(deckOfCard);
	//	OopsUtil.displayCard(distributedCard);
		deckOfCardMethod.addToQueue(card, distributedCard);
		deckOfCardMethod.displayLinkedList();
	}

}
