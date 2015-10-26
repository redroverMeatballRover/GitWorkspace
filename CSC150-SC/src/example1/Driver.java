package example1;

public class Driver {

	// illustrates differences in the == and the equals 
	
	public static void main(String[] args) {
		SomeInt i = new SomeInt(3);
		SomeInt j = new SomeInt(3);
		SomeInt k = i;
		
		System.out.println("i == j:" + (i==j));
		System.out.println("i == j:" + i.equals(j));
		System.out.println("i == j:" + (i==k));
		System.out.println("i == j:" + i.equals(k));
		
		

	}

}
