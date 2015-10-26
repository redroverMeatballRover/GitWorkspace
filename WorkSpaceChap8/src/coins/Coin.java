package coins;
import java.util.Random;

/**
 * Author Cody Schaffer
 */

public class Coin {

	/*----------------------------------------------------------
	 * This class makes a coin. The coin has the ability to be 
	 * flipped.
	 ----------------------------------------------------------*/
	public void coinFlipped()
	{
		Random rand = new Random();
		int headsOrTails = rand.nextInt(2);
		
		System.out.println("The coin was flipped, and the result is: ");
		if (headsOrTails == 0)
		{
			System.out.println("heads");
		}
		
		if (headsOrTails == 1)
		{
			System.out.println("tails");
		}
		
		
	}

}
