
import java.util.Random;
import java.util.Scanner; 
import java.text.NumberFormat;
import java.text.DecimalFormat;


public class chapter3exercises {
	enum Week {monday, tuesday, wednesday, thursday, friday, saturday, sunday};
	
	
	
	public static void main(String[] args) {
		
		
		String phrase = "overview";
		System.out.println ("Original String: \"" + phrase + "\"");
		System.out.println ("Length of string: " + phrase.length());
		
		Exercise3_2();
		Exercise3_3();
		Exercise3_4();
		Exercise3_5();
		Exercise3_6();
		Exercise3_7();
		Exercise3_8();
		Exercise3_9();
		Exercise3_10();
		Exercise3_11();
		Exercise3_12();
	}
	
	public static void Exercise3_2()
	{
		String phrase = "introduction";
		System.out.println ("Original String: \"" + phrase + "\"");
		System.out.println ("8th letter of string: " + phrase.charAt(7));
	}
	
	public static void Exercise3_3()
	{
		String original = "enormous";
		String phrase = original.replace('e', 'j');
		System.out.println (phrase);	
	}

	public static void Exercise3_4()
	{
		String m1, m2, m3;
		m1 = "quest for the holy grail";
		m2 = m1.toLowerCase();
		m3 = m1 + " " + m2;
		System.out.println (m3.replace ('h', 'z'));
		
		// prints out "the quest for tze zoly grail quset for tze zoly grail", 
	}

	public static void Exercise3_5()
	{
		//import java.awt.*;
		/* the effect of the above code is that it provides support to draw graphics and create graphical 
		user interfaces. */	
	}
	
	public static void Exercise3_6()
	{
		Random generator = new Random();
		int num1;
		float num2;
		
		// this is A
		num1 = generator.nextInt(20);
		System.out.println (num1);
		
		// this is B
		num1 = generator.nextInt(8) + 1;
		System.out.println (num1);
	
		// this is C
		num1 = generator.nextInt(45) + 10;
		System.out.println (num1);
		
		//this is D
		num1 = generator.nextInt(100) - 50;
		System.out.println (num1);
	}
	
	public static void Exercise3_7()
	{
		Random generator = new Random();
		int num1;
		float num2;
		
		// this is A
		num1 = generator.nextInt(10) + 1;
		System.out.println ("From 0 to 10: " + num1);
		
		//this is B
		num1 = generator.nextInt(501);
		System.out.println ("From 0 to 500: " + num1);
		
		// this is C
		num1 = generator.nextInt(11);
		System.out.println ("From 0 to 10: " + num1);
		
		//this is D
		num1 = generator.nextInt(500) + 1;
		System.out.println ("From 1 to 500: " + num1);
		
		//this is E
		num1 = generator.nextInt(25) + 50;
		System.out.println ("From 25 to 50: " + num1);
		
		//this is F
		num1 = generator.nextInt(15) - 10;
		System.out.println ("From -10 to 15: " + num1);
	}
	
	public static void Exercise3_8() //help!
	{
		double num1 = 7;
		double num2 = 9;
		double num3 = 0;
		
		num3 = Math.sqrt(num1 + num2);
		System.out.println ("num1 plus num2 is " + num3);
	}
	
	public static void Exercise3_9() //help!
	{
		double num1 = 7;
		double num2 = 2;
		double total = 0;
		
		
		System.out.println ("total is " +  (total = Math.abs(num1 + num2)));	
	}
	
	public static void Exercise3_10() //help!
	{
		double num1 = 5.12349;
		DecimalFormat fmt = new DecimalFormat ("0.####");
		System.out.println ("The number is rounded up to 4 decimal places" + fmt.format(num1));
	}
	
	public static void Exercise3_11() //help!
	{
		double num1 = 0;
		double decVal = 0; 
		
		System.out.println ("Enter your decimal value here");
		Scanner scan = new Scanner (System.in);
		
		decVal = scan.nextDouble();
		DecimalFormat fmt = new DecimalFormat ("0.###");
		
		num1 = Math.pow (decVal, 4);
		System.out.println ("your decimal rounded up to three places is " + fmt.format(num1));
	}
	
	public static void Exercise3_12() //help!
	{
		Week day1, day2, day3, day4, day5, day6, day7;
		day1 = Week.monday;
		day2 = Week.tuesday;
		day3 = Week.wednesday;
		day4 = Week.thursday;
		day5 = Week.friday;
		day6 = Week.saturday;
		day7 = Week.sunday;
		
		System.out.println ("Day name: " + day1.name());
		
		
	}
	
	
	
	
	
	
	
	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

		
		
		
		
		



