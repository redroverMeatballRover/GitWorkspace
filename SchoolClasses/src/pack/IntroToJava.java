package pack;
/**
 * 
 * @author cschaffer
 *this is the second level computer class
 */
public class IntroToJava extends TopicsInComputers {

	private int authorshipAttrib;
	
	public IntroToJava(int classNumber, String titleName,
			String descriptionCourse, String departmentTeach, int homeworkLoad,
			int numBooks, int discusNum, int journalNum, String focusClass,
			int progNum, int langCov, int authorship) 
	
	{
		super(classNumber, titleName, descriptionCourse, departmentTeach, homeworkLoad,
				numBooks, discusNum, journalNum, focusClass, progNum, langCov);
		
		authorshipAttrib = authorship;
	}

	
	public void readJavaBook()
	{
		System.out.println("Read the JAVA Foundations book in this class.");
	}
	
	
	public void setAttrib(int authorship)
	{
		authorshipAttrib = authorship;
	}
	//GET PAGE
	public int getAttrib()
	{
		return authorshipAttrib;
	}

}
