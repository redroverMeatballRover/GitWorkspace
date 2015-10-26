/**
 * 
 */


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;
import javax.swing.text.StyledDocument;

import project.MenuListener;

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
		
		textArea = new JTextArea(read("text/chapter1.txt"), 70, 70);
		textArea.setFont(new Font("Serif", Font.LAYOUT_LEFT_TO_RIGHT, 16));
		textArea.setBounds(0, 0, 600, 600);
		textArea.setEditable(false);
		chapter1.add(textArea);
	}

	public static void chapter2()
	{
		chapter2 = new JPanel();
		textArea = new JTextArea(read("text/chapter2.txt"), 70, 70);
		textArea.setFont(new Font("Serif", Font.LAYOUT_LEFT_TO_RIGHT, 16));
		textArea.setBounds(0, 0, 600, 600);
		textArea.setEditable(false);
		chapter2.add(textArea);
	}

	public static void chapter3()
	{
		chapter3 = new JPanel();
		textArea = new JTextArea(read("text/chapter3.txt"), 70, 70);
		textArea.setFont(new Font("Serif", Font.LAYOUT_LEFT_TO_RIGHT, 16));
		textArea.setBounds(0, 0, 600, 600);
		textArea.setEditable(false);
		chapter3.add(textArea);
	}

	public static void chapter4()
	{
		chapter4 = new JPanel();
		textArea = new JTextArea(read("text/chapter4.txt"), 70, 70);
		textArea.setFont(new Font("Serif", Font.LAYOUT_LEFT_TO_RIGHT, 16));
		textArea.setBounds(0, 0, 600, 600);
		textArea.setEditable(false);
		chapter4.add(textArea);
	}

	public static void chapter5()
	{
		chapter5 = new JPanel();
		textArea = new JTextArea( 70, 70);
		textArea = new JTextArea(read("text/chapter5.txt"), 70, 70);
		textArea.setFont(new Font("Serif", Font.LAYOUT_LEFT_TO_RIGHT, 16));
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
	
	public static JTextPane createTextArea(String file) {
    	
    	String[] initString;
    	
		try {
			text = new Scanner(new File(file));
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}
		int lineCount = 0;
		while(text.hasNextLine())
		{
			lineCount ++;
			text.nextLine();
		}
		initString = new String[lineCount];
		for(int i = 0; i > lineCount; i++)
		{
			initString[i] = "win";
		}
 
        String[] initStyles =
                { "large", "italic", "bold", "small", "large",
                  "regular", "button", "regular", "icon",
                  "regular"
                };
 
        JTextPane textPane = new JTextPane();
        StyledDocument doc = textPane.getStyledDocument();
        addStylesToDocument(doc);
 
        try {
            for (int i=0; i < initString.length; i++) {
                doc.insertString(doc.getLength(), initString[i],
                                 doc.getStyle(initStyles[i]));
            }
        } catch (BadLocationException ble) {
            System.err.println("Couldn't insert initial text into text pane.");
        }
        
        return textPane;
    }
    
	public static void addStylesToDocument(StyledDocument doc) {
        Style def = StyleContext.getDefaultStyleContext().
                        getStyle(StyleContext.DEFAULT_STYLE);
 
        Style regular = doc.addStyle("regular", def);
        StyleConstants.setFontFamily(def, "SansSerif");
 
        Style s = doc.addStyle("italic", regular);
        StyleConstants.setItalic(s, true);
 
        s = doc.addStyle("bold", regular);
        StyleConstants.setBold(s, true);
 
        s = doc.addStyle("small", regular);
        StyleConstants.setFontSize(s, 10);
 
        s = doc.addStyle("large", regular);
        StyleConstants.setFontSize(s, 16);
 
        s = doc.addStyle("icon", regular);
        StyleConstants.setAlignment(s, StyleConstants.ALIGN_CENTER);
    }
}