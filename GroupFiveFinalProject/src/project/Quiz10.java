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
public class Quiz10 extends JPanel {

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
	private JButton submit10;

	//constructor
	public Quiz10() {
		
		setLayout (new BoxLayout(this, BoxLayout.Y_AXIS));		
		quiz = new JLabel("Quiz 10.1");
		quiz.setFont(new Font("Helvetica", Font.PLAIN, 25));

		// -----------------------------------------------------------------------------------------------------------//
		question2 = new JLabel(
				"A checked exception is an exception that must be?");
		question2.setFont(new Font("Helvetica", Font.PLAIN, 12));

		b1 = new JCheckBox("caught and handled when thrown");
		b2 = new JCheckBox("caught and thrown when handled");
		b3 = new JCheckBox("all of the above");
		b4 = new JCheckBox("Using a finally clause");

		question3 = new JLabel(
				"What does a finally block do? ");
		question3.setFont(new Font("Helvetica", Font.PLAIN, 12));

		c1 = new JCheckBox("Run no matter what");
		c2 = new JCheckBox("Run if the TRY block is used");
		c3 = new JCheckBox("Run only if the CATCH block is used");
		c4 = new JCheckBox("Used before the main method");
		// italic.setBackground(Color.cyan);

		question4 = new JLabel(
				"Which of the following is not a standard I/O stream?");
		question4.setFont(new Font("Helvetica", Font.PLAIN, 12));

		d1 = new JCheckBox("(system.read)");
		d2 = new JCheckBox("(system.EXECUTE)");
		d3 = new JCheckBox("(system.post)");
		d4 = new JCheckBox("(system.DISPOSE)");

		question5 = new JLabel(
				"What is required in a try-catch? ");
		question5.setFont(new Font("Helvetica", Font.PLAIN, 12));

		e1 = new JCheckBox("Try block");
		e2 = new JCheckBox("An if statemnt");
		e3 = new JCheckBox("A while statement");
		e4 = new JCheckBox("Recursion");

		question6 = new JLabel(
				"Where is the finally block placed? ");
		question6.setFont(new Font("Helvetica", Font.PLAIN, 12));

		f1 = new JCheckBox("at the end of the try catch block");
		f2 = new JCheckBox("Recursion");
		f3 = new JCheckBox("Rec");
		f4 = new JCheckBox("Finally Clause");

		question7 = new JLabel(
				"At most, how many finally blocks can you have in one try-catch?  ");
		question7.setFont(new Font("Helvetica", Font.PLAIN, 12));

		g1 = new JCheckBox("1");
		g2 = new JCheckBox("2");
		g3 = new JCheckBox("3");
		g4 = new JCheckBox("4");



		StyleListener listener10 = new StyleListener();
		b1.addItemListener(listener10);

		c1.addItemListener(listener10);
		d1.addItemListener(listener10);

		e1.addItemListener(listener10);
		f1.addItemListener(listener10);
		g1.addItemListener(listener10);

		submit10 = new JButton("Submit");
		submit10.addActionListener(new ButtonListener());

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
		add(submit10);
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
			
			if (event.getSource() == submit10)
			{
			
			JFrame frame2 = new JFrame("Quiz Score");
			frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			QuizScore10 panel = new QuizScore10(score1, c, ic);
			frame2.getContentPane().add(panel);

			frame2.pack();
			frame2.setVisible(true);
			
			
			}

		}
	}
}