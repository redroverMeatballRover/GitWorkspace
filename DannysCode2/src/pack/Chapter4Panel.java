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
public class Chapter4Panel extends JPanel 
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton section1, section2, section3, section4, section5, section6, section7, section8, menu;
	
	public Chapter4Panel()
	{
		section1 = new JButton("Section 1");
		section2 = new JButton("Section 2");
		section3 = new JButton("Section 3");
		section4 = new JButton("Section 4");
		section5 = new JButton("Section 5");
		section6 = new JButton("Section 6");
		section7 = new JButton("Section 7");
		section8 = new JButton("Section 8");
		menu = new JButton("Menu");
		
		setPreferredSize(new Dimension(1000,1000));
		section1.addActionListener (new Listener1());
		section2.addActionListener (new Listener2());
		section3.addActionListener (new Listener3());
		section4.addActionListener (new Listener4());
		section5.addActionListener (new Listener5());
		section6.addActionListener (new Listener6());
		section7.addActionListener (new Listener7());
		section8.addActionListener (new Listener8());
		menu.addActionListener(new MenuListener());
		add(section1);
		add(section2);
		add(section3);
		add(section4);
		add(section5);
		add(section6);
		add(section7);
		add(section8);
		add(menu);
	}
	
	private class Listener1 implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent arg0) 
		{
			JFrame frame = new JFrame("Section 1");
			frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

			Chapter4Section1Panel panel = new Chapter4Section1Panel();
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

			Chapter4Section2Panel panel = new Chapter4Section2Panel();
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

			Chapter4Section3Panel panel = new Chapter4Section3Panel();
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

			Chapter4Section4Panel panel = new Chapter4Section4Panel();
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

			Chapter4Section5Panel panel = new Chapter4Section5Panel();
			frame.getContentPane().add(panel);

			frame.pack();
			frame.setVisible(true);
		}
	}
	private class Listener6 implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent arg0) 
		{
			JFrame frame = new JFrame("Section 6");
			frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

			Chapter4Section6Panel panel = new Chapter4Section6Panel();
			frame.getContentPane().add(panel);

			frame.pack();
			frame.setVisible(true);
		}
	}
	private class Listener7 implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent arg0) 
		{
			JFrame frame = new JFrame("Section 7");
			frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

			Chapter4Section7Panel panel = new Chapter4Section7Panel();
			frame.getContentPane().add(panel);

			frame.pack();
			frame.setVisible(true);
		}
	}
	private class Listener8 implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent arg0) 
		{
			JFrame frame = new JFrame("Section 8");
			frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

			Chapter4Section8Panel panel = new Chapter4Section8Panel();
			frame.getContentPane().add(panel);

			frame.pack();
			frame.setVisible(true);
		}
	}
}
