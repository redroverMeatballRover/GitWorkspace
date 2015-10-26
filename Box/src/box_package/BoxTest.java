/**
 * @author Cody Schaffer
 */
package box_package;

/**
 * The purpose of this class is to use the BOX class to create a description of
 * a couple boxes.
 */
public class BoxTest {

	/**
	 * The main creates three boxes and gives them a height, weight, depth, and
	 * if the box is full or not. It also provides a way to change all of the
	 * instance variables via the getters and the setters. finally, it prints
	 * the description of each of the boxes.
	 */

	public static void main(String[] args) {

		Box box1 = new Box(3, 7, 5);
		Box box2 = new Box(4, 6, 8);
		Box box3 = new Box(5, 1, 7);

		System.out.println("Red Box1 first instance: " + box1);
		box1.setHeight(4);
		box1.setWeight(10);
		box1.setDepth(10);
		box1.setFullEmpty(true);
		System.out.println("Red Box1 first instance: " + box1 + "\n");

		System.out.println("Blue Box2 first instance: " + box2);
		box2.setHeight(3);
		box2.setWeight(4);
		box2.setDepth(4);
		box2.setFullEmpty(true);
		System.out.println("Blue Box2 first instance: " + box2 + "\n");

		System.out.println("Yellow Box3 first instance: " + box3);
		box3.setHeight(5);
		box3.setWeight(7);
		box3.setDepth(8);
		box3.setFullEmpty(false);
		System.out.println("yellow Box3 first instance: " + box3 + "\n");
	}

}
