package Module1;

//AUTHOR CODY SCHAFFER//----------------------------------------------------------//

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Module1 {

	
	public static void main(String[] args) throws IOException 
	{
		moveAndCapture();
	}
	
	public static void moveAndCapture() throws IOException
	{
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
			}
			
			if (m1.group(1).equals("kl")||m1.group(1).equals("kd")||m1.group(1).equals("KL")||m1.group(1).equals("KD")||m1.group(1).equals("Kl")||m1.group(1).equals("Kd"))
			{
				if (m1.group(1).equals("kl")||m1.group(1).equals("Kl")||m1.group(1).equals("KL"))	
					piece = "White King";
					if (m1.group(1).equals("kd")||m1.group(1).equals("Kd")||m1.group(1).equals("KD"))
					{
						piece = "Black King";
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
			if (m1.group(1).equals("rl")||m1.group(1).equals("rd")||m1.group(1).equals("RL")||m1.group(1).equals("RD")||m1.group(1).equals("Rl")||m1.group(1).equals("Rd"))
			{
				if (m1.group(1).equals("rl")||m1.group(1).equals("Rl")||m1.group(1).equals("RL"))	
					piece = "White Rook";
					if (m1.group(1).equals("rd")||m1.group(1).equals("Rd")||m1.group(1).equals("RD"))
					{
						piece = "Black Rook";
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
			}
			if (m1.group(1).equals("bl")||m1.group(1).equals("bd")||m1.group(1).equals("BL")||m1.group(1).equals("BD")||m1.group(1).equals("Bl")||m1.group(1).equals("Bd"))
			{
				if (m1.group(1).equals("bl")||m1.group(1).equals("Bl")||m1.group(1).equals("BL"))		
					piece = "White Bishop";
					if (m1.group(1).equals("bd")||m1.group(1).equals("Bd")||m1.group(1).equals("BD"))
					{
						piece = "Black Bishop";
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
			}
			if (m1.group(1).equals("nl")||m1.group(1).equals("nd")||m1.group(1).equals("NL")||m1.group(1).equals("ND")||m1.group(1).equals("Nl")||m1.group(1).equals("Nd"))
			{
				if (m1.group(1).equals("nl")||m1.group(1).equals("Nl")||m1.group(1).equals("NL"))	
					piece = "White Knight";
					if (m1.group(1).equals("nd")||m1.group(1).equals("Nd")||m1.group(1).equals("ND"))
					{
						piece = "Black Knight";
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
			}
			if (m1.group(1).equals("pl")||m1.group(1).equals("pd")||m1.group(1).equals("PL")||m1.group(1).equals("PD")||m1.group(1).equals("Pl")||m1.group(1).equals("Pd"))
			{
				if (m1.group(1).equals("pl")||m1.group(1).equals("Pl")||m1.group(1).equals("PL"))	
					piece = "White Pawn";
					if (m1.group(1).equals("pd")||m1.group(1).equals("Pd")||m1.group(1).equals("PD"))
					{
						piece = "Black Pawn";
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
			}
			else {
				System.out.println("INVALID MOVE");
			}
		}
	}	
}	
