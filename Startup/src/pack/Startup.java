package pack;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Startup {

	/**
	 * Author Cody Schaffer
	 */
		public static void main(String[] args) {
			JFrame frame = new JFrame ("StartUp Panel");
			  frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

			  
			  
			  frame.getContentPane().add(new StartupPanel());
			  
			  frame.pack();
			  frame.setVisible(true);
	}

}
