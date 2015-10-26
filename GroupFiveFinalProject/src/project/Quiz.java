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
public class Quiz extends JPanel {

	/*****************************
	  * State
	  *****************************/
	private static final long serialVersionUID = 1L;
	private JLabel quiz, question2, question3, question4, question5, question6,
			question7;
	private JCheckBox b1, b2, b3, b4, c1, c2, c3, c4, d1, d2, d3, d4, e1, e2,
			e3, e4, f1, f2, f3, f4, g1, g2, g3, g4, h1, h2, h3, h4, i1, i2, i3,
			i4, j1, j2, j3, j4, k1, k2, k3, k4;
	protected int score1;
	protected String c;
	protected String ic;
	protected boolean n;
	protected int count;
	private JButton submit;

	//constructor
	public Quiz() {
		
		setLayout (new BoxLayout(this, BoxLayout.Y_AXIS));
		quiz = new JLabel("Quiz 6.1");
		quiz.setFont(new Font("Helvetica", Font.PLAIN, 25));
		
		//QUIZ QUESTIONS
		// -----------------------------------------------------------------------------------------------------------//
		question2 = new JLabel(
				"What is the fundamental element that makes up a java program?");
		question2.setFont(new Font("Helvetica", Font.BOLD, 15));

		b1 = new JCheckBox("objects");
		b2 = new JCheckBox("houses");
		b3 = new JCheckBox("boats");
		b4 = new JCheckBox("all of the above");

		question3 = new JLabel(
				"What is one of the four types of computer languages?");
		question3.setFont(new Font("Helvetica", Font.BOLD, 15));

		c1 = new JCheckBox("assembly");
		c2 = new JCheckBox("english");
		c3 = new JCheckBox("math");
		c4 = new JCheckBox("GUI");
		// italic.setBackground(Color.cyan);

		question4 = new JLabel(
				"Identifiers fall into three categories. What is one of these categories?");
		question4.setFont(new Font("Helvetica", Font.BOLD, 15));

		d1 = new JCheckBox("words we find in a book");
		d2 = new JCheckBox("words that we make up when writing a program");
		d3 = new JCheckBox("words that have caps");
		d4 = new JCheckBox("words that are not english words");

		question5 = new JLabel(
				"What are the three types of errors that you will encounter when developing a program? ");
		question5.setFont(new Font("Helvetica", Font.BOLD, 15));

		e1 = new JCheckBox("compile-time, hardware, machine");
		e2 = new JCheckBox("run-time, logical, machine");
		e3 = new JCheckBox("rune-time, compile-time, hardware");
		e4 = new JCheckBox("compile-time, run-time, logical ");

		question6 = new JLabel(
				"A conversion between one primitive type and another falls into one of two categories. What are they?");
		question6.setFont(new Font("Helvetica", Font.BOLD, 15));

		f1 = new JCheckBox("Widening and Narrowing");
		f2 = new JCheckBox("Widening and Lessening");
		f3 = new JCheckBox("Narrowing and Thickening");
		f4 = new JCheckBox("Narrowing and Converting");

		question7 = new JLabel(
				"What does an assignment statement do?");
		question7.setFont(new Font("Helvetica", Font.BOLD, 15));

		g1 = new JCheckBox("assigns a method to a class");
		g2 = new JCheckBox("assigns a value to a variable ");
		g3 = new JCheckBox("assigns a boolean to a class");
		g4 = new JCheckBox("assigns an integer to a method");

		//adds listeners for the correct answers
		StyleListener listener = new StyleListener();
		b1.addItemListener(listener);		
		c1.addItemListener(listener);
		d2.addItemListener(listener);
		e4.addItemListener(listener);
		f1.addItemListener(listener);
		g2.addItemListener(listener);
		submit = new JButton("Submit");
		submit.addActionListener(new ButtonListener());

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
		add(submit);
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
	/*****************************
	  * GUI: Listener
	  *****************************/

	private class ButtonListener implements ActionListener {
		/*****************************
		  * GUI: Event
		  *****************************/
		public void actionPerformed(ActionEvent event) {
			
			if (event.getSource() == submit)
			{
			
			JFrame frame2 = new JFrame("Quiz Score");
			frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			/*****************************
			* Object
			*****************************/
			QuizScore panel = new QuizScore(score1, c, ic);
			frame2.getContentPane().add(panel);

			frame2.pack();
			frame2.setVisible(true);
			}

		}
	}
}
