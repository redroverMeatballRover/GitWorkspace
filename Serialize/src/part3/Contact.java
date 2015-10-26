package part3;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import pack2.MyFile;

public class Contact implements Comparable<Contact> {

	private String name;
	private String phone;
	private String email;
	private String bdate;

	public Contact(String n, String p, String e, String bd) {
		this.name = n;
		this.phone = p;
		this.email = e;
		this.bdate = bd;
	}

//	public static ArrayList<Contact> readContacts(String file) {
//		ArrayList<Contact> results = new ArrayList<Contact>();
//		MyFile myFile = new MyFile();
//		String input = myFile.readTextFile("Contacts.csv");
//		Pattern p1 = Pattern
//				.compile("(\\b[A-Z][a-z]+ [A-Z]?[.]? ?[A-Z\']{1,3}[a-z]+\\b),([0-9 ()-]{3,6}[0-9-]{3,4}\\d{4}),(\\b[a-zA-Z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}\\b),(([0-9/]{1,4}){3})");
//		Matcher m1 = p1.matcher(input);
//
//		while (m1.find()) {
//			results.add(new Contact(m1.group(1), m1.group(2), m1.group(3), m1
//					.group(4)));
//		}
//		return results;
//	}

	@Override
	public String toString() {
		return "Name: " + this.name + " ----- Number: " + this.phone
				+ " ---- Email: " + this.email + "----- Birthday: "
				+ this.bdate;
	}

	@Override
	public int compareTo(Contact arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

}
