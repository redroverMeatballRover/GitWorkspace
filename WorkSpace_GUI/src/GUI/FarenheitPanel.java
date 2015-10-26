package GUI;

/**
 * Author Cody Schaffer
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/*-----------------------------------------------------
 * Constructor creates main GUI components and makes 
 * a button for the converter. 
 -----------------------------------------------------*/

public class FarenheitPanel extends JPanel {

	private JLabel inputLabel, outputLabel, resultLabel;
	private JTextField fahrenheit;
	private JButton fahrPush;

	public FarenheitPanel() {
		
		inputLabel = new JLabel("Enter Fahrenheight temperature:");
		outputLabel = new JLabel("Temperature in Celsius: ");
		resultLabel = new JLabel("---");

		fahrenheit = new JTextField(5);
		fahrPush = new JButton ("Convert");
		TempListener listener = new TempListener();
		fahrenheit.addActionListener(listener);
		fahrPush.addActionListener(listener);
		add(inputLabel);
		add(fahrenheit);
		add(outputLabel);
		add(resultLabel);
		add (fahrPush);

		setPreferredSize(new Dimension(300, 75));
		setBackground(Color.yellow);
	}
	
	/*-----------------------------------------------------
	 * Represents a listener for the temperature input field. 
	 * this area listen for the button.
	 -----------------------------------------------------*/
	
	private class TempListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event) {
			
			int fahrenheitTemp, CelsiusTemp;
			
			String text = fahrenheit.getText();
			
			fahrenheitTemp = Integer.parseInt(text);
			CelsiusTemp = (fahrenheitTemp - 32) * 5 / 9;
			
			resultLabel.setText(Integer.toString (CelsiusTemp));

		}

	}

}
