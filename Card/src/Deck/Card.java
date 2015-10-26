package Deck;
import java.util.Random;

/**
 * @author Cody Schaffer
 */
/*-----------------------------------------------------
 * This class orders the enums for CardValue and Suit. 
 * It provides the getters and setters of the cards. 
 ----------------------------------------------------*/
public class Card {

	private CardValue value;
	private SuitValue suit;

	// gets the card value.
	public CardValue getValue() {
		return value;
	}
	//gets the suit value
	public SuitValue getSuit() {
		return suit;
	}
	//sets the CardValue
	public void setValue(CardValue value) {
		this.value = value;
	}
	//sets the SuitValue
	public void setSuit(SuitValue suit) {
		this.suit = suit;
	}

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	//	int blue[] = new int[52];
////	
////	for (int i = 0; i <52; i++)
////	{
////		blue[i] = i + 1;
////	}
////
////	
////	
////	
////	
////	for(int i = 0; i < 52;i++){
////	
////		//shuffle the card
////		//print out the first card
////		System.out.print(blue[0] + " ");
////		//shuffle again
////		
////		//put the rest of the cards into a new deck
////		blue = fillTheNewDeck(blue);
////		for (int b = 0; b < blue.length; b++)
////		{
////			System.out.print(blue[b] + " ");
////		}
////		
////		System.out.println();
////	}
////	
//	
//	Card[] deck = new Card[52];
//	
//	int count = 0;
//	
//	for(SuitValue s : Suits.values()){
//
//		for(CardValue c : CardValue.values()){
//			
//			deck[count] = new Card();
//			deck[count].setSuit(s);
//			deck[count].setValue(c);
//			count++;
//		}
//	}
//	
//	
//	for(Card c : deck){
//		System.out.println(c.getValue() + " of " + c.getSuit());
//	}
//	
//	
//}
//
//public static int[] fillTheNewDeck(int[] blue){
//	int[] newDeck = new int[blue.length - 1];
//	
//	for (int k = 0; k < newDeck.length; k++)
//	{
//		newDeck[k] = blue[k+1]; 
//	}
//	
//	return newDeck;
//}
//
//public static void initCards(){
//	String[] suits = {"Heart", "Dimond", "Spade", "club"};
//	String[] cards = new String[7];
//	
//	for(int i = 0; i < suits.length;i++){
//		
//		for(int j = 1; j <= 13; j++){
//			
//			
//		}
//		
//	}
//
//}
//
//}
//
//	
//
//	
//	
//	
//	
////	static int i;
//////	static int j;
//////	public static int storedCardValue = 0;
//////	public static int storedSuitValue = 0;
//////	public static String SuitValue[] = { "Diamonds", "Hearts", "Clubs", "Spades" };
//////	public static String CardValue[] = { "Ace", "King", "Queen", "Jack", "Ten", "Nine",
//////			"Eight", "Seven", "Six", "Five", "Four", "Three", "Two" };
//////	public int count;
//////	public int countAllCards;
////	
////	
////	public static void drawCard() {
////
////		DeckOfCards cardDeck = new DeckOfCards();
////		cardDeck.shuffleCards();
////		cardDeck.dealCard();
////		cardDeck.checkCards();
////		
////
//////		Random generator = new Random(); 
//////		//string array variable//
//////		int i;
//////		int j;
//////		// int drawFiveCards;
//////
//////		int storedCardValue = 0;
//////		int storedSuitValue = 0;
//////
//////		// for (drawFiveCards = 0; drawFiveCards <= 4; drawFiveCards++) {
//////		//limits the string array//
//////		i = generator.nextInt(3);
//////		j = generator.nextInt(12);
//////		
//////		//string array//
//////		String SuitValue[] = { "Diamonds", "Hearts", "Clubs", "Spades" };
//////		String CardValue[] = { "Ace", "King", "Queen", "Jack", "Ten", "Nine",
//////				"Eight", "Seven", "Six", "Five", "Four", "Three", "Two" };
//////		
//////		System.out.println("You drew the " + CardValue[j] + " of "
//////				+ SuitValue[i]);
//////		
//////		//checks to make sure there are no repeat offender cards.//
//////		if (i == storedSuitValue && j == storedCardValue) {
//////			System.out.println(CardValue[j] + SuitValue[i]);
//////			storedSuitValue = i;
//////			storedCardValue = j;
//////			System.out.println("Warning: There is a repeating card.");
//////		}
////	}
////
//}