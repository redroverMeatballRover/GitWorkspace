package pack;
/**
 * 
 * @author cschaffer
 *this is the first level national class
 */
public class Finance extends National {

	private int openNoteQuiz;
	private int stocks;
	
	public Finance(int classNumber, String titleName, String descriptionCourse,
			String departmentTeach, int homeworkLoad, int numBooks,
			int mathNumber, int calcNeed, int openQuiz, int stockNum) 
	
	{
		super(classNumber, titleName, descriptionCourse, departmentTeach, homeworkLoad,
				numBooks, mathNumber, calcNeed);
		
		openNoteQuiz = openQuiz;
		stocks = stockNum;
		
	}
	//METHODS 
	public void Accounting()
	{
		System.out.println("In this class you learn some accounting skills.");
	}
	
	
	//-------------------------------------------------------
	public void setQuiz(int openQuiz)
	{
		openNoteQuiz = openQuiz;
	}
	//GET PAGE
	public int getQuiz()
	{
		return openNoteQuiz;
	}
	
	public void setStocks(int stockNum)
	{
		stocks = stockNum;
	}
	//GET PAGE
	public int getStock()
	{
		return stocks;
	}
	

}
