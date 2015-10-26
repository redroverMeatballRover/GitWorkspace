package GUIFirst;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class PushCounterPanel extends JPanel {

	private int count;
	private JButton push;
	private JLabel label;
	
	public PushCounterPanel()
	{
		
		count = 0;
		push = new JButton ("Push Me!");
		push.addActionListener(new ButtonListener());
		
		label = new JLabel ("Pushes: " + count);
		add (push);
		add(label);
		
		setBackground (Color.red);
		setPreferredSize (new Dimension(300,40));
	}
	private class ButtonListener implements ActionListener
	{
		public void actionPerformed (ActionEvent event)
		{
			count++;
			label.setText("Pushes: " + count);
			
			
		}
	}
	

}
