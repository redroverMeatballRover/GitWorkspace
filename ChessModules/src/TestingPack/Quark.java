package TestingPack;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Quark {

	
	public static void main(String[] args) throws IOException 
	{
		moveOnce();
	}
	
	public static void moveOnce() throws IOException
	{
		//(ql)(\\w\\d)|(kl)(\\w\\d)|(rl)(\\w\\d)|(bl)(\\w\\d)|(nl)(\\w\\d)|(pl)(\\w\\d)
		//(ql)(\\w\\d)|(kl)(\\w\\d)
		//(?<queen>ql)(?<pos1>\\w\\d)
		//ArrayList<String> results = new ArrayList<String>();
		String piece = " ";
		String position = " ";
		String position2 = " ";
		String capture = " ";
		MyFile myFile = new MyFile();
		String input = myFile.readTextFile("ChessTest.txt");
		Pattern p1 = Pattern.compile("(ql|kl|bl|rl|nl|pl|qd|kd|bd|rd|nd|pd|QL|KL|BL|RL|NL|PL|QD|KD|BD|RD|ND|PD|Ql|Kl|Bl|Rl|Nl|Pl|Qd|Kd|Bd|Rd|Nd|Pd)(\\w\\d) ?(\\w\\d)?([*])?");
		Matcher m1 = p1.matcher(input);
		
		Pattern c1 = Pattern.compile("(\\w\\d) (\\w\\d) (\\w\\d) (\\w\\d)");
		Matcher k1 = c1.matcher(input);
		
		while (m1.find())
		{	
			if (m1.group(1).equals("ql")||m1.group(1).equals("qd")||m1.group(1).equals("QL")||m1.group(1).equals("QD")||m1.group(1).equals("Ql")||m1.group(1).equals("Qd"))
			{
				if (m1.group(1).equals("ql")||m1.group(1).equals("Ql")||m1.group(1).equals("QL"))	
				piece = "White Queen";
				if (m1.group(1).equals("qd")||m1.group(1).equals("Qd")||m1.group(1).equals("QD"))
				{
					piece = "Black Queen";
				}
				position = m1.group(2);
				if (m1.group(3) == null)
				{
					System.out.println("The " + piece + " moves to " + position);
				}
				if (m1.group(3) != null && m1.group(4) == null)
				{
					position2 = m1.group(3);
					System.out.println("The " + piece + " moves from " + position + " to " + position2);
				}
				if (m1.group(3) != null && m1.group(4) != null)
				{
					position2 = m1.group(3);
					capture = m1.group(4);
					System.out.println("The " + piece + " moves from " + position + " to " + position2  + " and captures the piece on " + position2);
				}
				if (k1.find())//castling move
				{
					String kingPos1 = k1.group(1);
					String kingPos2 = k1.group(2);
					String rookPos1 = k1.group(3);
					String rookPos2 = k1.group(4);
					System.out.println("The king moves from " + kingPos1 + " to " + kingPos2 + " while the rook moves from " + rookPos1 + " to " + rookPos2);	
				}
			}
		}	
}
}