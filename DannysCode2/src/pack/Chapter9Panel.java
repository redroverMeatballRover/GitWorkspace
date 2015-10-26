/**
 * 
 */
package pack;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @author dmaldonado
 *
 */
public class Chapter9Panel extends JPanel 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton section1,section2,section3,section4,menu;
	
	public Chapter9Panel()
	{
		section1 = new JButton("Section 1");
		section2 = new JButton("Section 2");
		section3 = new JButton("Section 3");
		section4 = new JButton("Section 4");
		menu = new JButton("Menu");
		
		setPreferredSize(new Dimension(1000,1000));
		section1.addActionListener (new Listener1());
		section2.addActionListener (new Listener2());
		section3.addActionListener (new Listener3());
		section4.addActionListener (new Listener4());
		menu.addActionListener(new MenuListener());
		add(section1);
		add(section2);
		add(section3);
		add(section4);
		add(menu);
	}
	
	private class Listener1 implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent arg0) 
		{
			JFrame frame = new JFrame("Section 1");
			frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

			Chapter9Section1Panel panel = new Chapter9Section1Panel();
			frame.getContentPane().add(panel);

			frame.pack();
			frame.setVisible(true);
		}	
	}
	
	private class Listener2 implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent arg0) 
		{
			JFrame frame = new JFrame("Section 2");
			frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

			Chapter9Section2Panel panel = new Chapter9Section2Panel();
			frame.getContentPane().add(panel);

			frame.pack();
			frame.setVisible(true);
		}
	}
	
	private class Listener3 implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent arg0) 
		{
			JFrame frame = new JFrame("Section 3");
			frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

			Chapter9Section3Panel panel = new Chapter9Section3Panel();
			frame.getContentPane().add(panel);

			frame.pack();
			frame.setVisible(true);
		}
	}
	
	private class Listener4 implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent arg0) 
		{
			JFrame frame = new JFrame("Section 4");
			frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

			Chapter9Section4Panel panel = new Chapter9Section4Panel();
			frame.getContentPane().add(panel);

			frame.pack();
			frame.setVisible(true);
		}
	}
}
