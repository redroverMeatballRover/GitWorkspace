package pack3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CSC180 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


		String data  = "Test HERE@That.com.";
		Pattern pattern = Pattern.compile("\\d");
		Pattern p1 = Pattern.compile("\\b([a-zA-Z0-9._%+-].+)@([a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4})\\b");
		
		//\d find a digit 0-9
		//
				
		Matcher m = p1.matcher(data);
		
		while (m.find())
		{
			System.out.println("Match: " + m.group());
		}
		
		
	}

}
