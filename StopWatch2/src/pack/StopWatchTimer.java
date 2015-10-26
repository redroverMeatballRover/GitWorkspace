package pack;

import java.text.SimpleDateFormat;

/**
 * Author: Cody Schaffer
 */
/*---------------------------------------------------------------------------
 * This is the Timer for the StopWatch program. It uses the SimpleDateFormat
 * import to run the timer. 
 --------------------------------------------------------------------------*/
public class StopWatchTimer implements Runnable {
 
	private StopWatchPanel stopWatchGUI;
	private boolean timeRunning = false;
	private long timePause = 0;
	private long startingTime = 0;
	private long endTime = 0;
	private String resultTime;

	/*------------------------------------------------------------------------
	 * The object is used to access the StopWatchPanel class 
	 * in order to set the text of a label to the
	 * correct time.
	 ------------------------------------------------------------------------*/
	public StopWatchTimer(StopWatchPanel stopWatch) {
		this.stopWatchGUI = stopWatch;
	}
	/*---------------------------------------------------------------------------
	 * This method is called inside the run method. It has a parameter that
	 * represents the time and reformats that time. It then returns the
	 * reformatted time. 
	 --------------------------------------------------------------------------*/
	public String formatTime(long ticksElapsed) {
		 
		SimpleDateFormat formatter = new SimpleDateFormat("mm:ss");
		String time = formatter.format(ticksElapsed);
		return time;
	}

	/*---------------------------------------------------------------------------
	 * This method executes when the thread is started from the
	 * StopWatchPanel. It calculates the time and them formats it, where it then
	 * assigns the time to the label 
	 --------------------------------------------------------------------------*/
	public void run() 
	{	
			while (timeRunning) {
				resultTime = (formatTime(startCounting()));
				stopWatchGUI.setTimerTextLabel(resultTime);
			}
	}
	
	/*---------------------------------------------------------------------------
	 * Returns resultTime
	 --------------------------------------------------------------------------*/
	public String getResultTime() {
		return resultTime;
	}
 
	/*---------------------------------------------------------------------------
	 * Starts the timer. 
	 --------------------------------------------------------------------------*/
	public void startTime() {
		if (timeRunning == false) {
			startingTime = System.nanoTime() - (timePause - startingTime);
		} else {
			startingTime = System.nanoTime();
		}
		timeRunning = true;
	}
	/*---------------------------------------------------------------------------
	 * pauses the timer
	 --------------------------------------------------------------------------*/
	public void pauseTime() {
		timeRunning = false;
		endTime = System.nanoTime();
		timePause = System.nanoTime();
	}
 
	/*---------------------------------------------------------------------------
	 * resets the timer
	 --------------------------------------------------------------------------*/
	public void reset() {
		startingTime = 0;
		endTime = 0;
		timePause = 0;
		timeRunning = false;
	}
	
	/*---------------------------------------------------------------------------
	 * Starts counting
	 --------------------------------------------------------------------------*/
	public long startCounting() {
		long elapsed;
		if (timeRunning) {
			elapsed = System.nanoTime() - startingTime;
		} else {
			elapsed = endTime - startingTime;
 
		}
		return elapsed / 1000000;
	}	
}
