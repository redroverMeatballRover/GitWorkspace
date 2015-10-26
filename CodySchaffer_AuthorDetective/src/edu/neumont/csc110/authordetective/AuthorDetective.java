package edu.neumont.csc110.authordetective;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
//----------------------------------------------------------------------------------------------------
// This code references another Java Project called ConfigFileReader that does all the grunt work
// of the code. Author Detective simply prints and calls methods in order to obtain info out of 
// them.
//
// The goal of this code is to reference a file stored in the computer, read that file, find the 
// address of the Authordetective txt, return the number of of texts in the file, return the names of 
// those authors, and return the function words that we are supposed to search for. 
//
// we have also added a delta calculator. 
//----------------------------------------------------------------------------------------------------
import java.io.IOException;

public class AuthorDetective {
	
	//----------------------------------------------------------------------------------------------------
	// This code prints out our authors and stories. It is being built upon. 
	//----------------------------------------------------------------------------------------------------	
	public static void main(String[] args) throws IOException
	{
		// To print out ALL results, simply un-comment each method. 
		
		//configReader();
		//wordStream();
		//authorProfile();
		
		//deltaCalculator();
		//runUnitTest();
		//cussWords();
		
		
			
		
		//WordStream newWordStream = new WordStream(configFileReader.getAnonymousTextPath());
		//newWordStream.test();
		
		CussWords cussWords = new CussWords();
		cussWords.checkCurse(); // because the CussWords Class has a println statement in it, we don't need to have it say println here. 
//		cussWords.findAuthors();
		
		final String CONFIG_FILE_PATH = "C:\\AuthorDetective\\ConfigFiles\\Config_Anonymous_1.xml";	
		ConfigFileReader configFileReader = new ConfigFileReader(CONFIG_FILE_PATH);
			
		
		
		// Instantiate an anonymous profile
		AuthorProfile anonymousProfile = new AuthorProfile();
		anonymousProfile.setAuthorName("Anonymous");
		String[] testing = configFileReader.getCurseWords();
		


		// Get the anonymous text path from the ConfigFileReader
		String[] anonymousPath = configFileReader.getAnonymousTextPath();

		
		// Instantiate a WordStream class and pass it the anonymous text path as a parameter
		// for the constructor.	
		WordStream wordStream = new WordStream(anonymousPath[0]);
	

		// Add the WordStream to the anonymousProfile by using the addStream method
		anonymousProfile.addStream(wordStream);
				
		// Instantiate a delta calculator
		DeltaCalculator deltaCalc = new DeltaCalculator();

						
		// Get the author training text paths from the configFileReader and assign it to authorPaths.
		String[] authorPaths = configFileReader.getAuthorTextPaths();

		
		// This is a for loop that repeats for each author
		for (int authorCount = 0; authorCount < authorPaths.length; authorCount++)
		{	
			// Instantiate an AuthorProfile for this author and assign it to authorProfile
			 AuthorProfile authorProfile = new AuthorProfile();

			// set the path as the author name.
			authorProfile.setAuthorName(authorPaths[authorCount]);
			

			// Instantiate a WordStream class and pass it the author's text path 
			// as a parameter to the WordStream constructor.	
			WordStream authorStream = new WordStream(authorPaths[authorCount]);

			// Add the WordStream to this authors AuthorProfile.
			anonymousProfile.addStream(authorStream);

			
			// Calculate a delta based on how frequently this author uses function words
			// and how frequently function words are used in the anonymous text.
			String[] functWords = configFileReader.getFunctionWords();
			
			
			deltaCalc.reset();
			for (int wordCount = 0; wordCount < functWords.length; wordCount++)
			{
				
				// Get the next function word 
				String functionWord = functWords[wordCount];

				
				// Get the relative frequency of use for this function word
				double anonyFreq = anonymousProfile.getRelWordFreq(functionWord);


				// Get the relative frequency of use for this function word
				double authorFreq = authorProfile.getRelWordFreq(functionWord);


				//compare the use frequency and calculate 
				deltaCalc.addComparison(anonyFreq, authorFreq);
					
			}
			System.out.println("This is the average of the cuss words: " + deltaCalc.getAvgDelta() + " in the story " + authorPaths[authorCount]);
		}
		
	}
	
	public static void configReader()throws IOException
	{
		//----------------------------------------------------------------------------------------------------
		//this references the Author detective txt we have saved. 
		//----------------------------------------------------------------------------------------------------
		final String CONFIG_FILE_PATH = "C:\\AuthorDetective\\ConfigFiles\\Config_Anonymous_1.xml";
		ConfigFileReader configFileReader = new ConfigFileReader(CONFIG_FILE_PATH);//reads the txt.
		
		//----------------------------------------------------------------------------------------------------
		//configFileReader.getAnonymousTextPath() = the path to the actual story. You use this in 
		//the wordstream String in order to find the story, read it, and print each words. 
		//----------------------------------------------------------------------------------------------------
		configFileReader.getAnonymousTextPath();
		System.out.println (configFileReader.getAnonymousTextPath());
		String[] authors = configFileReader.getAuthorTextPaths(); // references the authors array
		for (String author: authors)//returns the number of authors each time
		{
			System.out.println(author);//prints it
		}
		
		
		String[] words = configFileReader.getFunctionWords();
		for (String word: words)//returns the number of function words
		{
			System.out.println(word);//prints it
		
		}
		
		String[] words2 = configFileReader.getCurseWords();
		System.out.println("\nThese are the DEFINING Curse Words");
		for (String word: words2)//returns the number of function words
		{
			System.out.println(word);//prints it
		
		}
			
	}
	
//	public static void wordStream() throws IOException
//	{
//		//----------------------------------------------------------------------------------------------------------
//		// WordStream references the WordStream.java project. It reads the methods there and prints all the words. 
//		//----------------------------------------------------------------------------------------------------------
//		final String CONFIG_FILE_PATH = "C:\\AuthorDetective\\ConfigFiles\\Config_Anonymous_1.xml";
//		ConfigFileReader configFileReader = new ConfigFileReader(CONFIG_FILE_PATH);//reads the txt.		
//		
//		WordStream newWordStream = new WordStream(configFileReader.getAnonymousTextPath());
//				
//		//prints the words
//		System.out.println ("\nThe words of the story are: " );
//		String codyWord = null;
//	
//		while((codyWord = newWordStream.next()) != null && !codyWord.equals("")) // as long as the word does not = null and word
//		{
//			System.out.println (codyWord);
//		}
//	}
//		
//	
//	//----------------------------------------------------------------------------------------------------------
//	// This tests the author profile. First we read the file and return it so we can read it. 
//	// next we announce it, and set it to "anonymous". 
//	//----------------------------------------------------------------------------------------------------------
//	public static void authorProfile() throws IOException
//	{
//		final String CONFIG_FILE_PATH = "C:\\AuthorDetective\\ConfigFiles\\Config_Anonymous_1.xml";
//		ConfigFileReader configFileReader = new ConfigFileReader(CONFIG_FILE_PATH);//reads the txt.		
//		
//		AuthorProfile anonymous = new AuthorProfile();
//		anonymous.setAuthorName("Anonymous");
//		
//		anonymous.addStream(new WordStream(configFileReader.getAnonymousTextPath));
//		//----------------------------------------------------------------------------------------------------------
//		// prints out the author profile identity, the unique word count, the total word count,
//		// the frequency of the function words, and then the rest of the words. 
//		//----------------------------------------------------------------------------------------------------------
//		System.out.println("\n\nAuthor Profile for : " + anonymous.getAuthorName());
//	    System.out.println("Unique Word Count : " + anonymous.getUniqueWordCount());
//	    System.out.println("Total Word Count : " + anonymous.getTotalWordCount());
//	   
//	    	double and = anonymous.getRelWordFreq("and");
//	    	double or = anonymous.getRelWordFreq("or");
//	    	double is =anonymous.getRelWordFreq("is");
//	    	double the =anonymous.getRelWordFreq("the");
//	    	double to =anonymous.getRelWordFreq("to");
//	
//	    DecimalFormat format = new DecimalFormat("#.#####");
//	
//	    System.out.println("Frequancy's" +
//	    		"\nand : " + format.format(and) +
//	    		"\nor : " + format.format(or) +
//	    		"\nis : " + format.format(is) +
//	    		"\nthe : " + format.format(the) +
//	    		"\nto : " + format.format(to));
//	    System.out.println("\n\nRest of word freq"); //prints all of the unique words
//	   
//	    anonymous.printProfileWords();
//	}	
//
//	//---------------------------------------------------------------------
//	/* DeltaCalculator calculates a delta between each author profile and 
//	 * the anonymous text profile based on the function words in the 
//	 * config file. 
//	 */
//	//---------------------------------------------------------------------
//	public static void deltaCalculator() throws IOException
//	{
//		final String CONFIG_FILE_PATH = "C:\\AuthorDetective\\ConfigFiles\\Config_Anonymous_1.xml";
//		ConfigFileReader configFileReader = new ConfigFileReader(CONFIG_FILE_PATH);//reads the txt.	
//		
//		AuthorProfile anonymous = new AuthorProfile();
//		anonymous.setAuthorName("Anonymous");
//		anonymous.addStream(new WordStream(configFileReader.getAnonymousTextPath()));
//		
//				
//		//------------------------------------------------------------------------------------------------------
//		/* 1) First, we instantiate a delta calculator. 2) We then get the author training text paths from the 
//		 * configFileReader, and assign it to authorPaths. 3) A FOR loop repeats for each author to retrieve the name. 
//		 * 
//		 * 4) in the FOR loop, we instantiate an AuthorProfile for this author and assign it to authorProfile.
//		 * 5) since the path contains the name of the author (ie author1), set the path as the author name.  
//		 * 6) instantiate a WordStream class and pass it to the author's text path as a parameter to the WordStream Constructor. 
//		 * 
//		 * 7) This adds the WordStream to this authors AuthorProfile (the addStream() method in the AuthorProfile)
//		 * 
//		 * 8) Calculate a delta based on how frequently this author uses function words and how frequently function 
//		 * 	  words are used in the anonymous text.
//		 * 
//		 * Within the second FOR LOOP:
//		 * 9) gets the next function word. 
//		 * 10) Gets the relative frequency of use for this function word from the anonymousProfile.
//		 * 11) Get the relative frequency of use for this function word from the authorProfile. 
//		 * 12) we use the addComparison() method on the DeltaCalculator object to add a comparison based on 
//		 *     how frequently the anonymous text uses this funct word and how frequently this author uses this
//		 *     funct word.
//		 */
//		//------------------------------------------------------------------------------------------------------
//		
//		DeltaCalculator deltaCalc = new DeltaCalculator(); 										// 1
//		String[] authorPaths = configFileReader.getAuthorTextPaths(); 							// 2
//		
//		for (int authorCount = 0; authorCount < authorPaths.length; authorCount++) 				// 3
//		{	
//			AuthorProfile authorProfile = new AuthorProfile(); 									// 4
//			authorProfile.setAuthorName(authorPaths[authorCount]);								// 5
//		
//			WordStream wrdStrm = new WordStream(authorPaths[authorCount]);						//6
//			authorProfile.addStream(wrdStrm); 													// 7
//		
//			String[] functWords = configFileReader.getFunctionWords();							// 8
//			deltaCalc.reset(); // this resets the calculator. 
//			
//			String[] curseWords = configFileReader.getCurseWords();
//			deltaCalc.reset();
//			
//			for (int wordCount = 0; wordCount < curseWords.length; wordCount++)
//			{
//				//String word = functWords[wordCount]; 											// 9  
//				//double anonyFreq = anonymous.getRelWordFreq(word);				 			    // 10 
//				//double authorFreq = authorProfile.getRelWordFreq(word); 						// 11
//				//deltaCalc.addComparison(authorFreq, anonyFreq);								    // 12
//				
//				String Word = curseWords[wordCount];
//				double anonyFreq = anonymous.getRelWordFreq(Word);				 			    
//				double authorFreq = authorProfile.getRelWordFreq(Word); 						
//				deltaCalc.addComparison(authorFreq, anonyFreq);	
//				
//			}
//		
//			//--------------------------------------------------------------------------------------------------------------------
//			/* finally, we print out the author name, and the delta between this author and the anonymous text. 
//			 * The delta is found from the getAvgDelta() method in DeltaCalculator. We use the Decimal format to 
//			 * get the decimal. 
//			 * -------------------------------------------------------------------------------------------------------------------
//			 */	
//			DecimalFormat fmt = new DecimalFormat ("0.#######"); 
//			
//			System.out.println("test 1");
//			System.out.println("This is the profile: " + authorProfile.getAuthorName());
//			System.out.println("test 2");
//			System.out.println("This is the delta: " + fmt.format(deltaCalc.getAvgDelta()));	
//		}	
//	}
//	
//	public void cussWords() throws IOException
//	{
//		final String CONFIG_FILE_PATH = "C:\\AuthorDetective\\ConfigFiles\\Config_Anonymous_1.xml";
//		ConfigFileReader configFileReader = new ConfigFileReader(CONFIG_FILE_PATH);//reads the txt.	
//		
//		AuthorProfile anonymous = new AuthorProfile();
//		anonymous.setAuthorName("Anonymous");
//		anonymous.addStream(new WordStream(configFileReader.getAnonymousTextPath()));
//		
//		CussWords csWrds = new CussWords();
//		
//		
//		
//		
//	}
//
//	/*---------------------------------------------------------------------------------------------------------------
//	 * TESTING SECTION
//	 * The runUnitTest is meant to call all the other testing methods in the other classes and test them all. 
//	 * We call them, see if they return true, and print the correct line for success, if it fails, print the correct
//	 * line for failure. 
//	 ----------------------------------------------------------------------------------------------------------------*/
//	public static boolean runUnitTest() throws IOException // testing method. 	
//	{
//		boolean pass = false, test1 = false, test2 = false, test3 = false, test4 =false;
//		WordStream wrdStrm = new WordStream("C:\\AuthorDetective\\ConfigFiles\\Config_Anonymous_1.xml");
//		
//		if (wrdStrm.test() == true)
//		{
//			test1 = true;
//			System.out.println("WordStream Status: Success");
//		}
//		else
//		{
//			System.out.println("The Wordstream Test Failed.");
//		}
//	
//		ConfigFileReader conRead = new ConfigFileReader("C:\\AuthorDetective\\ConfigFiles\\Config_Anonymous_1.xml");
//		if (conRead.test() == true)
//		{
//			test2 = true;
//			System.out.println("ConfigFileReader Status: Success.");
//		}
//		else
//		{
//			System.out.println("The ConfigFileReader Test Failed.");
//		}
//		
//		DeltaCalculator deltCalcTest = new DeltaCalculator();
//		if (deltCalcTest.test12() == true)
//		{
//			test3 = true;
//			System.out.println("DeltaCalculator Status: Success.");
//		}
//		else
//		{
//			System.out.println("The DeltaCalculator Test Failed.");
//		}
//	
//		AuthorProfile authProvo = new AuthorProfile();
//		if (authProvo.test() == true)
//		{
//			test4 = true;
//			System.out.println("AuthorProfile Status: Success.");
//		}
//		else
//		{
//			System.out.println("The AuthorProfile Test Failed.");
//		}
//		
//		if (test1 && test2 && test3 && test4);
//		{
//			pass = true;
//		}
//		
//		return pass;
//	}
//
//




}














