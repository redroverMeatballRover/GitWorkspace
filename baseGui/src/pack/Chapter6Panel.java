/**
 * 
 */
package pack;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;
import javax.swing.text.StyledDocument;

import com.sun.org.apache.bcel.internal.generic.PUSH;

/**
 * @author dmaldonado
 *
 */
public class Chapter6Panel extends JPanel 
{
	/**
	 * 
	 */
	private static String newline = "\n";
	private static final long serialVersionUID = 1L;
	private static JTabbedPane study;
	private static JPanel main;
	protected static JPanel home, section1, section2, section3, section4, section5, section6, section7, quiz;
	private static JTextArea textArea;
	protected JButton takeQuiz;

	public Chapter6Panel()
	{
		setPreferredSize(new Dimension(1000,1000));
		study = new JTabbedPane();
		main = new JPanel();
		setSize(800,800);
		main.setBackground(Color.gray);
		study.setForeground(Color.blue);

		main.setLayout(new BorderLayout());
		
		takeQuiz = new JButton("Take the quiz");
		takeQuiz.addActionListener (new ButtonListener());
		add (takeQuiz);

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

//	public static void section1()
//	{
//		section1 = new JPanel();
//		textArea = new JTextArea("Review and stuff and here is the rest of my code that i will be bringing to you today!", 70, 70);
//		textArea.setBounds(0, 0, 600, 600);
//		textArea.setEditable(false);
//		section1.add(textArea);
//	}
	
	protected static void section1()
	{
		section1 = new JPanel();
		textArea = new JTextArea("Review and stuff and here is the rest of my code that i will be bringing to you today!", 70, 70);
		textArea.setBounds(0, 0, 600, 600);
		textArea.setEditable(false);
		section1.add(textArea);
	//	createTextArea();
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
	
		//add (quizTaker);
	}	
		private class ButtonListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				JFrame frame = new JFrame("Style Options");
				
				frame.getContentPane().add(new Quiz6());
			
				frame.pack();
				frame.setVisible(true);
			}
		}
		
	
}