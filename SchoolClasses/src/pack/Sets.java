package pack;
/**
 * 
 * @author cschaffer
 *this is the second level math class
 */
public class Sets extends Algebra {

	private int groupProjects;
	
	public Sets(int classNumber, String titleName, String descriptionCourse,
			String departmentTeach, int homeworkLoad, int numBooks,
			int pagesRead, int probs, int recorrection, int groupProj)
	
	{
		super(classNumber, titleName, descriptionCourse, departmentTeach, homeworkLoad,
				numBooks, pagesRead, probs, recorrection);
		
		groupProjects = groupProj;
		
	}

	
	public int pointlessProblems()
	{
		return groupProjects/pages;
	}
	
	public void setProj(int groupProj)
	{
		groupProjects = groupProj;
	}
	//GET PAGE
	public int getProj()
	{
		return groupProjects;
	}
	
	

}
