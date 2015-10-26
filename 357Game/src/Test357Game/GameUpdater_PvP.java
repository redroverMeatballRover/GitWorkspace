package Test357Game;

import java.util.Scanner;

public class GameUpdater_PvP {

public String[][] boardUpdate2 = new String[3][7]; 
	
//	int rowSelection;
//	int xToDelete;
	
	
	int row;
	int xNum;
	
	
	
	public void initiateGame(String[][] boardUpdate)
	{
		//start turns
		boardUpdate2 = boardUpdate; 
		//use some value to distiguish the players
		Player player = new Player();
		player.playerTurn();
	}
	
	
	
	//array length
	
	//foreach
	
	
//	they delete 2
//	array has 3
//	
//	arraylength = 1
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void enactMoveAndUpdateGame(int x, int y)
	{
		System.out.println("Got Here!");
		row = x;
		xNum = y;
		enactPlayerAction(boardUpdate2);
		System.out.println("Got Here!");
		
	}

	
	public void enactPlayerAction(String[][] currentBoard)
	{
		//choose correct row
			
		String nullSquare = " - ";
		
		for (int i = 0; i < xNum; i++)
		{
			if(currentBoard[row][i] != null)
				currentBoard[row][i] = nullSquare;		
		}
		
		//NEEDS TO PRINT THE GAME AGAIN
		
		
	}
	
	
}
