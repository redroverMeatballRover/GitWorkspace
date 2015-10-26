import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class runSteve {

	public ArrayList<String> textFileCommander = new ArrayList<String>();
	
	public void moar() throws IOException
	{
		String line;
		BufferedReader br = new BufferedReader(new FileReader("testStevesTXT"));
		
		while((line = br.readLine()) != null) 
	    {
	       textFileCommander.add(line.toLowerCase()); //adds each line to the arraylist
	    }
	    for(String item : textFileCommander)
	    {
	    	testing(item); //for each line, run a regex check
	    }
	}
	
	public void testing(String item)
	{

		//String regex = "^(?<piece>q|k|b|p|n|r+)(?<color>l|d)(?<x>\\w)(?<y>\\d)$";
		//String regex = "^(?<piece>q|k|b|p|n|r+)(?<color>l|d)(?<x>\\w)(?<y>\\d)$";  //doesnt appear to work
		String regex = "^\\s*(?<piece>q|k|b|p|n|r+)(?<color>l|d)(?<x>\\w)(?<y>\\d)\\s*$"; //accounts for white space
		
		Matcher m = Pattern.compile(regex).matcher(item);

		while (m.find()) 
		{
		    System.out.println(m.group("piece")+m.group("color")+m.group("x")+m.group("y"));
		}	
	}
}
	
	














