package pack;

public class Contrived {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String adding1 = addNumbers("1","1");
		int adding2 = addNumbers(1,1);
		
		System.out.println(adding1);
		System.out.println(adding2);

	}
	
	public String addNumbers(String value1, String value2)
	{
		int valueToAdd1 = Integer.parseInt(value1);
		int valueToAdd2 = Integer.parseInt(value2);
		
		int add = valueToAdd1 + valueToAdd2;
	
		String addedNumbers = Integer.toString(add);
		
		return addedNumbers;
	}
	
	public static int addNumbers(int value1, int value2)
	{
		return value1 + value2;
	}

}
