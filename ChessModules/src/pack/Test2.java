package pack;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test2 {

	public static void main(String[] args) throws FileNotFoundException 
	{
		//regexText();
	}
}
	
class Contact implements Comparable<Contact>{
	private String queen;
	private String king;
	private String bishop;
	private String knight;
	private String rook;
	private String pawn;

	public static ArrayList<Contact> readContacts(String file){
		ArrayList<Contact> results = new ArrayList<Contact>();
		MyFile myFile = new MyFile();
		String input = myFile.readTextFile("ChessTest.txt");
		Pattern p1 = Pattern.compile("(q+l) (k+l) (b+l) (n+l) (r+l) (p+l)");
		//Pattern p1 = Pattern.compile("(q+l) (?<king>(k+l)) (?<bishop>(b+l)) (?<knight>(n+l)) (?<rook>(r+l)) (?<pawn>(p+l))");
		Matcher m1 = p1.matcher(input);

		while (m1.find())
		{
			results.add(new Contact(m1.group(1), m1.group(2), m1.group(3), m1.group(4), m1.group(5), m1.group(6)));
		}
		System.out.println(m1.group(1));
		System.out.println(m1.group(2));
		System.out.println(m1.group(3));
		return results;
		
		
	}	
	
	
	public Contact(String q, String k, String b, String kn, String r, String p) {
		this.queen = q;
		this.king = k;
		this.bishop = b;
		this.knight = kn;
		this.rook = r;
		this.pawn = p;
	}
	
	

	public String getQueen() {
		return queen;
	}


	public void setQueen(String queen) {
		this.queen = queen;
	}


	public String getKing() {
		return king;
	}


	public void setKing(String king) {
		this.king = king;
	}


	public String getBishop() {
		return bishop;
	}


	public void setBishop(String bishop) {
		this.bishop = bishop;
	}


	public String getKnight() {
		return knight;
	}


	public void setKnight(String knight) {
		this.knight = knight;
	}


	public String getRook() {
		return rook;
	}


	public void setRook(String rook) {
		this.rook = rook;
	}


	public String getPawn() {
		return pawn;
	}


	public void setPawn(String pawn) {
		this.pawn = pawn;
	}


	@Override
	public String toString() {
		return queen + king + rook;
	}


	@Override
	public int compareTo(Contact arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
}

	
	

//	public void getAllPiecesAndMoves() throws FileNotFoundException {
//		ArrayList<String> list = new ArrayList<String>();
//
//		Scanner s = null;
//
//		try {
//			s = new Scanner(new BufferedReader(new FileReader("ChessTest.txt")));
//			while (s.hasNext()) {
//				list.add(s.next());
//				// System.out.println(s.next());
//				// list.add(s.next());
//			}
//		} finally {
//			// System.out.println("---------" + list);
//			if (s != null) {
//				s.close();
//			}
//		}
//	}
//
//	@SuppressWarnings("resource")
//	protected static void regexText() throws FileNotFoundException {
//		String queen = null;
//		String king = null;
//		String bishop = null;
//		String knight = null;
//		String rook = null;
//		String pawn = null;
//
//		Scanner s = null;
//		s = new Scanner(new BufferedReader(new FileReader("ChessTest.txt")));
//
//		//(?<digit>\d) (?<upper>[A-Z]) (?<lower>[a-z])
//		
//		MyFile myFile = new MyFile();
//		String input = myFile.readTextFile("ChessTest.txt");
//		Pattern p1 = Pattern.compile("(?<queen>(q+l)) (?<king>(k+l)) (?<bishop>(b+l)) (?<knight>(n+l)) (?<rook>(r+l)) (?<pawn>(p+l))");
//		Matcher m1 = p1.matcher(input);
////		Pattern p2 = Pattern.compile("(k+l)");
////		Matcher m2 = p2.matcher(input);
////		Pattern p3 = Pattern.compile("(b+l)");
////		Matcher m3 = p3.matcher(input);
////		Pattern p4 = Pattern.compile("(n+l)");
////		Matcher m4 = p4.matcher(input);
////		Pattern p5 = Pattern.compile("(r+l)");
////		Matcher m5 = p5.matcher(input);
////		Pattern p6 = Pattern.compile("(p+l)");
////		Matcher m6 = p6.matcher(input);
//
//		// for (int i = 0; i < 2; i++) {
////		while (s.hasNext()) {
//		while (m1.find()) {
//			{
//				m1.group(queen);
//				m1.group(king);
//				m1.group(bishop);
//				m1.group(knight);
//				m1.group(rook);
//				m1.group(pawn);
//				System.out.println("The queen: " + m1.group() + " ");
//				
//				try {
//					if (m1.group(queen).equals("ql"))	
//					{
//						System.out.println("There is a queen present");
//						queen = m1.group();
//						
//						//looks for the color of the queen
//						//looks for the alphabet notation
//						//looks for the number notation
//						
//					}
////					if (m2.group().equals("kl"))
////					{
////						System.out.println("There is a king present");
////						king = m2.group();
////					}
////					if (m3.group().equals("bl"))
////						
////					{
////						System.out.println("There is a bishop present");
////						bishop = m3.group();
////					}
////					if (m4.group().equals("nl"))
////						
////					{
////						System.out.println("There is a knight present");
////						knight = m4.group();
////					}
////					if (m5.group().equals("rl"))
////						
////					{
////						System.out.println("There is a rook present");
////						rook = m5.group();
////					}
////					if (m6.group().equals("pl"))
////					{
////						System.out.println("There is a pawn present");
////						pawn = m6.group();
////					}
//				} catch (IllegalStateException e) {
//				}
//			}	
//		}
//		
//	}
//
//	protected void createSentences() {
//		
//		
//		//System.out.println("The " + queen + " moves to ");
//	}

