package pack;
/**
 * 
 * @author cschaffer
 *this is the base class to support all other national-related classes
 */
public class National extends ClassClass {
	
	private int mathNum;
	private int calculatorsNeeded;

	public National(int classNumber, String titleName,
			String descriptionCourse, String departmentTeach, int homeworkLoad,
			int numBooks, int mathNumber, int calcNeed ) 
	{	
		super(classNumber, titleName, descriptionCourse, departmentTeach, homeworkLoad,
				numBooks);
		mathNum = mathNumber;
		calculatorsNeeded = calcNeed;
	}

	@Override
	void projector() {
		System.out.println("This class has a projector.");
	}

	//METHODS//
	public void useRealLifeMathSkills()
	{
		System.out.println("You will use real life math skills in this course.");
	}
		
	//GETTERS AND SETTERS--------------------------------------------------//
	public void setMath(int mathNumber)
	{
		mathNum = mathNumber;
	}
	//GET PAGE
	public int getMath()
	{
		return mathNum;
	}
	
	public void setCalculator(int calcNeed)
	{
		calculatorsNeeded = calcNeed;
	}
	//GET PAGE
	public int getCalculator()
	{
		return calculatorsNeeded;
	}
		
	

}

