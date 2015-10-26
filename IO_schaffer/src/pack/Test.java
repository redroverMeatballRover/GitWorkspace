package pack;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Test {

	
	public static void main(String[] args) throws Exception {
		
		
		FileReader fileRead = new FileReader("infoEmps.txt");
		BufferedReader reader = new BufferedReader(fileRead);
		
		
		ArrayList<String> list = new ArrayList<String>(10);
		//list.size();
		
		String line = "";
		while (reader.ready())
		{
			line = reader.readLine();
			System.out.println(line);
			String[] split = line.split(",");
			
			//WORKS for splitting up everything on the line
			for (String s : split)
			{
				list.add(s);
				System.out.println("Split: " + s);
			}
		}
			System.out.println("-------------------------------");
			System.out.println(list.get(0));
			System.out.println(list.get(1));
			System.out.println(list.get(2));
			
			System.out.println(list.get(5));
			
			
			
			
			
			
//			String[] split = new String[3];
//			split[0] = "asadf";
//			split[1] = "asadf";
//			split[2] = "asadf";
//			split[3] = "asadf";
//			
			
//			
//			
//			//searching the string
//			line.charAt(0); // returns position of first letter
//			line.indexOf("801"); // returns position
//			line.lastIndexOf(""); //can tell program where to start searching
//			line.endsWith("");
//			line.startsWith("a");
//			line.trim(); //trims out space at beggining and end of something like "     adsfa as     "
//			line.contains(".com");
//			line.length();
//			line.isEmpty();
//			line.replace(oldChar, newChar); //can replace and make corrects
//			
//			//pg 511 in the book
//			//read chapter 5
//			
			
//			
//			for (int i = 0; i < split.length; i++)
//			{
//				String s = split[0];
//			}
//			
//			for(int i = 0; i< list.size(); i++)
//			{
//				String s = list.get(1);
//			}
			
			
			
		
		
		
	}

}
