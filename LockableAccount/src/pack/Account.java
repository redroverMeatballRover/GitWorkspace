package pack;
import java.text.NumberFormat;
import java.util.Scanner;

/**
 * 
 * @author cschaffer
 *
 *This account is taken from the chapter 5 class called Accounts. This time, we impliment the Lockable interface, and use it to lock all of the accounts. 
 *the entire code is from the other program called lockable driver that i built in  assignment 9.8. 
 */

public class Account implements Lockable {
	private final double RATE = 0.035; // interest rate of 3.5%

	private String name;
	private long acctNumber;
	private double balance;
	
	//LOCKS//----------------------------------------------//
	private int safeKey = 7;
	int userKey;
	boolean locked = true;
	//----------------------------------------------------//

	//constructor
	public Account(String owner, long account, double initial) {
		name = owner;
		acctNumber = account;
		balance = initial;
	}
	//overridden constructor
	public Account(int key)
	{
		safeKey = key;
	}
	
	
	//scans for user answer
	public void userAnswer()
	{
		Scanner scan = new Scanner(System.in);
		userKey = scan.nextInt();
	}

	//sets the key
	@Override
	public void setKey(int key) {
		safeKey = key;
	}
	
	//user locks the account
	@Override
	public void lock(int key) {

		System.out.println("-----------------------------------------------------");
		System.out.println("\n TRANSACTION COMPLETE: Please close and lock the account with the key code: ");
		userAnswer();
		
		if (userKey == key)
		{
			System.out.println("You have locked the account. Thank You and have a good day!");
			locked = true;
		}
		else
		{
			System.out.println("Invalid key. Please try again to lock the account.");
			locked =  false;
			userAnswer();
			lock(7);
		}
		
	}

	//user unlocks the account
	@Override
	public void unlock(int key) {
		while(locked = true)
		{
			if (userKey == key)
			{
				locked = false;
				System.out.println("You have unlocked your account.");
				//locked();
				System.out.println("-----------------------------------------------------");
				
				deposit(0);
				withdraw(0, 0);
				addInterest();
				getBalance();
			
				break;
			
			}
			
			else
			{
				System.out.println("Invalid Key. Please Try again to unlock the account.");
				locked = true;
				userAnswer();
			}	
		}
		
	}

	//checks lock status.
	@Override
	public boolean lockable() {
		
		System.out.println(locked);
		return  locked;
	}
	
	
	//returns the string. 
	public String toString() {
		NumberFormat fmt = NumberFormat.getCurrencyInstance();

		return (acctNumber + "\t" + name + "\t" + fmt.format(balance));
	}
	
	
	//OCCURS AFTER UNLOCKED//
	//------------------------------------------------------------------------------------------//
	//deposits
	public double deposit(double amount) {
		if (amount > 0)
			balance = balance + amount;

		return balance;
	}

	//withdraws
	public double withdraw(double amount, double fee) {
		if (amount + fee > 0 && amount + fee < balance)
			balance = balance - amount - fee;

		return balance;
	}

	//addInterest
	public double addInterest() {
		balance += (balance * RATE);
		return balance;
	}

	//getBalance
	public double getBalance() {
		return balance;
	}
	//------------------------------------------------------------------------------------------//

}
