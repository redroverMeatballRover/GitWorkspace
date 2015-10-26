package edu.neumont.csc110.authordetective;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


// runs word stream and feeds back whole words
public class WordStream {
	
	//----------------------------------------------------------------------------------------------------
	// FILEREADER READING is what is reading the first story. 
	//----------------------------------------------------------------------------------------------------
	
	FileReader reading;
	private ConfigFileReader cReader;
	
	//----------------------------------------------------------------------------------------------------
	// the FilePath is the path to the story. the FileReader/Path is purposefully named. 
	//----------------------------------------------------------------------------------------------------
	public WordStream(String filePath) throws FileNotFoundException // this is the constructor
	{
		reading = new FileReader(filePath);//essentially try/catch
		cReader = new ConfigFileReader("C:\\AuthorDetective\\ConfigFiles\\Config_Anonymous_1.xml");
	}
	
	//----------------------------------------------------------------------------------------------------
	// the NEXT string is what counts the letters in the words. 
	// HOW IT WORKS: the
	//----------------------------------------------------------------------------------------------------
	public String next()throws IOException
	{
		String word = new String("");
		int charPosition = 0; //this is an int. later, we will turn this int into a char in order to return the letter.
		boolean buildingWord = true; 
		char currentChar = 0;
		
		while (buildingWord)
		{
			charPosition = reading.read(); // it has read the story
			currentChar = (char) charPosition; //this is casting an int and turning it into a character. this is called CASTING.
			if (Character.isLetterOrDigit(currentChar) && charPosition != -1)
			{
				word = word + currentChar; // this builds the word. basically, the word(if the word was "cody") = cod + "y"(which is the currentChar) 
			}
			else if (word.length() > 0 || charPosition == -1)
			{
				buildingWord = false;
				if(charPosition == -1 && !(word.length() > 0))
					word = null;
			}
		}
		return word;// makes the STRING NEXT = to all the words that the loop goes through. It then goes to the AuthorDetective.java, 
					// which then prints out the results. the location in the other project is "newWordStream.next();"
	}
	
	//------------------------------------------------------------------------------------------------------------------------------------------
	// all this does is check to see that words still exsist to go through the loop. 
	// its job is to break out of the loop as soon as there is no more words. 
	//------------------------------------------------------------------------------------------------------------------------------------------
	public boolean hasnext() throws IOException
	{										
		return reading.ready();
	}
	
	
	//------------------------------------------------------------------------------------------------------------------------------------------
	// all this does is check to see that words still exsist to go through the loop. 
	// its job is to break out of the loop as soon as there is no more words. 
	//------------------------------------------------------------------------------------------------------------------------------------------
	
	/*---------------------------------------------------------------------------------------------------------------
	 * TESTING SECTION
	 * In this method, we run a test that checks for the first and last word of the first 
	 * anonymous document.The first word in the document is "FIRST" and the last word 
	 * in the document is "2".This code finds the first word and last word and proves that 
	 * the wordStream is working. 
	 * 
	 * (forgive the excessive commenting as it is a way of learning the code for me.)
	 * 
	 * help by Yi Yang.
	 ----------------------------------------------------------------------------------------------------------------*/
	public boolean test() throws IOException
	{	
		ConfigFileReader cReader = new ConfigFileReader("C:\\AuthorDetective\\ConfigFiles\\Config_Anonymous_1.xml"); //cReader reads the file. 
		WordStream wrdStrm = new WordStream(cReader.getAnonymousTextPath());// we pass the cReader, which is reading the txt. document, to the wrdStrm. 
		boolean pass = false; 												 
		boolean test1 = false;												
		boolean test2 = false;
		boolean isFirstTimeUsingNextMethod = true;		// checks for the first word "First". Using the method once will return the very first word. 
		int wordCount = 0;
		int emptyCount = 0;// total wordcount = 3051 words. 
		String str = "";													// empty str holds whatever goes into it. 
		String temp = "";													// empty temp holds words to check for certain words. 
		String firstWord = "First";											// checks for the very first word 
		String lastWord = "2";												// checks for last word
		
		while ((str = wrdStrm.next()) != null) // while the str = whatever words are being passed into the wrdStrm and are not null, 
		{
			wordCount++;
			if (str.length() == 0)
			{
				emptyCount++;
			}
			
			
			if(isFirstTimeUsingNextMethod)	// if its the first word...
			{
				if(str.equals(firstWord))   // str = "First"
				{
					test1 = true;			// then true. 
				}
				
				isFirstTimeUsingNextMethod = false; 	// if its false, move on. 
			}
			//Find the last word
			if(str != null)		// if str does not = null, then store the words in string temp. 
			{
				temp = str;
			}
		}
		
		if(temp.equals(lastWord))  // if the temp = "2"
		
			test2 = true; // if its "2" its true.
		
		
		if (test1 && test2 && wordCount == 3051) // checks the test1 and test2 and if it passes, it works. 
		{
			pass = true; 
		}
		
		//System.out.print(pass);
		
		return pass;
	}
}
