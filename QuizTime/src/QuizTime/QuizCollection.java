package QuizTime;

import java.util.Scanner;
/**
 * Author Cody Schaffer
 * This class represents a list of questions. 
 */
public class QuizCollection {

	Questions[] collection;
	Answers[] collection2;
	private int count;
	private int count2;
//CONSTRUCTOR//
	public QuizCollection() {
		collection = new Questions[25];
		collection2 = new Answers[25];
		count = 0;
		count2 = 0;
	}
	/*--------------------------------------------------------------------------
	 * Returns a descriptions of the question and helps arrange the arrays. 
	 -------------------------------------------------------------------------*/
	public String toString() {
		String quizReport = "";
		quizReport += "";

		for (int questions = 0; questions < count; questions++) {
			quizReport += collection[questions].toString() + "\n";

		}
		return quizReport;
	}
	/*--------------------------------------------------------------------------
	 * makes it possible to add questions to the quiz
	 -------------------------------------------------------------------------*/
	private void increaseSize() {
		Questions[] temp = new Questions[collection.length * 2];
		for (int questions = 0; questions < collection.length; questions++)
			temp[questions] = collection[questions];

		collection = temp;

	}
	/*--------------------------------------------------------------------------
	 addQuestion adds the question to the array with an indicator 
	 -------------------------------------------------------------------------*/
	public void addQuest(String quest) {
		if (count == collection.length) {
			increaseSize();
		}
		collection[count] = new Questions(quest);
		count++;

		System.out.println(count);
	}
	/*--------------------------------------------------------------------------
	 *adds an answer listener to an array. 
	 -------------------------------------------------------------------------*/
	public void addAnswer(String answer) {
		if (count2 == collection2.length) {
			increaseSize();
		}
		collection2[count2] = new Answers(answer);
		count2++;
	}
}
