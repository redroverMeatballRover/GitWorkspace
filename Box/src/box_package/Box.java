/**
 * @author Cody Schaffer
 */
package box_package;
/**
 * The purpose of this Class is to make instance variables for the box. The
 * variables are initialized and accepted in the constructor. We provide getters
 * and setters for every instance variable. Finally, we print out a description
 * of the box.
 */
public class Box 
	
	{
	private double boxHeight;
	private double boxWeight;
	private double boxDepth;
	boolean boxFull = false;
	public String status;
	
	// Constructor// Constructs instance variables for the object.
	public Box(double height, double weight, double depth) {
		boxHeight = height;
		boxWeight = weight;
		boxDepth = depth;
	}
	
	// Getters & Setters // --------------------------------------------------------------------
	// returns height//
	public double getHeight() {
		return boxHeight;
	}
	// Sets the new height //
	public void setHeight(double newHeight) 
	{
		boxHeight = newHeight;
	}
	
	//returns weight//
	public double getWeight() {
		return boxWeight;
	}
	//sets the new weight//
	public void setWeight(double newWeight) 
	{
		boxWeight = newWeight;
	}
	//returns the depth//
	public double getDepth() {
		return boxDepth;
	}
	//sets the new depth//
	public void setDepth(double newDepth) 
	{
		boxDepth = newDepth;
	}
	
	//This method checks to see if the box is full or empty.//
	public String getFullEmpty() {
		String fullEmpty = boxFull ? "full" : "empty"; // boxfull basically says: if string "full", true. if string "false", empty. 
		return fullEmpty;
	}
	
	//this resets the FullEmpty//
	public void setFullEmpty(boolean newFull) 
	{
		boxFull = newFull;
	}
	// toString Method // prints out a description of the book.
	public String toString() 
	{
		String fullEmpty = boxFull ? "full" : "empty";
		return "This box's height is: " + boxWeight + " feet, and the weight is: " + boxWeight + " pounds, and the depth is: " + boxDepth + " feet, and the box is " + fullEmpty;
	}
}
