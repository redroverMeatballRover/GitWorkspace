/**
 * @author Cody Schaffer
 */
package wrk;

/**
 * The purpose of this class is to use the DOG class to create a description of
 * a couple dogs.
 */
public class Kennel {
	/**
	 * The main creates three boxes and gives them a name and age, It also
	 * provides a way to change all of the instance variables via the getters
	 * and the setters. finally, it prints the description of each of the dogs
	 * and gets each dogs name and age in human years.
	 */
	public static void main(String[] args) {
		Dog dog1 = new Dog("Skippy", 7);
		Dog dog2 = new Dog("Snurf", 3);
		Dog dog3 = new Dog("Barky", 1);

		System.out.println("First Instance of Skippy: " + dog1);
		dog1.setName("Albert");
		dog1.setAge(10);
		System.out.println("Second Instance of Skippy " + dog1 + "\n");

		System.out.println("First Instance of Snurf: " + dog2);
		dog2.setName("Super Snurf");
		dog2.setAge(5);
		System.out.println("Second Instance of Snurf " + dog2 + "\n");

		System.out.println("First Instance of Barky: " + dog3);
		dog3.setAge(2);
		System.out.println("Second Instance of Barky " + dog3 + "\n");

	}
}
