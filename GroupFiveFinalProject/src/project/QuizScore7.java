/**
 *-------------------------------------------------------------------------------------------------------------------------//
 * Team 5 Authors: Danny Maldanaldo, Daniel Ordonez, Matthew Murray, Cody Schaffer
 * Title: OOP Study Guide Project
 * Team: 5
 * Instructor: Cobb
 * -------------------------------------------------------------------------------------------------------------------------//
 */
package project;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
/**
 * This class collects the user's score from 
 * the review quiz and gives the user permission 
 * to either go on, or upon failure of the quiz to
 * recursively take the quiz again.  
 */
public class QuizScore7 extends JPanel  {
	
	private static final long serialVersionUID = 1L;
	protected JFrame frame;
	protected JFrame frame2;
	JPanel quiz;
	JLabel quizScore;
	JLabel grade, exp;
	protected int score1;
	private JButton fail;
	private JButton success;
	protected String c;
	protected String ic;
	protected boolean moveOn;

	//constructor
	public QuizScore7(int s1, String correct, String incorrect) {
		
		setLayout (new GridLayout(5,5));
		Quiz7 sop = new Quiz7();
		setPreferredSize(new Dimension(200, 150));

		score1 = s1;
		c = correct;
		ic = incorrect;
		
		fail = new JButton ("Retake Quiz");
		success = new JButton ("Move on to the next section");
		
		fail.addActionListener(new ButtonListener());
		success.addActionListener(new ButtonListener());

		quizScore = new JLabel("Quiz Score: " + (getScore1()));
		quizScore.setFont(new Font("Helvetica", Font.PLAIN, 20));
		calculate();
	
//		area.setEditable(false);
//		add(area);
		add(grade);
		add (quizScore);
		add(exp);
	}

	//calculates the Letter grade for each Quiz. 
	public void calculate() {
		
		ArrayList<String> gradeList = new ArrayList<String>(6);
		gradeList.add("Grade: F");
		gradeList.add("Grade: D");
		gradeList.add("Grade: C");
		gradeList.add("Grade: B");
		gradeList.add("Grade: A");
		gradeList.add("Grade: A+");
		
		if (getScore1() < 2) {
			grade = new JLabel(gradeList.get(0));
			grade.setFont(new Font("Helvetica", Font.PLAIN, 20));
			
			exp = new JLabel("You did not pass. Please try again.");
			exp.setFont(new Font("Helvetica", Font.PLAIN, 12));
			add(fail);	
		} else if (getScore1() == 2) {
			grade = new JLabel(gradeList.get(1));
			grade.setFont(new Font("Helvetica", Font.PLAIN, 20));
			exp = new JLabel("Very poor: 60% ACCURACY ");
			exp.setFont(new Font("Helvetica", Font.PLAIN, 12));
			add(fail);
		} else if (getScore1() == 3) {
			grade = new JLabel(gradeList.get(2));
			grade.setFont(new Font("Helvetica", Font.PLAIN, 20));
			exp =new JLabel("You passed, but could use some work: 70% ACCURACY ");
			exp.setFont(new Font("Helvetica", Font.PLAIN, 12));
			add(success);
		} else if (getScore1() == 4) {
			grade = new JLabel(gradeList.get(3));
			grade.setFont(new Font("Helvetica", Font.PLAIN, 20));
			exp = new JLabel("You passed: 80% ACCURACY ");
			exp.setFont(new Font("Helvetica", Font.PLAIN, 12));
			add(success);
		} else if (getScore1() == 5) {
			grade = new JLabel(gradeList.get(4));
			grade.setFont(new Font("Helvetica", Font.PLAIN, 20));
			exp = new JLabel("You passed: 90% ACCURACY ");
			exp.setFont(new Font("Helvetica", Font.PLAIN, 12));
			add(success);
		} else if (getScore1() >= 6) {
			grade = new JLabel(gradeList.get(5));
			grade.setFont(new Font("Helvetica", Font.PLAIN, 20));
			exp = new JLabel("EXCELLENT: 100% ACCURACY ");
			exp.setFont(new Font("Helvetica", Font.PLAIN, 12));
			add(success);
		}
	}

	public int getScore1() {
		return score1;
	}
	public String getC() {
		return c;
	}
	public String getIC() {
		return ic;
	}
	//listens for the button press of either button success or button fail. 
	//If the button is the "Fail" button, the button press recursively calls
	//the quiz again.
	private class ButtonListener implements ActionListener{
		public void actionPerformed (ActionEvent event){
			if (event.getSource() == fail) // THIS IS THE RECURSIVE PART, IT CALLS THE QUIZ AGAIN
			{
				calculate();
				//QuizDriver qd = new QuizDriver();
				JFrame frame = new JFrame("Quiz 7.1");
				frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				
				frame.getContentPane().add(new Quiz7());
			
				frame.pack();
				frame.setVisible(true);
				
				moveOn = false;
				System.out.println(moveOn);
				
				//frame2.dispose()
			}
			else if (event.getSource() == success)
			{
				calculate();
				moveOn = true;
				System.out.println(moveOn);
				
				JFrame frame = new JFrame("Start");
				frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

				StartPanel panel = new StartPanel();
				frame.getContentPane().add(panel);

				frame.pack();
				frame.setVisible(true);	
			}
		}
	}

}

