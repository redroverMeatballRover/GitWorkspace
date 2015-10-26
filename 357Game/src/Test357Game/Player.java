package Test357Game;

import java.util.Scanner;

public class Player {

	
	int playerValue;
	GameUpdater_PvP update = new GameUpdater_PvP();
	
//	public Player(int playerValue)
//	{
//		this.playerValue = playerValue;
//	}
	
	int rowSelection;
	int xToDelete;
	
	public void playerTurn()
	{
		System.out.println("Which Row would you like to remove from?");
		Scanner scanForRow = new Scanner(System.in);
		rowSelection = scanForRow.nextInt();
		
		System.out.println("How many X's would you like to remove?");
		Scanner scanForXDeletion = new Scanner(System.in);
		xToDelete = scanForXDeletion.nextInt();
		
		update.enactMoveAndUpdateGame(rowSelection, xToDelete);
	}
	
	

}
