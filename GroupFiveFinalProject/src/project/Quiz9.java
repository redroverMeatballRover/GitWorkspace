/**
 * -------------------------------------------------------------------------------------------------------------------------//
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
 * This class is a quiz for the chapter 9 that the user can take to test
 * his skills from the previous chapters. 
 */
public class Quiz9 extends JPanel {

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
	public Quiz9() {
		
		setLayout (new BoxLayout(this, BoxLayout.Y_AXIS));
		
		quiz = new JLabel("Quiz 8.1");
		quiz.setFont(new Font("Helvetica", Font.PLAIN, 25));

		// -----------------------------------------------------------------------------------------------------------//
		
	
		question2 = new JLabel(
				"Polymorphism is");
		question2.setFont(new Font("Helvetica", Font.PLAIN, 12));

		b1 = new JCheckBox("the practice of using one reference variable to point to various methods and objects.");
		b2 = new JCheckBox("the practice of using inheritance to extend interfaces.");
		b3 = new JCheckBox("the practice of using one reference variable to point to various GUIs");
		b4 = new JCheckBox("the practice of using one independent variable in the interface.");

		question3 = new JLabel(
				"Java uses __ binding");
		question3.setFont(new Font("Helvetica", Font.PLAIN, 12));

		c1 = new JCheckBox("Late");
		c2 = new JCheckBox("Early");
		c3 = new JCheckBox("Zero");
		c4 = new JCheckBox("Extending");
		// italic.setBackground(Color.cyan);

		question4 = new JLabel(
				"How can polymorphism be used?");
		question4.setFont(new Font("Helvetica", Font.PLAIN, 12));

		d1 = new JCheckBox("By Inheritance and Interfaces.");
		d2 = new JCheckBox("By Inheritance and Extends.");
		d3 = new JCheckBox("By Inheritance and GUIs.");
		d4 = new JCheckBox("By Interfaces and Interheritables.");

		question5 = new JLabel(
				" An interface");
		question5.setFont(new Font("Helvetica", Font.PLAIN, 12));

		e1 = new JCheckBox("Has only constants and abstract methods.");
		e2 = new JCheckBox("Has only empty methods.");
		e3 = new JCheckBox("Is an  empty class");
		e4 = new JCheckBox("Has only constants");

		question6 = new JLabel(
				"Interface hierarchy");
		question6.setFont(new Font("Helvetica", Font.PLAIN, 12));

		f1 = new JCheckBox("Has no visibility issues.");
		f2 = new JCheckBox("Has many visibility issues.");
		f3 = new JCheckBox("Is protected");
		f4 = new JCheckBox("Is Invisible");

		question7 = new JLabel(
				"A polymorphed object");
		question7.setFont(new Font("Helvetica", Font.PLAIN, 12));

		g1 = new JCheckBox("can't use methods not defined in the interface.");
		g2 = new JCheckBox("can't use empty methods ");
		g3 = new JCheckBox("can't use methods not defined in its sister class");
		g4 = new JCheckBox("Has stuff");



		StyleListener listener9 = new StyleListener();
		b1.addItemListener(listener9);
		c1.addItemListener(listener9);	
		d1.addItemListener(listener9);	
		e1.addItemListener(listener9);
		f1.addItemListener(listener9);	
		g1.addItemListener(listener9);

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
			

			//referenceToTheFrame.setVisible(false);
			
			if (event.getSource() == submit8)
			{
			
			JFrame frame2 = new JFrame("Chapter 9 Quiz Score");
			frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			QuizScore9 panel = new QuizScore9(score1, c, ic);
			frame2.getContentPane().add(panel);

			frame2.pack();
			frame2.setVisible(true);
			
			
			}

		}
	}
}