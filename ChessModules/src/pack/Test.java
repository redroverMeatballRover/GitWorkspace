package pack;

import java.awt.List;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/*
 * make queen a seperate method and have them all search for their own paths
 */

public class Test {

	public static void main(String[] args) throws FileNotFoundException {
		
		queen();
	}

	@SuppressWarnings("resource")
	protected static void queen() throws FileNotFoundException {
		
		ArrayList<Object> list = new ArrayList<Object>();
		list.add("a8");
		list.add("a8");
		list.add("a8");
		list.add("a8");
		list.add("a8");
		list.add("a8");
		list.add("a8");
		list.add("a8");
		list.add("a8");
		list.add("a8");
		list.add("a8");
		list.add("a8");
		list.add("a8");
		
		
		
		String queen = null;
		String type;
	
		Scanner s = null;
		s = new Scanner(new BufferedReader(new FileReader("ChessTest.txt")));

		MyFile myFile = new MyFile();
		String input = myFile.readTextFile("ChessTest.txt");
		Pattern p1 = Pattern.compile("(q)");
		Matcher m1 = p1.matcher(input);
		Pattern p2 = Pattern.compile("(l)");
		Matcher m2 = p2.matcher(input);
		
		while (s.hasNext()) {
			{
				m1.find();
				// System.out.println("The queen: " + m1.group() + " ");
				try {
					if (m1.group().equals("q"))	
					{
						System.out.println("There is a queen present");
						queen = m1.group();
						if (m2.group().equals("l"))
						{
							type = "White";
						}
						else {
							type = "Black";
						}
						
						
						
						//looks for the color of the queen
						//looks for the alphabet notation
						//looks for the number notation
						
					}
					
				} catch (IllegalStateException e) {
				}
			}	
		}
	}

	

}
