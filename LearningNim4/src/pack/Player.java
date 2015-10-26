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
//			catch(InputMismatchException error){
//				System.out.println("Invalid selection, please try again.");
//				sc.next();
//			}
	    	catch(InputMismatchException error){
				System.out.println("Invalid selection, please try again.");
				sc.next();
			}
	    }
	    System.out.println("Number of 'x' to remove: " + numXtoRemove);
	    return numXtoRemove;
	}

	public boolean enactPVCChoiceToReplayAI()
	{
		boolean isGameOver = true;
		
		System.out.println("Do you wish to replay the AI? He will be smarter this time...\n");
		System.out.println("1) yes \n2) no");
		
		Scanner scan = new Scanner(System.in);
		int playerAnswer = scan.nextInt();
		
		if(playerAnswer == 1)
		{
			//play again
			//set gameover to false
			//scoreboard so there is a record of the winner first match. 
			
			//save previous game moves
			//reset board/counters and start game. 
			//save game array moves and check each time its the computers turn to see if there was a matching move that lead to a win --> iterate to do so
			
			// if losing streak --> 
			
			isGameOver = false;
		}
		else {
			isGameOver = true;
		}
		
		return isGameOver;
	}
	
}


//while(!isValidRow)
//{
//	try{
//		rowChoice = sc.nextInt();
//		isValidRow = true;
//	}
//	catch(InputMismatchException error){
//		System.out.println("Invalid selection, please try again.");
//		sc.next();
//	}
//}
//System.out.println("Row entered: " + rowChoice);