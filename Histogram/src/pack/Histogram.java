package pack;

import java.util.Random;

/**
 * Author: Cody Schaffer
 * 
 * The purpose of this program is to inspect the frequency distribution of a set of values. 
 * We check for values between 1 and 100, and then in sub catagories, check how many times 
 * a set of numbers between 1 - 10 or 11 - 20 have occured. Everytime a number occurs inside 
 * those constraints, a * appears.
 */
public class Histogram {

	private static int[] numberList;
	Random rgen1 = new Random();
	private String dot1 = "", dot2 = "", dot3 = "", dot4 = "", dot5 = "",
			dot6 = "", dot7 = "", dot8 = "", dot9 = "", dot10 = "";
/*------------------------------------------------------------------------------------
 * the listMaker method creates a array of numbers from 0 to 100. We put the array 
 * in a for loop that increments through a set of random numbers for each if statement. 
 * in each if statement, we put the random numbers through a specific number range, such
 * as 1 - 10. we then save that randomly generated number set in an array object. 
 * we then print out the results. 
 -----------------------------------------------------------------------------------*/
	public void listMaker()

	{

		numberList = new int[100];
		

		for (int s = 0; s <= numberList.length - 1; s++) {
			int x = rgen1.nextInt(numberList.length - 1);
			numberList[s] = x;

			if (numberList[s] >= 1 && numberList[s] <= 10) {
				dot1 = dot1 + "*";
			}

			else if (numberList[s] >= 11 && numberList[s] <= 20) {
				dot2 = dot2 + "*";
			}

			else if (numberList[s] >= 21 && numberList[s] <= 30) {
				dot3 = dot3 + "*";
			}

			else if (numberList[s] >= 31 && numberList[s] <= 40) {
				dot4 = dot4 + "*";
			}

			else if (numberList[s] >= 41 && numberList[s] <= 50) {
				dot5 = dot5 + "*";
			}

			else if (numberList[s] >= 51 && numberList[s] <= 60) {
				dot6 = dot6 + "*";
			}

			else if (numberList[s] >= 61 && numberList[s] <= 70) {
				dot7 = dot7 + "*";
			}

			else if (numberList[s] >= 71 && numberList[s] <= 80) {
				dot8 = dot8 + "*";
			}

			else if (numberList[s] >= 81 && numberList[s] <= 90) {
				dot9 = dot9 + "*";
			}

			else if (numberList[s] >= 91 && numberList[s] <= 100) {
				dot10 = dot10 + "*";
			}

		}

		System.out.println("Number of integers between 1 - 10 | " + dot1);
		System.out.println("Number of integers between 11 - 20 | " + dot2);
		System.out.println("Number of integers between 21 - 30 | " + dot3);
		System.out.println("Number of integers between 31 - 40 | " + dot4);
		System.out.println("Number of integers between 41 - 50 | " + dot5);
		System.out.println("Number of integers between 51 - 60 | " + dot6);
		System.out.println("Number of integers between 61 - 70 | " + dot7);
		System.out.println("Number of integers between 71 - 80 | " + dot8);
		System.out.println("Number of integers between 81 - 90 | " + dot9);
		System.out.println("Number of integers between 91 - 100 | " + dot10);

	}

}
