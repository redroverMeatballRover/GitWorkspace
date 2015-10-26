package pack;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Combine {

	public static void main(String a[]) throws IOException {
		
		Striker();
		
	}

		//([A-Za-z]+ [A-Za-z]+)|(\\d+{1,2}[/-]\\d{1,2}[/-]\\d{1,4})
			
		public static void Striker() throws IOException {
		
		System.out.println("Welcome to the Contact manager!");
		System.out.println("Would you like to: \n 1) Sort Persons by NAME \n 2) Sort Persons by Phone Number \n 3) Sort persons by Email Address \n 4) Sort persons by Birthday \n 5) Get a single person by Name \n 6) quit");
		Scanner scan = new Scanner(System.in);
		int choice = scan.nextInt();
		boolean magic = true;
		
//		TreeMap<Contact, String> tm = new TreeMap<Contact, String>();
		
		//WITCHCRAFT WAY TO DO IT 
		
//		ArrayList<Contact> contactList = Contact.readContacts("Contacts.csv");
//		TreeMap<Contact, String> normalView = new TreeMap<Contact, String>();
//		TreeMap<Contact, String> phoneView = new TreeMap<Contact, String>(new phoneComp());
//		
//		for(Contact c : contactList){
//			normalView.put(c, c.getName());
//			phoneView.put(c, c.getName());
//		}
		
		if (choice == 1)
		{
			int count = 0;
			TreeMap<Contact, String> tm = new TreeMap<Contact, String>(new nameComp());
			ArrayList<Contact> contactList = Contact.readContacts("Contacts.csv");
			for(Contact c : contactList){
				tm.put(c, c.getName());
			}
			
			for(Contact c : tm.keySet()){
				count++;
				System.out.println(count + ": " + c);
			}
			Striker();
		}
		
		if (choice == 2)
		{	
			TreeMap<Contact, String> td = new TreeMap<Contact, String>(new phoneComp());
			ArrayList<Contact> contactList = Contact.readContacts("Contacts.csv");
			for(Contact c : contactList){
				td.put(c, c.getName());
			}
			
			for(Contact c : td.keySet()){
				System.out.println(c);
			}
			Striker();
		}
		
		if (choice == 3) //birthday organizes by captials first
		{
			TreeMap<Contact, String> ts = new TreeMap<Contact, String>(new emailComp());
			ArrayList<Contact> contactList = Contact.readContacts("Contacts.csv");
			for(Contact c : contactList){
				ts.put(c, c.getName());
			}
			
			for(Contact c : ts.keySet()){
				System.out.println( c);
			}
			Striker();
		}
		
		if (choice == 4) // birthday parses by month because it is not a date
		{
	
			TreeMap<Contact, String> tl = new TreeMap<Contact, String>(new birthComp());
			ArrayList<Contact> contactList = Contact.readContacts("Contacts.csv");
			for(Contact c : contactList){
				tl.put(c, c.getName());
			}
			
			for(Contact c : tl.keySet()){
				System.out.println(c);
			}
			Striker();
		}
		
		if (choice == 5) 
		{
			Reader read = new Reader();
			Reader.contactManager();
			Striker();
			
		}
		
		if (choice == 6) 
		{
			System.out.println("Goodbye");
		}
			
	}
}

class nameComp implements Comparator<Contact> {
	@Override
	public int compare(Contact c1, Contact c2) {
		return c1.getName().compareTo(c2.getName());
	}
}

class phoneComp implements Comparator<Contact> {

	@Override
	public int compare(Contact c1, Contact c2) {
		return c1.getPhone().compareTo(c2.getPhone());
	}
}

class emailComp implements Comparator<Contact> {
	@Override
	public int compare(Contact c1, Contact c2) {
		return c1.getEmail().compareTo(c2.getEmail());
	}
}

class birthComp implements Comparator<Contact> {
	@Override
	public int compare(Contact c1, Contact c2) {
		return c1.getBdate().compareTo(c2.getBdate());
	}
}



class Contact implements Comparable<Contact>{
	private String name;
	private String phone;
	private String email;
	private String bdate;
	

	public static ArrayList<Contact> readContacts(String file){
		ArrayList<Contact> results = new ArrayList<Contact>();
		MyFile myFile = new MyFile();
		String input = myFile.readTextFile("Contacts.csv");
		Pattern p1 = Pattern.compile("(\\b[A-Z][a-z]+ [A-Z]?[.]? ?[A-Z\']{1,3}[a-z]+\\b),([0-9 ()-]{3,6}[0-9-]{3,4}\\d{4}),(\\b[a-zA-Z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}\\b),(([0-9/]{1,4}){3})");
		Matcher m1 = p1.matcher(input);

		while (m1.find())
		{
			results.add(new Contact(m1.group(1), m1.group(2), m1.group(3), m1.group(4)));
		}
		return results;
	}
	
	
	
//	System.out.println(name);
//	System.out.println(phone);
	

	public Contact(String n, String p, String e, String bd) {
		this.name = n;
		this.phone = p;
		this.email = e;
		this.bdate = bd;
	}
	
	public int compareTo(Contact c)
	{
		return this.name.compareTo(c.name);
		//return 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBdate() {
		return bdate;
	}

	public void setBdate(String bdate) {
		this.bdate = bdate;
	}

	@Override
	public String toString() {
		return "Name: " + this.name + " ----- Number: " + this.phone + " ---- Email: " + this.email + "----- Birthday: " + this.bdate;
	}
	
}
