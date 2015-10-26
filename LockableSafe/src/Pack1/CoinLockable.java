package Pack1;
import java.util.Scanner;

/**
 * author: Cody Schaffer
 * 
 * This class is designed after the coin class in chapter 5. It implements the lockable interface, 
 * and uses the classes inside it. The program will not allow the user to access the methods inside the 
 * safe unless it is unlocked. 
 */

public class CoinLockable implements Lockable {

	private int safeKey = 7;
	int userKey;
	boolean locked = true;
	
	//constructor
	public CoinLockable(int key)
	{
		safeKey = key;
	}
	
	//method looks for user answer.
	public void userAnswer()
	{
		Scanner scan = new Scanner(System.in);
		userKey = scan.nextInt();
	}
	
	//sets the key number.
	@Override
	public void setKey(int key) {
	
		safeKey = key;
	}
	
	// locks the safe.
	@Override
	public void lock(int key) {
		
		
		if (userKey == key)
		{
			System.out.println("You have locked the safe.");
			locked = true;
		}
		else
		{
			System.out.println("Invalid key. Please try again to lock the safe.");
			locked =  false;
			userAnswer();
			lock(7);
		}
	}
	
	// unlocks the safe.
	@Override
	public void unlock(int key) {
	
	while(locked = true)
	{
		if (userKey == key)
		{
			locked = false;
			
			//TESTS THE LOCK STATUS
			System.out.println("\n\n-----------------------------testing the boolean locked--------------------------");
			lockable();
			System.out.println("-----------------------------testing the boolean locked--------------------------\n\n");
			
			System.out.println("You have unlocked the safe.");
			System.out.println("-----------------------------------------------------");
			
			//ACCESS INNER SAFE METHODS------------------------------------------------------------------------------------------//
			safeBox();
			insideSafe();
			//------------------------------------------------------------------------------------------------------------------//
			
			System.out.println("-----------------------------------------------------");
			System.out.println("\n CHOICE: You have taken possession of the safe's contents. Please close and lock the safe with the key: ");
			userAnswer();
			//lock(7);
			break;
		}
		
		else
		{
			System.out.println("Invalid Key. Please Try again to unlock the safe.");
			locked = true;
			userAnswer();
		}	
	}
	}

	//checks the status of the lock. 
	@Override
	public boolean lockable() {
		
		System.out.println(locked);
		return  locked;
	}
	
	//returns the safe status.
	public String toString()
	{
	  return "The safe is locked: " + locked;
	}
	
	
	
	
	//---------------------------------------------------------------------//
	//METHODS OF INNER SAFE
	// lets you know you accessed the safe.
	public void safeBox()
	{
		System.out.println("You have access to the safe.");
	}
	
	//gives you a description of whats in the safe.
	public void insideSafe()
	{
		System.out.println("Inside the safe: 1 million dollars in cash.");
		System.out.println("Also inside: 1 glock, an MP5, grenades and body armor.");
	}
}