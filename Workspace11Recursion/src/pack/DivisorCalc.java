package pack;

/**
 * cody schaffer
 * 
 * This is the GCD, it is a recursive program that calls itself in order to organize the correct GCD
 */
public class DivisorCalc {
	
	int gcd(int num1, int num2) 
	{
		if (num2 == 0) 
		{
			return num1;
		} 		
		else if (num1 < num2) 
		{
			return gcd(num2, num1);
		} 
		else 
		{
			return gcd(num2, num1 % num2);
		}
//		else if (num2 <= num1)//QUESTIONABLE
//		{
//			return num1/num2;
//		}
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
//	private int num1;
//	private int num2;
//
//	public static int gcp( int num1, int num2)
//	{
//		if (num2 <= num1 && num2/num1)
//		{
//			return num2;
//		}
//		
//		if (num1 < num2)
//		{
//			gcp(int num2, int num1)
//		}
//		
//		if ()
//	}
		
	
	
	


