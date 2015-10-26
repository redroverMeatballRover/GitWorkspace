package pack;
/**
 * 
 * @author cschaffer
 *this is the first level math class
 *
 */
public class Algebra extends Math {

	private int recorrections;
	
	public Algebra(int classNumber, String titleName, String descriptionCourse,
			String departmentTeach, int homeworkLoad, int numBooks,
			int pagesRead, int probs, int recorrection) 
	
	{
		super(classNumber, titleName, descriptionCourse, departmentTeach, homeworkLoad,
				numBooks, pagesRead, probs);
		
		recorrections = recorrection;
		
	}

	
	public int computeRecVSPages()
	{
		return recorrections/pages;
	}
	
	
	public void setRec(int recorrection)
	{
		recorrections = recorrection;
	}
	//GET PAGE
	public int getRec()
	{
		return recorrections;
	}
	
	

}
