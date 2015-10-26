package edu.neumont.csc110.authordetective;

//Imports
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/*ConfigFileReader - Reads a config file from a location designated in the calling class 
 * then returns requested information located in that config file based on predefined headers 
 */
public class ConfigFileReader 
{
    String m_ConfigFilePath;
    private static String[] cussWords;
    
    public static String[] getCussWordsList(){
    	return cussWords;
    }
    
    /*Constructor for the Config File Reader
      Accepts the path to where the config file is located from the calling class as a string labeled configFilePath. 
      This constructor method will save the path as a private attribute of the class.*/     
    ConfigFileReader(String configFilePath)
    {
           m_ConfigFilePath = configFilePath;
           cussWords = getCussWords();
    }
   
    /* Parser for the config file to get the subject text path
     * Use the scanner class to parse the file located at a path stored in m_ConfigFileReader
     * Returns the next token after predesignated header <AnonymousText>
     */
    String[] getAnonymousTextPath()
    {
		//Initial Declarations for the getAuthorTextPaths method
		final String AUTHOR_GROUP_START_TAG = "<AnonymousText>";
		final String AUTHOR_GROUP_END_TAG = "</AnonymousText>";
		String testWord = "";
		String[] authorTextPaths = null;
		
    	try
		{
			Scanner readFile = new Scanner(new File(m_ConfigFilePath));
			
			// Get a count of how many exemplars there are
			int wordCount = 0;
			Boolean keepLooking = true;
			while (readFile.hasNext() && keepLooking)
			{
				// Find the opening tag
				testWord = readFile.next();
				if (AUTHOR_GROUP_START_TAG.equals(testWord))
				{
					while (readFile.hasNext() && keepLooking)
					{
						testWord = readFile.next();
						
						// If this is the closing tag then we are done counting
						if (AUTHOR_GROUP_END_TAG.equals(testWord))
						{
							keepLooking = false;
						}
						else // Otherwise add another path to the count							
						{
							wordCount++;
						}
					}
				}
			}
			readFile.close();
			
			// Now we will actually import the paths
			if (0 < wordCount)
			{
				// Allocate memory for the function word array
				authorTextPaths = new String[wordCount];
				
				// Reset the scanner to the start of the file
				readFile = new Scanner(new File(m_ConfigFilePath));
				
				// Go get each author training text
				wordCount = 0;
				keepLooking = true;
				while (readFile.hasNext() && keepLooking)
				{
					testWord = readFile.next();
					
					// Find the opening tag
					if (AUTHOR_GROUP_START_TAG.equals(testWord))
					{
						while (readFile.hasNext() && keepLooking)
						{	
							testWord = readFile.next();
							
							// Find the closing tag`
							if (AUTHOR_GROUP_END_TAG.equals(testWord))
							{
								keepLooking = false;
							}
							
							// Get the next file path
							else
							{
								authorTextPaths[wordCount] = testWord;
								wordCount++;
							}
						}
					}
				}
				readFile.close();
			}
		} 
		catch (FileNotFoundException e) 
		{
			
		}
        return authorTextPaths;
	}
    
    /* Parser for the config file to gather the reference text paths
     * Use the scanner class to parse the file located at a path stored in m_ConfigFileReader
     * Returns an array holding the tokens located between the predesignated header <AnonymousText> and </AnonymousText> the designated footer
     */
	String[] getAuthorTextPaths()
	{
		//Initial Declarations for the getAuthorTextPaths method
		final String AUTHOR_GROUP_START_TAG = "<AuthorGroup>";
		final String AUTHOR_GROUP_END_TAG = "</AuthorGroup>";
		String testWord = "";
		String[] authorTextPaths = null;
		
    	try
		{
			Scanner readFile = new Scanner(new File(m_ConfigFilePath));
			
			// Get a count of how many exemplars there are
			int wordCount = 0;
			Boolean keepLooking = true;
			while (readFile.hasNext() && keepLooking)
			{
				// Find the opening tag
				testWord = readFile.next();
				if (AUTHOR_GROUP_START_TAG.equals(testWord))
				{
					while (readFile.hasNext() && keepLooking)
					{
						testWord = readFile.next();
						
						// If this is the closing tag then we are done counting
						if (AUTHOR_GROUP_END_TAG.equals(testWord))
						{
							keepLooking = false;
						}
						else // Otherwise add another path to the count							
						{
							wordCount++;
						}
					}
				}
			}
			readFile.close();
			
			// Now we will actually import the paths
			if (0 < wordCount)
			{
				// Allocate memory for the function word array
				authorTextPaths = new String[wordCount];
				
				// Reset the scanner to the start of the file
				readFile = new Scanner(new File(m_ConfigFilePath));
				
				// Go get each author training text
				wordCount = 0;
				keepLooking = true;
				while (readFile.hasNext() && keepLooking)
				{
					testWord = readFile.next();
					
					// Find the opening tag
					if (AUTHOR_GROUP_START_TAG.equals(testWord))
					{
						while (readFile.hasNext() && keepLooking)
						{	
							testWord = readFile.next();
							
							// Find the closing tag`
							if (AUTHOR_GROUP_END_TAG.equals(testWord))
							{
								keepLooking = false;
							}
							
							// Get the next file path
							else
							{
								authorTextPaths[wordCount] = testWord;
								wordCount++;
							}
						}
					}
				}
				readFile.close();
			}
		} 
		catch (FileNotFoundException e) 
		{
			
		}
        return authorTextPaths;
	}
    
	/* Parser for the config file to get the function words to be tested
     * Use the scanner class to parse the file located at a path stored in m_ConfigFileReader
     * Returns an array holding the tokens located between the predesignated header <FunctionWords> and </FunctionWords> the designated footer
     */
	String[] getFunctionWords()
	{
		
		//Initial Declarations for the getFunctionWords method
		final String FUNCTION_WORDS_START_TAG = "<FunctionWords>";
		final String FUNCTION_WORDS_END_TAG = "</FunctionWords>";
		String testWord = "";
		String[] functWords = null;
		
		try
		{
			Scanner readFile = new Scanner(new File(m_ConfigFilePath));
			
			// Get a count of how many function words there are
			int wordCount = 0;
			Boolean keepLooking = true;
			while (readFile.hasNext() && keepLooking)
			{
				// Find the opening tag
				testWord = readFile.next();
				if (FUNCTION_WORDS_START_TAG.equals(testWord))
				{
					while (readFile.hasNext() && keepLooking)
					{
						testWord = readFile.next();
						
						// If this is the closing tag then we are done counting
						if (FUNCTION_WORDS_END_TAG.equals(testWord))
						{
							keepLooking = false;
						}
						
						// Count up our words
						else
						{
							wordCount++;
						}
					}
				}
			}
			readFile.close();
			
			// Now get function words
			if (0 < wordCount)
			{
				// Allocate memory for the function word array
				functWords = new String[wordCount];
				
				// Reset the scanner to the start of the file
				readFile = new Scanner(new File(m_ConfigFilePath));
				
				// Go get each function word
				wordCount = 0;
				keepLooking = true;
				while (readFile.hasNext() && keepLooking)
				{
					testWord = readFile.next();
					
					// Find the opening tag
					if (FUNCTION_WORDS_START_TAG.equals(testWord))
					{
						while (readFile.hasNext() && keepLooking)
						{	
							testWord = readFile.next();
							
							// Find the closing tag`
							if (FUNCTION_WORDS_END_TAG.equals(testWord))
							{
								keepLooking = false;
							}
							
							// Get the next function word
							else
							{
								functWords[wordCount] = testWord;
								wordCount++;
							}
						}
					}
				}
				readFile.close();
			}
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		return functWords;
	}
	
	String[] getCussWords()
	{
	final String FUNCTION_WORDS_START_TAG = "<CurseWords>";
	final String FUNCTION_WORDS_END_TAG = "</CurseWords>";
	String testWord = "";
	String[] functWords = null;
	
	try
	{
		Scanner readFile = new Scanner(new File(m_ConfigFilePath));
		
		// Get a count of how many function words there are
		int wordCount = 0;
		Boolean keepLooking = true;
		while (readFile.hasNext() && keepLooking)
		{
			// Find the opening tag
			testWord = readFile.next();
			if (FUNCTION_WORDS_START_TAG.equals(testWord))
			{
				while (readFile.hasNext() && keepLooking)
				{
					testWord = readFile.next();
					
					// If this is the closing tag then we are done counting
					if (FUNCTION_WORDS_END_TAG.equals(testWord))
					{
						keepLooking = false;
					}
					
					// Count up our words
					else
					{
						wordCount++;
					}
				}
			}
		}
		readFile.close();
		
		// Now get function words
		if (0 < wordCount)
		{
			// Allocate memory for the function word array
			functWords = new String[wordCount];
			
			// Reset the scanner to the start of the file
			readFile = new Scanner(new File(m_ConfigFilePath));
			
			// Go get each function word
			wordCount = 0;
			keepLooking = true;
			while (readFile.hasNext() && keepLooking)
			{
				testWord = readFile.next();
				
				// Find the opening tag
				if (FUNCTION_WORDS_START_TAG.equals(testWord))
				{
					while (readFile.hasNext() && keepLooking)
					{	
						testWord = readFile.next();
						
						// Find the closing tag`
						if (FUNCTION_WORDS_END_TAG.equals(testWord))
						{
							keepLooking = false;
						}
						
						// Get the next function word
						else
						{
							functWords[wordCount] = testWord;
							wordCount++;
						}
					}
				}
			}
			readFile.close();
		}
	}
	catch (FileNotFoundException e)
	{
		e.printStackTrace();
	}
	return functWords;
	}
	
}
