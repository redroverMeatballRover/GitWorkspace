/**
 *-------------------------------------------------------------------------------------------------------------------------//
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

/*
 * This class builds the Review Chapters (Chapters 1-5)
 * and holds the tabs as well as the quiz. 
 * All the chapters and sections of this program are read from a text file. 
 */
public class ReviewPanel extends JPanel 
{
	private static final long serialVersionUID = 1L;
	private static JTabbedPane study;
	private static JPanel main;
	private static JPanel home, chapter1, chapter2, chapter3, chapter4, chapter5, quiz;
	private static JTextArea textArea;
	private static Scanner text;
	
	
	//constructor
	public ReviewPanel()
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
		study.addTab("Chapter 1", chapter1);
		study.addTab("Chapter 2", chapter2);
		study.addTab("Chapter 3", chapter3);
		study.addTab("Chapter 4", chapter4);
		study.addTab("Chapter 5", chapter5);
		study.addTab("Quiz", quiz);
		main.add(study, BorderLayout.CENTER);
		add(main);
		setVisible(true);

	}
	//overloaded constructor
	public ReviewPanel(int x, int y)
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
		study.addTab("Chapter 1", chapter1);
		study.addTab("Chapter 2", chapter2);
		study.addTab("Chapter 3", chapter3);
		study.addTab("Chapter 4", chapter4);
		study.addTab("Chapter 5", chapter5);
		study.addTab("Quiz", quiz);
		main.add(study, BorderLayout.CENTER);
		add(main);
		setVisible(true);

	}
	//creates pages/tabs
	public static void createPages()
	{
		home();
		chapter1();
		chapter2();
		chapter3();
		chapter4();
		chapter5();
		quiz();
	}
	//home tab, button retraces to the main menu.
	public static void home()
	{
		home = new JPanel();
		JButton button = new JButton("Menu");
		button.addActionListener(new MenuListener());
		home.add(button);
	}
	//chapter 1 tab
	public static void chapter1()
	{
		chapter1 = new JPanel();
		
		textArea = new JTextArea(read("text/chapter1.txt"), 70, 70);
		textArea.setFont(new Font("Serif", Font.LAYOUT_LEFT_TO_RIGHT, 13));
		textArea.setFont(new Font("Serif", Font.BOLD, 13));
		textArea.setBounds(0, 0, 600, 600);
		textArea.setEditable(false);
		chapter1.add(textArea);
	}
	//chapter 2 tab
	public static void chapter2()
	{
		chapter2 = new JPanel();
		textArea = new JTextArea(read("text/chapter2.txt"), 70, 70);
		textArea.setFont(new Font("Serif", Font.LAYOUT_LEFT_TO_RIGHT, 13));
		textArea.setFont(new Font("Serif", Font.BOLD, 13));
		textArea.setBounds(0, 0, 600, 600);
		textArea.setEditable(false);
		chapter2.add(textArea);
	}
	//chapter 3 tab
	public static void chapter3()
	{
		chapter3 = new JPanel();
		textArea = new JTextArea(read("text/chapter3.txt"), 70, 70);
		textArea.setFont(new Font("Serif", Font.LAYOUT_LEFT_TO_RIGHT, 13));
		textArea.setFont(new Font("Serif", Font.BOLD, 13));
		textArea.setBounds(0, 0, 600, 600);
		textArea.setEditable(false);
		chapter3.add(textArea);
	}
	//chapter 4 tab
	public static void chapter4()
	{
		chapter4 = new JPanel();
		textArea = new JTextArea(read("text/chapter4.txt"), 70, 70);
		textArea.setFont(new Font("Serif", Font.LAYOUT_LEFT_TO_RIGHT, 13));
		textArea.setFont(new Font("Serif", Font.BOLD, 13));
		textArea.setBounds(0, 0, 600, 600);
		textArea.setEditable(false);
		chapter4.add(textArea);
	}
	//chapter 5 tab
	public static void chapter5()
	{
		chapter5 = new JPanel();
		textArea = new JTextArea( 70, 70);
		textArea = new JTextArea(read("text/chapter5.txt"), 70, 70);
		textArea.setFont(new Font("Serif", Font.LAYOUT_LEFT_TO_RIGHT, 13));
		textArea.setFont(new Font("Serif", Font.BOLD, 13));
		textArea.setBounds(0, 0, 600, 600);
		textArea.setEditable(false);
		chapter5.add(textArea);
	}
	//Reads the text file
	public static String read(String file)
	{
		String chap = "";
		
		//USE OF THE TRY-CATCH
		/*****************************
		  * Exception Handling: Try-Catch
		  *****************************/

		try {
			text = new Scanner(new File(file));
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} 
		/*****************************
		  * Exception Handling: Finally
		  *****************************/
		finally //USE OF THE FINALLY CLAUSE
		{
			System.out.println("Searches for text document to fill text area");
		}
		while(text.hasNext())
		{
			chap = chap + text.nextLine() + "\n";
			
		}
		return chap;
	}
	
	//sends user to take a graded quiz
	public static void quiz()
	{
		quiz = new JPanel();
		JButton button = new JButton("Review Quiz Chapters 1-5");
		button.addActionListener(new Listener1());
		quiz.add(button);
	}
}
	//Listens for the press of the "Take Quiz Button"
	class Listener1 implements ActionListener
	{
		//Sends user to the quiz
		@Override
		public void actionPerformed(ActionEvent arg0) 
		{
			JFrame frame = new JFrame("Style Options");
			
			frame.getContentPane().add(new Quiz());
			 
			frame.pack();
			frame.setVisible(true);
		}
		
	}