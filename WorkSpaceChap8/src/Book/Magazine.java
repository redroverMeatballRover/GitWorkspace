package Book;

public class Magazine extends Book {

	
	private String subject;
	private int articles;
	private int authors;
	/*-------------------------------------------------------------------------
	 * This class inherits from BOOK and inherits from BOOK's constructor.
	 * It uses methods from book and also has its own set of methods. 
	 ------------------------------------------------------------------------*/
	public Magazine(int numPages, String nameTitle, String magSub, int numArticles, int numAuthors)
	{
		super(numPages, nameTitle);
		subject = magSub;
		articles = numArticles;
		authors = numAuthors;	
	}
	//subscribes
	public void subscribe()
	{
	System.out.println("Subscribe to our magazine!");
	}
	//magazine contest
	public void contest()
	{
		System.out.println("Enter our contest!");
	}
	//letters to the editor
	public void editor()
	{
		System.out.println("Send your thoughts! we'll print your thoughts in our letters to the editor section!");
	}
	//computes articles per page
	public int computeArticlesPerPage ()
	{
		return articles/pages;
	}
	//computes authors per page
	public int computeAuthorsPerPage ()
	{
		return authors/pages;
	}
	
	
	//GETTERS AND SETTERS//------------------------
	//sets subject
	public void setSubject(String magSub)
	{
		subject = magSub;
	}
	//gets subject
	public String getSubject()
	{
		return subject;
	}
	//sets articles
	public void setArticles(int numArticles)
	{
		articles = numArticles;
	}
	//gets articles
	public int getArticles()
	{
		return articles;
	}
	//sets authors
	public void setAuthors(int numAuthors)
	{
		authors = numAuthors;
	}
	//gets authors
	public int getAuthors()
	{
		return authors;
	}
	
}
