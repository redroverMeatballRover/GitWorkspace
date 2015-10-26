package FinalPack;


import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;              
import java.awt.event.*;        
import java.io.IOException;

public class TabbedPane extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel topPanel;

	public TabbedPane() {

		setTitle("Chapter 6");
		setSize(500, 500);
		JTabbedPane jtp = new JTabbedPane();

		// This creates the template on the windowed application that we will be
		// using
		getContentPane().add(jtp);
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();

		introduction();
		// CONTENT
		// AREA---------------------------------------------------------------------------//
		JTextArea textArea = new JTextArea(
				"Welcome to Chapter 6. "
						+ "\n\n"
						+ "In this chapter, we study GUI's. "
						+ "which means that although it can display"
						+ "\n"
						+ " stuff, something something something something something."
						+ "\n\n"
						+ " something something something something something something"
						+ "\n"
						+ "something something something something something something"
						+ "\n"
						+ " something something something something something something");
		textArea.setEditable(false);
		setResizable(false);

		JScrollPane areaScrollPane = new JScrollPane(textArea);
		areaScrollPane.setPreferredSize(new Dimension(400, 400));

		JLabel label1 = new JLabel();
		label1.setText("Introduction to Chapter 6");

		jp1.add(label1);
		jp1.add(areaScrollPane);

		// This adds the first and second tab to our tabbed pane object and
		// names it
		jtp.addTab("Introduction", jp1);
		jtp.addTab("Section 6.1", jp2);

		// This creates a new button called "Press" and adds it to the second
		// tab

		JButton test = new JButton("Press");
		jp2.add(test);

		// This is an Action Listener which reacts to clicking on
		// the test button called "Press"
		ButtonHandler phandler = new ButtonHandler();
		test.addActionListener(phandler);
		setVisible(true); // otherwise you won't "see" it
	}

	protected void introduction() {

	}

	// This is the internal class that defines what the above Action Listener
	// will do when the test button is pressed.

	class ButtonHandler implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			JOptionPane.showMessageDialog(null, "I've been pressed",
					"What happened?", JOptionPane.INFORMATION_MESSAGE);

		}
	}

	// example usage

	public static void main(String[] args) {

		TabbedPane tab = new TabbedPane();
	}

}
	
	
	
//	public class TabbedPane extends JFrame {
//		
//		public TabbedPane() {
//
//			setTitle("Chapter 6");
//			setSize(500, 500); 
//
//			
//			JTabbedPane jtp = new JTabbedPane();
//
//			// This creates the template on the windowed application that we will be
//			// using
//			getContentPane().add(jtp);
//			
//			JPanel jp1 = new JPanel();// This will create the first tab
//			JPanel jp2 = new JPanel();// This will create the second tab
//			JPanel jp3 = new JPanel();
//			JPanel jp4 = new JPanel();
//			JPanel jp5 = new JPanel();
//			// This creates a non-editable label, sets what the label will read
//			// and adds the label to the first tab
//
//			JLabel label1 = new JLabel();
//			label1.setText("This is Tab 1, Welcome to this tab!");
//			//ImageIcon image = new ImageIcon("miniBat.jpg");
//			
//
//			jp1.add(label1);
//			//jp1.add(image);
//
//			// This adds the first and second tab to our tabbed pane object and
//			// names it
//			jtp.addTab("Introduction", jp1);
//			jtp.addTab("Section 6.1", jp2);
//			jtp.addTab("Section 6.2", jp3);
//			jtp.addTab("Section 6.3", jp4);
//			jtp.addTab("Section 6.4", jp5);
//			
//			
//
//			// This creates a new button called "Press" and adds it to the second
//			// tab
//
//			JButton test = new JButton("Press");
//			jp2.add(test);
//
//			// This is an Action Listener which reacts to clicking on
//
//			// the test button called "Press"
//
//			ButtonHandler phandler = new ButtonHandler();
//			test.addActionListener(phandler);
//			setVisible(true); // otherwise you won't "see" it
//
//		}
//		
//		// This is the internal class that defines what the above Action Listener
//
//		// will do when the test button is pressed.
//
//		class ButtonHandler implements ActionListener {
//
//			public void actionPerformed(ActionEvent e) {
//
//				JOptionPane.showMessageDialog(null, "I've been pressed",
//						"What happened?", JOptionPane.INFORMATION_MESSAGE);
//
//			}
//		}
//
//		// example usage
//
//		public static void main(String[] args) {
//
//			TabbedPane tab = new TabbedPane();
//			
//
//		}
//
//	}
