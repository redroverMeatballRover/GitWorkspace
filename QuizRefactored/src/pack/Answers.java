package pack;

import java.util.Scanner;

/**
 * Author Cody Schaffer
 * this class creates a object for each answer. 
 */

public class Answers {

	private String answers;
	Scanner scan = new Scanner(System.in);
	
	
	public Answers(String answers)
	{
		this.answers = answers;
	}
	
	public String toString()
	{
		String answerDescription;
		answerDescription = answers;
		
		return answerDescription;
		
	}
		
}
