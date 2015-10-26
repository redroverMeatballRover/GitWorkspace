package pack;

import java.util.Scanner;

/**
 * Author Cody Schaffer
 * 
 * In this class, we run the Quiz.
 */

public class Quiz {
	/*--------------------------------------------------------------------------
	 * GiveQuiz runs the quiz by giving the user the questions, scanning for 
	 * their answers, securing their answers, and reporting the answers back 
	 * to the user. The User is also given the choice between easy, hard, and 
	 * apacolypse quiz.  
	 -------------------------------------------------------------------------*/
	public void giveQuiz()
	{
		QuizCollection quiz = new QuizCollection();
		String answer;
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Choose 1) for EASY QUIZ, 2) for HARD QUIZ, 3) for APACOLYPSE QUIZ");
		answer= scan.nextLine();
		
		if (answer.equalsIgnoreCase("1"))
		{
		quiz.addQuest("What is the meaning of life?", 1);
		System.out.print(quiz.collection[1][0]);
		quiz.addAnswer(scan.nextLine());
		
		quiz.addQuest("My family tree root's Love grows where?", 1);
		System.out.print( quiz.collection[1][1]);
		quiz.addAnswer(scan.nextLine());
		
		quiz.addQuest("Where are my socks?", 1);
		System.out.print( quiz.collection[1][2]);
		quiz.addAnswer(scan.nextLine());
		
		System.out.println("\n\n----------------QUIZ END----------------\n\n");
		
		System.out.println("YOUR ANSWERS--------------------------------\n");
		
		System.out.println("EASY QUIZ SCORES");
		for (int i = 0; i < 3; i++)
		{
			int t = i + 1;
			
			System.out.println( t + ". " + "You answered: " + quiz.collection2[i]);
			
		}
		}
		//----------------------------------------------------------------------------------------------
		
		if(answer.equalsIgnoreCase("2"))
		{
		quiz.addQuest("If a woman complains and no one can hear her, is she still in the kitchen?", 2);
		System.out.print( quiz.collection[2][0]);
		quiz.addAnswer(scan.nextLine());
		
		quiz.addQuest("2 + 2 + 2 = banana than why do toilets flush backwards for humpback whales?",2);
		System.out.print( quiz.collection[2][1]);
		quiz.addAnswer(scan.nextLine());
		
		quiz.addQuest("Why?", 2);
		System.out.print( quiz.collection[2][2]);
		quiz.addAnswer(scan.nextLine());
		
		quiz.addQuest("How", 2);
		System.out.print( quiz.collection[2][3]);
		quiz.addAnswer(scan.nextLine());
		
		System.out.println("\n\n----------------QUIZ END----------------\n\n");
		
		System.out.println("YOUR ANSWERS--------------------------------\n");
		
		System.out.println("HARD QUIZ SCORES");
		for (int i = 0; i < 4; i++)
		{
			int t = i + 1;
			
			System.out.println( t + ". " + "You answered: " + quiz.collection2[i]);
			
		}
		}
		//-------------------------------------------------------------------------------------------------------
		if(answer.equalsIgnoreCase("3"))
		{
		quiz.addQuest("What... is your name?", 3);
		System.out.print( quiz.collection[3][0]);
		quiz.addAnswer(scan.nextLine());
		
		quiz.addQuest("What... is your quest?", 3);
		System.out.print( quiz.collection[3][1]);
		quiz.addAnswer(scan.nextLine());
		
		quiz.addQuest("What... is the air-speed velocity of an unladen swallow?", 3);
		System.out.print( quiz.collection[3][2]);
		quiz.addAnswer(scan.nextLine());
		
		System.out.println("\n\n----------------QUIZ END----------------\n\n");
		
		System.out.println("YOUR ANSWERS--------------------------------\n");
		
		System.out.println("APOCALYPSE QUIZ SCORES");
		for (int i = 0; i < 3; i++)
		{
			int t = i + 1;
			
			System.out.println( t + ". " + "You answered: " + quiz.collection2[i]);
			
		}
		}
	}

}

