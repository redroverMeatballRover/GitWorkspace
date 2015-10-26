package Univ;

public class ModelingUniversityDriver {

	public static void main(String[] args) {
		University university1 = new University("Cody", "Schaffer", "Neumont", "Cobb",
				"CSC150", 309);
		University university2 = new University("Larry", "Baltimore", "La Salle", "Cord", "Graphics101", 100);
		System.out.println(university1);
		System.out.println(university2);

		university1.setLastName("Morris");
		university1.getLastName();
		System.out.println(university1);
		university1.setFirstName("Quiad");
	
		System.out.println();
		System.out.println(university2.getCourse());
		university2.setCourse("MATH101");
		System.out.println(university2.getCourse());
		System.out.println(university2);
		System.out.println();
		
		System.out.println();
		System.out.println(university1.getClassRoom());
		university1.setClassRoom(111);
		System.out.println(university1.getClassRoom());
		System.out.println(university1);
		
		System.out.println();
		System.out.println(university2.getProfessor());
		university2.setProfessor("COX");
		System.out.println(university2.getProfessor());
		System.out.println(university2);
		System.out.println();
		
		System.out.println();
		System.out.println(university1.getUniversity());
		university1.setUniversity("UOFU");
		System.out.println(university1.getUniversity());
		System.out.println(university1);

	}
}
