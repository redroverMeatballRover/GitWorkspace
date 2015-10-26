public class ModelingUniversityDriver {
	
//Used to print out the states of University objects.
	public static void main(String[] args) {
		University university1 = new University("Cody", "Gulley", "Neumont", "Cobb",
				"CSC150", 309);
		University university2 = new University("Jim", "Smith", "Notre Dame", "Ruddy", "FOOTBALL101", 100);
		System.out.println(university1);
		System.out.println(university2);

		//changes the state of university1's last name
		university1.setLastName("Schaffer");
		university1.getLastName();
		System.out.println(university1);
		university1.setFirstName("Rafik");
		
		
		//changes the state of univresity1's course
		System.out.println();
		System.out.println(university2.getCourse());
		university2.setCourse("MATH101");
		System.out.println(university2.getCourse());
		System.out.println(university2);
		System.out.println();
		
		//changes the state of university1's classroom

		System.out.println();
		System.out.println(university1.getClassRoom());
		university1.setClassRoom(111);
		System.out.println(university1.getClassRoom());
		System.out.println(university1);
		
		
		//changes the state of univresity1's professor

		System.out.println();
		System.out.println(university2.getProfessor());
		university2.setProfessor("COX");
		System.out.println(university2.getProfessor());
		System.out.println(university2);
		System.out.println();
		
		
		//changes the state of univresity1's university
		

		System.out.println();
		System.out.println(university1.getUniversity());
		university1.setUniversity("UOFU");
		System.out.println(university1.getUniversity());
		System.out.println(university1);

	}
}
