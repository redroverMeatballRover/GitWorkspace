package pack;
/**
 * 
 * @author cschaffer
 *this is the first level computer class
 */
public class Leadership extends SocialSciences {
	
	private int presentations;
	
	public Leadership(int classNumber, String titleName,
			String descriptionCourse, String departmentTeach, int homeworkLoad,
			int numBooks, int discusNum, int journalNum, String focusClass, int presNum) {
		
		super(classNumber, titleName, descriptionCourse, departmentTeach, homeworkLoad,
				numBooks, discusNum, journalNum, focusClass);
		
		presentations = presNum;

	}
	//PROBLEM SOLVING-------------------------------------------------------//
	public void problemSolving()
	{
		System.out.println("This class focuses a lot on problem solving.");
	}
	
	//GETTERS AND SETTERS--------------------------------------------------//
	public void setPres(int presNum)
	{
		presentations = presNum;
	}
	//GET PAGE
	public int getPres()
	{
		return presentations;
	}
	
	
}
