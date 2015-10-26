package GUI;
/**
 * Author Cody Schaffer
 */

import javax.swing.JFrame;
//********************************************************************
//This is the driver class for the Farenheight GUI. The goal of this
// class is to make a temperature device that converts farenheight to
// celsius with an "enter" button reference and a actual button reference.
//********************************************************************
public class Farenheit {

	public static void main(String[] args) {

		JFrame frame = new JFrame("Fahrenheit");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		FarenheitPanel panel = new FarenheitPanel();
		frame.getContentPane().add(panel);

		frame.pack();
		frame.setVisible(true);

	}

}
