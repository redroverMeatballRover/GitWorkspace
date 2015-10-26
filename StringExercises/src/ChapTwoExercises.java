
public class ChapTwoExercises 
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		exercise2_1();
		exercise2_2();
		exercise2_3();
		exercise2_4();
		exercise2_5();
		exercise2_6();
		exercise2_7();
		exercise2_8();
		exercise2_9();
		exercise2_10();
	}
	
	// 2.1 this programming statement is the instruction to print out a line of text that says "I gotta be me".
	public static void exercise2_1()
	{
		System.out.println ("I gotta be me!");
	}	
	
	// 2.2 A string of text is produced by the following lines right up until println occurs. 
	public static void exercise2_2()
	{
		System.out.print ("Here we go!");
		System.out.print ("12345");
		System.out.print ("test this if you are not sure");
		System.out.print ("another");
		System.out.println ( );
		System.out.println ("all done");
	}	
	
	// question 2.3 asking what is wrong with the following program statement.
	// answer is that it needs a \n space to space out the sentence.
	public static void exercise2_3()
	{
		System.out.println ("To be or not to be \nthat is the question");
	}	
	/*
	 * 2.4 This creates a string that says "50 plus 25 is 5025". The reason it does this is because the + sign turns the digits after it into
	 * a string as well and keeps doing so. 
	 */
	public static void exercise2_4()
	{
		System.out.println ("50 plus 25 is " + 50 + 25);
	}	
	
	//2.5 the following output produces a poem. It also itroduces Java escape sequences that you can use to break strings up over lines of code. 
	public static void exercise2_5()
	{ 
		System.out.println ("He thrusts his fists \n against" + 
		" and the post\n and still insists \n he sees the \"ghost\"");
	}	
	
	
	/* 2.6 this shows that you can give an define an integer as a value. The value is whatever the int. size is after being multiplied/added/
	 * subtracted/divided by those numbers after it. It can also be treated as a number. 
	 */
	public static void exercise2_6()
	{
		int size = 18;
		size = size + 12;
		size = size * 12;
		size = size / 4;	
	}	
	/*
	 * 2.7 decimal values are contained in the floating point variables.
	 */
	public static void exercise2_7()
	{
		double depth = 2.4;
		depth = 20 - depth * 4;
		depth = depth / 5; 
	}	
	
	// 2.8 They are just illustrating shortcuts to do variables in. 
	public static void exercise2_8()
	{
		int length = 5;
		length *= 2;
		length *= length;
		length /= 100;
	}
	
	// 2.9 four different program statements that incriment the value of an integer variable total. 
	public static void exercise2_9()
	{
		int size = 18;
		size = 18 + 12;
		size = 18 * 12;
		size = 18 / 4;	
	}	
	
	{
		int size = 10;
		size = 10 + 12;
		size = 10 * 12;
		size = 10 / 4;	
	}	
	
	{
		double size = 5;
		size = 5 + 12;
		size = 5 * 12;
		size = 5 / 4;	
	}	
	
	{
		int size = 500;
		size = 500 + 12;
		size = 500 * 12;
		size = 500 / 4;	 
	}	
	
	public static void exercise2_10()
	{
		// 2.10 
		int iResult, num1 = 25, num2 = 40, num3 = 17, num4 = 5;
		double fResult, val1 = 17.0, val2 = 12.78;
		
		iResult = num1 / num4; //              = shows an integer.
		System.out.println (iResult); 
		
		fResult = num1 / num4; //				= 5\shows a float after creating an integer.
		System.out.println (fResult); 
		
		iResult = num3 / num4;// 				= creates an integer. throws away the decimal. 
		System.out.println (iResult); 
		
		fResult = num3 / num4;// 				= creates an integer, but shows it as a decimal because of the float. 
		System.out.println (fResult); 
		
		fResult = val1 / num4;// 				= creates a float value.  
		System.out.println (fResult);
		
		fResult = val1 / val2;// 				= creates a float value.
		System.out.println (fResult);
		
		iResult = num1 / num2; //				= creates an integer and throws away the decimal. 
		System.out.println (iResult); 
		
		fResult = (double) num1 / num2;// 		= creates a integer that initially throws away the decimal, but the "double" makes it come back.
		System.out.println (fResult); 
		
		fResult = num1 / (double) num2; //		= divides num1 by num2, which because it has (double) in front is an decimal. 
 		System.out.println (fResult); 
		
		fResult = (double) (num1 / num2); //	= two integers become a decimal.
		System.out.println (fResult); 
		
		iResult = (int) (val1 / num4); //		= becomes an integer.
		System.out.println (iResult); 
		
		fResult = (int) (val1 / num4); //		= becomes a decimal. 
		System.out.println (fResult); 
		
		fResult = (int) ((double) num1 / num2);// = becomes a decimal
		System.out.println (fResult); 
		
		iResult = num3 % num4;// 				= shows the remainder of the two integers.
		System.out.println (iResult); 
		
		iResult = num2 % num3;// 				= shows the remainder of the two integers.
		System.out.println (iResult); 
		
		iResult = num3 % num2;// 				= shows the remainder of the two integers.	
		System.out.println (iResult); 
		
		iResult = num2 % num4;// 				= shows the remainder of the two integers.
		System.out.println (iResult); 
	}

}	
