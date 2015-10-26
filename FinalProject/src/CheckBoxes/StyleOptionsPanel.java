package CheckBoxes;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

public class StyleOptionsPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel quiz, question2, question3, question4, question5, question6,
			question7, question8, question9, question10, question11;
	private JCheckBox b1, b2, b3, b4, c1, c2, c3, c4, d1, d2, d3, d4, e1, e2,
			e3, e4, f1, f2, f3, f4, g1, g2, g3, g4, h1, h2, h3, h4, i1, i2, i3,
			i4, j1, j2, j3, j4, k1, k2, k3, k4;
	protected int score1;
	protected String c;
	protected String ic;
	protected boolean n;
	protected int count;
	private JButton submit;
	
	
	

	public StyleOptionsPanel() {
		
		setLayout (new BoxLayout(this, BoxLayout.Y_AXIS));
		//setLayout (new GridLayout(10,10));

	//	JPanel panel=new JPanel();
	//  JScrollPane scrollBar=new JScrollPane(panel,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);  
		  
		
		
		
		quiz = new JLabel("Quiz 6.1");
		quiz.setFont(new Font("Helvetica", Font.PLAIN, 25));

		// -----------------------------------------------------------------------------------------------------------//
		
	
		question2 = new JLabel(
				"Another question that has another question to a question that _____________ .");
		question2.setFont(new Font("Helvetica", Font.PLAIN, 12));

		b1 = new JCheckBox("test question test question test question");
		b2 = new JCheckBox("Test test test test test");
		b3 = new JCheckBox("test test");
		b4 = new JCheckBox("test");

		question3 = new JLabel(
				"Another question that has another question to a question that _____________ .");
		question3.setFont(new Font("Helvetica", Font.PLAIN, 12));

		c1 = new JCheckBox("test question test question test question");
		c2 = new JCheckBox("Test test test test test");
		c3 = new JCheckBox("test test");
		c4 = new JCheckBox("test");
		// italic.setBackground(Color.cyan);

		question4 = new JLabel(
				"Another question that has another question to a question that _____________ .");
		question4.setFont(new Font("Helvetica", Font.PLAIN, 12));

		d1 = new JCheckBox("test question test question test question");
		d2 = new JCheckBox("Test test test test test");
		d3 = new JCheckBox("test test");
		d4 = new JCheckBox("test");

		question5 = new JLabel(
				"Another question that has another question to a question that _____________ .");
		question5.setFont(new Font("Helvetica", Font.PLAIN, 12));

		e1 = new JCheckBox("test question test question test question");
		e2 = new JCheckBox("Test test test test test");
		e3 = new JCheckBox("test test");
		e4 = new JCheckBox("test");

		question6 = new JLabel(
				"Another question that has another question to a question that _____________ .");
		question6.setFont(new Font("Helvetica", Font.PLAIN, 12));

		f1 = new JCheckBox("test question test question test question");
		f2 = new JCheckBox("Test test test test test");
		f3 = new JCheckBox("test test");
		f4 = new JCheckBox("test");

		question7 = new JLabel(
				"Another question that has another question to a question that _____________ .");
		question7.setFont(new Font("Helvetica", Font.PLAIN, 12));

		g1 = new JCheckBox("test question test question test question");
		g2 = new JCheckBox("Test test test test test");
		g3 = new JCheckBox("test test");
		g4 = new JCheckBox("test");

//		question8 = new JLabel(
//				"Another question that has another question to a question that _____________ .");
//		question8.setFont(new Font("Helvetica", Font.PLAIN, 12));
//
//		h1 = new JCheckBox("test question test question test question");
//		h2 = new JCheckBox("Test test test test test");
//		h3 = new JCheckBox("test test");
//		h4 = new JCheckBox("test");
//
//		question9 = new JLabel(
//				"Another question that has another question to a question that _____________ .");
//		question9.setFont(new Font("Helvetica", Font.PLAIN, 12));
//
//		i1 = new JCheckBox("test question test question test question");
//		i2 = new JCheckBox("Test test test test test");
//		i3 = new JCheckBox("test test");
//		i4 = new JCheckBox("test");
//
//		question10 = new JLabel(
//				"Another question that has another question to a question that _____________ .");
//		question10.setFont(new Font("Helvetica", Font.PLAIN, 12));
//
//		j1 = new JCheckBox("test question test question test question");
//		j2 = new JCheckBox("Test test test test test");
//		j3 = new JCheckBox("test test");
//		j4 = new JCheckBox("test");
//
//		question11 = new JLabel(
//				"Another question that has another question to a question that _____________ .");
//		question11.setFont(new Font("Helvetica", Font.PLAIN, 12));
//
//		k1 = new JCheckBox("test question test question test question");
//		k2 = new JCheckBox("Test test test test test");
//		k3 = new JCheckBox("test test");
//		k4 = new JCheckBox("test");

		StyleListener listener = new StyleListener();
		b1.addItemListener(listener);
//		b2.addItemListener(listener);
//		b3.addItemListener(listener);
//		b4.addItemListener(listener);
		
		c1.addItemListener(listener);
//		c2.addItemListener(listener);
//		c3.addItemListener(listener);
//		c4.addItemListener(listener);
		
		d1.addItemListener(listener);
//		d2.addItemListener(listener);
//		d3.addItemListener(listener);
//		d4.addItemListener(listener);
		
		e1.addItemListener(listener);
//		e2.addItemListener(listener);
//		e3.addItemListener(listener);
//		e4.addItemListener(listener);
		
		f1.addItemListener(listener);
//		f2.addItemListener(listener);
//		f3.addItemListener(listener);
//		f4.addItemListener(listener);
		
		g1.addItemListener(listener);
//		g2.addItemListener(listener);
//		g3.addItemListener(listener);
//		g4.addItemListener(listener);
		
//		h1.addItemListener(listener);
////		h2.addItemListener(listener);
////		h3.addItemListener(listener);
////		h4.addItemListener(listener);
//		
//		i1.addItemListener(listener);
////		i2.addItemListener(listener);
////		i3.addItemListener(listener);
////		i4.addItemListener(listener);
//		
//		j1.addItemListener(listener);
////		j2.addItemListener(listener);
////		j3.addItemListener(listener);
////		j4.addItemListener(listener);
//		
//		k1.addItemListener(listener);
////		k2.addItemListener(listener);
////		k3.addItemListener(listener);
////		k4.addItemListener(listener);

		submit = new JButton("Submit");
		submit.addActionListener(new ButtonListener());

		add(quiz);

		add(question2);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(question3);
		add(c1);
		add(c2);
		add(c3);
		add(c4);
		add(question4);
		add(d1);
		add(d2);
		add(d3);
		add(d4);
		add(question5);
		add(e1);
		add(e2);
		add(e3);
		add(e4);
		add(question6);
		add(f1);
		add(f2);
		add(f3);
		add(f4);
		add(question7);
		add(g1);
		add(g2);
		add(g3);
		add(g4);
//		add(question8);
//		add(h1);
//		add(h2);
//		add(h3);
//		add(h4);
//		add(question9);
//		add(i1);
//		add(i2);
//		add(i3);
//		add(i4);
//		add(question10);
//		add(j1);
//		add(j2);
//		add(j3);
//		add(j4);
//		add(question11);
//		add(k1);
//		add(k2);
//		add(k3);
//		add(k4);

		// add (Box.createHorizontalStrut(10));
		// add(new JLabel(""));

		add(submit);
		
		

		setPreferredSize(new Dimension(800, 800));
		//setResizeable(false);

	}

	private class StyleListener implements ItemListener {
		public void itemStateChanged(ItemEvent event) {
			scoreCounter();
		}
	}

	@SuppressWarnings("unchecked")
	public int scoreCounter() {
		//boolean n = false;
		// USE FUCKING ARRAY LIST
		// B1------------------------------------------
		
	
		if (b1.isSelected()) {
			score1++;
		}
		// --------------------------------------------

		//----------------------------------------------
		else if (c1.isSelected()){ 
			score1++;
		}

	
		//------------------------------------------------
		
		//------------------------------------------------
		else if (d1.isSelected()) {
			score1++;
	
		} 
		//--------------------------------------------------
	//----------------------------------------------------------------	
		else if (e1.isSelected()) {
			score1++;
			
		} 
		
	//-----------------------------------------------------------------
	
		//-------------------------------------------------
		else if (f1.isSelected()) {
			score1++;
		
		} 
		
		//--------------------------------------------------
		
		//-------------------------------------------------
		else if (g1.isSelected()) {
			score1++;
			
		} 
		
		//------------------------------------------------

		//------------------------------------------------
		else if (h1.isSelected()) {
			score1++;
			
		} 
		
		//------------------------------------------------
		
		//-----------------------------------------------
		else if (i1.isSelected()) {
			score1++;
			
		}
		
		//-------------------------------------------------
		
		//------------------------------------------------
		else if (j1.isSelected()) {
			score1++;
			
		} 
		
		//-------------------------------------------------
		
		//------------------------------------------------
		else if (k1.isSelected()) {
			score1++;
			
		}
		
		// ---------------------------------------------
		System.out.println(score1);
		return score1;
	}
	
	private class ButtonListener implements ActionListener {

		public void actionPerformed(ActionEvent event) {
			JFrame frame = new JFrame("Section 1");
			frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

			QuizScore panel = new QuizScore(score1, c, ic);
			frame.getContentPane().add(panel);

			frame.pack();
			frame.setVisible(true);
		}
	}
}









































////********************************************************************
////StyleOptionsPanel.java       Java Foundations
////
////Demonstrates the use of check boxes.
////********************************************************************
//
//import javax.swing.*;
//import javax.swing.border.TitledBorder;
//
//import java.awt.*;
//import java.awt.event.*;
//import java.text.SimpleDateFormat;
//import java.util.Calendar;
//
//public class StyleOptionsPanel extends JPanel {
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = 1L;
//	private JLabel quiz, question1, question2, question3, question4, question5, question6;
//	private JCheckBox a1, a2, a3, a4, b1, b2, b3, b4;
//	//private JPanel welcomePanel;
//
//
//	// -----------------------------------------------------------------
//	// Sets up a panel with a label and some check boxes that
//	// control the style of the label's font.
//	// -----------------------------------------------------------------
//	public StyleOptionsPanel() {
//		
////		 welcomeTab();
////	     welcomePanel.setBorder(new TitledBorder("adfasdfadsfadfa"));
////	     JOptionPane.showMessageDialog(null, welcomePanel);
//		
//		quiz = new JLabel("Quiz 6.1");
//		quiz.setFont(new Font("Helvetica", Font.PLAIN, 70));
//		
//		question1 = new JLabel("In java there is a lot of stuff that goes to a ____________ sort of thing.");
//		question1.setFont(new Font("Helvetica", Font.PLAIN, 20));
//		a1 = new JCheckBox("Somehting");
//		a2 = new JCheckBox("Something ");
//		a3 = new JCheckBox("Something something something something something something");
//		a4 = new JCheckBox("this is a test question");
//	
//		question2 = new JLabel("Another question that has another question to a question that _____________ .");
//		question2.setFont(new Font("Helvetica", Font.PLAIN, 20));
//		
//		b1 = new JCheckBox("test question test question test question");
//		b2 = new JCheckBox("Test test test test test");
//		b3 = new JCheckBox("test test");
//		b4 = new JCheckBox("test");
//		//italic.setBackground(Color.cyan);
//
//		StyleListener listener = new StyleListener();
//		b1.addItemListener(listener);
//		b2.addItemListener(listener);
//
//		
//		add(quiz);
//
//		add(question1);
//		add (Box.createHorizontalStrut(10));
//		add(a1);
//		add(a2);
//		add(a3);
//		add(a4);
//
//		add(question2);
//		add (Box.createHorizontalStrut(10));
//		add(b1);
//		add(b2);
//		add(b3);
//		add(b4);
//
//		setPreferredSize(new Dimension(300, 400));
//		
//		
//
//	}
//
//	
//	
//	private class StyleListener implements ItemListener {
//		// --------------------------------------------------------------
//		// Updates the style of the label font style.
//		// --------------------------------------------------------------
//		public void itemStateChanged(ItemEvent event) {
//			int style = Font.PLAIN;
//
//			if (b1.isSelected())
//				style = Font.BOLD;
//
//			if (b2.isSelected())
//				style += Font.ITALIC;
//
//			//saying.setFont(new Font("Helvetica", style, 36));
//			quiz.setFont(new Font("Helvetica", style, 50));
//		}
//	}
//}
