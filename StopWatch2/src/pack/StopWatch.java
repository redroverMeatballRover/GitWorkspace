package pack;

import javax.swing.JFrame;

public class StopWatch {
	/**
	 * Author: Cody Schaffer
	 */
	/*---------------------------------------------------------------------------
	 * This is the driver for the StopWatch program. The purpose of this program is 
	 * to be able to start the stopwatch, pause it, and reset it. The watch runs in 
	 * seconds.
	 --------------------------------------------------------------------------*/
	
	public static void main(String[] args) {
 
		StopWatchPanel stopWatch = new StopWatchPanel();
		stopWatch.stopWatchGUI();
		
		stopWatch.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		stopWatch.setVisible(true);
	}
}