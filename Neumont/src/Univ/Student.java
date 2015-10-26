package Univ;

public class Student extends Course{
	public String firstName;
	public String lastName;
	public void setFirstName(String f) {
		 firstName=f;
	}
	public void setLastName(String l) {
		 lastName=l;
	}
	public String getLastName() {
		return lastName;
	}
	public String getFirstName() {
		return firstName;
	}

	
}