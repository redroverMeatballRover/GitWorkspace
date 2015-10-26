import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.*;



public class UserInterface extends JFrame 
{
	private static JTabbedPane study;
	private static JPanel main;
	private static JPanel chapter1, chapter2, chapter3, chapter4, chapter5, quiz;
	private static JTextArea textArea;
	
	public UserInterface()
	{
		study = new JTabbedPane();
		main = new JPanel();
		setSize(800,800);
		main.setLayout(new BorderLayout());
		getContentPane().add(main);
		
		createPages();
		
		study= new JTabbedPane();
		study.addTab("Chapter 1", chapter1);
		study.addTab("Chapter 2", chapter2);
		study.addTab("Chapter 3", chapter3);
		study.addTab("Chapter 4", chapter4);
		study.addTab("Chapter 5", chapter5);
		study.addTab("   Quiz   ", quiz);
		main.add(study, BorderLayout.CENTER);
		add(main);
		setVisible(true);
		setResizable(false);
	}
	
	public static void createPages()
	{
		chapter1();
		chapter2();
		chapter3();
		chapter4();
		chapter5();
		quiz();
	}
	
	
	public static void chapter1()
	{
		chapter1 = new JPanel();
		textArea = new JTextArea("Review and stuff", 70, 70);
		textArea.setBounds(0, 0, 600, 600);
		textArea.setEditable(false);
		chapter1.add(textArea);
	}
	public static void chapter2()
	{
		chapter2 = new JPanel();
		textArea = new JTextArea("Review and stuff", 70, 70);
		textArea.setBounds(0, 0, 600, 600);
		textArea.setEditable(false);
		chapter2.add(textArea);
	}
	public static void chapter3()
	{
		chapter3 = new JPanel();
		textArea = new JTextArea("Review and stuff", 70, 70);
		textArea.setBounds(0, 0, 600, 600);
		textArea.setEditable(false);
		chapter3.add(textArea);
	}
	public static void chapter4()
	{
		chapter4 = new JPanel();
		textArea = new JTextArea("Review and stuff", 70, 70);
		textArea.setBounds(0, 0, 600, 600);
		textArea.setEditable(false);
		chapter4.add(textArea);
	}
	public static void chapter5()
	{
		chapter5 = new JPanel();
		textArea = new JTextArea("Review and stuff", 70, 70);
		textArea.setBounds(0, 0, 600, 600);
		textArea.setEditable(false);
		chapter5.add(textArea);
	}
	public static void quiz()
	{
		chapter5 = new JPanel();
		textArea = new JTextArea("Review and stuff", 70, 70);
		textArea.setBounds(0, 0, 600, 600);
		textArea.setEditable(false);
		chapter5.add(textArea);
	}
	
	
	
	public static void main(String[]args)
	{
		UserInterface one = new UserInterface();
	}
}
