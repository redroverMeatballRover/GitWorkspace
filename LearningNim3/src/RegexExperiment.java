import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegexExperiment {

	public static void main(String[] args) 
	{
		String emailAddress = "josh@josh.com";
	
		Pattern pattern = Pattern.compile("(?<name>[a-z]+)|(?<domain>[a-z]+.com)");
		Matcher matcher = pattern.matcher(emailAddress);
		
		while (matcher.find())
		{
			System.out.println(matcher.group("name"));
			System.out.println(matcher.group("domain"));
		}
			
		
	}

}
