package test;

import java.awt.Component;

import javax.swing.JFrame;

public class Test2Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		  JFrame frame = new JFrame ("Creature");
		  frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

		  
		  Test2 panel = new Test2();
		  frame.getContentPane().add(panel);
		  
		  frame.pack();
		  frame.setVisible(true);

	}

}
