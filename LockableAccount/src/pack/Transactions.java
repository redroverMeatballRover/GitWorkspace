package pack;
import java.util.Scanner;

/**
 * author: Cody Schaffer
 * 
 * This class designs a Java interface called Lockable that includes the following methods: setKey, lock, unlock, and locked.
 * The setKey, lock, and unlock methods take an integer parameter that represents the key. 
 * The setKey method establishes the key. The lock and unlock methods lock and unlock the object, but only if the key passed in is correct. 
 * The locked method returns a boolean that indicates whether or not the object is locked. 
 * A Lockable object represents an object whose regular methods are protected: if the object is locked, the methods cannot be invoked; if it is un-locked, they can be invoked. 
 * Redesign and implement a version of the Coin class from Chapter 5 so that it is Lockable.
 * 
 * 
 * This Program lets you become one of three people: Arnold, Ekaterina, or Ashley. Once you choose a character, you must enter in an individual code to
 * access their accounts. Each person will do one thing in their account. Finally, the program will return everybody's accounts for the end of the day.  
 * 
 * Arnold code: 7
 * Ekaterina code: 8
 * Ashley code: 9
 */
public class Transactions {
	
	public static void main(String[] args) {
		//ACCOUNT PEOPLE//------------------------------------------------------------------//
		Account acct1 = new Account("Arnold Schwazenegger", 72354, 100.00);
		Account acct2 = new Account("Ekaterina Linkova", 69713, 500.00);
		Account acct3 = new Account("Ashley Violet", 93757, 769.32);
		//----------------------------------------------------------------------------------//
		
		//FIRST CHOICE: CHOOSE A CUSTOMER---------------------------------------------------------------------------------//
		System.out.println("Choose from one of three people to see their account: Arnold, Ekaterina, or Ashley.");
		System.out.println("------------------------------------------------------------------------------------------------");
		System.out.println("PRESS 1 for Arnold, PRESS 2 for Ekaterina, PRESS 3 for Ashley");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		//----------------------------------------------------------------------------------------------------------------//
		
		//ARNOLD SECTION---------------------------------------------------------------------------------------------------------------//
		if (choice == 1) 
		{
			System.out.println("You are Arnold Schwarzenegger and you have to deposit money into the bank. What do you do?");
			System.out.println("----------------------------------------------------------------------------");
			System.out.println("PRESS 1 TO UNLOCK THE ACCOUNT, PRESS 2 TO DO NOTHING");
			int choice1 = scanner.nextInt();

			if (choice1 == 1) {
				System.out.println("You choose to unlock the account.");
				System.out.println("the account is protected by a key. Please choose to enter a key code: ");
				
				acct1.userAnswer();
				acct1.unlock(7);
				
				//OPENING THE ACCOUNT --------------------------------------------------------------------------------------------------//
				double arnoldBalance = acct1.deposit(200.00);
				
				System.out.println("Arnold's balance after deposit: " + arnoldBalance);
				acct1.addInterest();
				
				System.out.println();
				System.out.println(acct1);
				// ---------------------------------------------------------------------------------------------------//
				acct1.lock(7);
			} 
			else if (choice1 == 2) 
			{
				System.out.println("You stand there, checking out the bank girl. She notices you have humongous muscles. You get her number despite not being able to talk comprehensible english.");
			}
		}
		//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
		
		//EKATERINA CODE//---------------------------------------------------------------------------------------------------------------------------------------------------------------------//
		else if (choice == 2) 
		{
			System.out.println("You are Ekaterina Linkova and you have to deposit money and pull money out of the bank. What do you do?");
			System.out.println("----------------------------------------------------------------------------");
			System.out.println("PRESS 1 TO UNLOCK THE ACCOUNT, PRESS 2 TO DO NOTHING");
			int choice1 = scanner.nextInt();
			
			if (choice1 == 1) {
				System.out.println("You choose to unlock the account.");
				System.out.println("the account is protected by a key. Please choose to enter a key code: ");
				acct1.userAnswer();
				acct1.unlock(8);
				
				// --------------------------------------------------------------------------------------------------//
				 double linkovaBalance = acct2.deposit(75.25);
				 System.out.println("Ekatrina Linkova balance after deposit: " +
				 linkovaBalance);

				 System.out.println("Linkova balance after withdrawal: "
				 + acct2.withdraw(480, 1.50));

				 acct2.addInterest();
				System.out.println();
				 System.out.println(acct2);
				// ---------------------------------------------------------------------------------------------------//
				 acct1.lock(8);
				 
			} else if (choice1 == 2) {
				System.out.println("You stand there. The bank girl looks really hot. But then she picks her nose. You decide not to pursue any lesbian connection.");
			}
		}
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
		
		//ASHLEY CODE-------------------------------------------------------------------------------------------------------------------------------------------------------------------//
		else if (choice == 3) 
		{
			System.out.println("You are Ashley Violet and you want to check how much money you have in the bank. What do you do?");
			System.out.println("----------------------------------------------------------------------------");
			System.out.println("PRESS 1 TO UNLOCK THE ACCOUNT, PRESS 2 TO DO NOTHING");
			int choice1 = scanner.nextInt();

			if (choice1 == 1) {
				System.out.println("You choose to unlock the account.");
				System.out.println("the account is protected by a key. Please choose to enter a key code: ");
				acct1.userAnswer();
				acct1.unlock(9);
				
				// --------------------------------------------------------------------------------------------------//
				 acct3.withdraw(-100.00, 1.50); // invalid transaction
				 acct3.addInterest();
				System.out.println();
				 System.out.println(acct3);
				// ---------------------------------------------------------------------------------------------------//
				 acct1.lock(9);

			} else if (choice1 == 2) {
				System.out.println("You stand there, looking blankly at the banker girl. The girl suddenly gives birth to her baby. Thank god you are a doctor and can help her.");
			}

		}		
		
	System.out.println("\n\n---------------------------------------------------------------------------------------------");	
	System.out.println("ALL CUSTOMERS ACCOUNTS: \n");
	System.out.println(acct1);
	System.out.println(acct2);
	System.out.println(acct3);
	
	}
}


