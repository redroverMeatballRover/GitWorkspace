/**
 * 
 */
package gui;

import javax.swing.JFrame;

/**
 * @author dmaldonado
 *
 */
public class Startup {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Recursive Spiral");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		QuizPanel panel = new QuizPanel();
		frame.getContentPane().add(panel);

		frame.pack();
		frame.setVisible(true);
	}

}
