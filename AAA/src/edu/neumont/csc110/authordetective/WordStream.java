package edu.neumont.csc110.authordetective;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
// this will stream words together then feed thoes words back to author detective
public class WordStream 
{
	String m_wordReader;
	FileReader reader;
	int cussCount = 0;
		
	//constructor for the word stream
	WordStream(String FilePath) throws IOException
	{
		reader = new FileReader(FilePath);
	}
	
	// this will search for the next word
	public String next() throws IOException
	{
		String word = "";
		boolean complete = false;
		int currentLetter = 0;
		while (!complete) // as lo ng as my word is not finished it will run
		{
			
			currentLetter = reader.read();
			
			if (Character.isWhitespace(currentLetter) && word.length()>0)
			{
				complete = true; // word will be done and skip ahead
			}
			else if (Character.isLetterOrDigit(currentLetter))// if the letter is a letter or digit than it will add to word
			{
				word += (char) currentLetter;
			}
			if (currentLetter==-1) // if there are no more words, it returns as null.
			{
				word = word.length() > 0 ? word : null;
				complete = true;
			}
		}
		
		
		
		// end elton's FOR loop
		return word;
		
	}
	
	public static boolean countCussWords(String word) throws IOException
	{
		
//		ConfigFileReader configFileReader = new ConfigFileReader("C:\\AuthorDetective\\ConfigFiles\\Config_Anonymous_1.xml");

		String[] moarCurse = ConfigFileReader.getCussWordsList();
		
		for (int cuss = 0; cuss < moarCurse.length; cuss++)
		{
			String cussWord = moarCurse[cuss];
			if (cussWord.equals(word))
			{
				return true;
			}
		}

		return false;

	}
	
	public int getCussWords()
	{
		return cussCount;
	}
	
	public boolean hasNext() throws IOException
	{
		return reader.ready();
	}
	
	
}