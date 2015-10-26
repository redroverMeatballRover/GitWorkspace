/**
 *-------------------------------------------------------------------------------------------------------------------------//
 * Team 5 Authors: Danny Maldanaldo, Daniel Ordonez, Matthew Murray, Cody Schaffer
 * Title: OOP Study Guide Project
 * Team: 5
 * Instructor: Cobb
 * -------------------------------------------------------------------------------------------------------------------------//
 */
package project;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

/*
 * This class is a quiz for the Chapter 6 that the user can take to test
 * his skills from the previous chapters. 
 */
public class Quiz6 extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel quiz, question2, question3, question4, question5, question6,
			question7, question8, question9, question10, question11;
	private JCheckBox b1, b2, b3, b4, c1, c2, c3, c4, d1, d2, d3, d4, e1, e2,
			e3, e4, f1, f2, f3, f4, g1, g2, g3, g4, h1, h2, h3, h4, i1, i2, i3,
			i4, j1, j2, j3, j4, k1, k2, k3, k4;
	/*****************************
	  * Inheritance: Protected Modifiers
	  *****************************/
	protected int score1;
	protected String c;
	protected String ic;
	protected boolean n;
	protected int count;
	private JButton submit6;
	
	//constructor
	public Quiz6() {
		
		setLayout (new BoxLayout(this, BoxLayout.Y_AXIS));
		quiz = new JLabel("Quiz 6.1");
		quiz.setFont(new Font("Helvetica", Font.PLAIN, 25));

		//QUIZ QUESTIONS
		// -----------------------------------------------------------------------------------------------------------//
		question2 = new JLabel(
				"What is a GUI?");
		question2.setFont(new Font("Helvetica", Font.BOLD, 15));

		b1 = new JCheckBox("Graphical User Interface");
		b2 = new JCheckBox("Graphics UI Interface");
		b3 = new JCheckBox("Graphical User InDesign");
		b4 = new JCheckBox("Graphic UML Interface");

		question3 = new JLabel(
				"What is a component?");
		question3.setFont(new Font("Helvetica", Font.BOLD, 15));

		c1 = new JCheckBox("oject that defines the screen element used to display information");
		c2 = new JCheckBox("oject that defines the GUI element used to display User information");
		c3 = new JCheckBox("oject that defines the user element used to display information");
		c4 = new JCheckBox("oject that defines the screen element used to display the code");
		// italic.setBackground(Color.cyan);

		question4 = new JLabel(
				"What is a component?");
		question4.setFont(new Font("Helvetica", Font.BOLD, 15));

		d1 = new JCheckBox("special type of component used to hold and organize other components.");
		d2 = new JCheckBox("oject that defines the screen element used to display information");
		d3 = new JCheckBox("oject that defines the screen element used to display the GUI");
		d4 = new JCheckBox("special type of component used to hold and organize other Panels.");

		question5 = new JLabel(
				"What is a listener?");
		question5.setFont(new Font("Helvetica", Font.BOLD, 15));

		e1 = new JCheckBox("object that waits for an event to occur and responds in some way ");
		e2 = new JCheckBox("object that sits around and messes up your code ");
		e3 = new JCheckBox("object that waits for an event to occur and initializes a button ");
		e4 = new JCheckBox("all of the above");

		question6 = new JLabel(
				"A frame and a panel are ________ ?");
		question6.setFont(new Font("Helvetica", Font.BOLD, 15));

		f1 = new JCheckBox("both b and c");
		f2 = new JCheckBox("container that is used to display GUI-based Java applications");
		f3 = new JCheckBox("container that needs to be added to another container for it to be displayed");
		f4 = new JCheckBox(" one that is managed by the underlying operating system on which the program is run");

		question7 = new JLabel(
				"Which one is not a component of a GUI?");
		question7.setFont(new Font("Helvetica", Font.BOLD, 15));

		g1 = new JCheckBox("Javascript Sliders");
		g2 = new JCheckBox("Buttons");
		g3 = new JCheckBox("Labels");
		g4 = new JCheckBox("Menus");


		//adds listeners for the correct answers
		StyleListener listener55 = new StyleListener();
		b1.addItemListener(listener55);
		c1.addItemListener(listener55);
		d1.addItemListener(listener55);
		e1.addItemListener(listener55);
		f1.addItemListener(listener55);
		g1.addItemListener(listener55);

		submit6 = new JButton("Submit");
		submit6.addActionListener(new ButtonListener());

		add(quiz);

		add(question2);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(question3);
		add(c1);
		add(c2);
		add(c3);
		add(c4);
		add(question4);
		add(d1);
		add(d2);
		add(d3);
		add(d4);
		add(question5);
		add(e1);
		add(e2);
		add(e3);
		add(e4);
		add(question6);
		add(f1);
		add(f2);
		add(f3);
		add(f4);
		add(question7);
		add(g1);
		add(g2);
		add(g3);
		add(g4);

		add(submit6);
		setPreferredSize(new Dimension(800, 800));
		//setResizeable(false);

	}
	/*****************************
	  * Polymorphism: Interface
	  *****************************/

	// listens for the score of the quiz
	private class StyleListener implements ItemListener {
		public void itemStateChanged(ItemEvent event) {
			scoreCounter();
		}
	}
	//counts up the score of the user. 
	@SuppressWarnings("unchecked")
	public int scoreCounter() {
		
		if (b1.isSelected()) {
			score1++;
		}
		else if (c1.isSelected()){ 
			score1++;
		}
		else if (d1.isSelected()) {
			score1++;
		} 
		else if (e1.isSelected()) {
			score1++;
		} 
		else if (f1.isSelected()) {
			score1++;
		} 
		else if (g1.isSelected()) {
			score1++;	
		} 
		else if (h1.isSelected()) {
			score1++;
		} 
		else if (i1.isSelected()) {
			score1++;
		}
		else if (j1.isSelected()) {
			score1++;
		} 
		else if (k1.isSelected()) {
			score1++;
		}
		// ---------------------------------------------
		System.out.println(score1);
	
		return score1;
	}
	//	listens for the completion of the quiz and for the user
	//  to click the submit button. It then runs the users score and 
	//  if he/she passed. 	
	private class ButtonListener implements ActionListener {

		public void actionPerformed(ActionEvent event) {
			
			if (event.getSource() == submit6)
			{
			
			JFrame frame2 = new JFrame("Quiz Score");
			frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			QuizScore6 panel = new QuizScore6(score1, c, ic);
			frame2.getContentPane().add(panel);

			frame2.pack();
			frame2.setVisible(true);
			
			
			}

		}
	}
}
