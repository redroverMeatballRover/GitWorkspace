/**
 * 
 */
package pack;

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
		JFrame frame = new JFrame("Start");
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

		StartPanel panel = new StartPanel();
		frame.getContentPane().add(panel);

		frame.pack();
		frame.setVisible(true);
	}

}
