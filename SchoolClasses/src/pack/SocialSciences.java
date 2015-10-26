package pack;
/**
 * 
 * @author cschaffer
 *this is the base class to support all other socialSciencesr-related classes
 */
public class SocialSciences extends ClassClass {

	private int psychDiscussionNum;
	private int journals;
	private String focus;
	
	public SocialSciences(int classNumber, String titleName,
			String descriptionCourse, String departmentTeach, int homeworkLoad,
			int numBooks, int discusNum, int journalNum, String focusClass) {
		
		super(classNumber, titleName, descriptionCourse, departmentTeach, homeworkLoad,
				numBooks);
		
		psychDiscussionNum = discusNum;
		journals = journalNum;
		focus= focusClass;
		
	}

	void projector() 
	{	
		System.out.println("There is a projector in this class.");
	}
	
	public void setDiscuss(int discusNum)
	{
		psychDiscussionNum = discusNum;
	}
	//GET PAGE
	public int getDiscuss()
	{
		return psychDiscussionNum;
	}
	
	public void setJournals(int journalNum)
	{
		journals = journalNum;
	}
	//GET PAGE
	public int getJournals()
	{
		return journals;
	}
	
	public void setFocus(String focusClass)
	{
		focus = focusClass;
	}
	//GET PAGE
	public String getFocus()
	{
		return focus;
	}
	
	
	
}

	
