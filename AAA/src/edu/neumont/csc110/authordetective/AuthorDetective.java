package edu.neumont.csc110.authordetective;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Map;
import java.util.TreeMap;

// this class grabs a author text and compairs it to the anonymous texts then returns the difference between the documents as the println

//------------------------------------------------------
// I am keeping most of the instruction comments because 
// 1: they are valid
// 2: they will really help when i refer back to this code at any time in future
//-----------------------------------------------------
public class AuthorDetective
{
	
	/**
	 * This program attempts to classify an anonymous text with an author
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException
	{
		
		
		//---------------------------------------------------------------------
		// Create an Anonymous Author Profile
		//---------------------------------------------------------------------
		
		final String CONFIG_FILE_PATH = "C:\\AuthorDetective\\ConfigFiles\\Config_Anonymous_1.xml";
		
		ConfigFileReader configFileReader = new ConfigFileReader(CONFIG_FILE_PATH);
//			
		// Instantiate an anonymous profile
		// Get the anonymous text path from the ConfigFileReader
		String[] anonymousTextPath = configFileReader.getAnonymousTextPath();
		

		// loop to cycle through all of the anonymous text documents which will compaire all of them to all 
		for (int anonCount = 0; anonCount < anonymousTextPath.length; anonCount++)
		{
			AuthorProfile anonymousProfile = new AuthorProfile();
			anonymousProfile.setAuthorName("AnonymousAuthor_" + (anonCount+1));
			
			// Instantiate a WordStream class and pass it the anonymous text path as a parameter
			WordStream wordStream = new WordStream(anonymousTextPath[anonCount]);
			//
		
			//-----------------------------------------------------------------------------
			// CUSS WORD HELP: this helps calculate the cuss words and number them for each 
			// anonymousProfile. 
			//-----------------------------------------------------------------------------
			anonymousProfile.addStream(wordStream);
			
			int cussWordCount = 0; //set counter
			//String cussAuthor = null; 			//MY CODE
//			int newAuthorProfanityCount = 0;		//MY CODE
//			boolean cussHappened = false;			//MY CODE
//			String authorsWithProfaneLanguage = ""; //MY CODE
			TreeMap<String, Integer> words = anonymousProfile.getWordMap(); // fucking treemap. you must get the word map. 
			for(Map.Entry<String, Integer > word :  anonymousProfile.getWordMap().entrySet()) // 
				{ 
				if(WordStream.countCussWords(word.getKey())){
					cussWordCount++;
					
					//------------------------------------------------------------------------------------
					// TEST: trying to isolate anonymous that have cuss words
					//-------------------------------------------------------------------------------------
//					if (cussWordCount > 0)
//					{
//						//cussAuthor = anonymousProfile.getAuthorName();
//						cussHappened = true;
//						System.out.println("it worked");
//		
//						for  (newAuthorProfanityCount = 0; cussHappened = true; newAuthorProfanityCount++)
//						{
//							authorsWithProfaneLanguage = anonymousProfile.getAuthorName();
//						}
//						
//					}
//					else
//					{
//						System.out.println("nothing here");
//					}
					//MY CODE
				}
			}
			
			System.out.println(anonymousProfile.getAuthorName() + " " + cussWordCount); // Yung Yi code
			//System.out.println("Authors with curse words: " + newAuthorProfanityCount + " \n These are the authors: " + authorsWithProfaneLanguage );
			//System.out.println(anonymousProfile.getAuthorName() + " issued profanity: " + cussAuthor + " this many times " + cussWordCount ); //MY CODE
		

			
			
			//---------------------------------------------------------------------------------------------------
			// PRINT OUT THE FINDINGS OF THE EXPERIMENT. 
			//-----------------------------------------------------------------------------------------------------
			
			//---------------------------------------------------------------------
			// Calculate a delta between each author profile and the anonymous text
			// profile based on the function words in the config file:  
			//---------------------------------------------------------------------
			DeltaCalculator deltaCalculator = new DeltaCalculator();
	
							
			// Get the author training text paths from the configFileReader and assign it to authorPaths.
			String[] authorPaths = configFileReader.getAuthorTextPaths();
	
			String matchName = "";
			double delta = 1;
			
			// This is a for loop that repeats for each author
			for (int authorCount = 0; authorCount < authorPaths.length; authorCount++)
			{	
				// Instantiate an AuthorProfile for this author and assign it to authorProfile
				AuthorProfile authorProfile = new AuthorProfile();
				
	
				// Since the path contains the name of the author (i.e. author1),
				// set the path as the author name.
				authorProfile.setAuthorName("Author_" + (authorCount + 1));
				
				// Instantiate a WordStream class and pass it the author's text path 
				// as a parameter to the WordStream constructor.	
				WordStream authPathsWordStream = new WordStream(authorPaths[authorCount]);
				//
				//
				//
				//
				//
			
				//adding stream to the profile
				authorProfile.addStream(authPathsWordStream);
				
				//---------------------------------------------------------------------------------------------------
				// CUSS WERDS
				//-----------------------------------------------------------------------------------------------------
				//count cuss words
				int cussWerdsCount = 0;
				for(Map.Entry<String, Integer> word :  authorProfile.getWordMap().entrySet()){
					if(WordStream.countCussWords(word.getKey())){
						cussWerdsCount++;
					}
				}
				
				System.out.println(authorProfile.getAuthorName() + " cusswords: " + cussWerdsCount);
				
				//---------------------------------------------------------------------------------------------------
				// PRINT OUT THE FINDINGS OF THE EXPERIMENT. 
				//-----------------------------------------------------------------------------------------------------
	
				// Calculate a delta based on how frequently this author uses function words
				// and how frequently function words are used in the anonymous text.
				String[] functWords = configFileReader.getFunctionWords();
				deltaCalculator.reset();
				for (int wordCount = 0; wordCount < functWords.length; wordCount++)
				{
					
					// Get the next function word
					String functionWord = functWords[wordCount];
	
					// Get the relative frequency of use for this function word
					// from the anonymousProfile and authorProfile.
					double anon = anonymousProfile.getRelWordFreq(functionWord);
					double auth = authorProfile.getRelWordFreq(functionWord);
					
					//compair the function word freq between anonymous and author profiles
					deltaCalculator.addComparison(anon, auth);
				}
				
				//---------------------------------------------------------------------------------------------------
				// CUSS
				//-----------------------------------------------------------------------------------------------------
				DeltaCalculator cussCalc = new DeltaCalculator();
				String[] allTheCussWords = configFileReader.getCussWords();
				cussCalc.reset();
				for (int cuss = 0; cuss < allTheCussWords.length; cuss++)
				{
					String cussWrd = allTheCussWords[cuss];
					
					// Get the relative frequency of use for this function word
					// from the anonymousProfile and authorProfile.
					double anon = anonymousProfile.getRelWordFreq(cussWrd);
					double auth = authorProfile.getRelWordFreq(cussWrd);
					
					
					//compair the function word freq between anonymous and author profiles
					cussCalc.addComparison(anon, auth);
				}
				
				
				// Print out the author name, and the delta between this author and the anonymous text.
				
				double functDelta = deltaCalculator.getAvgDelta();
				double cussDelta = cussCalc.getAvgDelta();
				double currentDelta = ((functDelta+cussDelta)/2);
				
				// to get whatever the lowest delta is from all of the results and set it to some instance variables, which will be send to the profile in a sec
				if(currentDelta < delta)
				{
					delta = currentDelta;
					matchName = authorProfile.getAuthorName();
				}
				if (currentDelta == delta && !authorProfile.getAuthorName().equals(matchName))
				{
					matchName = (matchName + " and " + authorProfile.getAuthorName() + " equally");
				}
				}
			
				anonymousProfile.setMatch(matchName, delta);// save the match to the anonymous object incase i ever need future refrence
				//System.out.println(anonymousProfile.getAuthorName()+ " <-Is similar to -> " + anonymousProfile.getMatch()); // print result for this anonymous text match
			}
		
	
		}
}