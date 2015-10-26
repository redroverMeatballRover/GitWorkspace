/**
 * -------------------------------------------------------------------------------------------------------------------------//
 * Team 5 Authors: Danny Maldanaldo, Daniel Ordonez, Matthew Murray, Cody Schaffer
 * Title: OOP Study Guide Project
 * Team: 5
 * Instructor: Cobb
 * -------------------------------------------------------------------------------------------------------------------------//
 */
package project;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;
import javax.swing.text.StyledDocument;

/**
 * This class creates the chapter 6 portion of the 
 * study guide. 
 */
public class Chapter10Panel extends JPanel 
{
	private static final long serialVersionUID = 1L;
	private static JTabbedPane study;
	private static JPanel main;
	private static JPanel home, section1, section2, section3, section4, section5, section6, quiz;
	private static JTextArea textArea;
	private static Scanner text;

	//constructor
	public Chapter10Panel()
	{
		setPreferredSize(new Dimension(1000,800));
		study = new JTabbedPane();
		main = new JPanel();
		setSize(800,800);
		main.setBackground(Color.gray);
		study.setForeground(Color.blue);

		main.setLayout(new BorderLayout());

		createPages();

		study= new JTabbedPane();
		study.addTab("Home", home);
		study.addTab("Sec 10.1", section1);
		study.addTab("Sec 10.2", section2);
		study.addTab("Sec 10.3", section3);
		study.addTab("sec 10.4", section4);
		study.addTab("Sec 10.5", section5);
		study.addTab("Sec 10.6", section6);
		study.addTab("Quiz", quiz);
		main.add(study, BorderLayout.CENTER);
		add(main);
		setVisible(true);

	}
	//constructor overload
	/*****************************
	  * Overloaded Constructor
	  *****************************/

	public Chapter10Panel(int x, int y)
	{
		setPreferredSize(new Dimension(1000,800));
		study = new JTabbedPane();
		main = new JPanel();
		setSize(x,y);
		main.setBackground(Color.gray);
		study.setForeground(Color.blue);

		main.setLayout(new BorderLayout());

		createPages();

		study= new JTabbedPane();
		study.addTab("Home", home);
		study.addTab("Sec 10.1", section1);
		study.addTab("Sec 10.2", section2);
		study.addTab("Sec 10.3", section3);
		study.addTab("Sec 10.4", section4);
		study.addTab("Sec 10.5", section5);
		study.addTab("Sec 10.6", section6);
		study.addTab("Quiz", quiz);
		main.add(study, BorderLayout.CENTER);
		add(main);
		setVisible(true);

	}
	//creates pages
	/*****************************
	  * Behavior
	  *****************************/
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
	//creates home tab with button to main menu
	public static void home()
	{
		/*****************************
		* Polymorphism: Inheritance
		*****************************/
		Menu menu = new MenuListener(); //polymorphism through innheritance
		home = new JPanel();
		JButton button = new JButton("Menu");
		button.addActionListener(new MenuListener());
		home.add(button);
		menu.button();
	}
	//section 1 tab
	public static void section1()
	{
		section1 = new JPanel();
		
		textArea = new JTextArea(read("text/Ch10Section1.txt"), 70, 70);
		textArea.setFont(new Font("Serif", Font.LAYOUT_LEFT_TO_RIGHT, 15));
		textArea.setFont(new Font("Serif", Font.BOLD, 15));
		textArea.setBounds(0, 0, 600, 600);
		textArea.setEditable(false);
		section1.add(textArea);
	}
	//section2 tab
	public static void section2()
	{
		section2 = new JPanel();
		textArea = new JTextArea(read("text/Ch10Section2.txt"), 70, 70);
		textArea.setFont(new Font("Serif", Font.LAYOUT_LEFT_TO_RIGHT, 15));
		textArea.setFont(new Font("Serif", Font.BOLD, 15));
		textArea.setBounds(0, 0, 600, 600);
		textArea.setEditable(false);
		section2.add(textArea);
	}
	//section3 tab
	public static void section3()
	{
		section3 = new JPanel();
		textArea = new JTextArea(read("text/Ch10Section3.txt"), 70, 70);
		textArea.setFont(new Font("Serif", Font.LAYOUT_LEFT_TO_RIGHT, 15));
		textArea.setFont(new Font("Serif", Font.BOLD, 15));
		textArea.setBounds(0, 0, 600, 600);
		textArea.setEditable(false);
		section3.add(textArea);
	}
	//section4 tab
	public static void section4()
	{
		section4 = new JPanel();
		textArea = new JTextArea(read("text/Ch10Section4.txt"), 70, 70);
		textArea.setFont(new Font("Serif", Font.LAYOUT_LEFT_TO_RIGHT, 15));
		textArea.setFont(new Font("Serif", Font.BOLD, 15));
		textArea.setBounds(0, 0, 600, 600);
		textArea.setEditable(false);
		section4.add(textArea);
	}
	//section5 tab
	public static void section5()
	{
		section5 = new JPanel();
		textArea = new JTextArea( 70, 70);
		textArea = new JTextArea(read("text/Ch10Section5.txt"), 70, 70);
		textArea.setFont(new Font("Serif", Font.LAYOUT_LEFT_TO_RIGHT, 15));
		textArea.setFont(new Font("Serif", Font.BOLD, 15));
		textArea.setBounds(0, 0, 600, 600);
		textArea.setEditable(false);
		section5.add(textArea);

	}
	//section 6 tab
	public static void section6()
	{
		section6 = new JPanel();
		textArea = new JTextArea(read("text/Ch10Section6.txt"), 70, 70);
		textArea.setFont(new Font("Serif", Font.LAYOUT_LEFT_TO_RIGHT, 15));
		textArea.setFont(new Font("Serif", Font.BOLD, 15));
		textArea.setBounds(0, 0, 600, 600);
		textArea.setEditable(false);
		section6.add(textArea);
	}
	//reads from the file
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
	//Sets quiz tab and the "take quiz" button
	public static void quiz()
	{
		quiz = new JPanel();
		JButton button = new JButton("Take Quiz");
		button.addActionListener(new Listener10());
		quiz.add(button);
	}
}
//listens for the take quiz button to run the quiz
/*****************************
 * Polymorphism: Interface
 *****************************/

	class Listener10 implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent arg0) 
		{
			JFrame frame = new JFrame("Chapter 10 Quiz: Exception");
			
			frame.getContentPane().add(new Quiz10());
			 
			frame.pack();
			frame.setVisible(true);
		}
	}

