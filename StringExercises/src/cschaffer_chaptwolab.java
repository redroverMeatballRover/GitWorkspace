import java.util.Scanner;


public class cschaffer_chaptwolab {

	
	//this code converts the farenheight to celcius temperature. 
	public static void main(String[] args)
	{
		Scanner CelsTemp = new Scanner(System.in);
	
		int celsiusTemp = 24;
			
		System.out.println ("Enter Celsius here");
	
		celsiusTemp = CelsTemp.nextInt();
		
		final int BASE = 32;
		final double CONVERSION_FACTOR = 9.0 / 5.0;
		
		double fahrenheitTemp;
	
		fahrenheitTemp = celsiusTemp * CONVERSION_FACTOR + BASE;
	
		System.out.println ("Celsius Temperature: " + celsiusTemp);
		System.out.println ("Fahrenheit Equivalent: " + fahrenheitTemp);
	
	
	}

	
}
