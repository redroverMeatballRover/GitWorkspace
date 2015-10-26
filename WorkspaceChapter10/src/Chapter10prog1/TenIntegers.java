package Chapter10prog1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Cody Schaffer
 * 
 * This class creates the numbers and makes several methods to hold each of the ten numbers the user creates. 
 * It then uses an add method to compute the sum of the legal usernumbers and then returns an average. 
 */

public class TenIntegers implements IntInterface

{

	final double MIN = 1, MAX = 10;
	private double num1;
	private double num2;
	private double num3;
	private double num4;
	private double num5;
	private double num6;
	private double num7;
	private double num8;
	private double num9;
	private double num10;

	List numList = new ArrayList(9);
	Scanner scan = new Scanner(System.in);

	private String userNum;

	public TenIntegers(double one, double two, double three, double four,
			double five, double six, double seven, double eight, double nine, double ten) {
		
		num1 = one;
		num2 = two;
		num3 = three;
		num4 = four;
		num5 = five;
		num6 = six;
		num7 = seven;
		num8 = eight;
		num9 = nine;
		num10 = ten;

	}

	
	//CREATE A FOR LOOP FOR THIS???
//	public void num()
//	{
//	
//		for (int i = 0; i < 4; i++)
//		{
//			 numList[i] = Double.parseDouble(userNum); 
//		}
//	}
	
	//creates the usernumber 1. 
	@Override
	public void num1() {

		System.out.println("Please enter a number between one and ten: ");
		userNum = scan.next();
		num1 = Double.parseDouble(userNum);
		numList.add(num1);

		if (num1 < MIN || num1 > MAX) {
			// throw problem;
			System.out
					.println("ERROR: your entry was not a number within the bounds of 1 through 10. Please Enter again. ");

			System.out.println("\nRETRY:");
			num1();
		}
	}
	//creates the usernumber 2. 
	@Override
	public void num2() {

		System.out.println("Please enter a number between one and ten: ");
		userNum = scan.next();
		num2 = Double.parseDouble(userNum);
		numList.add(num2);

		if (num2 < MIN || num2 > MAX) {
			// throw problem;
			System.out
					.println("ERROR: your entry was not a number within the bounds of 1 through 10. Please Enter again. ");

			System.out.println("\nRETRY:");
			num2();
		}
	}
	//creates the usernumber 3. 
	@Override
	public void num3() {

		System.out.println("Please enter a number between one and ten: ");
		userNum = scan.next();
		num3 = Double.parseDouble(userNum);
		numList.add(num3);

		if (num3 < MIN || num3 > MAX) {
			// throw problem;
			System.out
					.println("ERROR: your entry was not a number within the bounds of 1 through 10. Please Enter again. ");

			System.out.println("\nRETRY:");
			num3();
		}
	}
	//creates the usernumber 4. 
	@Override
	public void num4() {

		System.out.println("Please enter a number between one and ten: ");
		userNum = scan.next();
		num4 = Double.parseDouble(userNum);
		numList.add(num4);

		if (num4 < MIN || num4 > MAX) {
			// throw problem;
			System.out
					.println("ERROR: your entry was not a number within the bounds of 1 through 10. Please Enter again. ");

			System.out.println("\nRETRY:");
			num4();
		}

	}
	//creates the usernumber 5. 
	@Override
	public void num5() {

		System.out.println("Please enter a number between one and ten: ");
		userNum = scan.next();
		num5 = Double.parseDouble(userNum);
		numList.add(num5);

		if (num5 < MIN || num5 > MAX) {
			// throw problem;
			System.out
					.println("ERROR: your entry was not a number within the bounds of 1 through 10. Please Enter again. ");

			System.out.println("\nRETRY:");
			num5();
		}
		
	}
	//creates the usernumber 6. 
		@Override
		public void num6() {
			System.out.println("Please enter a number between one and ten: ");
			userNum = scan.next();
			num6 = Double.parseDouble(userNum);
			numList.add(num6);

			if (num6 < MIN || num6 > MAX) {
				// throw problem;
				System.out
						.println("ERROR: your entry was not a number within the bounds of 1 through 10. Please Enter again. ");

				System.out.println("\nRETRY:");
				num6();
			}
		}

		//creates the usernumber 7. 
		@Override
		public void num7() {
			System.out.println("Please enter a number between one and ten: ");
			userNum = scan.next();
			num7 = Double.parseDouble(userNum);
			numList.add(num7);

			if (num7 < MIN || num7 > MAX) {
				// throw problem;
				System.out
						.println("ERROR: your entry was not a number within the bounds of 1 through 10. Please Enter again. ");

				System.out.println("\nRETRY:");
				num7();
			}
			
		}

		//creates the usernumber 8. 
		@Override
		public void num8() {
			System.out.println("Please enter a number between one and ten: ");
			userNum = scan.next();
			num8 = Double.parseDouble(userNum);
			numList.add(num8);

			if (num8 < MIN || num8 > MAX) {
				// throw problem;
				System.out
						.println("ERROR: your entry was not a number within the bounds of 1 through 10. Please Enter again. ");

				System.out.println("\nRETRY:");
				num8();
			}
		}

		//creates the usernumber 9. 
		@Override
		public void num9() {
			// TODO Auto-generated method stub
			System.out.println("Please enter a number between one and ten: ");
			userNum = scan.next();
			num9 = Double.parseDouble(userNum);
			numList.add(num9);

			if (num9 < MIN || num9 > MAX) {
				// throw problem;
				System.out
						.println("ERROR: your entry was not a number within the bounds of 1 through 10. Please Enter again. ");

				System.out.println("\nRETRY:");
				num9();
			}
		}

		//creates the usernumber 10. 
		@Override
		public void num10() {
			// TODO Auto-generated method stub
			System.out.println("Please enter a number between one and ten: ");
			userNum = scan.next();
			num10 = Double.parseDouble(userNum);
			numList.add(num10);

			if (num10 < MIN || num10 > MAX) {
				// throw problem;
				System.out
						.println("ERROR: your entry was not a number within the bounds of 1 through 10. Please Enter again. ");

				System.out.println("\nRETRY:");
				num10();
			}
		}
		
		
		// adds the legal numbers and finds the average
	public void addNum() {
		System.out.println("You entered the numbers: ");//lists all numbers, legal and illegal, that you entered. 
		System.out.println(numList);
		System.out.println("The average of all the LEGAL numbers between 1 and 10: "
				+ ((num1 + num2 + num3 + num4 + num5+num6+num7+num8+num9+num10) / MAX));//computes only the legal number. 
	}

}
