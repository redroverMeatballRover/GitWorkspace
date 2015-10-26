package pack;

import java.util.Scanner;

public class Startup {

	protected void powersAndNumbers() {

		ExceptionHandling problem = new ExceptionHandling(
				"Not a valid entry. Please enter a positive integer between 1 and N. The number cannot be a letter or a negative number, otherwise, the program restarts.");

		System.out
				.println("Please Enter a positive integer. Enter Satan's number if you want to quit.");

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		if (num == 666) {
			System.out.println("Program aborted.");
		}

		while (num != 666) {
			System.out.println("Please Enter another positive integer.");

			@SuppressWarnings("resource")
			Scanner scan2 = new Scanner(System.in);
			int power = scan2.nextInt();

			if (num > 0 && power > 0) {

				Math.pow(num, power);
				System.out.println("The first number to the power of the second number is: "
								+ Math.pow(num, power));
				System.out.println("Problem completed.");
				System.out.println("\n------------------------------------------------------------------");

				powersAndNumbers();
			} else {
				System.out.println(problem);
				System.out.println("RESTARTING");
				System.out.println("\n------------------------------------------------------------------");
				powersAndNumbers();
			}
		}
	}
}
