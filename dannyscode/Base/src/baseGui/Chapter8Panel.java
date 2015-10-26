/**
 * 
 */
package baseGui;

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
public class Chapter8Panel extends JPanel 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton section1,section2,section3,section4,section5,menu;
	
	public Chapter8Panel()
	{
		section1 = new JButton("Section 1");
		section2 = new JButton("Section 2");
		section3 = new JButton("Section 3");
		section4 = new JButton("Section 4");
		section5 = new JButton("Section 5");
		menu = new JButton("Menu");
		
		setPreferredSize(new Dimension(1000,1000));
		section1.addActionListener (new Listener1());
		section2.addActionListener (new Listener2());
		section3.addActionListener (new Listener3());
		section4.addActionListener (new Listener4());
		section5.addActionListener (new Listener5());
		menu.addActionListener(new MenuListener());
		add(section1);
		add(section2);
		add(section3);
		add(section4);
		add(section5);
		add(menu);
	}
	
	private class Listener1 implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent arg0) 
		{
			JFrame frame = new JFrame("Section 1");
			frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

			Chapter8Section1Panel panel = new Chapter8Section1Panel();
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

			Chapter8Section2Panel panel = new Chapter8Section2Panel();
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

			Chapter8Section3Panel panel = new Chapter8Section3Panel();
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

			Chapter8Section4Panel panel = new Chapter8Section4Panel();
			frame.getContentPane().add(panel);

			frame.pack();
			frame.setVisible(true);
		}
	}
	
	private class Listener5 implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent arg0) 
		{
			JFrame frame = new JFrame("Section 5");
			frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

			Chapter8Section5Panel panel = new Chapter8Section5Panel();
			frame.getContentPane().add(panel);

			frame.pack();
			frame.setVisible(true);
		}
	}
}
