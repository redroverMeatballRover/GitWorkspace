package edu.neumont.csc110.authordetective;

/**
 * This class is used to calculate a delta between two profiles.
 * @author rjohnson
 *
 */
public class DeltaCalculator
{
	private double delta;
	private int compCount;

	
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
		// Use the Math.abs() method to calculate the absolute 
		// difference between 'anonyFreq' and 'authorFreq'.
		delta += Math.abs(anonyFreq - authorFreq);
		compCount += 1;
		// Add the absolute difference just calculated to the  
		// class attribute called 'delta' (in addition to what it already contains).
		
		// Increment the class attribute variable called 'compCount'
	}
	
	
	/**
	 * 
	 * @return - Returns the average delta of each comparison
	 */
	public double getAvgDelta()
	{
		double avgDelta = 0;
		
		// Calculate an average delta.
		if(compCount > 0)
		{
			avgDelta = Math.abs(delta/compCount);
		}
		// If the class attribute 'compCount' is greater than zero,
		// divide the class attribute 'delta' by 'compCount' and
		// save this value to 'avgDelta'.
		

		return avgDelta;
	}
	
	
	/**
	 * Resets the delta calculator
	 */
	public void reset()
	{
		delta = 0;
		compCount = 0;
	}
	boolean test()
	{
		boolean test1 = false, test2 = false, test3 = false;
		boolean pass = false;
		
		//needed a compairson to work with and a defult compCount
		addComparison(25,5);
		
	
		if (delta == 20)
		{
			test1 = true; //addcompairison() test
		}
		
	
		
		if (getAvgDelta() == 20)
		{
			test2 = true; //getAvgDelta() test
		}
		
		reset();
		if (delta == 0)
		{
			test3 = true; //reset() test
		}
			
		//if all 3 tests passed then im good
		if (test1 == true && test2 == true && test3 == true)
		{
			pass = true;
		}
		
		return pass;
	}

}
