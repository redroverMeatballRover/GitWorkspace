package pack;
/**
 * 
 * @author cschaffer
 *this is the second level national class
 */
public class Government extends Finance {

	private int historyNotes;
	
	public Government(int classNumber, String titleName,
			String descriptionCourse, String departmentTeach, int homeworkLoad,
			int numBooks, int mathNumber, int calcNeed, int openQuiz,
			int stockNum, int histNotes) 
	{
		super(classNumber, titleName, descriptionCourse, departmentTeach, homeworkLoad,
				numBooks, mathNumber, calcNeed, openQuiz, stockNum);
		
		historyNotes = histNotes;
		
	}
	
	//METHODS//
	public void learnHistory()
	{
		System.out.println("In this class we learn about the american government.");
	}
	
	//-----------------------------------------------------------
	public void setHist(int histNotes)
	{
		historyNotes = histNotes;
	}
	//GET PAGE
	public int getHist()
	{
		return historyNotes;
	}

}
