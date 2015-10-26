import java.util.Scanner;

public class CSchaffer_Chap4 {
	/*--------------------------------------------------------------------------------------------- 
	 * This assignment is chapter 4 exercises 4.1 through 4.20.
	 * --------------------------------------------------------------------------------------------
	 */
	
	public static void main(String[] args) 
	
	{
		Exercise4_1();
		Exercise4_2();
		Exercise4_3();
		Exercise4_4();
		Exercise4_5();
		Exercise4_6();
		Exercise4_7();
		Exercise4_8();
		Exercise4_9();
		Exercise4_10();
		Exercise4_11();
		Exercise4_12();
		Exercise4_13();
		Exercise4_14();
		Exercise4_15();
		Exercise4_16();
		Exercise4_17();
		Exercise4_18();
		Exercise4_19();
		Exercise4_20();
		Cheat();
		Cheat2();
		Cheat3();
	}
	
	public static void Exercise4_1()
	{
		/*What happens in the MinofThree program if two or more of the values are equal?
		 * ANSWER: The program would not move forward. If three of the integers are the same, 
		 * the program will just spit out the same integer that the user put in because
		 * the "if" / "else" statements are ignored because nothing can be decided.  
		 * 
		 * If two of the integers are the same, of the three integers you plug in, 
		 * the one that is the lowest value will be picked because there are only two values
		 * (the higher one and the lower one) to choose from. the program chooses the lowest one. 
		 */
		System.out.println ("This is exercise 4.1");
		
		int num1, num2, num3, min = 0;
		
		Scanner scan = new Scanner (System.in);
		System.out.println ("Enter three Integers: ");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextInt();
		
		if (num1 < num2)
			if (num1 < num3)
				min = num1;
			else
				min = num3;
		else 
			if (num2 < num3)
				min = num2;
			else 
				min = num3;
		
		System.out.println ("Minimum value " + min);
	}
	
	
	public static void Exercise4_2()
	{
		System.out.println ("This is exercise 4.2");
		/*Q: what is wrong with the following code fragment?
		 * 
		 * The sum cannot be higher than the max. In the incorrect code, it reads 
		 * 
		 * if (total == MAX)
		 * 	if (total < sum)
		 * 		System.out.println ("total == MAX and < sum");
		 * 
		 * this code will not run because the sum will never be higher than the max.
		 */
	}
	
	public static void Exercise4_3()
	{
		System.out.println ("This is exercise 4.3");
		/*Q: What is wrong with the code?
		 * the code
		 * 
		 * if (Length = MIN_LENGTH)
		 * 		System.out.println (The length is minimal")
		 * 
		 * will not print because in the IF statement it needs to be
		 * 
		 * if (length == MIN_LENGTH)
		 * 
		 * because IF statements need a double equals ( == )
		 */
	}
	
	public static void Exercise4_4()
	{
		/*Q: what output is produced by the following code fragment?
		 * 
		 * This code prints out "apple" "orange" "pear"
		 * It has nothing to do with the max or the num, reason being because first, there
		 * are no brackets for the IF statement to claim. Even with brackets, The program would 
		 * print out "apple" "orange" and "pear" anyways, because the num is always higher than
		 * the max*2, which is 50. 87 will always be higher than 50. 
		 */
		System.out.println ("This is exercise 4.4");
		
		int num = 87, max = 25;
		if(num >= max*2)
			System.out.println ("apple");
			System.out.println ("orange");
		System.out.println ("pear");
	}
	
	public static void Exercise4_5()
	{
		System.out.println ("This is exercise 4.5");
		/*Q: what is the output of the following code fragment?
		 * 
		 * The output of this code is just "grape".  
		 * In the second IF statement, num1 == num2 cannot work because 15 does not ever equal 40.
		 * That being said, the program will not execute the following println statements.  
		 * 
		 * Therefore, the only think printed is "grape" because it has no condition not to be printed.
		 */
	}
	
	public static void Exercise4_6()
	{
		System.out.println ("This is exercise 4.6");
		/*the lexiconic ordering of the words in 4.6
		 * 
		 * 1. "       " (aka SPACE)
		 * 2. ******
		 * 3. 12345
		 * 4. 6789
		 * 5. ;+<?
		 * 6. ?-?-?-?
		 * 7. Ethel
		 * 8. HEPHALUMP
		 * 9. Lucy
		 * 10. ^^^^^^^^^^^^^^^
		 * 11. book
		 * 12. bookkeeper
		 * 13. fred
		 * 14. hephalump
		 * 15. ricky
		 * 16. {([])}
		 */
	}
	
	public static void Exercise4_7()
	{
		System.out.println ("This is exercise 4.7");
		/* Q: what is the output of the following code?
		 * 
		 * The first time through, the program will print the num as 0.
		  * The second time through, the program will print the num as 4. 
		  * this will continue and the integer will keep increasing by incriments
		  * of four until the 5th or 6th cycle where the integer = 20 or 24. Then the statement 
		  * will be false and the cycle will stop. The full output of the program will be:
		  * 
		  * 0
		  * 4
		  * 8
		  * 12
		  * 16
		  * 20
		 */
	}
	
	public static void Exercise4_8()
	{
		System.out.println ("This is exercise 4.8");
		/*Q: what is the output of the following code?
		 * 
		  * the remainder of 1 divided by 2 will be printed, then incrimented by one. so 1
		  * will become two after the program is finished. The program loop keeps going until 
		  * the numbers reach 20. 
		  */
	}
	
	public static void Exercise4_9()
	{
		System.out.println ("This is exercise 4.9");
		/* Q: what is the output of the following code?
		 * 
		  * this prints out a loop that increases by incriments of 2 all the way up to 200. 
		 */
	}
	
	public static void Exercise4_10()
	{
		System.out.println ("This is exercise 4.10"); 
		/* Q: what is the output of the following code?
		 * 
		 * The output of the code is decreasing numbers. 
		  * 200 is divded by 4 and the remainder is printed. 200 decreases by 1 each rotation, 
		  * and the remainder is returned until it gets down to 0, where the loop stops. 
		 */
	}
	
	public static void Exercise4_11() //help
	{
		System.out.println ("This is exercise 4.11");
		/* Q: transform the while loop into a do loop
		 * 
		  * int num = 1;
		  * while (num < 20 )
		  * 	{
		  * 		num++
		  * 		System.out.println (num);
		  *		 }
		  *
		  *make it a DO loop:
		  *
		  *int num = 19;
		  * do (num < 20 )
		  * 	{
		  * 		num++
		  * 		System.out.println (num);
		  *		 }
		 */
		
		//-----------------------------------------------------------------------------------------
		// this is a test of exercise 4.11 for the WHILE statement
		//-----------------------------------------------------------------------------------------
		//System.out.println ("This is exercise 4.11.");
		
		/*int num = 1;
		  while (num < 20 )
		  {
		   	num++;
		   	System.out.println (num);
		  }
		  
		  System.out.println ("This is the end of exercise 4.11.");  
		  */
		//--------------------------------------------------------------------------------------
		// this is a test for the DO statement 
		//--------------------------------------------------------------------------------------
		System.out.println ("afdadfadfadfa.");
		
		int num = 1;	
		
		do 
		{
			num++;
			System.out.println (num);
		}
		while (num < 20);
		System.out.println ("adfsadfasgsfgs."); 
		
	}
	
	public static void Exercise4_12()
	{
		 /* transfer the while loop into a for loop. 
		  * exercise 4.12 
		 */
		System.out.println ("This is exercise 4.12.");
		
		   for (int num = 1; num < 20; num++ )
		   {
			   System.out.println (num);  
		   }
		  		
	
		   System.out.println ("This is exercise 4.12.");
	}
	
	public static void Exercise4_13()
	
	
	/*What is wrong with the below code fragment?
	 * 1. COUNT should be subtracting 1
	 * 2. COUNT will always be greater than 0 because it starts at 50 and does not subtract by 1
	 * 3. It is not a WHILE loop
	 */
	
	// original problem
	{
		
		System.out.println ("This is exercise 4.13");
	/*	count = 50;
		while (count >= 0)
		{
			System.out.println (count);
			count = count + 1;
		}
		*/
	
	// First way to fix the problem
	/*	{
		MAX = 50;
		while (num >= 0)
		{
			System.out.println (num);
			count = count + 1;
		}
	*/
	}
	
	public static void Exercise4_14()
	{
		//write a while loop that verifies that the user enters a positive integer. 
		System.out.println ("This is exercise 4.14");
		System.out.println ("Please enter a positive integer ");
		
		Scanner scan = new Scanner (System.in);
		int choice = scan.nextInt();
		
		while (choice <= 0 )
		{
			System.out.println ("Please enter a positive integer " );
			choice = scan.nextInt();
		}	
	}
	
	public static void Exercise4_15()
	{
		//write a do loop that verifies that the user enters an even integer.
		System.out.println ("This is exercise 4.15");
		int number; 
		Scanner scan = new Scanner (System.in);
		
		do	
		{
			System.out.println ("Enter an even integer: ");
			number = scan.nextInt();
			number = number % 2;
			if (number % 2 == 0 )
			{
				System.out.println ("you have enter an even number yay");
			} 
			else 
			{
				System.out.println ("you have entered an odd number, bad boy!");
			}		
		}
		while (number % 2 == 1);
	}
	
	public static void Exercise4_16()
	{
		/*write a code fragment that reads and prints integer values
		 * entered by a user until a particular sentinel value is entered. do
		 * not print the sentinel value 
		 */
		System.out.println ("This is exercise 4.16");
	/*	SENTINEL = 10;
		
		System.out.println ("please enter a number between 0 and 15 ");
		number = scan.nextInt();
		
		while
		*/ 
		 final int SENTINEL = 10;
		 int number = 0;
		Scanner scan = new Scanner (System.in);
	
		do	
		{
			System.out.println ("Enter a number between 1 and 15 until you find the magic number: ");
			number = scan.nextInt();
			
			if (number == SENTINEL)
			{
				System.out.println ("You have entered the magic number");
			} 
			else 
			{
				System.out.println ("Wrong! please enter another number.");
			}		
		}
		while ( number  != SENTINEL);
	}
	
	public static void Exercise4_17()
	{
		//write  a for loop to print the odd numbers from 1 to 99
		System.out.println ("This is exercise 4.17");
		for ( int num = 1; num <= 99; num += 2)
		{
			System.out.println (num); 
		}
	}
	
	public static void Exercise4_18()
	{
		// write a for loop to print multiples of three from 300 to 3
		System.out.println ("This is exercise 4.18");
		for ( int num = 300; num >= 3; num -= 3)
		{
			System.out.println (num); 
		}
	}
	
	public static void Exercise4_19()
	{
		//write a code frag that reads 10 int values from the user and prints
		//the highest one
		System.out.println ("This is exercise 4.19");
		//if (number )
	}
	
	public static void Exercise4_20()
	{
		//write a code that computes the sum of the int from
		//20 to 70 incluseive, then prints the results.
		System.out.println ("This is exercise 4.20");
		int sum = 0;
		for (int num = 20; num <= 70  ; num++)
		{
			sum = num + sum;
		}
		System.out.println (sum);
		
	}
	
	public static void Cheat()
	{
	for (int count = 1; count < 101; count++)
		System.out.println (count);
	}		
	
	public static void Cheat2()
	{
	for (int count = 100; count > 1; count = count -1)
		System.out.println (count);
	}		
	public static void Cheat3()
	{
	for (int count = 5; count < 100; count = count + 5 )
		System.out.println (count);
	}		
			





}
	
	
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
