package Pack1;
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
 * This class puts you in the middle of a zombie apocalypse.You must open the safe in and close it. 
 * 
 * THE CODE TO THE SAFE IS: 7
 */
public class LockableDriver {

	
	// This is the main driver.
	public static void main(String[] args) {
		
		CoinLockable cl = new CoinLockable(7); //implements the CoinLockable as well as the code number.
	
		//TESTS THE STATUS OF THE LOCK. IF TRUE, ITS LOCKED. IF FALSE = UNLOCKED.
		System.out.println("\n\n-----------------------------testing the boolean locked--------------------------");
		cl.lockable();
		System.out.println("-----------------------------testing the boolean locked--------------------------\n\n");
		
		//SCENARIO
		System.out.println("It is the Zombie Apocalypse.You are in a boarded up house in front of a safe. What do you want to do?");
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("PRESS 1 TO UNLOCK THE SAFE, PRESS 2 TO DO NOTHING");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		
		if (choice == 1)
		{
			System.out.println("You choose to unlock the safe.");
			System.out.println("WARNING: safe is protected by a key. Please choose to enter a key code: ");
			cl.userAnswer();
			cl.unlock(7);
			cl.lock(7);
			//CHECKS STATUS OF THE LOCK.
			System.out.println("\n\n-----------------------------testing the boolean locked--------------------------");
			cl.lockable();
			System.out.println("-----------------------------testing the boolean locked--------------------------\n\n");
			
		}
		else if (choice == 2)
		{
			System.out.println("You sit and do nothing. The zombies break down the door and kill you.");
		}
		
		
		
		
		
		
		
		
	
		
//		Design a Java interface called Lockable that includes the following methods: setKey, lock, unlock, and locked. 
		
//		The setKey, lock, and unlock methods take an integer parameter that represents the key. 
		
//		The setKey method establishes the key. The lock and unlock methods lock and unlock the object, but only if the key passed in is correct. 
		
//		The locked method returns a boolean that indicates whether or not the object is locked. 
		
//		A Lockable object represents an object whose regular methods are protected: if the object is locked, the methods cannot be invoked; if it is un-locked, they can be invoked. 

//		Redesign and implement a version of the Coin class from Chapter 5 so that it is Lockable.
		
		
		
		
		
		
		
		
		
		
		
	}

}
