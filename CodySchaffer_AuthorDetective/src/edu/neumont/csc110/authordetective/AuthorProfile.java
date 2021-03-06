package edu.neumont.csc110.authordetective;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import java.util.Locale;


//-------------------------------------------------------------------------//
// Name: AuthorProfile
// Description: This class represents the profile of an author.
//-------------------------------------------------------------------------//
public class AuthorProfile
{
	private TreeMap<String, Integer> wordMap;
	private String authorName;
	private int totalWordCount;
	private int uniqueWordCount;
	private String codyWord;
	
	//-------------------------------------------------------------------------//
	// Name: AuthorProfile
	// Description: Constructor
	// must make a setter and a getter in order to get the author words and 
	// number of words each time. 
	//-------------------------------------------------------------------------//
	public void setAuthorName (String authname)
	{
		authorName = authname;
	}
	
	public String getAuthorName()
	{
		return authorName;
	}

	
	public AuthorProfile()
	{
		wordMap = new TreeMap<String, Integer>();
		reset();
	}


	//-------------------------------------------------------------------------//
	// Name: addStream
	//
	// Description: 
	// Adds a stream to the author profile by extracting each word from the 
	// stream, and adding it to the profile.
	//-------------------------------------------------------------------------//
	public void addStream(WordStream wordStream) throws IOException
	{
		String word = wordStream.next();
		
//		if(word is a cuss word){
//			collection.add(word);
//		}
//		
//		//the following code is not here
//		int cussWordCount = collection.length();
//		double useFrequency = cussWordCount / essayWordCount;
//		
//		//after you have the coresonding article
//		deltacalculator.getUseFreq(firstEssayCussWordFreq, secondEssayCussWordFreq);
		
		while(wordStream.hasnext()) // the hasnext method makes it possible to check for the next word. 
		{
			word = wordStream.next();
			addWord(word);
			//System.out.println (codyWord);
		}
	}
	

	//-------------------------------------------------------------------------//
	// Name: addWord
	//
	// Description: 
	// Adds a word (if it does not already exist) and increments the reference 
	// count. 
	//-------------------------------------------------------------------------//
	public void addWord(String word)
	{ 
		// Make sure the n-gram is not empty
		if ((null != word) && (0 < word.length()))
		{
			// Lowercase the word
			String lcWord = new String(word.toLowerCase(Locale.ENGLISH));
			
			// Keep track of the total number of words added
			totalWordCount++;	
			
			// Check to see if this word has already been added to the profile;
			// null will be returned if the word is not found.
			Integer wordCount = wordMap.get(lcWord);
			
			// If null is returned, this word has not been added yet occurred.
			if (null == wordCount)
			{
				wordMap.put(lcWord, 1);
				
				// Unique word count
				uniqueWordCount++;
			}
			
			// Otherwise increment and update the count for this word
			else
			{	
				wordCount++;
				wordMap.put(lcWord, wordCount);
			}
		}
	
		return;
	}

	
	//-------------------------------------------------------------------------//
	// Name: getWordCount
	//
	// Description:
	// Searches for the requested word, and returns the word count.
	//-------------------------------------------------------------------------//
	public int getWordCount(String word)
	{	
		return wordMap.get(word);
	}
	
	
	//-------------------------------------------------------------------------//
	// Name: getRelWordFreq
	//
	// Description: 
	// Returns the relative frequency of the passed in word.
	//-------------------------------------------------------------------------//
	public double getRelWordFreq(String word)
	{
		double relFreq = 0;
		
		if (0 < totalWordCount)
		{
			Integer count = wordMap.get(word);
			if (null != count)
			{
				relFreq = ((double)count / (double)totalWordCount);
			}
		}

		return relFreq;
	}


	//-------------------------------------------------------------------------//
	// Name: getTotalWordCount
	//
	// Description: 
	// Returns the total number of words that have been added to the profile.
	//-------------------------------------------------------------------------//
	public int getTotalWordCount()
	{
		return totalWordCount;
	}


	//-------------------------------------------------------------------------//
	// Name: getUniqueWordCount
	//
	// Description: 
	// Returns the number of unique words that have been added to the datastore.
	//-------------------------------------------------------------------------//
	public int getUniqueWordCount()
	{
		return uniqueWordCount;
	}
	
	public boolean wordCheck(String word) //this method is related to the cusswords class
	{
		boolean testVariable = wordMap.containsKey(word);
		return testVariable;
	}
	
	//-------------------------------------------------------------------------//
	// Name: printProfileWords
	//
	// Note: see http://stackoverflow.com/questions/1066589/java-iterate-through-hashmap
	// for details on how to iterate over the keys and values in a map (TreeMap, HashMap, ...).
	// This url was referenced in order to create this code.
	//
	// Description: 
	// Prints the words in the profile and their frequency count to the console.
	//-------------------------------------------------------------------------//
	public void printProfileWords()
	{
		for (Map.Entry<String, Integer> entry : wordMap.entrySet())
		{
			System.out.println(entry.getKey() + " occurs: " + entry.getValue() + " times.");
		}
	}
	
	
	//-------------------------------------------------------------------------//
	// Name: reset
	//
	// Description: Constructor
	//-------------------------------------------------------------------------//
	public void reset()
	{
		wordMap.clear();
		totalWordCount = 0;
		uniqueWordCount = 0;
	}
	
	/*---------------------------------------------------------------------------------------------------------------
	 * TESTING SECTION
	 * this section tests the author profile. first, it tests the addStream. if the getRelWordFreq works, it will 
	 * return a particular word more than one time. In this case, it checks for "Zerg". We check addWord next. 
	 * we add a word into the document, the word is "supercalifragilisticexpealiodocious" and if it is there once, 
	 * the system works. We check the unique word count for being more than zero. finally, we check the Word Frequency
	 * again to see the frequency of the word. Since we added supercalifragilisticexpealiodocious, we check how many
	 * times that word occurs. if it returns as the number we expect, its true. 
	 ----------------------------------------------------------------------------------------------------------------*/
	public boolean test() throws IOException
	{	
		
		boolean pass = false, test1 = false, test2 = false, test3 = false, test4 =false;
		AuthorProfile authProf = new AuthorProfile();
		ConfigFileReader cReader = new ConfigFileReader("C:\\AuthorDetective\\ConfigFiles\\Config_Anonymous_1.xml");//reads the txt.
		WordStream wrdStrm = new WordStream(cReader.getAnonymousTextPath());
		
		authProf.addStream(wrdStrm);
		
		if (authProf.getRelWordFreq("zerg") == 39); // zerg will occur 39 times in the story. 
		{
			test1 = true;
		}
		authProf.addWord("supercalifragilisticexpealiodocious");
		if (authProf.getWordCount("supercalifragilisticexpealiodocious")== 1)
		{
			test2 = true;
		}
		if (authProf.getUniqueWordCount() == 1010) // previous checks have confirmed that the uniqueWordCount = 1010 words. 
		{
			test3 = true;
		}
		if (authProf.getRelWordFreq("supercalifragilisticexpealiodocious") == 1.0)
		{
			test4 = true;
		}
		if (test1 && test2 && test3 && test4);
		{
			pass = true;
		}
		return pass;
	}
	
	
	
	
	
	
}
