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
 * This class is a quiz for the Review Panel that the user can take to test
 * his skills from the previous chapters. 
 */
public class Quiz8 extends JPanel {

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
	private JButton submit8;
	
	//constructor
	public Quiz8() {
		
		setLayout (new BoxLayout(this, BoxLayout.Y_AXIS));
		quiz = new JLabel("Quiz 8.1");
		quiz.setFont(new Font("Helvetica", Font.PLAIN, 25));
		//QUIZ QUESTIONS
		// -----------------------------------------------------------------------------------------------------------//

		question2 = new JLabel(
				"What is Inheritance?");
		question2.setFont(new Font("Helvetica", Font.BOLD, 15));

		b1 = new JCheckBox("When a class receives aspects of another class.");
		b2 = new JCheckBox("When a Class dies and another gains its aspects. ");
		b3 = new JCheckBox("Passing down variables.");
		b4 = new JCheckBox( "That thing at the place.");

		question3 = new JLabel(
				"The parent and child class are also called: ");
		question3.setFont(new Font("Helvetica", Font.BOLD, 15));

		c1 = new JCheckBox("Base and subclass");
		c2 = new JCheckBox("A and B class");
		c3 = new JCheckBox("Origin and spawn class");
		c4 = new JCheckBox(" Master and Slave class");
		// italic.setBackground(Color.cyan);

		question4 = new JLabel(
				"Which of these could be parent and child?");
		question4.setFont(new Font("Helvetica", Font.BOLD, 15));

		d1 = new JCheckBox("Map and Destination");
		d2 = new JCheckBox("Worker and Work ");
		d3 = new JCheckBox("Ring and Ding");
		d4 = new JCheckBox("Fish and Motorboat ");

		question5 = new JLabel(
				"What modifier keeps things under wraps yet allows it to be seen in Inheritance?");
		question5.setFont(new Font("Helvetica", Font.BOLD, 15));

		e1 = new JCheckBox("Protected");
		e2 = new JCheckBox("Secret");
		e3 = new JCheckBox("Background");
		e4 = new JCheckBox("Inherit");

		question6 = new JLabel(
				"An abstract class");
		question6.setFont(new Font("Helvetica", Font.BOLD, 15));

		f1 = new JCheckBox("contains empty methods");
		f2 = new JCheckBox("Contains generic methods that can get filled out. ");
		f3 = new JCheckBox("Is made by crappy artists.");
		f4 = new JCheckBox("is hard to define.");

		question7 = new JLabel(
				"Shadow Variables:");
		question7.setFont(new Font("Helvetica", Font.BOLD, 15));

		g1 = new JCheckBox("Are strongly advised against");
		g2 = new JCheckBox("Essential in Inheritance");
		g3 = new JCheckBox(" are variables with new values");
		g4 = new JCheckBox("Always protected.");


		//
		StyleListener listener6 = new StyleListener();
		b1.addItemListener(listener6);
		c1.addItemListener(listener6);
		d1.addItemListener(listener6);
		e1.addItemListener(listener6);
		f1.addItemListener(listener6);
		g1.addItemListener(listener6);

		submit8 = new JButton("Submit");
		submit8.addActionListener(new ButtonListener());

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
		add(submit8);
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
			
			//frame.dispose();
			//referenceToTheFrame.setVisible(false);
			
			if (event.getSource() == submit8)
			{
			
			JFrame frame2 = new JFrame("Quiz Score");
			frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			QuizScore8 panel = new QuizScore8(score1, c, ic);
			frame2.getContentPane().add(panel);

			frame2.pack();
			frame2.setVisible(true);
			
			
			}

		}
	}
}