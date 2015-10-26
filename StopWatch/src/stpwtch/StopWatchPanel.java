package stpwtch;



import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
 
/*
 * This class contains all of the code to generate the GUI and handle mouse and keyboard events.
 * The StopWatchGUI class extends JFrame. 
 * Every button has its own local inner class. Which implements ActionListener.
 */
public class StopWatchPanel extends JFrame {
 
	private static final long serialVersionUID = -5697534085966933863L;
	private final Toolkit t = getToolkit();
	private final Dimension s = t.getScreenSize();
 
	private final JPanel toppanel = new JPanel();
	private final JPanel centerpanel = new JPanel();
	private final JPanel bottompanel = new JPanel();
 
	private final JButton btstart = new JButton("Start");
	private final JButton btreset = new JButton("Reset");
	private final JButton btlap = new JButton("Lap");
 
	private final JLabel labeltimer = new JLabel("00:00.000");
	private final JTextArea textarea = new JTextArea(9, 20);
 
	private StopWatchTimer sw = new StopWatchTimer(this);
 
	private boolean started = false;
	private String startorpause = "start";
 
	private int roundNumber = 0;
 
	/*
	 * This method creates the GUI and set up all of the variables. The GUI will
	 * appear in the center of the screen.
	 */
	public void createGui() {
		setResizable(false);
		setSize(500, 300);
		setTitle("TechAndCrack StopWatch");
		setLocation(s.width / 2 - getWidth() / 2, s.height / 2 - getHeight()
				/ 2);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
 
		textarea.setEditable(false);
		textarea.setLineWrap(true);
		JScrollPane scrollpane = new JScrollPane(textarea);
 
		toppanel.add(scrollpane);
		toppanel.setLayout(new GridLayout());
		add(toppanel, BorderLayout.NORTH);
 
		labeltimer.setForeground(Color.GRAY);
		labeltimer.setFont(new Font("Courier New", Font.BOLD, 36));
		centerpanel.add(labeltimer);
		add(centerpanel, BorderLayout.CENTER);
 
		add(bottompanel, BorderLayout.PAGE_END);
		bottompanel.setLayout(new GridLayout());
		bottompanel.add(btstart);
		bottompanel.add(btreset);
		bottompanel.add(btlap);
 
		btstart.addActionListener(new buttonstart());
		btreset.addActionListener(new buttonreset());
		btlap.addActionListener(new buttonlap());
 
		setVisible(true);
	}
 
	/*
	 * This method sets the TimerLabel to the String parameter. The class
	 * StopWatchTimer calls this method while running and by doing so set the
	 * correct time to the label.
	 */
	public void setTimerTextLabel(String s) {
		labeltimer.setText(s);
	}
 
	/*
	 * This local inner class implements ActionListener. Whenever the button
	 * Start is clicked this class handles that event. It uses threads to
	 * calculate the time. The button Start handles both the Start, pause and
	 * continue events.
	 */
	private class buttonstart implements ActionListener {
 
		@Override
		public void actionPerformed(ActionEvent arg0) {
 
			Thread threadStopWatchTimer = new Thread(sw);
 
			if (startorpause == "start") {
				if (!started) {
					started = true;
					startorpause = "pause";
					btstart.setText("Pause");
					sw.start();
					threadStopWatchTimer.start();
				}
			} else if (startorpause == "pause") {
				started = false;
				startorpause = "start";
				btstart.setText("Continue");
				sw.pause();
			}
		}
	}
 
	/*
	 * This local inner class implements ActionListener. Whenever the button
	 * Reset is clicked this class handles that event. It resets everything to
	 * the default value and clears the JTextArea of text.
	 */
	private class buttonreset implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
 
			sw.reset();
			started = false;
			startorpause = "start";
			btstart.setText("Start");
			labeltimer.setText("00:00.000");
			textarea.setText("");
			roundNumber = 0;
		}
	}
 
	/*
	 * This local inner class implements ActionListener. Whenever the button Lap
	 * is clicked this class handles that event. When clicked this class appends
	 * a text line to the JTextArea with the current round number and time.
	 */
	private class buttonlap implements ActionListener {
 
		@Override
		public void actionPerformed(ActionEvent e) {
 
			if (sw.getTimeResult() != null) {
				if (started) {
					roundNumber++;
					textarea.append("Lap: " + roundNumber + " Time: "
							+ sw.getTimeResult() + "\n");
				}
			}
		}
	}
}




//import java.awt.*;
//import java.awt.event.*;
//import javax.swing.*;
//
//import java.awt.color.*;
//import java.awt.BorderLayout;
//import java.awt.Button;
//import java.awt.Color;
//import java.awt.Dimension;
//import java.awt.Font;
//import java.awt.GridLayout;
//import java.awt.Toolkit;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class StopWatchPanel extends JFrame // JFrame instead?
//{
//
//	public static final long serialVersionUID = 1L;
//	private final Toolkit t = getToolkit();
//	private final Dimension s = t.getScreenSize();
//
//	private final JPanel topPanel = new JPanel();
//	private final JPanel centerPanel = new JPanel();
//	private final JPanel bottomPanel = new JPanel();
//
//	private final JButton btStart = new JButton("Start");
//	private final JButton btReset = new JButton("Reset");
//	private final JButton btLap = new JButton("Lap");
//
//	private final JLabel labelTimer = new JLabel("00.00.000");
//	private final JTextArea textArea = new JTextArea(9, 20);
//
//	private StopWatchTimer sw = new StopWatchTimer(this);
//
//	private boolean started = false;
//	private String startOrPause = "Start";
//	private int roundNumber = 0;
//
//	public void createGUI() {
//		setResizable(false);
//		setSize(50, 300);
//		setTitle("TechAndCrack StopWatch");
//		setLocation(s.width / 2 - getWidth() / 2, s.height / 2 - getHeight());
//
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setLayout(new BorderLayout());
//		textArea.setEditable(false);
//		textArea.setEditable(true);
//		JScrollPane scrollpane = new JScrollPane(textArea);
//
//		topPanel.add(scrollpane);
//		topPanel.setLayout(new GridLayout());
//		add(topPanel, BorderLayout.NORTH);
//
//		labelTimer.setForeground(Color.GRAY);
//		labelTimer.setFont(new Font("Courier New", Font.BOLD, 36));
//		centerPanel.add(labelTimer);
//		add(centerPanel, BorderLayout.CENTER);
//
//		add(bottomPanel, BorderLayout.PAGE_END);
//		bottomPanel.setLayout(new GridLayout());
//		bottomPanel.add(btStart);
//		bottomPanel.add(btLap);
//		bottomPanel.add(btReset);
//
//		btStart.addActionListener(new buttonStart());
//		btReset.addActionListener (new buttonReset());
//		btLap.addActionListener (new buttonLap());
//		// swReset.addActionListener(new buttonReset());
//		// swLap.addActionListener(new buttonLap());
//
//		setVisible(true);
//
//	}
//
//	public void setTimerTextLabel(String s) {
//		labelTimer.setText(s);
//	}
//
//	private class buttonStart implements ActionListener {
//		public void actionPerformed(ActionEvent arg0)
//
//		{
//			Thread threadStopWatchTimer = new Thread(sw);
//
//			if (startOrPause == "start") {
//				if (!started) {
//					started = true;
//					startOrPause = "pause";
//					btStart.setText("Continue");
//					sw.start();
//					threadStopWatchTimer.start();
//				}
//			} else if (startOrPause == "pause") {
//				started = false;
//				startOrPause = "Start";
//				btStart.setText("Continue");
//				sw.pause();
//			}
//		}
//
//		private class buttonReset implements ActionListener {
//			public void actionPerformed(ActionEvent e) {
//				sw.reset();
//				started = false;
//				startOrPause = "Start";
//				btStart.setText("Start");
//				labelTimer.setText("00.00.000");
//				textArea.setText("");
//				roundNumber = 0;
//			}
//
//			private class buttonLap implements ActionListener {
//
//				@Override
//				public void actionPerformed(ActionEvent arg0) {
//					// TODO Auto-generated method stub
//
//					if (sw.getTimeResult() != null) {
//						if (started) {
//							roundNumber++;
//							textArea.append("Lap: " + roundNumber + " Time: "
//									+ sw.getTimeResult() + "\n");
//						}
//					}
//				}
//			}
//
//		}
//
//	}
//}
//	
//	//http://techandcrack.com/code-snippets/java/java-stopwatch-gui/
//	
//	
//	
//	
//	
////	////////////////////////////////////////////////
////	public JButton start, stop, reset;
////	public JLabel label;
////	public JPanel buttonPanel;
////	private StopWatchTimer sw = new StopWatchTimer();
////	private boolean started = false;
////	private String startOrPause = "Start";
////	private int roundNumber = 0;
////	////////////////////////////////////////////////
////	private static Toolkit t = getToolkit();
////	
////	public StopWatchPanel() {
////		
////		setResizable(false);
////		setSize(500,300);
////		
////		
////		
////		start = new JButton("Start");
////		stop = new JButton("Stop");
////		reset = new JButton("Reset Clock");
////		
////		setPreferredSize(new Dimension(300, 75));
////		setBackground(Color.yellow);
////		
//		
//		
//		
////	TIMER EXAMPLE	
////		timer = new Timer(int DELAY, ActionListener listener);
////		boolean isRunning = true;
////		
////		public void start()
////		{
////			
////		}
////		public void stop()
////		{
////			
////		}
//		
//		
//		
////		ButtonListener listener = new ButtonListener();
////		start.addActionListener(listener);
////		stop.addActionListener(listener);
////		reset.addActionListener(listener);
////
////		label = new JLabel("Java StopWatch");
////		
////		buttonPanel = new JPanel(); // ALWAYS ADD THIS FUCKER
////		add(buttonPanel); // ALWAYS ADD THIS FUCKER 
////		
////
////		buttonPanel.setPreferredSize (new Dimension(200, 700));
////		buttonPanel.setBackground(Color.gray);
////		buttonPanel.add(stop);
////		buttonPanel.add(start);
////		buttonPanel.add(reset);
////	}
//	
////	public void Clock()
////	{
////		
////	}
//
////	private class ButtonListener implements ActionListener {
////		public void actionPerformed(ActionEvent event) {
////			if (event.getSource() == start)
////				label.setText("left");
////			else {
////				label.setText("Right");
////			}
////		}
////	}
//
