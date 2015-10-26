package edu.neumont.csc110.authordetective;

import java.io.IOException;

public class ReAuthorDetective {

	
	public static void main(String[] args) throws IOException
	{
	
		final String CONFIG_FILE_PATH = "C:\\AuthorDetective\\ConfigFiles\\Config_Anonymous_1.xml";
		ReConfigFileReader reconfigFileReader = new ReConfigFileReader();
		
		reconfigFileReader.getAnonymousTextPath();
		System.out.println (reconfigFileReader.getAnonymousTextPath());
		String[] authors = reconfigFileReader.getAuthorTextPaths();
	
			for (String author: authors)//returns the number of authors each time
			{
				System.out.println(author);//prints it
			}
	
	
	String[] words = configFileReader.getFunctionWords();
			for (String word: words)//returns the number of function words
			{
				System.out.println(word);//prints it
	
			}
	
	

	}
}