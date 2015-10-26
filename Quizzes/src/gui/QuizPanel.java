/**
 * 
 */
package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * @author dmaldonado
 *
 */
public class QuizPanel extends JPanel
{
	private JLabel quote;
	private JRadioButton comedy, philosophy, carpentry;
	private String question1, question2, question3;

	//-----------------------------------------------------------------
	//  Set  vfts up a panel with a label and a set of radio buttons
	//  that control its text.
	//-----------------------------------------------------------------
	public QuizPanel()
	{
		question1 = "What does the finally block do?";
		question2 = "What type of error is it when a user inputs a double as a string?";
		question3 = "Is it possible to wirte your own exceptions?";

		quote = new JLabel (question1);
		quote.setFont (new Font ("Helvetica", Font.BOLD, 24));

		comedy = new JRadioButton ("Run no matter what", true);
		comedy.setBackground (Color.green);
		philosophy = new JRadioButton ("NumberFormat Exception");
		philosophy.setBackground (Color.green);
		carpentry = new JRadioButton ("Yes");
		carpentry.setBackground (Color.green);

		ButtonGroup group = new ButtonGroup();
		group.add (comedy);
		group.add (philosophy);
		group.add (carpentry);

		QuoteListener listener = new QuoteListener();
		comedy.addActionListener (listener);
		philosophy.addActionListener (listener);
		carpentry.addActionListener (listener);

		add (quote);
		add (comedy);
		add (philosophy);
		add (carpentry);

		setBackground (Color.green);
		setPreferredSize (new Dimension(300, 100));
	}
	
	
	

	//*****************************************************************
	//  Represents the listener for all radio buttons
	//*****************************************************************
	private class QuoteListener implements ActionListener
	{
		//--------------------------------------------------------------
		//  Sets the text of the label depending on which radio
		//  button was pressed.
		//--------------------------------------------------------------
		public void actionPerformed (ActionEvent event)
		{
			Object source = event.getSource();

			if (source == comedy)
				quote.setText (question1);
			else
				if (source == philosophy)
					quote.setText (question2);
				else
					quote.setText (question3);
		}
	}
}
