
public class Parameters {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//initiialize and int object
		int daysLeft = 10;
		Student student = new Student();
		student.setName("John");
		
		System.out.println("the number of days left: " + daysLeft);
		System.out.println("the student name is: "+ student.getName());
		
		//pass an int and an object to parameterchanger
		//and change the values
		parameterChanger(daysLeft, student);
		
		//after returning from parameterChanger print the values
		System.out.println();
		System.out.println("the number of days left: " + daysLeft);
		System.out.println("the student name is: " + student.getName());
	}
	
	public static void parameterChanger(int daysLeft, Student student) 
	{
		daysLeft += 5;
		student.setName("Tom");// copy of the one above
		
		System.out.println();
		System.out.println("the number of days left: " + daysLeft);
		System.out.println("the student name is: " + student.getName());
		
	}

}
