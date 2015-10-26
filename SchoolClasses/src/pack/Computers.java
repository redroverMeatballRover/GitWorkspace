package pack;

/**
 * 
 * @author cschaffer
 *this is the base class to support all other computer-related classes
 */

public class Computers extends ClassClass {

	private int programsWritten;
	
	public Computers(int classNumber, String titleName,
			String descriptionCourse, String departmentTeach, int homeworkLoad,
			int numBooks, int discusNum, int journalNum, String focusClass, int progNum) {
		
		super(classNumber, titleName, descriptionCourse, departmentTeach, homeworkLoad,
				numBooks);
	
		programsWritten = progNum;
	}

	void projector() 
	{	
		System.out.println("There is a projector in this class.");
	}
	
	
	public void labTime()
	{
		System.out.println("Now is lab time. Work on your code.");
	}
	
	public void setProg(int progNum)
	{
		programsWritten = progNum;
	}
	//GET PAGE
	public int getDiscuss()
	{
		return programsWritten;
	}
	
	
	
}
