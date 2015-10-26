package pack;
import java.util.Scanner;

/**
 * Author Cody Schaffer
 * this class creates the questions as objects. 
 */

public class Questions {

	private String quest;

	
//CONSTRUCTOR//	
	public Questions(String quizQuestion) {
		quest = quizQuestion;
	}

	// creates a new question.
	public String toString() {
		String description;
		description = quest;

		return description;
	}
}