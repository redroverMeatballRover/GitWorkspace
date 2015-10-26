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
public class StartPanel extends JPanel 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton chapter1;
	private JButton chapter2;
	private JButton chapter3;
	private JButton chapter4;
	private JButton chapter5;
	private JButton chapter6;
	private JButton chapter7;
	private JButton chapter8;
	private JButton chapter9;
	private JButton chapter10;
	private JButton chapter11;
	
	public StartPanel()
	{
		chapter1 = new JButton("Chapter 1");
		chapter2 = new JButton("Chapter 2");
		chapter3 = new JButton("Chapter 3");
		chapter4 = new JButton("Chapter 4");
		chapter5 = new JButton("Chapter 5");
		chapter6 = new JButton("Chapter 6");
		chapter7 = new JButton("Chapter 7");
		chapter8 = new JButton("Chapter 8");
		chapter9 = new JButton("Chapter 9");
		chapter10 = new JButton("Chapter 10");
		chapter11 = new JButton("Chapter 11");
		
		setPreferredSize(new Dimension(1000,1000));
		chapter1.addActionListener (new Listener1());
		chapter2.addActionListener (new Listener2());
		chapter3.addActionListener (new Listener3());
		chapter4.addActionListener (new Listener4());
		chapter5.addActionListener (new Listener5());
		chapter6.addActionListener (new Listener6());
		chapter7.addActionListener (new Listener7());
		chapter8.addActionListener (new Listener8());
		chapter9.addActionListener (new Listener9());
		chapter10.addActionListener (new Listener10());
		chapter11.addActionListener (new Listener11());
		add(chapter1);
		add(chapter2);
		add(chapter3);
		add(chapter4);
		add(chapter5);
		add(chapter6);
		add(chapter7);
		add(chapter8);
		add(chapter9);
		add(chapter10);
		add(chapter11);
	}
	
	private class Listener1 implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent arg0) 
		{
			JFrame frame = new JFrame("Chapter 1");
			frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

			Chapter1Panel panel = new Chapter1Panel();
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
			JFrame frame = new JFrame("Chapter 2");
			frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

			Chapter2Panel panel = new Chapter2Panel();
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
			JFrame frame = new JFrame("Chapter 3");
			frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

			Chapter3Panel panel = new Chapter3Panel();
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
			JFrame frame = new JFrame("Chapter 4");
			frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

			Chapter4Panel panel = new Chapter4Panel();
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
			JFrame frame = new JFrame("Chapter 5");
			frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

			Chapter5Panel panel = new Chapter5Panel();
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
			JFrame frame = new JFrame("Chapter 6");
			frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

			Chapter6Panel panel = new Chapter6Panel();
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
			JFrame frame = new JFrame("Chapter 7");
			frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

			Chapter7Panel panel = new Chapter7Panel();
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
			JFrame frame = new JFrame("Chapter 8");
			frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

			Chapter8Panel panel = new Chapter8Panel();
			frame.getContentPane().add(panel);

			frame.pack();
			frame.setVisible(true);
		}	
	}
	
	private class Listener9 implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent arg0) 
		{
			JFrame frame = new JFrame("Chapter 9");
			frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

			Chapter9Panel panel = new Chapter9Panel();
			frame.getContentPane().add(panel);

			frame.pack();
			frame.setVisible(true);
		}	
	}
	
	private class Listener10 implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent arg0) 
		{
			JFrame frame = new JFrame("Chapter 10");
			frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

			Chapter10Panel panel = new Chapter10Panel();
			frame.getContentPane().add(panel);

			frame.pack();
			frame.setVisible(true);
		}	
	}
	
	private class Listener11 implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent arg0) 
		{
			JFrame frame = new JFrame("Chapter 11");
			frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

			Chapter11Panel panel = new Chapter11Panel();
			frame.getContentPane().add(panel);

			frame.pack();
			frame.setVisible(true);
		}	
	}
}
