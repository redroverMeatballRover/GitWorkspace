package pack2.Quizzes1;
/**
 * 
 */


/**
 * @author dmaldonado
 *
 */
public abstract class QuizExceptions
{
	protected String[] quiz1 = {"What does the finally block do?","Mario","Answer is Mario", "Mario","mario","kallen and zero","mario","mario","mario","yo","yo"};
	protected String[] quiz2 = {"In which state is Neumont located?","In what country was Neumont founded in?","Does it snow in Utah?", "What is the name of the videogame character Mario's brother?",
							  "Are you alive?","What color are leaves in the spring?","What color is the Neumont shuttle?","What program is this written in?","What band sings the song 'Monster'?",
						      "In Assassin's Creed, what is the main character's name?","yo"};
	private int count = 0;
	private int count2 = 0;
	protected int newQuiz = 1;
	protected String grade;

	public void addQuestion()
	{
		System.out.println(quiz1[count]);
		count++;
	}
	
	public void addQuestion2()
	{
		System.out.println(quiz2[count2]);
		count2++;	
	}
	
	public abstract void giveQuiz(int quiz);
}