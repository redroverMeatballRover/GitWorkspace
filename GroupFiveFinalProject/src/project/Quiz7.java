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
 * This class is a quiz for the Chapter 7 that the user can take to test
 * his skills from the previous chapters. 
 */
public class Quiz7 extends JPanel {

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
	private JButton submit7;

	//constructor
	public Quiz7() {
		
		setLayout (new BoxLayout(this, BoxLayout.Y_AXIS));
		
		quiz = new JLabel("Quiz 7.1");
		quiz.setFont(new Font("Helvetica", Font.PLAIN, 25));
		//QUIZ QUESTIONS
		// -----------------------------------------------------------------------------------------------------------//
		question2 = new JLabel(
				"What is an array?");
		question2.setFont(new Font("Helvetica", Font.BOLD, 15));

		b1 = new JCheckBox("a programming language construct used to group and organize data, such as a list of 100 values.");
		b2 = new JCheckBox("a programming language construct used to build GUIs");
		b3 = new JCheckBox("a programming language construct used to group objects");
		b4 = new JCheckBox("a programming language construct for constants");

		question3 = new JLabel(
				"What is an array element?");
		question3.setFont(new Font("Helvetica", Font.BOLD, 15));

		c1 = new JCheckBox("type of value an array holds.");
		c2 = new JCheckBox("a value");
		c3 = new JCheckBox("an element variable");
		c4 = new JCheckBox("a multiple object value");
		// italic.setBackground(Color.cyan);

		question4 = new JLabel(
				"What is bounds checking?");
		question4.setFont(new Font("Helvetica", Font.BOLD, 15));

		d1 = new JCheckBox("What the index operator performs");
		d2 = new JCheckBox("What the index operator does with the elements");
		d3 = new JCheckBox("What the index operator explodes");
		d4 = new JCheckBox("all of the above.");

		question5 = new JLabel(
				"What does an initializer list do?");
		question5.setFont(new Font("Helvetica", Font.BOLD, 15));

		e1 = new JCheckBox("Instantiates an array and provide the initial values for the elements of the array");
		e2 = new JCheckBox("Instantiates an array and provide the initial values for the elements of the list");
		e3 = new JCheckBox("A and B");
		e4 = new JCheckBox("B and C");

		question6 = new JLabel(
				"Can an array be passed as a parameter?");
		question6.setFont(new Font("Helvetica", Font.BOLD, 15));

		f1 = new JCheckBox("True");
		f2 = new JCheckBox("False");
		f3 = new JCheckBox("A and B");
		f4 = new JCheckBox("all of the below.");

		question7 = new JLabel(
				"Can objects be stored in an array?");
		question7.setFont(new Font("Helvetica", Font.BOLD, 15));

		g1 = new JCheckBox("True");
		g2 = new JCheckBox("False");
		g3 = new JCheckBox("Sure");
		g4 = new JCheckBox("NO");

		//adds listeners for the correct answers
		StyleListener listener7 = new StyleListener();
		b1.addItemListener(listener7);
		c1.addItemListener(listener7);
		d1.addItemListener(listener7);
		e1.addItemListener(listener7);	
		f1.addItemListener(listener7);
		g1.addItemListener(listener7);

		submit7 = new JButton("Submit");
		submit7.addActionListener(new ButtonListener());

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
		add(submit7);
	
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
		
		// ---------------------------------------------
		System.out.println(score1);
	
		return score1;
	}
	
	//	listens for the completion of the quiz and for the user
	//  to click the submit button. It then runs the users score and 
	//  if he/she passed. 	
	private class ButtonListener implements ActionListener {

		public void actionPerformed(ActionEvent event) {
			
			if (event.getSource() == submit7)
			{
			
			JFrame frame2 = new JFrame("Quiz Score");
			frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			QuizScore7 panel = new QuizScore7(score1, c, ic);
			frame2.getContentPane().add(panel);

			frame2.pack();
			frame2.setVisible(true);
			
			
			}

		}
	}
}
