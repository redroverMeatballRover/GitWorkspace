/**
 * 
 */
package baseGui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

/**
 * @author dmaldonado
 *
 */
public class Chapter6Panel extends JPanel 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static JTabbedPane study;
	private static JPanel main;
	private static JPanel home, section1, section2, section3, section4, section5, section6, section7, quiz;
	private static JTextArea textArea;

	public Chapter6Panel()
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
		study.addTab("Section 7", section7);
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
		section7();
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
	
	public static void section7()
	{
		section7 = new JPanel();
		textArea = new JTextArea("Chapter 11 and stuff", 70, 70);
		textArea.setBounds(0, 0, 600, 600);
		textArea.setEditable(false);
		section7.add(textArea);
	}

	public static void quiz()
	{
		quiz = new JPanel();
		textArea = new JTextArea("Chapter 11 and stuff", 70, 70);
		textArea.setBounds(0, 0, 600, 600);
		textArea.setEditable(false);
		quiz.add(textArea);
	}
}