package pack2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import pack.Seri.NonSerializableObject;

public class Seri2 implements Serializable{

	public static void main(String a[]) throws IOException {
		RunMenu();
	}
		//([A-Za-z]+ [A-Za-z]+)|(\\d+{1,2}[/-]\\d{1,2}[/-]\\d{1,4})
			
		public static void RunMenu() throws IOException {
		
		System.out.println("Welcome to the Contact manager!");
		System.out.println("Would you like to: \n 1) Sort Persons by NAME");
		Scanner scan = new Scanner(System.in);
		int choice = scan.nextInt();
		boolean magic = true;
		

		
		if (choice == 1)
		{
			int count = 0;
			TreeMap<Contact, String> tm = new TreeMap<Contact, String>(new nameComp()); 
			
			ArrayList<Contact> contactList = Contact.readContacts("Contacts.csv");
			for(Contact c : contactList)
			{
				tm.put(c, c.getName());
			}
			
			for(Contact c : tm.keySet()){
				count++;
				System.out.println(count + ": " + c);
			}
			RunMenu();
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
	
	public Contact(String n, String p, String e, String bd) {
		this.name = n;
		this.phone = p;
		this.email = e;
		this.bdate = bd;
	}
	
	private static final long serialVersionUID = 4039562927858493789L;

	public String data;
//	public int doWrite = 10;
//	public transient int dontWrite = 7;
//	public transient NonSerializableObject obj;
//	//-------------------------------------------------------------------------------------------------------//
//	//-------------------------------------------------------------------------------------------------------//
//	public SerializableObject() {
//		System.out.println("Call constructor (default)!");
//	}
//
//	public SerializableObject(String data) {
//		this.data = data;
//		obj = new NonSerializableObject();
//		System.out.println("Call constructor (params)!");
//	}
	
	
	 public void readExternal(ObjectInput in) throws IOException,
	 ClassNotFoundException
	 {
	 data = (String)in.readObject();
		MyFile myFile = new MyFile();
		String input = myFile.readTextFile("Contacts.csv");
		data = input;
	 //dontWrite = in.readInt();
	 }
	
	 public void writeExternal(ObjectOutput out) throws IOException
	 {
	 // do write, is serializable
	 out.writeObject(data);
	 //out.writeInt(dontWrite);
	 }
	//-------------------------------------------------------------------------------------------------------//
	//-------------------------------------------------------------------------------------------------------//
	 
	public int compareTo(Contact c)
	{
		return this.name.compareTo(c.name);
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
