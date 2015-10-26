package Deck;

import java.util.Arrays;
import java.util.Random;



/**
* Author Cody Schaffer
* 
* The purpose of this class is to print out a deck of cards that are 
* randomly shuffled and then deal them one by one. This class acts like the
* deck of cards, where they can be ordered, and then shuffled. 
*/

public class DeckOfCards {

	private static int[] cards;
	private static String[] deck;
	private static Random rgen = new Random();

	/**
	 * Creates the cards inside the deck.  
	 */
	public static void deckMaker()

	{
		deck = new String[52];
		int count = 0;

		for (int s = 0; s <= 3; s++) {
			for (int c = 0; c < 13; c++) {
				deck[count] = CardValue.values()[c] + " of "
						+ SuitValue.values()[s];

				if (count < 52)
					count++;
			}
		}
		// for (int t = 0; t < 52; t++)
		// System.out.println(deck[t]);
	}

	/**
	 * Shuffles the deck.   
	 */
	public static void shuffle() {

		cards = new int[52];
		for (int i = 0; i < cards.length; i++) {
			cards[i] = i;
		}

		for (int i = 0; i < cards.length; i++) {
			int randomPosition = rgen.nextInt(cards.length);
			String temp = deck[i];
			deck[i] = deck[randomPosition];
			deck[randomPosition] = temp;
		}

		for (int x = 1; x < deck.length; x++) {
			System.out.println("Number of Cards printed: " + x);
			System.out.println(deck[x]);
			

		}

	}
}