package pack;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import pack2.MyFile;

public class Startup {

	public static void main(String[] args) throws IOException {

		System.out.println("Welcome to the Contact Manager!");
		contactManager();

	}

	public static void contactManager() throws IOException {

		System.out
				.println("\n Do you want to: \n 1) See all the contacts \n 2) See a specific contact \n 3) Enter a new Contact \n 4) Quit ");
		Scanner scan = new Scanner(System.in);
		int choice = scan.nextInt();

		if (choice == 1) {

			MyFile myFile = new MyFile();
			String input = myFile.readTextFile("infoEmps.txt");
			Pattern p1 = Pattern.compile("[A-Z][a-z]+");
			Matcher m1 = p1.matcher(input);

			for (int i = 0; i < 1; i++) {
				for (int j = 0; j < 3; j++) {
					for (int k = 0; k < 2; k++) {
						m1.find();
						System.out.print(m1.group() + " ");
					}
					System.out.println();
				}
				System.out.println();
			}
			System.out.println();
			contactManager();
		}

		else if (choice == 2) {

			// array option

			Scanner s = null;
			s = new Scanner(new BufferedReader(new FileReader("infoEmps.txt")));

			List<String> contact = new ArrayList<String>();

			try {
				while (s.hasNext()) {
					contact.add(s.next());
					// System.out.println(s.nextLine());
				}
			} finally {
				if (s != null) {
					s.close();
				}

				System.out.println("Please enter the contact number: ");
				int c = scan.nextInt();

				if (c == 1) {
					// Scanner s = null;
					// try {
					// s = new Scanner(new BufferedReader(new FileReader(
					// "infoEmps.txt")));
					//
					// for (int i = 0; i < 1; i++) {
					// System.out.println(s.nextLine());
					// }
					//
					// } finally {
					// if (s != null)
					// s.close();
					// }
					System.out.println(contact.get(0) + " " + contact.get(1));
				}
				else if (c == 2) {
					System.out.println(contact.get(2) + " " + contact.get(3));
				}
				else if (c == 3) {
					
					
					System.out.println(contact.get(4) + " " + contact.get(5));
					
					
					
					String input = contact.get(5);
					Pattern x1 = Pattern.compile("\\b([a-z0-9._%+-].+)@([a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4})\\b");
					Matcher z1 = x1.matcher(input);

					while (z1.find())
					{
						System.out.println("-------------------------KABLAM----------------------");
						System.out.print(z1.group() + " ");
					}
					
				}

			}
		}

		else if (choice == 3) {
			// outputStream = new PrintWriter(new
			// FileWriter("characteroutput.txt"));
			System.out.print("Name: ");
			String c = scan.next();

			System.out.println("Email: ");
			c = scan.next();

			System.out.println("Number: ");
			c = scan.next();
		}

		else if (choice == 4) {
			System.out.println("Goodbye.");
			System.exit(0);
		}

	}

}
