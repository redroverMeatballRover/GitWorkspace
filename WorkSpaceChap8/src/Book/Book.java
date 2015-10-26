package Book;

/*-------------------------------------------------------------------------
 *This class creates the initial constructor that the other classes 
 *will inherit and use. 
 ------------------------------------------------------------------------*/
public class Book {

	protected int pages;
	protected String title;
	
	//CONSTRUCTOR//
	public Book (int numPages, String nameTitle)
	{
		pages = numPages;
		title = nameTitle;
	}
	//SET PAGE
	public void setPages(int numPages)
	{
		pages  = numPages;
	}
	//GET PAGE
	public int getPages()
	{
		return pages;
	}
	//SET TITLE
	public void setTitle(String nameTitle)
	{
		title = nameTitle;
	}
	//GET TITLE
	public String getTitle()
	{
		return title;
	}

}
