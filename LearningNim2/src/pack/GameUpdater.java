package pack;

import java.util.InputMismatchException;
import java.util.Scanner;


public class GameUpdater {

	int[] row1;
	int[] row2;
	int[] row3;
	
	Player pl = new Player();
	AIComputer ai = new AIComputer();
	String currentPlayerName = "";

	boolean isPlayer1Turn = true;
	boolean gameOver = false;
	public boolean AIGameIsUnderway = false;
	
	public void generateNewBoard(int row1Length, int row2Length, int row3Length)
	{
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
	
	private void printBoard(){
		
		System.out.println("");
		
		System.out.print("[1]");
		for(int value: row1)
		{
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
	
	public void beginPlayerVsPlayerGame()
	{
		currentPlayerName = getCurrentPlayerName();
		while(!gameOver)
		{
			promptTurn();
		}
	}
	
	public void beginPlayerVsComputer()
	{
		AIGameIsUnderway = true;
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
		int row1Designation = 1;
		int row2Designation = 2;
		
		if(row == row1Designation){
			if(row1.length >= numXtoRemove){
				updateBoard(row, numXtoRemove);
				switchTurns();
			}
			else if(row1.length < numXtoRemove){
				System.out.println("Invalid move, please try again.");
			}
		}
		else if(row == row2Designation){
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
	
	private void updateBoard(int row, int numXtoRemove)
	{
		int row1Designation = 1;
		int row2Designation = 2;
		
		if(row == row1Designation){
			int numToRemove = row1.length - numXtoRemove;
			row1 = new int[numToRemove];
		}		
		else if(row == row2Designation){
			int numToRemove = row2.length - numXtoRemove;	
			row2 = new int[numToRemove];
		}
		else{
			int numToRemove = row3.length - numXtoRemove;		
			row3 = new int[numToRemove];
		}
		ai.getCurrentBoard(row1, row2, row3);
		printBoard();
	}
	
	//SUPPORT //---------------------------------------------------------------------//
	
	private String getCurrentPlayerName(){
		
		if (AIGameIsUnderway)
			return designationPVC();
		else
			return designationPVP();
		
	}

	private String designationPVP() {
		if(isPlayer1Turn)
		{
			currentPlayerName = "Player1";
		}
		else
		{
			currentPlayerName = "Player2";
		}
		return currentPlayerName;
	}
	
	private String designationPVC() {
		if(isPlayer1Turn)
			currentPlayerName = "Player1";
		else
			currentPlayerName = "Computer";
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
	
	private void checkForWinner()
	{
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
	
	
}
