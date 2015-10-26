package test;

import java.awt.*;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Test2 extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int count;
	private JButton push;
	private JLabel label, btSet, resultLabel;
	private JTextField numChange;
	
	public Test2()
	{
		count = 0;
		
		push = new JButton ("Push Me!");
		
		
		label = new JLabel ("Number of pushes: " + count);
		btSet = new JLabel ("Automatically set the button: ");
		resultLabel = new JLabel ("---");
		
		push.addActionListener (new ButtonListener());
		
		add (push);
		add (label);
		
		setBackground(Color.cyan);
		setPreferredSize (new Dimension(300,400));	
	}
	
	
	private class ButtonListener implements ActionListener
	{
		public void actionPerformed (ActionEvent event)
		{
			count++;
			label.setText("pushes: " + count);
		}
	}
	
	
	
	
}