package pack;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Author: Cody Schaffer
 */

/*---------------------------------------------------------------------------
 * This class manages all the GUI and mouse and keyboard events. 
 --------------------------------------------------------------------------*/
public class StopWatchPanel extends JFrame {

	private static final long serialVersionUID = 1L;

	private final JPanel topPanel = new JPanel();
	private final JPanel centerPanel = new JPanel();
	private final JPanel bottomPanel = new JPanel();

	private final JButton btStart = new JButton("Start");
	private final JButton btReset = new JButton("Reset");

	private final JLabel labelTimer = new JLabel("00:00"); // uses the simpleDateFormat to run the timer. 

	private StopWatchTimer stopWatch = new StopWatchTimer(this);

	private boolean started = false;
	private String startorpause = "start";

	/*---------------------------------------------------------------------------
	 * This method manages the layout of the GUI, including the resizing, 
	 * the title, the size, the panels, the labels, and the buttons. It basically
	 * designs the GUI interface.
	 --------------------------------------------------------------------------*/
	public void stopWatchGUI() {
		setResizable(false);// sets the GUI as resizable. 
		setSize(200, 200);// sets area of GUI
		setTitle("Stopwatch");// makes title for the GUI
		setLayout(new BorderLayout());

		topPanel.setLayout(new GridLayout()); // sets layout
		add(topPanel, BorderLayout.NORTH); // sets layout

		centerPanel.add(labelTimer);
		add(centerPanel, BorderLayout.CENTER);
		
		labelTimer.setForeground(Color.GRAY); // sets color
		labelTimer.setFont(new Font("Courier New", Font.BOLD, 36));
		
		add(bottomPanel, BorderLayout.PAGE_END);
		bottomPanel.setLayout(new GridLayout());
		bottomPanel.add(btStart);
		bottomPanel.add(btReset);

		btStart.addActionListener(new buttonStart());
		btReset.addActionListener(new buttonReset());
	}

	/*--------------------------------------------------------------------------------
	 * Method sets the TimerLabel to its string paramater, which is 00:00. 
	 * StopWatchTimer calls this method in order to set the correct time to the label.
	 ---------------------------------------------------------------------------------*/
	public void setTimerTextLabel(String s) {
		labelTimer.setText(s); 
	}

	/*---------------------------------------------------------------------------
	 * This class impliments actionlistener for the Start buttons. The start button is 
	 * also the pause button. 
	 --------------------------------------------------------------------------*/
	private class buttonStart implements ActionListener {

		public void actionPerformed(ActionEvent arg0) {

			Thread threadStopWatchTimer = new Thread(stopWatch);

			if (startorpause == "start") {
				if (!started) {
					started = true;
					startorpause = "pause";
					btStart.setText("Pause");
					stopWatch.startTime();
					threadStopWatchTimer.start();
				}
			} else if (startorpause == "pause") {
				started = false;
				startorpause = "start";
				btStart.setText("Continue");
				stopWatch.pauseTime();
			}
		}
	}

	/*---------------------------------------------------------------------------
	 * This class impliments actionlistener for the Reset buttons. The start button is 
	 * also the pause button. 
	 --------------------------------------------------------------------------*/
	private class buttonReset implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			stopWatch.reset();
			started = false;
			startorpause = "start";
			btStart.setText("Start");
			labelTimer.setText("00:00");
		}
	}
}