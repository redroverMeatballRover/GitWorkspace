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
import java.awt.event.ActionListener;

import javax.swing.JPanel;

/**
 * An abstract class that helps navigate the user's menu button commands. 
 */
/*****************************
 * Inheritance: Abstract Class
 *****************************/

public abstract class Menu extends JPanel implements ActionListener //abstract class
{
	private static final long serialVersionUID = 1L;

	public abstract void actionPerformed(ActionEvent e);
	
	/*****************************
	* Inheritance: Protected Modifiers
	*****************************/

	protected abstract void button();
}