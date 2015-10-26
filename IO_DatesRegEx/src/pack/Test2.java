package pack;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class Test2 {
	
	protected static void A() throws IOException
	{
		ArrayList<String> list = new ArrayList<String>(4);
		
		FileReader reader = new FileReader("Data.txt"); // shoult work
		BufferedReader buffer = new BufferedReader(reader);
		
		while (buffer.ready()) {
			
			String address = buffer.readLine();
			// System.out.println(date + "\n" + address);

			if (address.matches("([\\d]+ [neswNESW][.]? ){2}(?<city>[a-zA-Z ]+), [A-Z]+ [\\d]+[-]?[\\d]+")) {
				System.out.println(address + " == match!");
				String city = buffer.readLine();
				
				//pattern
//				if (city.matches("(Ogden|Salt Lake City|South Jordan)")) {
//					System.out.println(city + " == match!");
//				}
				
				MyFile myFile = new MyFile();
				String input = myFile.readTextFile("Data.txt");
				Pattern p1 = Pattern.compile("([\\d]+ [neswNESW][.]? ){2}(?<city>[a-zA-Z ]+), [A-Z]+ [\\d]+[-]?[\\d]+");
				Matcher m1 = p1.matcher(input);
				
				while (m1.find())
					//while (m1.find())
				{
					System.out.println(m1.group("city"));
					list.add(m1.group());
				}
			}
			
		}
		//System.out.println("AFALKDHFALKDSFAKF    ..." + list.get(2));
	}
	
	protected static void B() throws IOException
	{
		//ArrayList<String> list = new ArrayList<String>(4);
		
		FileReader reader = new FileReader("Data.txt"); // shoult work
		@SuppressWarnings("resource")
		BufferedReader buffer = new BufferedReader(reader);
		
		while (buffer.ready()) {
			String date = buffer.readLine();
			
			if (date.matches("\\d+{1,2}[/-]\\d{1,2}[/-]\\d{1,4}")) 
			{
				System.out.println(date + " == match!");
			

			SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yy");
			SimpleDateFormat sdf2 = new SimpleDateFormat("MM-dd-yyyy");

			Date d = null;
			Date c = null;
			
			if (date.matches("12-3-2010"))
			{

				try {
					//if / else
					c = sdf2.parse(date);
				} catch (ParseException e) {
					
				}
				try {
					System.out.println(c.getTime());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					// e.printStackTrace();
				}
			}
			
			else {
			try {
				//if / else
				d = sdf.parse(date);
			} catch (ParseException e) {
				
			}
			try {
				System.out.println(d.getTime());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
			}
			}
			}
		}
	}
	
public static void main(String[] args) throws IOException {
		
		A();
		B();
		
		
		
	}

}
