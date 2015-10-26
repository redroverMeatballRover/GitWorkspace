package pack;

public class testingCards {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
//		int blue[] = new int[52];
//		
//		for (int i = 0; i <52; i++)
//		{
//			blue[i] = i + 1;
//		}
//
//		
//		
//		
//		
//		for(int i = 0; i < 52;i++){
//		
//			//shuffle the card
//			//print out the first card
//			System.out.print(blue[0] + " ");
//			//shuffle again
//			
//			//put the rest of the cards into a new deck
//			blue = fillTheNewDeck(blue);
//			for (int b = 0; b < blue.length; b++)
//			{
//				System.out.print(blue[b] + " ");
//			}
//			
//			System.out.println();
//		}
//		
		
		Card[] deck = new Card[52];
		
		int count = 0;
		
		for(Suits s : Suits.values()){

			for(CardValue c : CardValue.values()){
				
				deck[count] = new Card();
				deck[count].setSuit(s);
				deck[count].setValue(c);
				count++;
			}
		}
		
		
		for(Card c : deck){
			System.out.println(c.getValue() + " of " + c.getSuit());
		}
		
		
	}
	
	public static int[] fillTheNewDeck(int[] blue){
		int[] newDeck = new int[blue.length - 1];
		
		for (int k = 0; k < newDeck.length; k++)
		{
			newDeck[k] = blue[k+1]; 
		}
		
		return newDeck;
	}
	
	public static void initCards(){
		String[] suits = {"Heart", "Dimond", "Spade", "club"};
		String[] cards = new String[7];
		
		for(int i = 0; i < suits.length;i++){
			
			for(int j = 1; j <= 13; j++){
				
				
			}
			
		}
	}

}
