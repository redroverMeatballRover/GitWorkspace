/**
 * 
 */
package example;

/**
 * @author dmaldonado
 *
 */
public class Quiz extends Answers
{
	private String[] quiz = {"In which state is Neumont located?","In what country was Neumont founded in?","Does it snow in Utah?", "What is the name of the videogame character Mario's brother?",
			"Are you alive?","What color are leaves in the spring?","What color is the Neumont shuttle?","What program is this written in?","What band sings the song 'Monster'?",
			"In Assassin's Creed, what is the main character's name?","In the anime Code Geass, what was the alias for the dark knight's leader?",
			"What are the metal suits called in Infinite Stratos?","There is a stadium in Sandy,UT. What sport is the stadium for?","What is the name of Death Sythe's kid in Soul Eater?",
			"From One Piece, what is Luffy's middle initial?","From Code Geass, what is the name of Suzaku's knightmare frame?","From the Hunger Games, what is the name of Katniss's sister?",
			"Where does the song 'Let The Monster Rise' come from?","In Elfen Leid, what was Mariko's number?","In Hayate the Combat Butler, about how much was Hayate sold for?",
			"In the manga Gate, what is the name of the main character?","In Chibi Vampire, what is the main character's name?",
			"In World Embryo, what are the intials of organization that the main character joins?","In World Embryo, what is Neene?","In Lock on, the main character's eye is called?"};
	private int count = 0;
	private int stop = 25;

	/**
	 * 
	 */
	public void addQuestion()
	{
		System.out.println(quiz[count]);
		count++;
	}

	public void giveQuiz()
	{
		for(int counter = 0; counter <stop; counter++)
		{
			addQuestion();
			question();
		}
	}

	public void showTotal()
	{
		System.out.println("You got a total of " + totalScore + " out of " + quiz.length);
	}
}
