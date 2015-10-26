package pack;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.io.*;

/**
 * 
 * @author cschaffer
 *
 *This program is a book processing system. It reads the titles of books (or in this case, bands)
 *from an input file, and then prints them to an output file. The input file has several duplicates.
 *The goal of the program is to print out all the books to the output file with no duplicates. 
 */

public class BookProccessing {
	
	//DRIVER//
	public static void main(String[] args) throws IOException {

		// String value = null;
		String file = "noDuplicates-dat.txt"; //OUTPUT
		
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter outFile = new PrintWriter(bw);

		Scanner in = new Scanner(new File("bookTitles.txt")); //INPUT FILE
		ArrayList<String> intList = new ArrayList();

		while (in.hasNext()) {
			String element = in.nextLine();
			intList.add(element);
			
			HashSet hs = new HashSet();//hash set removes duplicates.
			hs.addAll(intList);
			intList.clear();
			intList.addAll(hs);
			
			//System.out.println(element + "\n");
			// outFile.println(element);
		}

		
		//TESTING//
//		System.out.println("WHAT THE HASH LIST IS RETURNING");
//		System.out.println("----------------------------------------------------------");
//		System.out.println(intList);

		outFile.println(intList);
		outFile.close();
		System.out.println("Output file has been created: " + file);
	}

}

//	WORKS //
//while(in.hasNext()) // hasNextLine?
//{
//intList.add(in.nextLine());
//System.out.println(in.nextLine());
//}


//WORKS//
//while(in.hasNext()) // hasNextLine?
//{
//	value = in.nextLine();
//	outFile.print(value + "          ");
//	System.out.println(value);
//}

