package pack;

public class Card {
	private CardValue value;
	private Suits suit;
	
	public CardValue getValue() {
		return value;
	}
	
	public Suits getSuit() {
		return suit;
	}
	
	public void setValue(CardValue value) {
		this.value = value;
	}
	
	public void setSuit(Suits suit) {
		this.suit = suit;
	}
}
