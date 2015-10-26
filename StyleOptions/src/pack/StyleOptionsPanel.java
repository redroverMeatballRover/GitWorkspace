package pack;

import javax.swing.*;


import java.awt.*;
import java.awt.event.*;

public class StyleOptionsPanel extends JPanel {

	private JLabel saying;
	private JCheckBox bold, italic;
	
	public StyleOptionsPanel() 
	{
		
		
		
		
		
		
		// textbox -------------------------------------------------------
		
		
//		public class FarenheitPanel extends JPanel {
//
//			private JLabel inputLabel, outputLabel, resultLabel;
//			private JTextField fahrenheit;
//			private JButton fahrPush;
//
//			public FarenheitPanel() {
//				
//				inputLabel = new JLabel("Enter Fahrenheight temperature:");
//				outputLabel = new JLabel("Temperature in Celsius: ");
//				resultLabel = new JLabel("---");
//
//				fahrenheit = new JTextField(5);
//				fahrPush = new JButton ("Convert");
//				TempListener listener = new TempListener();
//				fahrenheit.addActionListener(listener);
//				fahrPush.addActionListener(listener);
//				add(inputLabel);
//				add(fahrenheit);
//				add(outputLabel);
//				add(resultLabel);
//				add (fahrPush);
//
//				setPreferredSize(new Dimension(300, 75));
//				setBackground(Color.yellow);
//			}
//			
//			/*-----------------------------------------------------
//			 * Represents a listener for the temperature input field. 
//			 * this area listen for the button.
//			 -----------------------------------------------------*/
//			
//			private class TempListener implements ActionListener
//			{
//				public void actionPerformed(ActionEvent event) {
//					
//					int fahrenheitTemp, CelsiusTemp;
//					
//					String text = fahrenheit.getText();
//					
//					fahrenheitTemp = Integer.parseInt(text);
//					CelsiusTemp = (fahrenheitTemp - 32) * 5 / 9;
//					
//					resultLabel.setText(Integer.toString (CelsiusTemp));
//
//				}
//
//			}
//
//		}
		
		//------------------------------------------------------------------------
		// check box
		saying = new JLabel ("say it with style");
		saying.setFont(new Font ("Helvetica", Font.PLAIN, 36));
		
		bold = new JCheckBox ("bold");
		bold.setBackground((Color.cyan));
		italic = new JCheckBox ("Italic");
		italic.setBackground(Color.cyan);
		
		StyleListener listener = new StyleListener();
		bold.addItemListener (listener);
		italic.addItemListener(listener);
		
		add(saying);
		add(bold);
		add(italic);
		
		setBackground(Color.CYAN);
		setPreferredSize (new Dimension (300,100));
	}
	
	private class StyleListener implements ItemListener
	{
		public void itemStateChanged(ItemEvent event)
		{
			int style = Font.PLAIN;
			if(bold.isSelected())
				style = Font.BOLD;
			if (italic.isSelected())
				style = Font.ITALIC;
			
			saying.setFont(new Font ("Helvetica", style, 36));
			
		}
	}
	
	
	
}