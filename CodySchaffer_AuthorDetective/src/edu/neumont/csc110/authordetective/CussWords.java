package edu.neumont.csc110.authordetective;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

public class CussWords 

{
	/*-----------------------------------------------------------------------------------------
	 * 1. Instatiate WordStream, and the reader of the txt document
	 * 2. Take from AuthorProfile and to build the story
	 * 3. check a list of cuss words in a string array to see if any cuss words are present
	 * 
	 * return:
	 * 1. the list of cuss words in each document
	 * 2. the frequency of the those cuss words. 
	 * 3. how many cuss words are found in each document. 
	 * 
	 * 
	 * 
	 * Private int explictCount;
	Public void checkExplict()
	Public int getExplictCount()

	 ----------------------------------------------------------------------------------------*/
	
	
	/*-----------------------------------------------------------------------------------------
	 * hoo boy. 
	 * 
	 * this method checks if there are any curse words in the documents. 
	 ----------------------------------------------------------------------------------------*/
	
	public void checkCurse() throws IOException
	{
		final String CONFIG_FILE_PATH = "C:\\AuthorDetective\\ConfigFiles\\Config_Anonymous_1.xml"; //path to the files. 
		ConfigFileReader configFileReader = new ConfigFileReader(CONFIG_FILE_PATH);//reads the txt.		
		
		String[] anonText = configFileReader.getAnonymousTextPath();
		WordStream wordStream = new WordStream(anonText[0]); //reads the story
		AuthorProfile authProf = new AuthorProfile(); // grabs the AuthorProfile
		authProf.addStream(wordStream);//gets the addStream from AuthorProfile
		
		
		
		HashMap<String, Integer> theMap = new HashMap<>(); // GOOD GOD YOU NEED TO REVIEW THESE, basically, the hashmap holds your entire curseword list.
		String[] testing = configFileReader.getCurseWords(); // the string Testing is now the entire curseword list. 
		//String[] someCurseWords = configFileReader.getCurseWords();
		String[] authorPaths = configFileReader.getAuthorTextPaths();
		
		//boolean someCurseWords = true;
		
		int count = 0;
		for (int i = 0; i < testing.length; i++) // this loop goes through the entire curseword list, until it gets to the end of the list, it continues to increment. 
		{
					if (authProf.wordCheck(testing[i])) // no idea how this works
					{	
						theMap.put(testing[i], authProf.getWordCount(testing[i]));
						count++;
					}
					
					else 
					{
						System.out.println(" This word does not appear in the text: " + testing[i] );
					}
					
	
					
		}
		
		System.out.println(theMap);	
		System.out.println("this is the curse word count:" + count);
	}	
	//----------------------------------------------------
	//list the authors.
	
	/*public void findAuthors() throws IOException
	{
		final String CONFIG_FILE_PATH = "C:\\AuthorDetective\\ConfigFiles\\Config_Anonymous_1.xml"; //path to the files. 
		ConfigFileReader configFileReader = new ConfigFileReader(CONFIG_FILE_PATH);//reads the txt.		
		
		WordStream wordStream = new WordStream(configFileReader.getAnonymousTextPath()); //reads the story
		AuthorProfile authProf = new AuthorProfile(); // grabs the AuthorProfile
		authProf.addStream(wordStream);//gets the addStream from AuthorProfile
		
		HashMap<String, Integer > theMap1 = new HashMap<>(); // GOOD GOD YOU NEED TO REVIEW THESE, basically, the hashmap holds your entire author list.
		//String[] needToGetAllTheAuthors = configFileReader.getAuthorTextPaths(); // the string needtogetalltheauthors is now the entire author list. 
		String[] testing = configFileReader.getCurseWords();
		
		System.out.println("lookit me!!!!" + testing);
		
		//System.out.println(needToGetAllTheAuthors);
		
		int cussWordCount = 0;
		for(int j = 0; j < authProf.getTotalWordCount(); j++)
		{
			for (int i = 0; i < 15; i++) // this loop goes through the entire cuss word list, until it gets to the end of the list, it continues to increment. 
			{		
				if (authProf.wordCheck(testing[i])) 
				{	
//					theMap1.put(testing[i], authProf.getWordCount(needToGetAllTheAuthors[i]));
					if(theMap1.containsKey(testing[i])){
						//do whatever you want
						System.out.println(cussWordCount);
						cussWordCount++;
					}
				}
			}
		}
		
		

		
		
	}*/
}
