package pack;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reader {

	public static void main(String[] args) throws IOException {

		contactManager();
	}

	@SuppressWarnings("resource")
	public static void contactManager() throws IOException {

		FileReader fileRead = new FileReader("Contacts.csv");
		BufferedReader reader = new BufferedReader(fileRead);
		final ArrayList<String> list = new ArrayList<String>(50);
		
		

		String line = "";
		while (reader.ready()) {
			line = reader.readLine();
			// System.out.println(line);
			String[] split = line.split(",");
			
			for (String s : split) {
				list.add(s);
				// System.out.println("Split: " + s);
			}
		}

		System.out.println("\n Choose 1 to get a refresher of the list, Choose 2 to see a specific contact ");

		try {
			Scanner scan = new Scanner(System.in);
			int choice = scan.nextInt();
			if (choice == 1) {

				try {
					for (int i = 0; i < 50; i++) {
						// for getting name list
						int up = i * 4;
						int id = i + 1;
						System.out.println(id + " -- " + list.get(up));
					}
				} catch (IndexOutOfBoundsException e) {
					System.out.println("WHOOPS");
				} finally {
				}
			}

			else if (choice == 2) {

				int random;
				int i = 0;
				
				System.out.println("Please enter the contact number: ");
				Scanner jak = new Scanner(System.in);
				
				for (random = jak.nextInt(); i < 1; i++)
				{
					int person = random * 4;
					int allElse1 = random + 1;
					int allElse2 = random + 2;
					int allElse3 = random + 3;
					System.out.println("Name: " + list.get(person) + " Phone: " + list.get(allElse1) + " Email: " + list.get(allElse2) + " Birthday: " + list.get(allElse3));
				}
				
				
//				
//				if (c == 1) {
//
//					Set<String> h1 = new HashSet<String>() {
//						{
//							add(list.get(1));
//							add(list.get(2));
//							add(list.get(3));
//						}
//					};
//					System.out.println(list.get(0) + " : " + h1);
//				}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			}

		} finally {

		}
	}
}
