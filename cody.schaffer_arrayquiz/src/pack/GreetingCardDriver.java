package pack;

public class GreetingCardDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Inventory invent = new Inventory();
	// TOTAL RETAIL COST
	
	// MODIFY AN EXSISTING CARD
	
	// ADD CARDS
	invent.addGreetingCard(1,
			"Hope you are getting better from your illness!",
			"GroundHog.jpg", 4.50); // indexNum, greet, backPic, cost
	invent.addGreetingCard(2, "I love you more than I love food!",
			"Hearts.jpg", 3.20);
	invent.addGreetingCard(3, "Have a great summer break!", "Sunny.jpg",
			5.20);
	invent.addGreetingCard(4, "Its valentines day!", "kisses.jpg", 3.50); // indexNum,
																			// greet,
																			// backPic,
																			// cost
	invent.addGreetingCard(5, "Have a very happy christmas!",
			"Christmas.jpg", 4.40);
	
	// PRINT OUT INVENTORY
	System.out.println(invent);
	
	// ADD MORE CARDS
	invent.addGreetingCard(6, "Very sorry for your loss", "Rainclouds.jpg",
			3.50); // indexNum, greet, backPic, cost
	invent.addGreetingCard(7, "Happy Birthday!", "Balloons.jpg", 2.20);
	invent.addGreetingCard(8, "Happy Forth of July", "fireworks.jpg", 1.20);
	
	// TOTAL RETAIL COSTS AGAIN
	System.out.println(invent);
		
	}
}



	
//-----------------------------------------------------------------------
//ATTEMPT WITH CARD COLOR AND ENVELOPE ARRAY
	
//	Inventory invent = new Inventory();
//	String i;
//	// TOTAL RETAIL COST
//
//	// MODIFY AN EXSISTING CARD
//
//	// ADD CARDS
//	invent.addGreetingCard(1,
//			"Hope you are getting better from your illness!",
//			"GroundHog.jpg", 4.50, String[0]); // indexNum, greet, backPic, cost
//	invent.addGreetingCard(2, "I love you more than I love food!",
//			"Hearts.jpg", 3.20);
//	invent.addGreetingCard(3, "Have a great summer break!", "Sunny.jpg",
//			5.20);
//	invent.addGreetingCard(4, "Its valentines day!", "kisses.jpg", 3.50); // indexNum,
//																			// greet,
//																			// backPic,
//																			// cost
//	invent.addGreetingCard(5, "Have a very happy christmas!",
//			"Christmas.jpg", 4.40);
//
//	// PRINT OUT INVENTORY
//	System.out.println(invent);
//
//	// ADD MORE CARDS
//	invent.addGreetingCard(6, "Very sorry for your loss", "Rainclouds.jpg",
//			3.50); // indexNum, greet, backPic, cost
//	invent.addGreetingCard(7, "Happy Birthday!", "Balloons.jpg", 2.20);
//	invent.addGreetingCard(8, "Happy Forth of July", "fireworks.jpg", 1.20);
//
//	// TOTAL RETAIL COSTS AGAIN
//	System.out.println(invent);
//
//}
