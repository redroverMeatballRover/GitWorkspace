package pack;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class StartPoint {

// working regex: [0-9]+{1}/[0-9]{2}/[0-9]{2} ------// MATCHES DATES
	
	//\d+ (\w+){1,}
	
	//\d{1,3}.?\d{0,3}\s[a-zA-Z]{2,30}\s[a-zA-Z]{2,15}
	
	//\d+\D+
	
	//\d+\s+([a-zA-Z]+|[a-zA-Z]+\s[a-zA-Z]+)+|[a-zA-Z]+
	
	//([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)
	
	public static void main(String[] args) {

		System.out.println("Checking dates...");

			MyFile myFile = new MyFile();
			String input = myFile.readTextFile("Data.txt");
			Pattern p1 = Pattern.compile("([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
			Matcher m1 = p1.matcher(input);
			
					while(m1.find())
					{
						System.out.print(m1.group() + " ");
					}	
	}

}

// 9/20/11	-- VALID
// 126 W. 840 S. Ogden, UT 84404 -- VALID
// 05/01/03 -- VALID
// 1300 E 540 S Salt Lake City, UT 84115 -- VALID

// 7583
// Not an address.     // NONE OF THESE ARE VALID

// 12-3-2010 			// VALID
// 10900 s 380 w. South Jordan, UT 84095-6734      VALID
// 4th of July 		-- VALID
// 10 east 120 north Bountiful, UT -- VALID


