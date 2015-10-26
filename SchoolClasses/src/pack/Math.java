package pack;
/**
 * 
 * @author cschaffer
 *this is the base class to support all other math-related classes
 */
public class Math extends ClassClass {

	protected int pages;
	private int problems;
	
	public Math(int classNumber, String titleName, String descriptionCourse,
			String departmentTeach, int homeworkLoad, int numBooks, int pagesRead, int probs) 
	
	{
		super(classNumber, titleName, descriptionCourse, departmentTeach, homeworkLoad,
				numBooks);
		
		pages = pagesRead;
		problems = probs;
	}


	@Override
	void projector() {
		System.out.println("This class has a projector.");
		
	}

	public double computePagesProbs()
	{
		return problems/pages;
	}
	
	public void setPages(int pagesRead)
	{
		pages = pagesRead;
	}
	//GET PAGE
	public int getPages()
	{
		return pages;
	}
	
	public void setProb(int probs)
	{
		problems = probs;
	}
	//GET PAGE
	public int getProb()
	{
		return problems;
	}
}
