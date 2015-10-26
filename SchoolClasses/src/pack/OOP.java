package pack;
/**
 * 
 * @author cschaffer
 *this is the OOP class
 */
public class OOP extends IntroToJava {

	private int weekendProg;
	
	public OOP(int classNumber, String titleName, String descriptionCourse,
			String departmentTeach, int homeworkLoad, int numBooks,
			int discusNum, int journalNum, String focusClass, int progNum,
			int langCov, int authorship, int weekProgNum) 
	
	{
		super(classNumber, titleName, descriptionCourse, departmentTeach, homeworkLoad,
				numBooks, discusNum, journalNum, focusClass, progNum, langCov,
				authorship);
		
		weekendProg = weekProgNum;
	}


	public void createGUI()
	{
		System.out.println("In this class you write a lot of GUIs");
	}
	
	
	public void setWeekendHomework(int weekProgNum)
	{
		weekendProg = weekProgNum;
	}
	//GET PAGE
	public int getWeekendHomeWork()
	{
		return weekendProg;
	}
	
}
