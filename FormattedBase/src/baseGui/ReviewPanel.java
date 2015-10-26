/**
 * 
 */
package baseGui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

/**
 * @author dmaldonado
 *
 */
public class ReviewPanel extends JPanel 
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static JTabbedPane study;
	private static JPanel main;
	private static JPanel home, chapter1, chapter2, chapter3, chapter4, chapter5, quiz;
	private static JTextArea textArea;
	private static Scanner text;

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

	public static void home()
	{
		home = new JPanel();
		JButton button = new JButton("Menu");
		button.addActionListener(new MenuListener());
		home.add(button);
	}

	public static void chapter1()
	{
		chapter1 = new JPanel();
		//JScrollPane scroller = new JScrollPane(chapter1);  
		//this.getContentPane().add(scroller, BorderLayout.CENTER);  
		
		textArea = new JTextArea(read("text/Section6.1.txt"), 70, 70);
		textArea.setFont(new Font ("Helvetica", Font.BOLD, 12));
		textArea.setBounds(0, 0, 600, 600);
		textArea.setEditable(false);
		chapter1.add(textArea);
	}

	public static void chapter2()
	{
		chapter2 = new JPanel();
		textArea = new JTextArea(read("text/chapter2.txt"), 70, 70);
		textArea.setBounds(0, 0, 600, 600);
		textArea.setEditable(false);
		chapter2.add(textArea);
	}

	public static void chapter3()
	{
		chapter3 = new JPanel();
		textArea = new JTextArea(read("text/chapter3.txt"), 70, 70);
		textArea.setBounds(0, 0, 600, 600);
		textArea.setEditable(false);
		chapter3.add(textArea);
	}

	public static void chapter4()
	{
		chapter4 = new JPanel();
		textArea = new JTextArea(read("text/chapter4.txt"), 70, 70);
		textArea.setBounds(0, 0, 600, 600);
		textArea.setEditable(false);
		chapter4.add(textArea);
	}

	public static void chapter5()
	{
		chapter5 = new JPanel();
		textArea = new JTextArea(read("text/chapter5.txt"), 70, 70);
		textArea.setBounds(0, 0, 600, 600);
		textArea.setEditable(false);
		chapter5.add(textArea);
	}

	public static void quiz()
	{
		quiz = new JPanel();
		textArea = new JTextArea("Quiz", 70, 70);
		textArea.setBounds(0, 0, 600, 600);
		textArea.setEditable(false);
		quiz.add(textArea);
	}
	
	public static String read(String file)
	{
		String chap = "";
		try {
			text = new Scanner(new File(file));
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}
		while(text.hasNext())
		{
			chap = chap + text.nextLine() + "\n";
			
		}
		return chap;
	}
}