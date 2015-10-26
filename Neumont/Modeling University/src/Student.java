public class Student extends Course{
	public String firstName;
	public String lastName;
//	public String university;
//	public String professor;
//	public String courseName;
//	public int classroom;

//sets/changes the First Name of a student in a university object
	public void setFirstName(String f) {
		 firstName=f;
	}
	//sets/changes the Last Name of a student in a university object
	public void setLastName(String l) {
		 lastName=l;
	}
	//returns the last name of a student in  a university object
	public String getLastName() {
		return lastName;
	}
	//returns the first name of a student in  a university object
	public String getFirstName() {
		return firstName;
	}

	
}