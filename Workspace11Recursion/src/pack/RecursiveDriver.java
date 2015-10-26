package pack;
import java.util.Random;
/**
 * 
 * @author cschaffer
 *
 *This program calculates the greatest common divisor between two random numbers. 
 *
 */
public class RecursiveDriver {
	//DRIVER: generates the random numbers and calls the GCD to find the gcd. 
	public static void main(String[] args) 
		{
			Random rand1 = new Random();
			Random rand2 = new Random();
			
			int om1 = rand1.nextInt(100);
			int om2 = rand2.nextInt(100);
			DivisorCalc obj = new DivisorCalc();
			System.out.println("GCD of " + om1 + " and " + om2 + " is "
					+ obj.gcd(om1, om2));
		}
		
	//arrays.fill	
	}

