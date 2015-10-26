package pack;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {

	
	public void startup(){
		System.out.println("Welcome to the Game of Nim! Please select a game mode below.");	
		displayMenu();
	}
	
	public void displayMenu()
	{	
		System.out.println("[1] * Player vs. Player");
		System.out.println("[2] * Player vs. Computer");
		System.out.println("[3] * Computer vs. Computer" + "\n");
		
		Scanner sc = new Scanner(System.in);	
		
	
		boolean isValidGameSelection =  true;
		
	    while(isValidGameSelection){
	    	try{
				int gameChoice = sc.nextInt();
				gameType(gameChoice);
				isValidGameSelection = true;
			}
			catch(InputMismatchException error){
				System.out.println("Invalid selection, please choose a game type (1-3).");
				sc.next();
			}
	    }
	}
	
	public void gameType(int gameChoice)
	{
		if(gameChoice == 1){
			System.out.println("Player vs. Player");
			beginNim(false);	
		}
		else if(gameChoice == 2){
			System.out.println("Player vs. Computer");
			beginNim(true);
		}
		else{
			System.out.println("Invalid selection, please choose a game type (1-2).");
			displayMenu();
		}
	}
	
	
	public void beginNim(boolean AIActivation){	
		GameUpdater gm = new GameUpdater();
		gm.generateNewBoard();
		gm.beginGame(AIActivation);
		
		//System.out.println("Would you like to play again?");
	}
	
	
	private void endOfGameOptions()
	{
		System.out.println("-------------------------------------------------------GOOD GAME!-------------------------------------------------------");
		System.out.println("1) Return to Menu");
		System.out.println("2) Close NIM");
		
		Scanner scan2 = new Scanner(System.in);
		int playerAnswer = scan2.nextInt();
		
		if(playerAnswer == 1)
		{
			displayMenu(); //THIS IS A RECURSIVE MOVE --> NEED TO REFACTOR
		}
		else {
			System.exit(0);
		}
		
	}
	
	
}
