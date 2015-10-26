// Scanners
import java.util.Scanner;
import java.text.DecimalFormat;
import java.io.*;


public class CSchaffer_Lab4 {

	//-----------------------------------------------------------------------------------------------------------------------
	/* LAB 4 by Cody Schaffer
	 * In this lab we have to scan a file (In this case, the gettysburg address), write a program that prints out to us how
	 * many words are in the speech, and fine how many times certain words are said throughout the entire speech.
	 */
	//------------------------------------------------------------------------------------------------------------------------
	
	public static void main(String[] args) throws FileNotFoundException {
	//------------------------------------------------------------------------------------------------------------------------
	// The int. aCount is for a switch statement that helps us to find the number of times a specific word goes through the 
	// speech.
	//------------------------------------------------------------------------------------------------------------------------
		
		
		String line;
		int count = 0;
		int aCount = 0; 
		int bCount = 0;
		int cCount = 0;
		int dCount = 0;
		int eCount = 0;
	
		ExtraCredit();
		//EXTRA CREDIT VARIABLE ASSIGNMENTS
		
		//--------------------------------------------------------------------------------------------------------------------------
		//scans the file 
		//--------------------------------------------------------------------------------------------------------------------------
		Scanner scan = new Scanner (new File("c:\\Users\\cschaffer\\workspace\\CodySchaffer_Lab4\\bin\\gettysburg.txt")); 
		//--------------------------------------------------------------------------------------------------------------------
		// Reads the file
		// Then starts a WHILE loop that goes through the entire speech word by word. Each word is a token. The while
		// loop goes until its gone through every single word. The COUNT++ returns the count of the full speech. 
		// The hasNext method is important here. 
		// Within the WHILE loop is a SWITCH STATEMENT, which we use to look for specific words in the speech. We use the 
		// SWITCH STATEMENT to return the number of times that word appears. 
		//--------------------------------------------------------------------------------------------------------------------
		String token = null;
		while (scan.hasNext())
		{
		    count++;  
			token = scan.next(); //telling us to scan the next word
				switch (token)//this could be int or double, but we are looking for tokens in this case.
				{
				case "a":
					aCount++;//shortcut way to increase the count each time the word is found
					break;
				case "and":
					bCount = bCount + 1;//longhand way to increase the count 
					break;
				case "or":
					cCount = cCount + 1;
					break;
				case "the":
					dCount =dCount + 1;
					break;
				case "is":
					eCount = eCount + 1;
					break;
				}					
		} 
		//-------------------------------------------------------------------------------------------------------------------------
		// We want to calculate the relative frequency of each word as it shows up in the speech. 
		// wordcountA/ totalWordCount = how we calculate this. 
		//-------------------------------------------------------------------------------------------------------------------------
		
		double totalWordCount = 31; 
		
		double wordcountA = 7;
		double wordcountB = 6;
		double wordcountC = 2;
		double wordcountD = 15;
		double wordcountE = 1;
		
		DecimalFormat fmt = new DecimalFormat ("0.###"); // use this to format the decimals to only a few places.
		
		System.out.println ("The count of the adress is: " + count);
		
		System.out.println ("The count of A is: " + aCount + " and the relative frequency of of A is: " + fmt.format(wordcountA/ totalWordCount));
		System.out.println ("The count of AND is: " + bCount + " and the relative frequency of of AND is: " + fmt.format(wordcountB / totalWordCount));
		System.out.println ("The count of OR is: " + cCount + " and the relative frequency of of OR is: " + fmt.format(wordcountC / totalWordCount));
		System.out.println ("The count of THE is: " + dCount + " and the relative frequency of of THE is: " + fmt.format(wordcountD / totalWordCount));
		System.out.println ("The count of IS is: " + eCount+ " and the relative frequency of of IS is: " + fmt.format(wordcountE / totalWordCount));
	}
	//---------------------------------------------------------------------------------------------------------------------------------
	// EXTRA CREDIT ATTEMPT
	//---------------------------------------------------------------------------------------------------------------------------------
	
	public static void ExtraCredit() throws FileNotFoundException {
	
	System.out.println ("EXTRA CREDIT ATTEMPT");
	
	String line;
	int count = 0;
	int aaCount = 0; 
	int bbCount = 0;
	int ccCount = 0;
	int ddCount = 0;
	int eeCount = 0;
	
	Scanner scan = new Scanner (new File("c:\\Users\\cschaffer\\workspace\\CodySchaffer_Lab4\\bin\\gettysburg.txt")); 
	String token = null;
	while (scan.hasNext())
	{
	    count++;  
		token = scan.next(); //telling us to scan the next word
			switch (token)//this could be int or double, but we are looking for tokens in this case.
			{
			case "four":
				aaCount++;//shortcut way to increase the count each time the word is found
				break;
			case "score":
				bbCount = bbCount + 1;//longhand way to increase the count 
				break;
			case "seven":
				ccCount = ccCount + 1;
				break;
			case "years":
				ddCount =ddCount + 1;
				break;
			case "ago":
				eeCount = eeCount + 1;
				break;
			}					
	} 
	
	System.out.println ("The count of the adress is: " + count);
	
	System.out.println ("The count of FOUR is: " + aaCount);
	System.out.println ("The count of SCORE is: " + bbCount);
	System.out.println ("The count of SEVEN is: " + ccCount);
	System.out.println ("The count of YEARS is: " + ddCount);
	System.out.println ("The count of AGO is: " + eeCount);
	
	
	

	//---------------------------------------------------------------------------------------------------------------------------------
	// END EXTRA CREDIT ATTEMPT
	//---------------------------------------------------------------------------------------------------------------------------------
		
	}
}
