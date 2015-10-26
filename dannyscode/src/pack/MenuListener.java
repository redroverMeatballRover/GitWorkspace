package pack;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

/**
 * @author dmaldonado
 *
 */
public class MenuListener implements ActionListener
{
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		JFrame frame = new JFrame("Start");
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

		StartPanel panel = new StartPanel();
		frame.getContentPane().add(panel);

		frame.pack();
		frame.setVisible(true);	
	}
}
