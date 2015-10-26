package edu.neumont.csc110.authordetective;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Map;
import java.util.TreeMap;
import java.util.Locale;

//-------------------------------------------------------------------------//
//Name: AuthorProfile
//
//Description: This class represents the profile of an author.
//-------------------------------------------------------------------------//
public class AuthorProfile
{
	private TreeMap<String, Integer> wordMap;
	
	private int totalWordCount;
	private int uniqueWordCount;
	private String fullName;
	private String matchName = "";
	private double matchDelta = 0;

	
	//-------------------------------------------------------------------------//
	// Name: AuthorProfile
	//
	// Description: Constructor
	//-------------------------------------------------------------------------//
	
	
	public AuthorProfile()
	{
		wordMap = new TreeMap<String, Integer>();
		reset();
	}
	
	public TreeMap<String, Integer> getWordMap()
	{
		return wordMap;
	}

	//Gives the author a name
	public void setAuthorName(String name)
	{
		fullName = name;
	}
	
	//returns the name
	public String getAuthorName()
	{
		return fullName;
	}
	
	public void setMatch (String name, double delta)
	{
		matchName = name;
		matchDelta = delta;
	}
	
	public String getMatch()
	{
		DecimalFormat fmt = new DecimalFormat("0.#######");
		String match = (matchName + " With a delta of: " + fmt.format(matchDelta));
		return match;
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
		while (null != word)
		{
			addWord(word);
			word = wordStream.next();
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
			
			// Keep track of the total number of n-grams added
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
	
	
	
	
	
	
}