package pack;
/**
 * 
 * @author cschaffer
 *this is ASSClass
 */
public class ASSCLass extends Leadership {
	
	private int essays;

	public ASSCLass(int classNumber, String titleName,
			String descriptionCourse, String departmentTeach, int homeworkLoad,
			int numBooks, int discusNum, int journalNum, String focusClass,
			int presNum, int essayNum) 
	{	
		super(classNumber, titleName, descriptionCourse, departmentTeach, homeworkLoad,
				numBooks, discusNum, journalNum, focusClass, presNum);	
	
		essays = essayNum;
	}

	
	public void makePresentation()
	{
		System.out.println("For this class's final we make a presentation.");
	}
	
	
	//GETTERS AND SETTERS--------------------------------------------------//
	public void setEssay(int essayNum)
	{
		essays = essayNum;
	}
	//GET PAGE
	public int getEssay()
	{
		return essays;
	}
}
