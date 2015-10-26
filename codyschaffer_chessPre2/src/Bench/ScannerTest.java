package Bench;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ScannerTest {

	// need to test: if a piece can be tested by regex.

	public static void main(String[] args) throws NumberFormatException,
			IOException {

		Pawn p = new Pawn("pd");
		if (p.setInBoard().equals("pd"))
			System.out.println("TRUE");
		else if (p.setInBoard().equals("pl"))
			System.out.println("semi-true");
		else 
			System.out.println("false");
		
	}

}






















//public class ScannerTest 
//{
//
//	//need to test: if a piece can be tested by regex.
//	
//	
//	public static void main(String[] args) throws NumberFormatException, IOException {
//
//		String a = " ";
//		int b;
//		String c = " ";
//		int d;
//
//		MrFile myFile = new MrFile();
//		String input = myFile.readTextFile("ChessTest.txt");
//
//		Pattern x1 = Pattern.compile("(q|k|r|b|p|n)?(d|l)?([A-Ha-h])([1-9]) ?([A-Ha-h])?([1-9])?");
//		Matcher y1 = x1.matcher(input);
//
//		FileReader reader = new FileReader("ChessTest.txt"); 
//		BufferedReader buffer = new BufferedReader(reader);
//		
//		while (buffer.readLine() != null)
//		{
//		while (y1.find()) 
//		{
//			a = y1.group(3);
//			b = Integer.parseInt(y1.group(4));
//
//			c = y1.group(5);
//			d = Integer.parseInt(y1.group(6));
//
//			System.out.println(a + b);
//			System.out.println(c + d);
//		}
//		}
//		System.out.println("hello");
//	}
//}