package Z;

public class Stats {

	public static double mean(double...array)
	{
		double total = 0;
		for (int i = 0; i< array.length; i++)
		{
			total += array[i];
			
		}
		double mean = total / array.length;
		System.out.println("Mean" + mean);
		return total / array.length;
	}

	public static double standardDeviation(double mean, double []array)
	{
		double total = 0;
		for(int i = 0; i<array.length; i++)
		{
			total += (array[i] - mean) * (array[i] - mean);
		}
		
		return Math.sqrt(total / (array.length - 1));
	
	}
	
}
