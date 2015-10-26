/**
 * -------------------------------------------------------------------------------------------------------------------------//
 * Team 5 Authors: Danny Maldanaldo, Daniel Ordonez, Matthew Murray, Cody Schaffer
 * Title: OOP Study Guide Project
 * Team: 5
 * Instructor: Cobb
 * -------------------------------------------------------------------------------------------------------------------------//
 */
package project;
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

//This class is merely a disclaimer. It provides that we are not going to use this program 
//as a product to sell to students to undermine the JAVA Foundations book, or to give away answers. 
public class WarningPanel extends JPanel
{
	private static final long serialVersionUID = 1L;
	private JLabel warning;
	private JButton button;
	
	//Acts as a disclaimer. May or may not be useful. 
	public WarningPanel()
	{
		setPreferredSize(new Dimension(500,200));
		warning = new JLabel("This is a study guide for CSC 150. This is not meant to replace Java Perspectives.");
		button = new JButton("Enter");
		button.setBounds(10,10,100,25);
		button.addActionListener(new MenuListener());
		add(warning);
		add(button, BorderLayout.CENTER);
	}
}
