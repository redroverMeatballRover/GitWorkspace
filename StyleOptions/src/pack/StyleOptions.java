package pack;

import javax.swing.JFrame;

public class StyleOptions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		  JFrame frame = new JFrame ("");
		  frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

		  
		  
		  frame.getContentPane().add(new StyleOptionsPanel());
		  
		  frame.pack();
		  frame.setVisible(true);

	}

}
