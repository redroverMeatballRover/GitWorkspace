package pack;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsRevisit {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Type a number: ");
		boolean success = false;

		while (success == false) {
			try {

				scan.nextInt();
			}
			// catch (InputMismatchException | Exception e) // with the "or"
			// opperator, you can throw multiple
			// {
			// System.out.println("You are a dumb");
			// }

			catch (InputMismatchException e) // with the "or" opperator, you can
												// throw multiple
			{
				System.out.println("You are a dumb");
				scan.reset(); // or make a new scanner
				
			}
			// catch (Exception e)
			// {
			// System.out.println("You are a ruh-tard");
			// }

		}
	}

	public void generate() throws Exception {
		int i = 1 / 0;
		Exception e = new Exception("Test");
		throw e;
	}
}
