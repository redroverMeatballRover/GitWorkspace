package edu.neumont.csc110.authordetective;

import java.io.IOException;

/**
 * This class is used to calculate a delta between two profiles.
 * @author rjohnson
 */
public class DeltaCalculator
{
	private double delta;
	private double compCount;
	
	public DeltaCalculator()
	{
		reset();
	}
	/**
	 * This method adds a comparison based on the frequency of the word
	 * being compared.
	 * @param anonyFreq - Word frequency in the anonymous profile.
	 * @param authorFreq - Word frequency in the author profile
	 */
	public void addComparison(double anonyFreq, double authorFreq)
	{
		/* We use the absolute math method (Math.abs) to calculate absolute difference
		 * between anonyfreq and authorfreq. add the absolute difference to class
		 * attribute called "delta". Incriment compcount. 
		 */	
		delta = delta + Math.abs(anonyFreq - authorFreq); 
		compCount++;
	}
	
	/* this calculates the average delta. if the class attribute COMPCOUNT is greater than zero, 
	 * divide the class attribute DELTA by COMPCOUNT and we save the value to AVGDELTA. 
	 *  
	 */	
	public double getAvgDelta()
	{
		double avgDelta = 0;
		//double avgDelta = (delta/2);
		if (compCount > 0)
		{
			avgDelta = (delta / compCount);
			
		}
		else 
		{
			//System.out.println ("everything is broken.");
		}
		
		return avgDelta;
	}
	
	//this resets the delta calculator. 
	public void reset()
	{
		delta = 0;
		compCount = 0;
	}
	
	/*---------------------------------------------------------------------------------------------------------------
	 * TESTING SECTION
	 * This tests the deltaCalculator. The first test is for the addComparison Method. the first check is to make sure 
	 * that DELTA = annoyFreq - AuthorFreq. we set addComparison to 5 and 29. 5 - 29 = 24 (absolute value). DELTA now = 24. 
	 * In the next test, which is getAvgDelta, we check to make sure that avgDelta is returning the correct number. Since
	 * in our last test we made DELTA = 24, in the test we set COMPCOUNT to 1. 
	 * 
	 * in the getAvgDelta method, avgDelta = delta / compcount. 
	 * so, if DELTA = 24, and COMPCOUNT = 1, it = 24/1 which = 24. 
	 * It checks to see that it is 24. 
	 ----------------------------------------------------------------------------------------------------------------*/
	public boolean test12() throws IOException
	{	
		boolean test = false;
		boolean test2 = false;
		boolean test3 = false;
		reset();
		addComparison(5,29); 
		
		if (getAvgDelta() == 24.0) 
		{
			test = true;
		}
		
		if ((int) delta == 24 && (int)compCount == 1)
		{
			test2 = true;
		}
		
		if ((int)delta == 24)
		{
			test3 = true;
		}
		return test && test2 && test3 ? true : false;
	}
	
	
	
	
	
	
	
	
	
	
	
}