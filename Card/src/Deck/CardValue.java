package Deck;

/**
* Author: Cody Schaffer
* This is the enum for the cardValues.   
*/

public enum CardValue {
	Ace(1), Two(2), Three(3), Four(4), Five(5), Six(6), Seven(7), Eight(8), Nine(
			9), Ten(10), Jack(11), Queen(12), King(13);

	private int value;

	private CardValue(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}
