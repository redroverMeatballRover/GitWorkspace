package Deck;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Cody Schaffer
 */

/**
 * The purpose of this class is to print out a deck of cards that are 
 * randomly shuffled and then deal them one by one. 
 */
public class CardDriver {

	public static void main(String[] args)

	{
		DeckOfCards.deckMaker();
		DeckOfCards.shuffle();
	}

}


