package pack;

abstract class PublicSafetyOfficer {

	protected String firstName;
	protected String lastName;
	protected int age;
	protected int badgeNum;

	public PublicSafetyOfficer(String fName, String lName, int ageYear,int badge) 
	{
		firstName = fName;
		lastName = lName;
		age = ageYear;
		badgeNum = badge;
	}

	
	 abstract String getFirstName();
	 abstract String getLastName();
	 abstract int getAge();
	 abstract int getBadge();
}
