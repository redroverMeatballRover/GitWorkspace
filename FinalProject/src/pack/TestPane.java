package pack;

import javax.swing.JFrame;

public class TestPane {

	
	public static void main(String[] args) {

		 JFrame frame = new JFrame ("Creature");
		  frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

		  
		  TestPanel panel = new TestPanel();
		  frame.getContentPane().add(panel);
		  
		  frame.pack();
		  frame.setVisible(true);	
		

	}

}
