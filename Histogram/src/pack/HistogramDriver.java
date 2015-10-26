package pack;

public class HistogramDriver {

	/**
	 * Author: Cody Schaffer
	 * 
	 * The purpose of this program is to inspect the frequency distribution of a set of values. 
	 * We check for values between 1 and 100, and then in sub catagories, check how many times 
	 * a set of numbers between 1 - 10 or 11 - 20 have occured. Everytime a number occurs inside 
	 * those constraints, a * appears.
	 */
	public static void main(String[] args) {
		
		Histogram histogram = new Histogram();
		histogram.listMaker();

	}

}
