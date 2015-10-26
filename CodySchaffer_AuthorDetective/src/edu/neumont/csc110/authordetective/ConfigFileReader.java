package edu.neumont.csc110.authordetective;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

//----------------------------------------------------------------------------------------------------
//The goal of this code is to reference a file stored in the computer, read that file, find the 
//address of the Authordetective txt, return the number of of texts in the file, return the names of 
//those authors, and return the function words that we are supposed to search for. 
//----------------------------------------------------------------------------------------------------

public class ConfigFileReader {
//----------------------------------------------------------------------------------------------------
// this string is the link to the document we have saved. 
//----------------------------------------------------------------------------------------------------
	String m_configFilePath;
	
	ConfigFileReader(String configFilePath)
	{
	     	m_configFilePath = configFilePath;
	}
	
	//----------------------------------------------------------------------------------------------------
	// this object gets the path to the anonymous text portion. 
	//----------------------------------------------------------------------------------------------------
	/*String getAnonymousTextPath() throws FileNotFoundException
	{
			final String ANONYMOUS_TAG_START = "<AnonymousText>"; 	//the constant
	    	String path = null; 								  	//for now, the string path is null
	    	String testword = "";									
	    	boolean authorTagFound = false;							//checks to see if the AnonymousText has been found
	    	
	    	//Scans until it finds <AnonymousText>, then looks at the line after that to check and see if its there. 
	    	//it then breaks the loop if it is found.
	    	
			Scanner scan = new Scanner(new File(m_configFilePath)); // scans document
			while (scan.hasNext())									
			{																
				testword = scan.next(); 
				if (testword.equals("<AnonymousText>")){
					testword=scan.next();
					break;
				}
			}
			return testword; // returns anonymousText
			
			
			
	} 
	*/
	String[] getAnonymousTextPath() throws FileNotFoundException
	{
		String[] strArray= null;
		String testword = "";
		int size = 0;
		//----------------------------------------------------------------------------------------------------
		// this loop scans from the top brackets of AuthorGroup to the bottom brackets of AuthorGroop.
		// The first loop scans for how many there are. the second one increments the count and keeps 
		// returning how many there are until the brackets end. 
		//----------------------------------------------------------------------------------------------------
		Scanner scan = new Scanner (new File(m_configFilePath));
		while (scan.hasNext())
		{
			testword = scan.next(); 
			if (testword.equals("<AnonymousText>")){
				break;
			}
		}
		while(scan.hasNext())
		{
			testword = scan.next();
			if (testword.equals("</AnonymousText>")){
				break;
			}
			size++;
		}
		strArray=new String[size];
			
		//----------------------------------------------------------------------------------------------------
		// This is the second one.  
		//----------------------------------------------------------------------------------------------------
		Scanner AuthorNums = new Scanner (new File(m_configFilePath));
		while (AuthorNums.hasNext())
		{
			testword = AuthorNums.next(); 
			if (testword.equals("<AuthorGroup>")){
				break;
			}
		}
		for(int i=0;i<strArray.length;i++){
			strArray[i]=AuthorNums.next();
		}
		return strArray;			
	} 

	//----------------------------------------------------------------------------------------------------
	// this object checks the names and numbers of the author. This is an  array that goes back 
	// through the file and picks up how many instances of files there are, then goes back again 
	// and returns the names. 
	//----------------------------------------------------------------------------------------------------
	String[] getAuthorTextPaths() throws FileNotFoundException
	{
		
		
		
		
		
		String[] strArray= null;
		String testword = "";
		int size = 0;
		//----------------------------------------------------------------------------------------------------
		// this loop scans from the top brackets of AuthorGroup to the bottom brackets of AuthorGroop.
		// The first loop scans for how many there are. the second one increments the count and keeps 
		// returning how many there are until the brackets end. 
		//----------------------------------------------------------------------------------------------------
		Scanner scan = new Scanner (new File(m_configFilePath));
		while (scan.hasNext())
		{
			testword = scan.next(); 
			if (testword.equals("<AuthorGroup>")){
				break;
			}
		}
		while(scan.hasNext())
		{
			testword = scan.next();
			if (testword.equals("</AuthorGroup>")){
				break;
			}
			size++;
		}
		strArray=new String[size];
			
		//----------------------------------------------------------------------------------------------------
		// This is the second one.  
		//----------------------------------------------------------------------------------------------------
		Scanner AuthorNums = new Scanner (new File(m_configFilePath));
		while (AuthorNums.hasNext())
		{
			testword = AuthorNums.next(); 
			if (testword.equals("<AuthorGroup>")){
				break;
			}
		}
		for(int i=0;i<strArray.length;i++){
			strArray[i]=AuthorNums.next();
		}
		return strArray;		
	}  
	
	
	//----------------------------------------------------------------------------------------------------
	// Enact the same code in order to find the function words. Change the AuthorGroup to be 
	// FunctionWords instead. 
	// 
	// P.S. This is how to do an array where hardcoding the exact number of files, authors, 
	// and function words is unknown. 
	//----------------------------------------------------------------------------------------------------
	String[] getFunctionWords() throws FileNotFoundException
	{
		String[] strArray= null;
		String testword = "";
		int size = 0;
		Scanner scan = new Scanner (new File(m_configFilePath));
			while (scan.hasNext())
			{
				testword = scan.next(); 
				if (testword.equals("<FunctionWords>")){
					break;
				}
			}
			while(scan.hasNext())
			{
				testword = scan.next();
				if (testword.equals("</FunctionWords>")){
					break;
				}
				size++;
			}
			strArray=new String[size];
			
		//do it again to return the names of the authors
		Scanner AuthorNums = new Scanner (new File(m_configFilePath));
		while (AuthorNums.hasNext())
		{
			testword = AuthorNums.next(); 
			if (testword.equals("<FunctionWords>")){
				break;
			}
		}
		for(int i=0;i<strArray.length;i++){
			strArray[i]=AuthorNums.next();
		}
				
		return strArray;
	}
	
	
	
	String[] getAuthorCursePaths() throws FileNotFoundException
	{
		String[] strArray= null;
		String testword = "";
		int size = 0;
		//----------------------------------------------------------------------------------------------------
		// this loop scans from the top brackets of AuthorGroup to the bottom brackets of AuthorGroop.
		// The first loop scans for how many there are. the second one increments the count and keeps 
		// returning how many there are until the brackets end. 
		//----------------------------------------------------------------------------------------------------
		Scanner scan = new Scanner (new File(m_configFilePath));
		while (scan.hasNext())
		{
			testword = scan.next(); 
			if (testword.equals("<AuthorGroup>")){
				break;
			}
		}
		while(scan.hasNext())
		{
			testword = scan.next();
			if (testword.equals("</AuthorGroup>")){
				break;
			}
			size++;
		}
		strArray=new String[size];
			
		//----------------------------------------------------------------------------------------------------
		// This is the second one.  
		//----------------------------------------------------------------------------------------------------
		Scanner AuthorNums = new Scanner (new File(m_configFilePath));
		while (AuthorNums.hasNext())
		{
			testword = AuthorNums.next(); 
			if (testword.equals("<AuthorGroup>")){
				break;
			}
		}
		for(int i=0;i<strArray.length;i++){
			strArray[i]=AuthorNums.next();
		}
		return strArray;		
	}  
	
	//get the curse words. 
	
	String[] getCurseWords() throws FileNotFoundException
	{
		String[] strArray= null;
		String testword = "";
		int size = 0;
		Scanner scan = new Scanner (new File(m_configFilePath));
			while (scan.hasNext())
			{
				testword = scan.next(); 
				if (testword.equals("<CurseWords>")){
					break;
				}
			}
			while(scan.hasNext())
			{
				testword = scan.next();
				if (testword.equals("</CurseWords>")){
					break;
				}
				size++;
			}
			strArray=new String[size];
			
		//do it again to return the names of the authors
		Scanner AuthorNums = new Scanner (new File(m_configFilePath));
		while (AuthorNums.hasNext())
		{
			testword = AuthorNums.next(); 
			if (testword.equals("<CurseWords>")){
				break;
			}
		}
		for(int i=0;i<strArray.length;i++){
			strArray[i]=AuthorNums.next();
		}
				
		return strArray;
	}
	
	
	
	
	
	
	
	
	//----------------------------------------------------------------------------------
	// TESTING CODE
	//----------------------------------------------------------------------------------
	
	/*---------------------------------------------------------------------------------------------------------------
	 * TESTING SECTION
	 * tests the configFileReader. the first thing the test does is look in the annonymousTextPath to see if it works. 
	 * it checks to see if the ANON_TEXT_PATH = cReader.getAnonymousTextPath. 
	 * next, it checks to see if the author text path = the txt for the first author.
	 * finally, it checks for at least one function word. 
	 ----------------------------------------------------------------------------------------------------------------*/
	public boolean test() throws IOException
	{	
		boolean pass = false, test1 = false, test2 = false, test3 = false;
		
		final String ANON_TEXT_PATH = "c:\\AuthorDetective\\Anonymous\\anonymous01.txt";
		ConfigFileReader cReader = new ConfigFileReader("C:\\AuthorDetective\\ConfigFiles\\Config_Anonymous_1.xml");//reads the txt.
	
		if (ANON_TEXT_PATH.equals(cReader.getAnonymousTextPath()))
		{
			test1 = true;
		}
		
		final String AUTHOR_TEXT_PATH = "c:\\AuthorDetective\\AuthorGroup\\author01.txt";
		ConfigFileReader bReader = new ConfigFileReader("C:\\AuthorDetective\\ConfigFiles\\Config_Anonymous_1.xml");//reads the txt.
		
		if (AUTHOR_TEXT_PATH.equals("c:\\AuthorDetective\\AuthorGroup\\author01.txt"))
		{
			test2 = true;
		}
		
		final String funct_word1 = "a";
		ConfigFileReader dReader = new ConfigFileReader("C:\\AuthorDetective\\ConfigFiles\\Config_Anonymous_1.xml");//reads the txt.
	
		if (funct_word1.equals(dReader.getFunctionWords()[0]))
		{
			test3 = true;
		}
		
		if (test1 && test2 && test3 == true)
		{
			pass = true;
		}
		return pass;
	}
}

