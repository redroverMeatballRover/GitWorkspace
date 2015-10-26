import java.util.InputMismatchException;
import java.util.Scanner;

public class Board {
	
	static int[] row1;
	static int[] row2;
	static int[] row3;
	
	static String currentPlayerName = "";
	static boolean isPlayer1Turn = true;
	static boolean gameOver = false;
	
	public static void generateNewBoard(int row1Length, int row2Length, int row3Length){
		
		row1 = new int[row1Length];
		row2 = new int[row2Length];
		row3 = new int[row3Length];
		
		for(int i = 0; i < row1.length; i++) {
			row1[i] = 1;
		}
		
		for(int i = 0; i < row2.length; i++) {
			row2[i] = 1;
		}
		
		for(int i = 0; i < row3.length; i++) {
			row3[i] = 1;
		}
		printBoard();
	}
	
	private static void printBoard(){
		System.out.println("");
		
		System.out.print("[1]");
		
		for(int value: row1){
			System.out.print(" x ");
		}
		System.out.println("");
		System.out.print("[2]");
		
		for(int value: row2){
			System.out.print(" x ");
		}
		System.out.println("");
		System.out.print("[3]");
		
		for(int value: row3){
			System.out.print(" x ");
		}
		System.out.println("" + "\n");
	}
	
	public static void beginPlayerVsPlayerGame(){
		currentPlayerName = getCurrentPlayerName();
		//System.out.println(currentPlayerName + ": It's your turn.");
		
		
		//TODO Change this to just run until the end of the game.
		while(!gameOver)
		{
			promptTurn();
		}
	}
	
	public static void beginPlayerVsComputerGame(){
		
		while(!gameOver)
		{
			//promptPvCTurn();
		}	
	}
	
	private static String getCurrentPlayerName(){
		if(isPlayer1Turn){
			currentPlayerName = "Player 1";
		}
		else
		{
			currentPlayerName = "Player 2";
		}
		return currentPlayerName;
	}
	
	private static void promptTurn(){
		int row = getRow();
		int numXtoRemove = getNumXtoRemove();
		
		validateMove(row, numXtoRemove);	
	}
	
	private static int getRow(){
		System.out.println("Which row would you like to remove an 'x' from?");
		
		Scanner sc = new Scanner(System.in);
		boolean isValidRow = false;	
		int rowChoice = 0;
		
	    while(!isValidRow){
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
	
	private static int getNumXtoRemove(){
		//System.out.println(currentPlayerName + ": It's your turn.");
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
	
	private static void switchTurns(){	
		if(isPlayer1Turn)
		{
			isPlayer1Turn = false;
		}
		else{
			isPlayer1Turn = true;
		}
		currentPlayerName = getCurrentPlayerName();
		System.out.println(currentPlayerName + ": It's your turn.");
	}
	
	private static void validateMove(int row, int numXtoRemove){
		
		//ALSO CHECK FOR ROW BEFORE 
		if(row == 1){
			if(row1.length >= numXtoRemove){
				updateBoard(row, numXtoRemove);
				switchTurns();
			}
			else if(row1.length < numXtoRemove){
				System.out.println("Invalid move, please try again.");
			}
		}
		else if(row == 2){
			if(row2.length >= numXtoRemove){
				updateBoard(row, numXtoRemove);
				switchTurns();
			}
			else if(row2.length < numXtoRemove){
				System.out.println("Invalid move, please try again.");
			}
		}
		else{
			if(row3.length >= numXtoRemove){
				updateBoard(row, numXtoRemove);
				switchTurns();
			}
			else if(row3.length < numXtoRemove){
				System.out.println("Invalid move, please try again.");
			}
		}
		checkForWinner();
	}


	
	private static void checkForWinner(){
		//if (row1 && row2 .lengths = 0)
			//check if remaining row length of 1
		
		//MAKE CHECK THAT PREVENTS PLAYERS FROM ELIMINATING THE FINAL ROW ENTIRELY 
		
		if(row1.length == 0 && row2.length == 0 && row3.length == 1)
		{
			System.out.println("GAME OVER: " + currentPlayerName + " LOSES!");
			gameOver = true;
		}
		if(row2.length == 0 && row3.length == 0 && row1.length == 1)
		{
			System.out.println("GAME OVER: " + currentPlayerName + " LOSES!");
			gameOver = true;
		}
		if(row3.length == 0 && row1.length == 0 && row2.length == 1)
		{
			System.out.println("GAME OVER: " + currentPlayerName + " LOSES!");
			gameOver = true;
		}
	}
	
	private static void updateBoard(int row, int numXtoRemove){
		if(row == 1){
			int numToRemove = row1.length - numXtoRemove;
			row1 = new int[numToRemove];
		}		
		else if(row == 2){
			int numToRemove = row2.length - numXtoRemove;	
			row2 = new int[numToRemove];
		}
		else{
			int numToRemove = row3.length - numXtoRemove;		
			row3 = new int[numToRemove];
		}
		printBoard();
	}



	//PvC --->
	
	/* create loop that switches between player and computer turn
	 * on computer turn, create loop -->
	 * for computer > random row that is active > random number based on the length of that row
	 */
	
	



}