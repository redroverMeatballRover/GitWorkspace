package pupdog;

public class Kennel {

	public static void main(String[] args) {
		
		
		PuppyDog puppyDog1 = new PuppyDog("brown", "spotted", 1, 30, "Baltimore"); //String fur, String pattern, int dogAge, int weight, String name
		PuppyDog puppyDog2 = new PuppyDog("black", "plain", 2, 20, "Tucker");
		
		System.out.println("One day, two puppies met each other in a park. the first puppy's name was " + puppyDog1.getDogName() + ".\n the second puppy's name was " + puppyDog2.getDogName() 
				+ ". they began to bark at each other. \"" + puppyDog1.getdogBark() + "\" said " + puppyDog1.getDogName() + "." + "\"" + puppyDog2.getdogBark() + "\"\n said " + puppyDog2.getDogName() 
				+ ". The two puppies then began to " + puppyDog1.getDogBite() + " each other. They bit each other fondly and playfully. Then " + puppyDog2.getDogName() + puppyDog1.getDogTackle() + "s "
				+puppyDog1.getDogName() + ".\n They fell to a heap, all tired. The puppies then " + puppyDog2.getDogGoToSleep() + " for " + puppyDog1.getSleepTime() + " minutes."  );
		
		

//				Behaviors
//				                                                       i.     Bark [2 points]
//
//				                                                     ii.     Roll Over [2 points]
//
//				                                                    iii.     Bite [2 points]
//
//				                                                    iv.     Go to Sleep [2 points]
//
//				                                                     v.     Go to Sleep should take in the number of minutes it should sleep [1 points]
//
//				                                                    vi.     Run [2 points]
//
//				                                                   vii.     Run should take a direction (left or right) [1 points]
//
//				                                                 viii.     Tackle [2 points]
//
//				Next in your Main method instantiate 2 different puppies from your puppy dog class. [4 points]
//				Play out the story in code: have the puppies run around and play with one another.
//				You must first have them meet each other. [2 points]
//				They should begin to play with one another.
//				                                                       i.     Bark at one another [2 points]
//
//				                                                     ii.     Run Around [2 points]
//
//				                                                    iii.     Bite [2 points]
//
//				                                                    iv.     Tackle [2 points]
//
//				Once the puppies are done playing have them take a nap for 30 minutes. [2 points]
//		
//		
//	}
//
//}
}
}