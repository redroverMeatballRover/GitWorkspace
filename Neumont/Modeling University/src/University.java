
public class University extends Student{
	
public String university;

public University (String fName, String lName, String univ, String prof,
String courseTitle, int room) {

firstName = fName;
lastName = lName;
university = univ;
professor=prof;
courseName = courseTitle;
classroom = room;
}

//sets/changes the university
public void setUniversity(String univ)
{
	university = univ;
}

//returns the university of a university object
public String getUniversity()
{
	return university;
}
//uses to create sentences with variables of a university object
public String toString() {
	return " The student " + firstName + " " + lastName + " goes to "
			+ university + " and has  " + courseName + " in room " + classroom
			+ " taught by professor " + professor + ".";
}
}
