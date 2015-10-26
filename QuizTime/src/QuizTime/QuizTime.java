package QuizTime;

import java.util.Scanner;

public class QuizTime {

	/**
	 * Author Cody Schaffer
	 */
	/*--------------------------------------------------------------------------
	 * The goal of this assignment is to create quiz with the add method 
	 * and arrays that allow you to take a quiz that aaccepts answers.   
	 -------------------------------------------------------------------------*/
	public static void main(String[] args) {
	
		Quiz questionGiver = new Quiz();
		
		System.out.print("ITS QUIZ TIME! \n");
		System.out.println("Please answer all the questions to the best of your ability. \n");
		questionGiver.giveQuiz();

	}
}
