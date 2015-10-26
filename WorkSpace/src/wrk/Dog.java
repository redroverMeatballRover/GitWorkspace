/**
 * @author Cody Schaffer
 */
package wrk;
/**
 * The purpose of this Class is to make instance variables for the dog. The
 * variables are initialized and accepted in the constructor. We provide getters
 * and setters for every instance variable. Finally, we print out a description
 * of the dog.
 */
public class Dog {

	private String dogName;
	private int dogYears;
	private final static int CONVERSION = 7;
	
	// Constructor// Constructs instance variables for the object.
	public Dog(String name, int age) 
	{
		dogName = name;
		dogYears = age;
	}
	
	// Getters & Setters // --------------------------------------------------------------------
	// returns height//
	public String getName() {
		return dogName;
	}
	// makes a new name//
	public void setName(String newName) {

		dogName = newName;
	}
	//returns dogyears//
	public int getAge() {
		return dogYears;
	}
	//sets the new age//
	public int setAge(int newAge) {
		dogYears = newAge;
		return dogYears;
	}
	// toString Method // prints out a description of the dog.
	public String toString() {
		return "My dog's name is " + dogName + " and he is " + dogYears
				+ " years old in human years; in dog years he is "
				+ computeDogAge();
	}
	//computes the dog age by multiplying the person age by 7.//
	public int computeDogAge() {

		return dogYears * CONVERSION;
	}
}
