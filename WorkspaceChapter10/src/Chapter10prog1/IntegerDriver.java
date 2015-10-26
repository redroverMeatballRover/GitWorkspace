package Chapter10prog1;

public class IntegerDriver {

	/**
	 * Cody Schaffer
	 * 
	 * This program asks the user to send in 10 different numbers. The numbers have to be within a certain range, or an exception is thrown. 
	 * If the number is within the range, the program prompts the user for another valid number til the user submits. 
	 * 
	 * This is the driver. It calls all the numbers and then the add method. 
	 */
	public static void main(String[] args) throws OutOfRangeException {

		TenIntegers ti = new TenIntegers(0, 0, 0, 0, 0,0,0,0,0,0);
		
		ti.num1();
		ti.num2();
		ti.num3();
		ti.num4();
		ti.num5();
		ti.num6();
		ti.num7();
		ti.num8();
		ti.num9();
		ti.num10();
		ti.addNum();

	}

}
