package pack;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {

		// \d+{1,2}[/-]\d{1,2}[/-]\d{1,4} WORKS FOR DATES ALL
		// ([\d]+ [neswNESW][.]? ){2}(?<city>[a-zA-Z ]+), [A-Z]+ [\d]+[-]?[\d]+
		// WORKS FOR ALL ADDRESS

		FileReader reader = new FileReader("Data.txt"); // shoult work
		BufferedReader buffer = new BufferedReader(reader);

		while (buffer.ready()) {
			String date = buffer.readLine();
			// String address = buffer.readLine();
			// System.out.println(date + "\n" + address);
			
			String address = buffer.readLine();
			String city = buffer.readLine();
			// System.out.println(date + "\n" + address);

			if (address.matches("([\\d]+ [neswNESW][.]? ){2}(?<city>[a-zA-Z ]+), [A-Z]+ [\\d]+[-]?[\\d]+")) {
				// list.add(address);
				System.out.println(address + " == match!");

				if (address.matches("Ogden|Salt Lake City|South Jordan")) {
					System.out.println(city + " == match!");
				}
			} 

			else if (date.matches("\\d+{1,2}[/-]\\d{1,2}[/-]\\d{1,4}")) {
				System.out.println(date + " == match!");
			}
//			 else if (!date.matches("\\d+{1,2}[/-]\\d{1,2}[/-]\\d{1,4}")) 
//			 {
//				 
//			 }

			SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yy");
			SimpleDateFormat sdf2 = new SimpleDateFormat("dd-mm-yy");

			Date d = null;
			Date c = null;
			try {
				d = sdf.parse(date);
				c = sdf2.parse(date);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
			}
			try {
				System.out.println(d.getTime());
				System.out.println(c.getTime());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
			}
			finally {
				
			}
			

		}

//		while (buffer.ready()) {
//			// String date = buffer.readLine();
//			String address = buffer.readLine();
//			String city = buffer.readLine();
//			// System.out.println(date + "\n" + address);
//
//			if (address
//					.matches("([\\d]+ [neswNESW][.]? ){2}(?<city>[a-zA-Z ]+), [A-Z]+ [\\d]+[-]?[\\d]+")) {
//				// list.add(address);
//				System.out.println(address + " == match!");
//
//				if (address.matches("Ogden|Salt Lake City|South Jordan")) {
//					System.out.println(city + " == match!");
//				}
//			} else {
//
//			}
//		}

		buffer.close();
	}

}
