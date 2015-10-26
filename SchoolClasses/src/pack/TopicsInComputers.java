package pack;
/**
 * 
 * @author cschaffer
 *this is the first level computer class
 */
public class TopicsInComputers extends Computers
{
	private int computerLanguagesCovered;
	
	public TopicsInComputers(int classNumber, String titleName,
			String descriptionCourse, String departmentTeach, int homeworkLoad,
			int numBooks, int discusNum, int journalNum, String focusClass,
			int progNum, int langCov)
	
	{
		super(classNumber, titleName, descriptionCourse, departmentTeach, homeworkLoad,
				numBooks, discusNum, journalNum, focusClass, progNum);
		// TODO Auto-generated constructor stub
	
		computerLanguagesCovered = langCov;
	
	
	}
	
	public void designUserInteraction()
	{
		System.out.println("in this class we build a user interaction interface.");
	}

	
	public void setLang(int langCov)
	{
		computerLanguagesCovered = langCov;
	}
	//GET PAGE
	public int getLangCov()
	{
		return computerLanguagesCovered;
	}
}
