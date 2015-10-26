package QuizTime;

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

	
	public String toString() {
		String description;
		description = quest;

		return description;
	}

	//----------------------------------------------------------------------------------
	//GIVE QUIZ METHOD--------------------------------------------------------------------
	
	
//	
//	public void giveQuiz()
//	{
//		QuizCollection quiz = new QuizCollection();
//		String answer;
//		Scanner scan = new Scanner(System.in);
//				
//		quiz.addQuest("What is the meaning of life?");
//		System.out.print(quiz);
//		quiz.addAnswer(scan.nextLine());
//		
//		quiz.addQuest("My family tree root's Love grows where?");
//		System.out.print( quiz.collection[1]);
//		quiz.addAnswer(scan.nextLine());
//		
//		quiz.addQuest("Where are my socks?");
//		System.out.print( quiz.collection[2]);
//		quiz.addAnswer(scan.nextLine());
//		
//		quiz.addQuest("If a woman complains and no one can hear her, is she still in the kitchen?");
//		System.out.print( quiz.collection[3]);
//		quiz.addAnswer(scan.nextLine());
//		
//		quiz.addQuest("2 + 2 + 2 = banana than why do toilets flush backwards for humpback whales?");
//		System.out.print( quiz.collection[4]);
//		quiz.addAnswer(scan.nextLine());
//		
//		quiz.addQuest("Why?");
//		System.out.print( quiz.collection[5]);
//		quiz.addAnswer(scan.nextLine());
//		
//		quiz.addQuest("How");
//		System.out.print( quiz.collection[6]);
//		quiz.addAnswer(scan.nextLine());
//		
//		quiz.addQuest("What... is your name?");
//		System.out.print( quiz.collection[7]);
//		quiz.addAnswer(scan.nextLine());
//		
//		quiz.addQuest("What... is your quest?");
//		System.out.print( quiz.collection[8]);
//		quiz.addAnswer(scan.nextLine());
//		
//		quiz.addQuest("What... is the air-speed velocity of an unladen swallow?");
//		System.out.print( quiz.collection[9]);
//		quiz.addAnswer(scan.nextLine());
//		
//		System.out.println("\n\n----------------QUIZ END----------------\n\n");
//		
//		System.out.println("YOUR ANSWERS--------------------------------\n");
//		
//		for (int i = 0; i < 10; i++)
//		{
//			int t = i + 1;
//			System.out.println( t + ". " + "You answered: " + quiz.collection2[i]);
//			
//		}
//	
//	}
	
}





