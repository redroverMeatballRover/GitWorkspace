package pack;

/**
 * 
 * @author cschaffer
 * This class sets up the base layer for all other classes
 * 
 *
 */
abstract class ClassClass {

	private int classNum;
	private String title;
	private String description;
	private String department;
	private int homework;
	private int books;
	
	abstract void projector();	
	
	//CONSTRUCTOR//
		public ClassClass (int classNumber, String titleName, String descriptionCourse, String departmentTeach, int homeworkLoad, int numBooks)
		{
			classNum = classNumber;
			title = titleName;
			description = descriptionCourse;
			department = departmentTeach;
			homework = homeworkLoad;
			books = numBooks;
		}
		//SET PAGE
		public void setClassNum(int classNumber)
		{
			classNum = classNumber;
		}
		//GET PAGE
		public int getClassNum()
		{
			return classNum;
		}
		//SET PAGE
		public void setTitle(String titleName)
		{
			title = titleName;
		}
		//GET PAGE
		public String getTitle()
		{
			return title;
		}	
		
		//SET PAGE
		public void setDescription(String descriptionCourse)
		{
			description = descriptionCourse;
		}
		//GET PAGE
		public String getDescription()
		{
			return description;
		}	
		//SET PAGE
		public void setDepartment(String departmentTeach)
		{
			department = departmentTeach;
		}
		//GET PAGE
		public String getDepartment()
		{
			return department;
		}	
		
		public void setHomework(int homeworkLoad)
		{
			classNum = homeworkLoad;
		}
		//GET PAGE
		public int getHomework()
		{
			return homework;
		}

		
}
