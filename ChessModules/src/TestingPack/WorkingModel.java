package TestingPack;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WorkingModel {

	
	public static void main(String[] args) throws FileNotFoundException {
		
		getAllPiecesAndMoves();

	}


public static void getAllPiecesAndMoves() throws FileNotFoundException {
	ArrayList<String> list = new ArrayList<String>();

	Scanner s = null;

	try {
		s = new Scanner(new BufferedReader(new FileReader("ChessTest.txt")));
		while (s.hasNext()) {
			list.add(s.next());
			// System.out.println(s.next());
			// list.add(s.next());
		}
	} finally {
		// System.out.println("---------" + list);
		if (s != null) {
			s.close();
		}
	}
}

@SuppressWarnings("resource")
protected static void regexText() throws FileNotFoundException {
	String queen = null;
	String king = null;
	String bishop = null;
	String knight = null;
	String rook = null;
	String pawn = null;

	Scanner s = null;
	s = new Scanner(new BufferedReader(new FileReader("ChessTest.txt")));

	//(?<digit>\d) (?<upper>[A-Z]) (?<lower>[a-z])
	//?<queen>(q+l)) (?<king>(k+l)) (?<bishop>(b+l)) (?<knight>(n+l)) (?<rook>(r+l)) (?<pawn>(p+l))
	
	MyFile myFile = new MyFile();
	String input = myFile.readTextFile("ChessTest.txt");
	Pattern p1 = Pattern.compile("(q+l)");
	Matcher m1 = p1.matcher(input);
	Pattern p2 = Pattern.compile("(k+l)");
	Matcher m2 = p2.matcher(input);
	Pattern p3 = Pattern.compile("(b+l)");
	Matcher m3 = p3.matcher(input);
	Pattern p4 = Pattern.compile("(n+l)");
	Matcher m4 = p4.matcher(input);
	Pattern p5 = Pattern.compile("(r+l)");
	Matcher m5 = p5.matcher(input);
	Pattern p6 = Pattern.compile("(p+l)");
	Matcher m6 = p6.matcher(input);

	// for (int i = 0; i < 2; i++) {
//	while (s.hasNext()) {
	while (m1.find()) {
		{
			m1.group();
			m2.group();
			m3.group();
			m4.group();
			m5.group();
			m6.group();
			System.out.println("The queen: " + m1.group() + " ");
			
			try {
				if (m1.group().equals("ql"))	
				{
					System.out.println("There is a queen present");
					queen = m1.group();
					
					//looks for the color of the queen
					//looks for the alphabet notation
					//looks for the number notation
					
				}
				if (m2.group().equals("kl"))
				{
					System.out.println("There is a king present");
					king = m2.group();
				}
				if (m3.group().equals("bl"))
					
				{
					System.out.println("There is a bishop present");
					bishop = m3.group();
				}
				if (m4.group().equals("nl"))
					
				{
					System.out.println("There is a knight present");
					knight = m4.group();
				}
				if (m5.group().equals("rl"))
					
				{
					System.out.println("There is a rook present");
					rook = m5.group();
				}
				if (m6.group().equals("pl"))
				{
					System.out.println("There is a pawn present");
					pawn = m6.group();
				}
			} catch (IllegalStateException e) {
			}
		}	
	}
	
}

protected void createSentences() {
	
	
	//System.out.println("The " + queen + " moves to ");
}
}