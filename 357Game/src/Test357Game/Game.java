package Test357Game;

import java.util.Scanner;

public class Game {


	public void runGame()
	{
		System.out.println("Welcome to the 3-5-7 Game!");
		System.out.println("\n Please Choose a Game Type: \n 1) Player vs. Player \n 2) Player vs. Computer");
		
		Scanner scanForNumber = new Scanner(System.in);
		int gameType = scanForNumber.nextInt();
			
		System.out.println("You chose: " + gameType );
		
		//refactor this
		if (gameType == 1)
			runPvP();
		else if (gameType == 2)
			runPvC();
		else 
			System.out.println("INVALID INPUT --> <-- GO AGAIN");
	}
	
	public static void runPvP()
	{
		System.out.println("-------------------PLAYER vs. PLAYER-------------------");
		//SETS UP GAME
		GameCreator creator = new GameCreator();
		//creator.print();
		creator.newGame();
		
	}
	
	public static void runPvC()
	{
		System.out.println("-------------------PLAYER vs. COMPUTER-------------------");
		//SETS UP GAME
	}
}

