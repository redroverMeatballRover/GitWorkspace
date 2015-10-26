package Z;

import java.util.Random;

public class MathStuff {

	/*
	 * design and impliment and app that computes and prints the mean and standard deviation of a list 
	 * of integers x1 through xN. Assume that there will be no more than 50 input values. comute both 
	 * the mean and the standard deviation as float point values using the follwing formumulas 
	 * 
	 * chapter 7.5
	 */
	
	/*
	 * mean
	 * standard deviation
	 *
	 */
	public static void main(String[] args) {
		
		final int SAMPLE_SIZE = 50;
		double idealMean = 75;
		double idealstdDev = 300;
		Random gen = new Random();
		double randomDouble =  (100 * gen.nextDouble());
		
		double [] sampleArray = new double[SAMPLE_SIZE];
		
		for (int i = 0; i < sampleArray.length; i++ )
		{
			//sampleArray[i] = 100*gen.nextDouble();
			sampleArray[i] = idealMean + idealstdDev*gen.nextGaussian();
			//System.out.println(sampleArray[i]);
		}
		
		
		double mean = Stats.mean(sampleArray);
		
		double stDev = Stats.standardDeviation(mean, sampleArray);
		System.out.println("ideal mean: " + idealMean + " Ideal stand dev: " + idealstdDev);
	
		System.out.println("mean: " + mean + " standard Dev: " + stDev);
	}
	//mean = Stats.mean (3,4,5,6);
}	


	

