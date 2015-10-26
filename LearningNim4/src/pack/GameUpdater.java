package pack;

import java.util.Arrays;
import java.util.Scanner;

public class GameUpdater {

	
	Game g = new Game();
	AIMemoryAnalysisSystems memory = new AIMemoryAnalysisSystems();
	Player pl = new Player();
	AIComputer ai = new AIComputer();
	
	
	//IMPORTANT //------------------------//
	//switch these to just ints, and update the row length. This will modify the print.
	//------------------------------------//
	int[] row1; 
	int[] row2;
	int[] row3;
	//TESTING
	int row111;
	int row222;
	int row333;
	//-----------------------------------//
	
	//make these final-----------------------//
	int row1Length = 3;
	int row2Length = 5;
	int row3Length = 7;
	int numberOfRows = 3;
	//--------------------------------------//
	
	
//	int[][] rowDesignate;
	int[] rowDesignate2;
	
	
//	int[][] dynamicRowCollection; 
	int[] dynamicRowCollection2; 
	
	//RENAME THESE BECAUSE WE NEED TO RESET THIS
	int[][] moveCollector = new int[][] {{1,2,3}};
	
	int moveCollectorSizeUpdater = 1;
	int numberOfTurnsTakenIndexVersion = 0;
	//-------------------------------------------//
	
	//NEVER RESET THESE //----------------------------------------------//
	int winnerOfMatchIndexer = 0;
	int countdownToAISmartPlay = 1; 
	int winnerOfMatchListIndexer = 1;
	//------------------------------------------------------------------//
	
	String[] winnerOfMatch = new String[winnerOfMatchListIndexer];
	
	String currentPlayerName = "";
	boolean isPlayer1Turn = true;
	boolean gameOver = false;
	public boolean AIGameIsUnderway = false;
	
	
	//INITIATION GAME SYSTEM
	//----------------------------------------------------------------//
	public void generateNewBoard()
	{
//		row1 = new int[row1Length];
//		row2 = new int[row2Length];
//		row3 = new int[row3Length];
		
//		rowDesignate = new int[][] {row1, row2, row3};
//		
//		for(int j = 1; j < 3; j++)
//			for(int i = 0; i < rowDesignate[j].length; i++)
//				rowDesignate[j][i] = 1;
//		
//		printBoard(row1, row2, row3);
		
		row111 = 3;
		row222 = 5;
		row333 = 7;
		
		printBoard2(row111, row222, row333);
	}
	
//	private void printBoard(int[] one, int[] two, int[]three){
//		
//		dynamicRowCollection = new int[][] {one, two, three};
//		
//		for(int i = 0; i < dynamicRowCollection.length; i++)
//		{
//				System.out.println("");
//				System.out.print("["+ (i + 1) + "] ");
//				for(int value: dynamicRowCollection[i])
//				{
//					System.out.print(" x ");
//				}
//		}
//		System.out.println("\n\n");
//	}
	
	
	private void printBoard2(int one, int two, int three){
		
		dynamicRowCollection2 = new int[] {one, two, three};
		
		for(int i = 0; i < dynamicRowCollection2.length; i++)
		{
			for(int j = 0; j < dynamicRowCollection2[i]; j++)
			{
					System.out.print(" x ");
			}
			System.out.println("");
		}
		
		System.out.println("\n\n");
	}
	
	public void beginGame(boolean NimAIwasActivated)
	{
		AIGameIsUnderway =  NimAIwasActivated;
		currentPlayerName = getCurrentPlayerName();

		while(!gameOver)
		{
			promptTurn();
		}
	}
	//-------------------------------------------------------------------//
	
	
	//GAMEPLAY ACTION
	//---------------------------------------------------------------------//
	public void promptTurn()
	{
		int chosenRow;	
		if (!AIGameIsUnderway)
		{
			//MAKE CALL TO PVP
			
			chosenRow = pl.getRow();
			int numXtoRemove = pl.getNumXtoRemove();
			validateMove(chosenRow, numXtoRemove);	
		}
		else 
		{
			if(currentPlayerName == "Player1")
			{
				chosenRow = pl.getRow();
				int numXtoRemove = pl.getNumXtoRemove();
				validateMove(chosenRow, numXtoRemove);
			}
			else if(currentPlayerName == "Computer")
			{
				//get current board and pass it to the AI
				ai.getCurrentBoard(row1, row2, row3);
				ai.getRoundNumber(countdownToAISmartPlay);
				
				chosenRow = ai.getRow();
				int numXtoRemove = ai.getNumToRemove(chosenRow);
				validateMove(chosenRow, numXtoRemove);
			}
		}
	}
	
	public void validateMove(int row, int numXtoRemove)
	{
//		if(dynamicRowCollection[row - 1].length >= numXtoRemove)
//		{
//			updateAndSwitchPlayers(row, numXtoRemove);		
//		}	
//		else if (dynamicRowCollection[row - 1].length < numXtoRemove)
//		{
//			System.out.println("Invalid move, please try again.");
//		}
//		checkForWinner();
		
		if(dynamicRowCollection2[row - 1] >= numXtoRemove)
		{
			updateAndSwitchPlayers(row, numXtoRemove);		
		}	
		else if (dynamicRowCollection2[row - 1] < numXtoRemove)
		{
			System.out.println("Invalid move, please try again.");
		}
		checkForWinner();
	}

	private void updateBoard(int row, int numXtoRemove)
	{
//		int numToRemove;
//		int selectedRowLength = dynamicRowCollection[row - 1].length;
//		
//		numToRemove = selectedRowLength - numXtoRemove;
//		dynamicRowCollection[row - 1] = new int[numToRemove];		
//		printBoard(dynamicRowCollection[0], dynamicRowCollection[1], dynamicRowCollection[2]);
//		updateMoveCollector(dynamicRowCollection[0], dynamicRowCollection[1], dynamicRowCollection[2]);
		
		int numToRemove;
		int selectedRowLength = dynamicRowCollection2[row - 1];
		
		numToRemove = selectedRowLength - numXtoRemove;
		dynamicRowCollection2[row - 1] = new int[numToRemove];		
		printBoard2(dynamicRowCollection2[0], dynamicRowCollection2[1], dynamicRowCollection2[2]);
		updateMoveCollector2(dynamicRowCollection2[0], dynamicRowCollection2[1], dynamicRowCollection2[2]);
	}
	
	private void checkForWinner()
	{		
//		if(dynamicRowCollection[0].length == 0 && dynamicRowCollection[1].length == 0 && dynamicRowCollection[2].length == 1)
//		{
//			postGame();
//		}
//		if(dynamicRowCollection[1].length == 0 && dynamicRowCollection[1].length == 0 && dynamicRowCollection[2].length == 0)
//		{
//			postGame();
//		}
//		if(dynamicRowCollection[0].length == 0 && dynamicRowCollection[1].length == 1 && dynamicRowCollection[2].length == 0)
//		{
//			postGame();
//		}	
	}
	
	private void updateAndSwitchPlayers(int row, int numXtoRemove) {
		updateBoard(row, numXtoRemove);
		switchTurns();
	}
	//-----------------------------------------------------------------------//
	
//	public void updateMoveCollector(int[] one, int[] two, int[]three)
//	{
//		System.out.println("Row one length: " +  one.length);
//		System.out.println("Row two length: " +  two.length);
//		System.out.println("Row three length: " +  three.length);
//		
//		int a = one.length;
//		int b = two.length;
//		int c = three.length;
//		
//		int[] currentRowLengths = new int[] {a, b, c}; 
//		
//		int[][] moveCollectorUpdater = Arrays.copyOf(moveCollector, moveCollectorSizeUpdater);
//		moveCollectorUpdater[moveCollectorSizeUpdater - 1] = currentRowLengths;
//		
//		
//		moveCollector = moveCollectorUpdater;
//		System.out.println("THIS IS THE COUNT: " + moveCollectorSizeUpdater);	
//			
//		moveCollectorSizeUpdater++;
//	}
	
	
	public void updateMoveCollector2(int one, int two, intthree)
	{
		System.out.println("Row one length: " +  one);
		System.out.println("Row two length: " +  two);
		System.out.println("Row three length: " +  three);
		
		int a = one;
		int b = two;
		int c = three;
		
		int[] currentRowLengths = new int[] {a, b, c}; 
		
		int[][] moveCollectorUpdater = Arrays.copyOf(moveCollector, moveCollectorSizeUpdater);
		moveCollectorUpdater[moveCollectorSizeUpdater - 1] = currentRowLengths;
		
		
		moveCollector = moveCollectorUpdater;
		System.out.println("THIS IS THE COUNT: " + moveCollectorSizeUpdater);	
			
		moveCollectorSizeUpdater++;
	}
	

	private void printMovesCollection() 
	{	
		for(int i = 0; i < moveCollectorSizeUpdater - 1; i++)	 //the numberOfTurnsTaken - 1 is questionable. 
		{
			System.out.println("This is i: " + i);
			for(int value : moveCollector[i])
			{
				System.out.println("TURN" + (i + 1) +": ["  + value + "]");
			}
			System.out.println("");
		}
	}
	//---------------------------------------------------------------------------//
	
	
	
	
	//SUPPORT //---------------------------------------------------------------------//	
	private String getCurrentPlayerName()
	{
		
		if (AIGameIsUnderway)
			return designateGameType("Player1", "Computer");
		else
			return designateGameType("Player1", "Player2");
		
	}
	
	private String designateGameType(String competitor1, String competitor2)
	{
		currentPlayerName = (isPlayer1Turn)? competitor1 : competitor2;
		return currentPlayerName;
	}
	
	private void switchTurns(){	
		if(isPlayer1Turn)
			isPlayer1Turn = false;
		else
			isPlayer1Turn = true;
	
		currentPlayerName = getCurrentPlayerName();
		System.out.println(currentPlayerName + ": It's your turn.");
	}
	
	private void postGame() {
		
		System.out.println("GAME OVER: " + currentPlayerName + " LOSES!");
		
		printMovesCollection();	
		scoreBoard(currentPlayerName);
		
		if(AIGameIsUnderway)
		{
			boolean playingAgain = pl.enactPVCChoiceToReplayAI();
			if(playingAgain)
				saveGamePlayAndReset();
		}
		else
			gameOver = true;	
	}
	
	public void scoreBoard(String gameLoser)
	{
		//array that persists and saves who won the games. 
		String gameWinner = ""; 
		if(gameLoser.equals("Player1"))
			gameWinner = "Computer";
		else
			gameWinner = "Player1";
		
		winnerOfMatch[winnerOfMatchIndexer] = gameWinner;
		winnerOfMatchIndexer++;
		winnerOfMatchListIndexer++; 
		
		for(String value : winnerOfMatch)
		{
			System.out.println("Winner of round x: " + value);
		}
	}
	
	public void saveGamePlayAndReset()
	{
		memory.getMostRecentGameStateCollection(moveCollector);
		
		//reset //-----------------------------------------//
		moveCollector = new int[][] {{1,2,3}};
		moveCollectorSizeUpdater = 1;
		numberOfTurnsTakenIndexVersion = 0;
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
