/**
 * 
 */
package baseGui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;



/**
 * @author dmaldonado
 *
 */
public class Chapter7Panel extends JPanel 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static JTabbedPane study;
	private static JPanel main;
	private static JPanel home, section1, section2, section3, section4, section5, section6, quiz;
	private static JTextArea textArea;
	private static Scanner text;

	public Chapter7Panel()
	{
		setPreferredSize(new Dimension(1000,1000));
		study = new JTabbedPane();
		main = new JPanel();
		setSize(800,800);
		main.setBackground(Color.gray);
		study.setForeground(Color.blue);

		main.setLayout(new BorderLayout());

		createPages();

		study= new JTabbedPane();
		study.addTab("Home", home);
		study.addTab("Section 1", section1);
		study.addTab("Section 2", section2);
		study.addTab("Section 3", section3);
		study.addTab("Section 4", section4);
		study.addTab("Section 5", section5);
		study.addTab("Section 6", section6);
		study.addTab("Quiz", quiz);
		main.add(study, BorderLayout.CENTER);
		add(main);
		setVisible(true);

	}

	public static void createPages()
	{
		home();
		section1();
		section2();
		section3();
		section4();
		section5();
		section6();
		quiz();
	}

	public static void home()
	{
		home = new JPanel();
		JButton button = new JButton("Menu");
		button.addActionListener(new MenuListener());
		home.add(button);
	}

	public static void section1()
	{
		section1 = new JPanel();
		textArea = new JTextArea("Review and stuff", 70, 70);
		textArea.setBounds(0, 0, 600, 600);
		textArea.setEditable(false);
		section1.add(textArea);
	}

	public static void section2()
	{
		section2 = new JPanel();
		textArea = new JTextArea("Chapter 6 and stuff", 70, 70);
		textArea.setBounds(0, 0, 600, 600);
		textArea.setEditable(false);
		section2.add(textArea);
	}

	public static void section3()
	{
		section3 = new JPanel();
		textArea = new JTextArea("Chapter 7 and stuff", 70, 70);
		textArea.setBounds(0, 0, 600, 600);
		textArea.setEditable(false);
		section3.add(textArea);
	}

	public static void section4()
	{
		section4 = new JPanel();
		textArea = new JTextArea("Chapter 8 and stuff", 70, 70);
		textArea.setBounds(0, 0, 600, 600);
		textArea.setEditable(false);
		section4.add(textArea);
	}

	public static void section5()
	{
		section5 = new JPanel();
		textArea = new JTextArea("Chapter 9 and stuff", 70, 70);
		textArea.setBounds(0, 0, 600, 600);
		textArea.setEditable(false);
		section5.add(textArea);
	}

	public static void section6()
	{
		section6 = new JPanel();
		textArea = new JTextArea("Chapter 10 and stuff", 70, 70);
		textArea.setBounds(0, 0, 600, 600);
		textArea.setEditable(false);
		section6.add(textArea);
	}

	public static String read(String file)
	{
		String chap = "";
		try {
			text = new Scanner(new File(file));
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} finally {
			System.out.println("Searches for text document to fill text area");
		}
		while(text.hasNext())
		{
			chap = chap + text.nextLine() + "\n";
			
		}
		return chap;
	}
	
	public static void quiz()
	{
		quiz = new JPanel();
		JButton button = new JButton("Take Quiz");
		button.addActionListener(new Listener3());
		quiz.add(button);
	}
	
	class Listener3 implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent arg0) 
		{
			JFrame frame = new JFrame("Quiz 7");
			
			frame.getContentPane().add(new Quiz7());
			 
			frame.pack();
			frame.setVisible(true);
		}
		
	}
	
//	public static void quiz()
//	{
//		quiz = new JPanel();
//		textArea = new JTextArea("Chapter 11 and stuff", 70, 70);
//		textArea.setBounds(0, 0, 600, 600);
//		textArea.setEditable(false);
//		quiz.add(textArea);
//	}
}