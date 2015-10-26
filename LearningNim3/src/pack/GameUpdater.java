package pack;

import java.util.Arrays;
import java.util.Scanner;

public class GameUpdater {

	
	Game g = new Game();
	MovesCollection collectAllTheMoves = new MovesCollection();
	
	int[] row1;
	int[] row2;
	int[] row3;
	int[][] rowDesignate;
	int[][] dynamicRowCollection; 
	
	int[][] x2 = new int[][] {{1,2,3}};
	int[][] realArray = new int[][] {{1,2,3}};
	int[][] testX;
	
	
	//updatable numbers //-----------------------//
	int numberOfTurnsTaken = 1;
	int totalMovesArrayCollectionIndex = 0;
	
	int theGameWasWonAtOnePoint = 0;
	int theUpdater = 1;
	//-------------------------------------------//
	

	public int[][] FINALGAMESTATE = {{0,0,0}};
	public int[][] STARTGAMESTATE = {{3,5,7}};	
	
	
	String[] winnerOfMatch = new String[theUpdater];
	
	
	Player pl = new Player();
	AIComputer ai = new AIComputer();
	String currentPlayerName = "";

	boolean isPlayer1Turn = true;
	boolean gameOver = false;
	public boolean AIGameIsUnderway = false;
	
	//make these final-----------------------//
	int row1Length = 3;
	int row2Length = 5;
	int row3Length = 7;
	int numberOfRows = 3;
	//--------------------------------------//
	
	//REFACTORED
	public void generateNewBoard()
	{
		row1 = new int[row1Length];
		row2 = new int[row2Length];
		row3 = new int[row3Length];
		rowDesignate = new int[][] {row1, row2, row3};
			
		for(int j = 1; j < 3; j++)
			for(int i = 0; i < rowDesignate[j].length; i++)
				rowDesignate[j][i] = 1;
		
		printBoard(row1, row2, row3);
	}
	
	//REFACTORED
	private void printBoard(int[] one, int[] two, int[]three){
		
		dynamicRowCollection = new int[][] {one, two, three};
		
		for(int i = 0; i < dynamicRowCollection.length; i++)
		{
				System.out.println("");
				System.out.print("["+ (i + 1) + "] ");
				for(int value: dynamicRowCollection[i])
				{
					System.out.print(" x ");
				}
		}
		System.out.println("\n\n");
	}
	
	//REFACTORED
	public void beginGame(boolean NimAIwasActivated)
	{
		AIGameIsUnderway =  NimAIwasActivated;
		currentPlayerName = getCurrentPlayerName();

		while(!gameOver)
		{
			promptTurn();
		}
	}
	
	public void promptTurn()
	{
		int chosenRow;	
		if (!AIGameIsUnderway)
		{
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
				chosenRow = ai.getRow();
				int numXtoRemove = ai.getNumToRemove(chosenRow);
				validateMove(chosenRow, numXtoRemove);
			}
		}
	}
	
	public void validateMove(int row, int numXtoRemove)
	{
		if(dynamicRowCollection[row - 1].length >= numXtoRemove)
			updateAndSwitchPlayers(row, numXtoRemove);
		else if (dynamicRowCollection[row - 1].length < numXtoRemove)
			System.out.println("Invalid move, please try again.");
		
		checkForWinner();
	}

	private void updateBoard(int row, int numXtoRemove)
	{
		int numToRemove;
		int selectedRowLength = dynamicRowCollection[row - 1].length;
		
		numToRemove = selectedRowLength - numXtoRemove;
		dynamicRowCollection[row - 1] = new int[numToRemove];		
		printBoard(dynamicRowCollection[0], dynamicRowCollection[1], dynamicRowCollection[2]);
		moveCollector(dynamicRowCollection[0], dynamicRowCollection[1], dynamicRowCollection[2]);
	}
	
	
	
	public void moveCollector(int[] one, int[] two, int[]three)
	{
		System.out.println("Row one length: " +  one.length);
		System.out.println("Row two length: " +  two.length);
		System.out.println("Row three length: " +  three.length);
		
		int a = one.length;
		int b = two.length;
		int c = three.length;
		
		int[] xxx = new int[] {a, b, c}; 
		
		int[][] transitioningToX = Arrays.copyOf(realArray, numberOfTurnsTaken);
		transitioningToX[totalMovesArrayCollectionIndex] = xxx;
		
		realArray = transitioningToX;
		System.out.println("THIS IS THE COUNT: " + numberOfTurnsTaken);	
			
		numberOfTurnsTaken++;
		totalMovesArrayCollectionIndex++;	
	}

	private void printMovesCollection() {
		
		for(int i = 0; i < numberOfTurnsTaken - 1; i++)	 //the numberOfTurnsTaken - 1 is questionable. 
		{
			System.out.println("This is i: " + i);
			for(int value : realArray[i])
			{
				System.out.println("TURN" + (i + 1) +": ["  + value + "]");
			}
			System.out.println("");
		}
		
		//launch computer AI Analysis here
		//last move before loss is bad is the worst move in the computers memory
	}
	
	
	//SUPPORT //---------------------------------------------------------------------//
	private void updateAndSwitchPlayers(int row, int numXtoRemove) {
		updateBoard(row, numXtoRemove);
		switchTurns();
	}
	
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
	
	//REFACTOR//------------------------------------------------------------------------//
	private void checkForWinner()
	{		
		if(dynamicRowCollection[0].length == 0 && dynamicRowCollection[1].length == 0 && dynamicRowCollection[2].length == 1)
		{
			winnerTitle();
		}
		if(dynamicRowCollection[1].length == 0 && dynamicRowCollection[1].length == 0 && dynamicRowCollection[2].length == 0)
		{
			winnerTitle();
		}
		if(dynamicRowCollection[0].length == 0 && dynamicRowCollection[1].length == 1 && dynamicRowCollection[2].length == 0)
		{
			winnerTitle();
		}	
	}

	private void winnerTitle() {
		System.out.println("GAME OVER: " + currentPlayerName + " LOSES!");
		
		
		
		//show move list right here
		printMovesCollection();	
		
		//ask player if they would like to play again
		if(AIGameIsUnderway)
		{
			enactPVCChoiceToReplayAI(currentPlayerName);
		}
		else{
			gameOver = true;
		}
		
	}
	
	public void enactPVCChoiceToReplayAI(String getLoser)
	{
		System.out.println("Do you wish to replay the AI? He will be smarter this time...\n");
		System.out.println("1) yes \n2) no");
		
		Scanner scan = new Scanner(System.in);
		int playerAnswer = scan.nextInt();
		
		if(playerAnswer == 1)
		{
			scoreBoard(getLoser);
			//play again
			//set gameover to false
			//scoreboard so there is a record of the winner first match. 
			
			//save previous game moves
			//reset board/counters and start game. 
			//save game array moves and check each time its the computers turn to see if there was a matching move that lead to a win --> iterate to do so
			
			// if losing streak --> 
			
		}
		else {
			gameOver = true;
		}
	}
	
	
	public void scoreBoard(String gameLoser)
	{
		//array that persists and saves who won the games. 
		String gameWinner = ""; 
		
		if(gameLoser.equals("Player1"))
			gameWinner = "Computer";
		else
			gameWinner = "Player1";
		
		
		//copy array here
		
//		int[] xxx = new int[] {a, b, c}; 
//		int[][] transitioningToX = Arrays.copyOf(realArray, numberOfTurnsTaken);
//		transitioningToX[totalMovesArrayCollectionIndex] = xxx;
//		realArray = transitioningToX;
		
		//String[] copyOfScoreboard = new String[] {""};
		
		winnerOfMatch[theGameWasWonAtOnePoint] = gameWinner;
		theGameWasWonAtOnePoint++;
		theUpdater++; //updates the amount of space in the WinnerOfMatch array
		
		for(String value : winnerOfMatch)
		{
			System.out.println("Winner of round x: " + value);
		}
	}
	
	public void saveGamePlayAndReset()
	{
		//save the list of moves to a file or save to a collection
		collectAllTheMoves.getMostRecentGameStateCollection(realArray);
		
		//set counters to 0
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
