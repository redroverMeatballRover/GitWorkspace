package Book;
/*-------------------------------------------------------------------------
 * This class inherits from Magazine and inherits from Magazine's constructor.
 * It uses methods from book and also has its own set of methods. 
 ------------------------------------------------------------------------*/
public class TechJournal extends Magazine {

	private int nasaAuthors;
	private int appleEndorsements;
	
	public TechJournal (int numPages, String nameTitle, String magSub, int numArticles, int numAuthors, int nasa, int apple)
	{
		super(numPages, nameTitle, magSub, numArticles, numAuthors);
		nasaAuthors = nasa;
		appleEndorsements = apple;
	}
	//MAKES THE E-MAGAZINE CONSTRUCTOR
	public void subscribeEMage()
	{
	System.out.println("Subscribe to our E-magazine!");
	}
	//MAKES THE SPACE CONTEST
	public void spaceContest()
	{
		System.out.println("Enter our Space contest!");
	}
	//OVERRIDES 
	public void editor()
	{
		System.out.println("write a letter to stephen hawlking!");
		super.editor();//example of overriding methods.
	}
	
	//COMPUTES NASA AUTHORS PER PAGE
	public int computeNasaAuthorsPerPage ()
	{
		return nasaAuthors/pages;
	}
	//COMPUTES ENDORSEMENT
	public int computeEndorsementsPerPage ()
	{
		return appleEndorsements/pages;
	}
	
	
	//GETTERS AND SETTERS//------------------------
	//SETS NASA
	public void setNasa(int nasa)
	{
		nasaAuthors = nasa;
	}
	//GET NASA
	public int getNasa()
	{
		return nasaAuthors;
	}
	//SETS APPLE
	public void setApple(int apple)
	{
		appleEndorsements = apple;
	}
	//GETS APPLE
	public int getApple()
	{
		return appleEndorsements;
	}
	
	
	
}
