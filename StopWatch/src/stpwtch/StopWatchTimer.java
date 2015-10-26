package stpwtch;

import java.text.SimpleDateFormat;

public class StopWatchTimer implements Runnable {

	private StopWatchPanel swGui;
	private long startTime =0;
	private long endTime = 0;
	private boolean isRunning = false;
	private long timePause = 0;
	private String timeResult;
	
	public StopWatchTimer(StopWatchPanel sw)
	{
		this.swGui = sw;
	}
	
	public void run()
	{
		try {
		while (isRunning == false)
		{
		timeResult = (formatTime(startCounting()));
		swGui.setTimerTextLabel(timeResult);
		}
		
		} catch (Exception e){e.printStackTrace();
		}
	}
	
	public String getTimeResult()
	{
		return timeResult;
	}
	
	public void start()
	{
		if (isRunning == false)
		{
			startTime = System.nanoTime() - (timePause - startTime);
		}
			else
			{
				startTime = System.nanoTime();
			}
			isRunning = true;
	}
	
	public void pause()
	{
		isRunning = false;
		endTime = System.nanoTime();
		timePause = System.nanoTime();
	}
	
	public void reset()
	{
		startTime = 0;
		endTime = 0;
		timePause = 0;
		isRunning = false;
	}
	public long startCounting()
	{
		long elapsed;
		if (isRunning) 
		{
			elapsed = System.nanoTime() - startTime;
		}
		else 
		{
			elapsed = endTime - startTime;
		}
		
		return elapsed / 1000000;
	}
	
	public String formatTime (long elapsedTicks)
	{
		SimpleDateFormat formatter = new SimpleDateFormat ("mm:ss.SSS");
		String time = formatter.format(elapsedTicks);
		return time;
	}
	
}
