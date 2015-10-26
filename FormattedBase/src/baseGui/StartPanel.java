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
	private JButton review,chapter6,chapter7,chapter8,chapter9,chapter10,chapter11;
	
	public StartPanel()
	{
		review = new JButton("Review");
		chapter6 = new JButton("Chapter 6");
		chapter7 = new JButton("Chapter 7");
		chapter8 = new JButton("Chapter 8");
		chapter9 = new JButton("Chapter 9");
		chapter10 = new JButton("Chapter 10");
		chapter11 = new JButton("Chapter 11");
		
		setPreferredSize(new Dimension(1000,1000));
		review.addActionListener (new Listener1());
		chapter6.addActionListener (new Listener6());
		chapter7.addActionListener (new Listener7());
		chapter8.addActionListener (new Listener8());
		chapter9.addActionListener (new Listener9());
		chapter10.addActionListener (new Listener10());
		chapter11.addActionListener (new Listener11());
		add(review);
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
			
			ReviewPanel panel = new ReviewPanel();
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
