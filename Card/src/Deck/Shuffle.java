package Deck;

import java.util.Random;

/**
* Author: Cody Schaffer
* The purpose of this class is to print out a deck of cards that are 
* randomly shuffled and then deal them one by one. This class shuffles.  
*/
public class Shuffle {

	private static Random generator;

	public Shuffle() {
		generator = new Random();
	}

	public static void shuffleArray(int[] iArray)

	{
		int[] a = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		for (int i = 0; i < a.length; i++) {
			int j = i + generator.nextInt(a.length - i);
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}

	}

}
