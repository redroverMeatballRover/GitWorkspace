/**
 * -------------------------------------------------------------------------------------------------------------------------//
 * Team 5 Authors: Danny Maldanaldo, Daniel Ordonez, Matthew Murray, Cody Schaffer
 * Title: OOP Study Guide Project
 * Team: 5
 * Instructor: Cobb
 * -------------------------------------------------------------------------------------------------------------------------//
 */
package project;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

//The StartupPanel navigates us to the main menu 
//where we navigate to the various chapters.

/*****************************
 * Class
 *****************************/
public class StartPanel extends JPanel 
{
	private static final long serialVersionUID = 1L;
	private JButton review,chapter6,chapter7,chapter8,chapter9,chapter10,chapter11;
	
	//constructor builds the objects//
	public StartPanel()
	{
		review = new JButton("Review");
		chapter6 = new JButton("Chapter 6");
		chapter7 = new JButton("Chapter 7");
		chapter8 = new JButton("Chapter 8");
		chapter9 = new JButton("Chapter 9");
		chapter10 = new JButton("Chapter 10");
		chapter11 = new JButton("Chapter 11");
		
		
		setPreferredSize(new Dimension(500,200));
		review.addActionListener (new Listener1());
		chapter6.addActionListener (new Listener6());
		chapter7.addActionListener (new Listener7());
		chapter8.addActionListener (new Listener8());
		chapter9.addActionListener (new Listener9());
		chapter10.addActionListener (new Listener10());
		chapter11.addActionListener (new Listener11());
		add(review);
		add(chapter6);
		add(chapter7);
		add(chapter8);
		add(chapter9);
		add(chapter10);
		add(chapter11);
	}
	//Button Listener for the Review (Chapters 1-5)
	private class Listener1 implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent arg0) 
		{
			
			JFrame frame = new JFrame("Review: Chapters 1-5");
			frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			
			ReviewPanel panel = new ReviewPanel();
			frame.getContentPane().add(panel);

			frame.pack();
			frame.setVisible(true);
		}
	}
	//Button Listener for Chapter 6
	private class Listener6 implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent arg0) 
		{
			JFrame frame = new JFrame("Chapter 6: GUI");
			frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

			Chapter6Panel panel = new Chapter6Panel();
			frame.getContentPane().add(panel);

			frame.pack();
			frame.setVisible(true);
		}	
	}
	////Button Listener for Chapter 7
	private class Listener7 implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent arg0) 
		{
			JFrame frame = new JFrame("Chapter 7: Arrays");
			frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

			Chapter7Panel panel = new Chapter7Panel();
			frame.getContentPane().add(panel);

			frame.pack();
			frame.setVisible(true);
		}	
	}
	//Button Listener for Chapter 8
	private class Listener8 implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent arg0) 
		{
			JFrame frame = new JFrame("Chapter 8: Inheritance");
			frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

			Chapter8Panel panel = new Chapter8Panel();
			frame.getContentPane().add(panel);

			frame.pack();
			frame.setVisible(true);
		}	
	}
	//Button Listener for Chapter 9
	private class Listener9 implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent arg0) 
		{
			JFrame frame = new JFrame("Chapter 9: Polymorphism");
			frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

			Chapter9Panel panel = new Chapter9Panel();
			frame.getContentPane().add(panel);

			frame.pack();
			frame.setVisible(true);
		}	
	}
	//Button Listener for Chapter 10
	private class Listener10 implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent arg0) 
		{
			JFrame frame = new JFrame("Chapter 10: Exceptions");
			frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

			Chapter10Panel panel = new Chapter10Panel();
			frame.getContentPane().add(panel);

			frame.pack();
			frame.setVisible(true);
		}	
	}
	//Button Listener for Chapter 11
	private class Listener11 implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent arg0) 
		{
			JFrame frame = new JFrame("Chapter 11: Recursion");
			frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

			Chapter11Panel panel = new Chapter11Panel();
			frame.getContentPane().add(panel);

			frame.pack();
			frame.setVisible(true);
		}	
	}
}
