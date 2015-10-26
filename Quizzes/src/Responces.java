import java.util.Scanner;

/**
 * 
 */

/**
 * @author dmaldonado
 *
 */
public class Responces extends QuizExceptions
{
	Scanner scan = new Scanner(System.in);
	private String responce;
	protected double totalScore = 0;
	private int add=0;
	
	private String[] responces={"run","mario","mario","mario","mario","kallen zero","mario","mario","mario","yo","yo"};
	private String[] responces2={"utah","USA","yes","Luigi","yes","green","yellow","Eclipse","Skillet","desmond","yo"};
	
	/**
	 * add responce to a question on the quiz
	 */
	public void question()
	{
		//JLabel question1 = new JLabel(responces[0]);
		responce = scan.nextLine();
		if (responce.equalsIgnoreCase(responces[add]))
		{
			totalScore++;
		}
		add++;
	}
	
	public void question2()
	{
		responce = scan.nextLine();
		if (responce.equalsIgnoreCase(responces2[add]))
		{
			totalScore++;
		}
		add++;
	}
	
	public void giveQuiz(int quiz)
	{
		if(quiz == 0)
		{
			for(int counter = 0; counter <quiz1.length; counter++)
			{
				addQuestion();
				question();
			}
			calculate();
			check();
		}
		if(quiz == 1)
		{
			totalScore = 0;
			add = 0;
			for(int counter = 0; counter <quiz2.length; counter++)
			{
				addQuestion2();
				question2();
			}
			calculate();
		}
	}

	public void calculate()
	{
		totalScore = totalScore/quiz1.length;
		System.out.println(totalScore);

		if(totalScore >=.9)
			grade = "A";
		if(totalScore >=.8 && totalScore <.9)
			grade = "B";
		if(totalScore>=.7 && totalScore <.8)
			grade = "C";
		if(totalScore>=.6 && totalScore <.7)
			grade = "D";
		if(totalScore <.6)
			grade = "F";

		System.out.println(grade);
	}
	
	public void check()
	{
		if(grade.equals("D") || grade.equals("F"))
		{
			System.out.println("That is too low a score. New quiz.");
			giveQuiz(newQuiz);
			newQuiz++;
		}
	}
}
