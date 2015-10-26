package pack;

import java.util.Scanner;
import java.io.*;

/**
 * author cody schaffer
 * 
 * This program reads a string from the user and prints it to an output file.
 * The user will be asked to input a string until he inputs the word "DONE" into
 * the string space. The output file will record all of the user's strings, but
 * will not print the sentinel string ("DONE").
 */
public class DoneProccess {
	static String file = "test-dat.txt";

	// DRIVER -- calls and runs the Magic method within a try-catch.
	public static void main(String[] args) {
		System.out.println("Please enter any key to begin.");
		try {
			Magic();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Output file has been created: " + file);
	}

	// Risky method that has an IOException. This records the user's strings and
	// waits for the sentinel string.
	public static void Magic() throws IOException {

		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter outFile = new PrintWriter(bw);

		Scanner scan = new Scanner(System.in);
		String user = scan.nextLine();

		while (!user.equals("DONE")) {
			System.out.println("Enter a String of your choice(DONE to quit)");
			user = scan.nextLine();

			if (!user.equals("DONE")) {
				outFile.print(user + "   ");
			} else {
				System.out.println("Finished.");
			}

			outFile.println();
		}
		outFile.close();
	}

}
