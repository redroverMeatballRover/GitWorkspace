package pack;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Player extends ParticipantActions{

	public int getRow()
	{
		
		System.out.println("Which row would you like to remove an 'x' from?");	
		Scanner sc = new Scanner(System.in);
		
		boolean isValidRow = false;	
		int rowChoice = 0;
		
	    while(!isValidRow)
	    {
	    	try{
				rowChoice = sc.nextInt();
				isValidRow = true;
			}
			catch(InputMismatchException error){
				System.out.println("Invalid selection, please try again.");
				sc.next();
			}
	    }
	    System.out.println("Row entered: " + rowChoice);
	    return rowChoice;
	}

	public int getNumXtoRemove()
	{
	
		System.out.println("How many 'x' would you like to remove?" ); 
		Scanner sc = new Scanner(System.in);
		
		boolean isValidNumXtoRemove = false;
		int numXtoRemove = 0;
		
	    while(!isValidNumXtoRemove){
	    	try{
	    		numXtoRemove = sc.nextInt();
	    		isValidNumXtoRemove = true;
			}
			catch(InputMismatchException error){
				System.out.println("Invalid selection, please try again.");
				sc.next();
			}
	    }
	    System.out.println("Number of 'x' to remove: " + numXtoRemove);
	    return numXtoRemove;
	}

}
