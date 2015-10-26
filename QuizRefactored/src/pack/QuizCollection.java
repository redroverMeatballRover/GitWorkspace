package pack;

import java.util.Scanner;

/**
 * Author Cody Schaffer
 * This class represents a list of questions. 
 */

public class QuizCollection {

	Questions[][] collection;
	Answers[] collection2;
	private int count;
	private int count2;

	// CONSTRUCTOR//
	public QuizCollection() {
		collection = new Questions[4][25];
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
	private void increaseSize(int difficulty) {
		Questions[] temp = new Questions[collection.length * 2];
		for (int questions = 0; questions < collection.length; questions++)
			temp[questions] = collection[difficulty][questions];

		collection[difficulty] = temp;

	}
	/*--------------------------------------------------------------------------
	 * adds a question to the array. This method is overloaded for the 2d array.
	 * this makes it possible to grab the second pieces of the array. We add 
	 * the difficulty part of the array here.
	 -------------------------------------------------------------------------*/
	public void addQuest(String quest, int difficulty) {
		if (count == collection.length) {
			increaseSize(difficulty);
		}
		collection[difficulty][count] = new Questions(quest);
		count++;

		System.out.println(count);
	}
	/*--------------------------------------------------------------------------
	 *original addQuestion, it adds the question to the array with an indicator
	 *of zero in order for all the questions to be a part of. 
	 -------------------------------------------------------------------------*/
	public void addQuest(String quest) {
		if (count == collection.length) {
			increaseSize(0);
		}
		collection[0][count] = new Questions(quest);
		count++;

		System.out.println(count);
	}
	/*--------------------------------------------------------------------------
	 *allows a scanner to be added for the user.
	 -------------------------------------------------------------------------*/
	public void addAnswer(String answer) {
		if (count2 == collection2.length) {
			increaseSize(0);
		}
		collection2[count2] = new Answers(answer);
		count2++;
	}
}
