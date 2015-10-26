package edu.neumont.csc110.authordetective;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReConfigFileReader {

	String m_configFilePath;
	
	ReConfigFileReader(String reconfigFilePath)
	{
		m_configFilePath = reconfigFilePath;
	}
	
	String getAnonymousTextPath() throws FileNotFoundException
	{
		final String ANONYMOUS_TAG_START = "<AnonymousText>";
		String path = null;
		String testword = "";
		boolean authorTagFound = false;
		
		Scanner scan = new Scanner(new File(m_configFilePath));
		while (scan.hasNext())
		{
			testword = scan.next();
			if (testword.equals ("<AnonymousText>"));
			{
				testword = scan.next();
				break;
			}
		}
		return testword;
		
	}
	
}

	
	
	
	
	
	
	

	
	