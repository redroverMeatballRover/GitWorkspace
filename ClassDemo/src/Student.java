
public class Student
{
	private String name;
	private String firstName;
	private String lastName;
	static String university;
	
	public Student (String fName, String lName)
	{
		
		firstName = fName;
		lastName = lName;	
	}

	public Student() {
		
	}
	
	public Student(String inputName){
		name = inputName;
	}

	public static void setUniversity (String univ)
	{
		university = univ;
	}
	
	public static String getUniversity()
	{
		return university;
	}
	
	
		/*public String getFirstName()
		{
			return firstName;
		}
		
		public String getLastName()
		{
			return lastName;
		}

		public void setName(String string) {
			
		 return setName;
			
		}

*/
	public String getName() {
		return name;
	}

	public void setName(String inputName) {	
		 name = inputName;
	}
}
