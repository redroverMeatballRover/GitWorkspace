/**
 *-------------------------------------------------------------------------------------------------------------------------//
 * Team 5 Authors: Danny Maldanaldo, Daniel Ordonez, Matthew Murray, Cody Schaffer
 * Title: OOP Study Guide Project
 * Team: 5
 * Instructor: Cobb
 * -------------------------------------------------------------------------------------------------------------------------//
 */
package project;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;

/**
 * This class is a menuListener that helps navigate the user's button commands. 
 */
/*****************************
 * Inheritance: Subclass
 *****************************/
/*****************************
 * Inheritance: Inheritance Restriction
 *****************************/

public final class MenuListener extends Menu //inheritance restriction
{
	private static final long serialVersionUID = 1L;
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		JFrame frame = new JFrame("Home Menu");
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		StartPanel panel = new StartPanel();
		frame.getContentPane().add(panel);

		frame.pack();
		frame.setVisible(true);	
	}

	/*****************************
	  * Inheritance: Protected Modifiers
	  *****************************/
	/*****************************
	  * Inheritance: Method Overriding
	  *****************************/

	@Override
	protected void button() //method override
	{
		System.out.println("Polymorphism through inheritance");
	}
	
	
}
