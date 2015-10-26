package SuperTest;

import java.io.*;
import java.util.*;
import java.util.logging.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reuse {

	public static void main(String... aArguments) {


		ArrayList<Contact> results = new ArrayList<Contact>();
		MyFile myFile = new MyFile();
		String input2 = myFile.readTextFile("Contacts.csv");
		Pattern p1 = Pattern.compile("(\\b[A-Z][a-z]+ [A-Z]?[.]? ?[A-Z\']{1,3}[a-z]+\\b),([0-9 ()-]{3,6}[0-9-]{3,4}\\d{4}),(\\b[a-zA-Z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}\\b),(([0-9/]{1,4}){3})");
		Matcher m1 = p1.matcher(input2);

		while (m1.find()) {
			results.add(new Contact(m1.group(1), m1.group(2), m1.group(3), m1.group(4)));
		}

		System.out.println(results);
			
		//------------------------------------------------------------------------------------
		// create a Serializable List
//		List<String> quarks = Arrays.asList("up", "down", "strange", "charm",
//				"top", "bottom");
		
		// serialize the List
		// note the use of abstract base class references
//-------------------------------------------------------------------------------------------
		try {
			// use buffering
			OutputStream file = new FileOutputStream("quarks.ser");
			OutputStream buffer = new BufferedOutputStream(file);
			ObjectOutput output = new ObjectOutputStream(buffer);
			try {
//				output.writeObject(quarks);
				output.writeObject(results);
			} finally {
				output.close();
			}
		} catch (IOException ex) {
			fLogger.log(Level.SEVERE, "Cannot perform output.", ex);
		}

		// deserialize the quarks.ser file
		// note the use of abstract base class references

		try {
			// use buffering
			InputStream file = new FileInputStream("quarks.ser");
			InputStream buffer = new BufferedInputStream(file);
			ObjectInput input4 = new ObjectInputStream(buffer);
			try {
				// deserialize the List
				@SuppressWarnings("unchecked")
				List<Contact> recoveredQuarks = (List<Contact>) input4.readObject();
				// display its data
				
//				for (String quark : recoveredQuarks) {
//					System.out.println("Recovered Quark: " + quark);
//				}
				for (Contact quark : recoveredQuarks) {
					System.out.println("Recovered Quark: " + quark);
				}
				
				
			} finally {
				input4.close();
			}
		} catch (ClassNotFoundException ex) {
			fLogger.log(Level.SEVERE, "Cannot perform input. Class not found.",
					ex);
		} catch (IOException ex) {
			fLogger.log(Level.SEVERE, "Cannot perform input.", ex);
		}
	}

	// PRIVATE //

	// Use Java's logging facilities to record exceptions.
	// The behavior of the logger can be configured through a
	// text file, or programmatically through the logging API.
	private static final Logger fLogger = Logger.getLogger(BLARG.class
			.getPackage().getName());
}
