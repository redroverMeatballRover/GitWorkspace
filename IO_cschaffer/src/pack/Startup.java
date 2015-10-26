package pack;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Startup {

	public static void main(String[] args) throws IOException {

		System.out.println("Welcome to the Contact Manager!");
		contactManager();
	}

	@SuppressWarnings("resource")
	public static void contactManager() throws IOException {

		FileReader fileRead = new FileReader("Contacts.txt");
		BufferedReader reader = new BufferedReader(fileRead);

		ArrayList<String> list = new ArrayList<String>(20);
		// list.size();

		String line = "";
		while (reader.ready()) {
			line = reader.readLine();
			// System.out.println(line);
			String[] split = line.split(",");

			// WORKS for splitting up everything on the line
			for (String s : split) {
				list.add(s);
				// System.out.println("Split: " + s);
			}
		}

		System.out
				.println("\n Do you want to: \n 1) See all the contacts \n 2) See a specific contact \n 3) Enter a new Contact \n 4) Quit ");

		try {
			Scanner scan = new Scanner(System.in);
			int choice = scan.nextInt();
			if (choice == 1) {

				// MyFile myFile = new MyFile();
				// String input = myFile.readTextFile("infoEmps.txt");
				// Pattern p1 = Pattern.compile("[A-Z][a-z]+");
				// Matcher m1 = p1.matcher(input);
				//
				// for (int i = 0; i < 1; i++) {
				// for (int j = 0; j < 3; j++) {
				// for (int k = 0; k < 2; k++) {
				// m1.find();
				// System.out.print(m1.group() + " ");
				// }
				// System.out.println();
				// }
				// System.out.println();
				// }
				// System.out.println();
				// contactManager();

				// OR use...

				try {
					System.out.println("1- " + list.get(0));
					System.out.println("2- " + list.get(3));
					System.out.println("3- " + list.get(6));
					System.out.println("4- " + list.get(9));
					System.out.println("5- " + list.get(12));
					System.out.println("6- " + list.get(15));
					System.out.println("7- " + list.get(18));
				} catch (IndexOutOfBoundsException e) {
				} finally {
					contactManager();
				}
			}

			else if (choice == 2) {

				System.out.println("Please enter the contact number: ");
				int c = scan.nextInt();

				if (c == 1) {
					System.out.println("Name: " + list.get(0));
					System.out.println("Email: " + list.get(1));
					System.out.println("Phone: " + list.get(2));
					contactManager();
				} else if (c == 2) {
					System.out.println("Name: " + list.get(3));
					System.out.println("Email: " + list.get(4));
					System.out.println("Phone: " + list.get(5));
					contactManager();
				} else if (c == 3) {

					System.out.println("Name: " + list.get(6));
					System.out.println("Email: " + list.get(7));
					System.out.println("Phone: " + list.get(8));
					contactManager();
				}

				else if (c == 4) {
					System.out.println("Name: " + list.get(9));
					System.out.println("Email: " + list.get(10));
					System.out.println("Phone: " + list.get(11));
					contactManager();
				} else if (c == 5) {
					System.out.println("Name: " + list.get(12));
					System.out.println("Email: " + list.get(13));
					System.out.println("Phone: " + list.get(14));
					contactManager();
				}

				else if (c == 6) {
					System.out.println("Name: " + list.get(15));
					System.out.println("Email: " + list.get(16));
					System.out.println("Phone: " + list.get(17));
					contactManager();
				} else if (c == 7) {
					System.out.println("Name: " + list.get(18));
					System.out.println("Email: " + list.get(19));
					System.out.println("Phone: " + list.get(20));
					contactManager();
				}

			}

			else if (choice == 3) {

				// use append and nextLine
				String c;
				String x;
				String d;
				String e;

				// BufferedReader inputStream = null;
				PrintWriter outputStream = null;

				try {
					outputStream = new PrintWriter(new FileWriter(
							"Contacts.txt", true));

					System.out.println("First Name: ");
					c = scan.next();

					System.out.println("Last Name: ");
					x = scan.next();

					System.out.println("Email: "); // ERROR + HANDLING HERE
					d = scan.next();

					System.out.println("Number: "); // ERROR + HANDLING HERE
					e = scan.next();

					outputStream.append("\n" + c + " " + x + "," + d + "," + e
							+ ",");
					outputStream.close();
				} finally {

					contactManager();
				}
			}

			else if (choice == 4) {
				goodbye();
			}

			else {
				System.out
						.println("You must choose by using a number. Enter 1, 2, 3, or 4 to choose.");
				contactManager();
			}
		} catch (InputMismatchException e) {
			System.out.println("YOU MUST USE NUMBERS, YOU FOOL!");
		} finally {
			contactManager();
		}
	}

	public static void goodbye() {
		System.out.println("Goodbye.");
		System.exit(0);
	}

}

