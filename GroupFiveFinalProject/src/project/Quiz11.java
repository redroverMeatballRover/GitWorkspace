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
 * This class is a quiz for the chapter 11 that the user can take to test
 * his skills from the previous chapters. 
 */
public class Quiz11 extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel quiz, question2, question3, question4, question5, question6,
			question7, question8, question9, question10, question11;
	private JCheckBox b1, b2, b3, b4, c1, c2, c3, c4, d1, d2, d3, d4, e1, e2,
			e3, e4, f1, f2, f3, f4, g1, g2, g3, g4, h1, h2, h3, h4, i1, i2, i3,
			i4, j1, j2, j3, j4, k1, k2, k3, k4;
	protected int score1;
	protected String c;
	protected String ic;
	protected boolean n;
	protected int count;
	private JButton submit11;
	
	//constructor
	public Quiz11() {
		
		setLayout (new BoxLayout(this, BoxLayout.Y_AXIS));
		
		quiz = new JLabel("Quiz 11.1");
		quiz.setFont(new Font("Helvetica", Font.PLAIN, 25));

		// -----------------------------------------------------------------------------------------------------------//
		
	
		question2 = new JLabel(
				"To ensure that infinite recursion does not happen, what is needed?");
		question2.setFont(new Font("Helvetica", Font.BOLD, 15));

		b1 = new JCheckBox("Base Case");
		b2 = new JCheckBox("If statement");
		b3 = new JCheckBox("a for loop");
		b4 = new JCheckBox("all of the above");

		question3 = new JLabel(
				"Out of the options below, which one is a type of recursion? ");
		question3.setFont(new Font("Helvetica", Font.BOLD, 15));

		c1 = new JCheckBox("indirect");
		c2 = new JCheckBox("Recursion");
		c3 = new JCheckBox("command");
		c4 = new JCheckBox("Invite");
		// italic.setBackground(Color.cyan);

		question4 = new JLabel(
				"Out of the options below, which one is a type of recursion? ");
		question4.setFont(new Font("Helvetica", Font.BOLD, 15));

		d1 = new JCheckBox("Direct");
		d2 = new JCheckBox("Multiple");
		d3 = new JCheckBox("Anaray");
		d4 = new JCheckBox("2D Array");

		question5 = new JLabel(
				"4.	When a method is called recursively, which of the following happens? ");
		question5.setFont(new Font("Helvetica", Font.BOLD, 15));

		e1 = new JCheckBox("New parameters");
		e2 = new JCheckBox("New components");
		e3 = new JCheckBox("New variables");
		e4 = new JCheckBox("Both A and B");

		question6 = new JLabel(
				"When does infinite recursion occur? ");
		question6.setFont(new Font("Helvetica", Font.BOLD, 15));

		f1 = new JCheckBox("When the base case is missing");
		f2 = new JCheckBox("For many reasons");
		f3 = new JCheckBox("Because my code is broken");
		f4 = new JCheckBox("All of them");

		question7 = new JLabel(
				"To program recursively...");
		question7.setFont(new Font("Helvetica", Font.BOLD, 15));

		g1 = new JCheckBox("One must think recursively");
		g2 = new JCheckBox("one must think");
		g3 = new JCheckBox("One must sleep");
		g4 = new JCheckBox("One must think a lot");



		StyleListener listener11 = new StyleListener();
		b1.addItemListener(listener11);

		c1.addItemListener(listener11);
	
		d1.addItemListener(listener11);
	
		e1.addItemListener(listener11);
	
		f1.addItemListener(listener11);
	
		g1.addItemListener(listener11);


		submit11 = new JButton("Submit");
		submit11.addActionListener(new ButtonListener());

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

		add(submit11);
		
		setPreferredSize(new Dimension(800, 800));
		//setResizeable(false);

	}
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
		System.out.println(score1);
	
		return score1;
	}
	//	listens for the completion of the quiz and for the user
	//  to click the submit button. It then runs the users score and 
	//  if he/she passed. 	
	private class ButtonListener implements ActionListener {

		public void actionPerformed(ActionEvent event) {
			
	
			if (event.getSource() == submit11)
			{
			
			JFrame frame2 = new JFrame("Quiz Score");
			frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			QuizScore11 panel = new QuizScore11(score1, c, ic);
			frame2.getContentPane().add(panel);

			frame2.pack();
			frame2.setVisible(true);
			
			
			}

		}
	}
}