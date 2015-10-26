package pack;
import java.util.Scanner;

/**
 * @author cschaffer
 *
 *This program finds the Nth line of the pascale triangle. The program asks the user for the number
 *of desired  lines written out. When the user inputs a number, that is the number of rows in the triangle. 
 */

public class Pascale {

	//DRIVER
	/*
	 * Builds a triangle that is composed of numbers. the numbers diagnal of each other add up to the next number in the triangle.
	 */
	public static void main(String[] args) {

		//scans for user answer
		System.out.println("Welcome to the Pascal triangle maker. Please enter the number of layers in the pascale triangle.");
		Scanner scan = new Scanner(System.in); 
		int n = scan.nextInt();
		
		int[] row = new int[0];
		for (int i = 0; i< n; i++)
		{
		row = pasRow(row);
		 for (int j=0; j< n - i; j++) 
		 {
	            System.out.print("  ");
	      }
		  for (int j=0; j< row.length; j++) {
	            System.out.print(row[j]+"   ");
	         }
	         System.out.println();
		}

	}

	/*
	 * sets up the array
	 */
	protected static int[] pasRow(int[] upperRow)
	{
		int[] row = new int [upperRow.length + 1];
		row[0] = 1;// 1st line
		row[row.length - 1] = 1;
		
		for (int i = 1; i < row.length - 1; i++)
		{
			row[i] = upperRow[i-1] + upperRow[i];
		}
		return row;
	}
}
