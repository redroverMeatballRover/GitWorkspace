package Book;

public class Novel extends Book {


private int chapters;
private String jackDescription;
private String jillDescription;
private String title;
	/*-------------------------------------------------------------------------
	 * This class inherits from BOOK and inherits from BOOK's constructor.
	 * It uses methods from book and also has its own set of methods. 
	 ------------------------------------------------------------------------*/
	public Novel(int numPages, String nameTitle, String character1,
			String character2, int bookChapters) {
		super(numPages, nameTitle);
		jackDescription = character1;
		jillDescription = character2;
		chapters = bookChapters;
	}

	//METHODS//--------------------------------------------------------
	//DEDICATES THE BOOK//
	public void dedication()
	{
	System.out.println("This book is dedicated to Jack and Jill");
	}
	//GIVES STORY OF THE BOOK//
	public void story()
	{
		System.out.println("Jack and Jill went up the hill to fetch a pail of water.");
	}
	
	
	//GETTERS AND SETTERS//------------------------
	//SETS JACK
	public void setJack(String character1)
	{
		jackDescription = character1;
	}
	//GETS JACK
	public String getJack()
	{
		return jackDescription;
	}
	//SETS JILL
	public void setJill(String character1)
	{
		jillDescription = character1;
	}
	//GETS JILL
	public String getJill()
	{
		return jillDescription;
	}
	//SETS CHAPTERS//
	public void setChapters(int bookChapters)
	{
		chapters = bookChapters;
	}
	//GETS CHAPTERS//
	public int getChapters()
	{
		return chapters;
	}

}
