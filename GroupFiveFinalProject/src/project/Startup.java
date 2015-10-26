/**
 * -------------------------------------------------------------------------------------------------------------------------//
 * Team 5 Authors: Danny Maldanaldo, Daniel Ordonez, Matthew Murray, Cody Schaffer
 * Title: OOP Study Guide Project
 * Team: 5
 * Instructor: Cobb
 * -------------------------------------------------------------------------------------------------------------------------//
 * 
 * PROJECT
 * This project is a fully operational study guide meant to be used by future OOP students under Mr. Cobb. 
 * The Study Guide contains review material from the first five chapters in the Java Foundations Book, as well
 * as in depth coverage of Chapters 6 - 11 and their sections. Study Material isolates the key material
 * that students might miss within much of the books wording. The idea behind the project was to create a 
 * Sparknotes-version of the chapters the OOP course covers. 
 * 
 * PROGRAM DESIGN
 * The Program uses GUI elements and many other java classes to bring together a visual interface. The user can
 * navigate through individual chapters, the chapter's individual sections, and take a small quiz that tests 
 * the more important points of the chapter. 
 *
 *LIST OF REQUIREMENTS
 *
 *
 */
package project;

import javax.swing.JFrame;

//DRIVER CLASS
public class Startup {

	// This main runs the Start Panel for the Study Guide.
	public static void main(String[] args) {
		
		/*****************************
		* GUI: Component
		*****************************/
		JFrame frame = new JFrame("Start");
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

		WarningPanel panel = new WarningPanel();
		frame.getContentPane().add(panel);

		frame.pack();
		frame.setVisible(true);
	}

}
