package pack;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NewGame {

	public void startup(){
		System.out.println("Welcome to the Game of Nim! Please select a game mode below.");	
		displayMenu();
	}
	
	public void displayMenu()
	{	
		System.out.println("[1] Player vs. Player");
		System.out.println("[2] Player vs. Computer");
		System.out.println("[3] Computer vs. Computer" + "\n");
		
		Scanner sc = new Scanner(System.in);	
		
	
		boolean isValidGameSelection =  false;//sc.nextInt() > 0 && sc.nextInt() < 4;
		
	    while(!isValidGameSelection){
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
			beginPlayerVsPlayer();		
		}
		else if(gameChoice == 2){
			beginPlayerVsComputer();
		}
		else{
			System.out.println("Invalid selection, please choose a game type (1-2).");
			displayMenu();
		}
	}
	
	public void beginPlayerVsPlayer(){
		System.out.print("Player vs. Player");
		
		GameUpdater gm = new GameUpdater();
		
		gm.generateNewBoard(3, 5, 7);
		gm.beginPlayerVsPlayerGame();
	}
	
	public void beginPlayerVsComputer(){
		System.out.println("Player vs. Computer");
		GameUpdater gm = new GameUpdater();
		gm.generateNewBoard(3, 5, 7);
		gm.beginPlayerVsComputer();
	}

}
