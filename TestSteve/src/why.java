import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class why {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public ArrayList<String> theStringsToBeRead = new ArrayList<String>();

	public void addLines() throws IOException
	{
		String line;
		BufferedReader br = new BufferedReader(new FileReader("testFile"));
		
		//put each line into an arraylist
		while((line = br.readLine()) != null) 
	    {
			theStringsToBeRead.add(line.toLowerCase()); //adds each line to the arraylist
	    }
		//parse each line in arraylist
	    for(String item : theStringsToBeRead)
	    {
	    	testing(item); //for each line, run a regex check
	    }
	}

	public void testing(String item)
	{

		//String regex = "(?<piece>q|k|b|p|n|r+)(?<color>l|d)(?<x>\\w)(?<y>\\d)";
		String regex = "^(?<piece>q|k|b|p|n|r+)(?<color>l|d)(?<x>\\w)(?<y>\\d)$";  //doesnt appear to work
		Matcher m = Pattern.compile(regex).matcher(item);

		while (m.find()) 
		{
		    System.out.println(m.group("piece")+m.group("color")+m.group("x")+m.group("y"));
		}	
	}


	

}
