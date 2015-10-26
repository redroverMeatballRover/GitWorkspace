package pack;

public class QuizRefactored {

	/**
	 * Author Cody Schaffer
	 */
	/*--------------------------------------------------------------------------
	 * This Quiz is the refactored version of the QUIZ assignment. the goal of 
	 * this assignment is to create a 2d array that allows you to choose between 
	 * easy, hard, and apocolyptic version questions.  
	 -------------------------------------------------------------------------*/
	
	public static void main(String[] args) {
Quiz questionGiver = new Quiz();
		
		System.out.print("ITS QUIZ TIME! \n");
		System.out.println("Please answer all the questions to the best of your ability. \n");
		questionGiver.giveQuiz();

	}

}
