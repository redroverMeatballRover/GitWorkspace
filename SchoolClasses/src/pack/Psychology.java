package pack;
/**
 * 
 * @author cschaffer
 *this is the third level class of phychology
 */
public class Psychology extends ASSCLass {

	private int actOutPlays;
	
	public Psychology(int classNumber, String titleName,
			String descriptionCourse, String departmentTeach, int homeworkLoad,
			int numBooks, int discusNum, int journalNum, String focusClass,
			int presNum, int essayNum, int actNum)
	
	{
		super(classNumber, titleName, descriptionCourse, departmentTeach, homeworkLoad,
				numBooks, discusNum, journalNum, focusClass, presNum, essayNum);
		
		actOutPlays = actNum;
	}

	public void readEnergyBus()
	{
		System.out.println("In this class we read an awful book called The Energy Bus.");
	}
	
	public void setAct(int actNum)
	{
		actOutPlays = actNum;
	}
	//GET PAGE
	public int getAct()
	{
		return actOutPlays;
	}
	

}
