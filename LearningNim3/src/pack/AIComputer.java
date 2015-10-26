package pack;

import java.util.ArrayList;
import java.util.Random;

public class AIComputer {

	int possibleNumberOfObjectsToBeRemoved;
	boolean allRowsActive;
	boolean r1 = true;
	boolean r2 = true;
	boolean r3 = true;
	
	boolean[] boolArray = new boolean[] {r1, r2, r3};
	
	int[][] allRows; 
	
	public void runFirstGame()
	{
		//getrow
		//getnum to delete
	}
	public void runFollowingGames()
	{
		//learning capacity
	}
	
	
	//support//---------------------------------------------------//
	int[] row1;
	int[] row2;
	int[] row3;
	
	public void getCurrentBoard(int[] row01, int[] row02, int[] row03)
	{
		row1 = row01;
		row2 = row02;
		row3 = row03;
		
		allRows = new int[][] {row1, row2, row3};
		
		System.out.println("---------------------------------------");
		System.out.println("Computer Checkup");
		
		for(int i = 0; i < allRows.length; i++)
		{
			System.out.println("Row"+ (i+1) + allRows[0].length);
		}
	}
	
	public void checkingRowStatus()
	{
		int emptyRow = 0;
		if(row1.length > emptyRow && row2.length > emptyRow && row3.length > emptyRow)
		{
			allRowsActive = true;
		}
		else {
			allRowsActive = false;
			for(int i = 0; i < allRows.length; i++)
			{
				if(allRows[i].length == 0)
					boolArray[i] = false;
			}
		}	
	}
	
	public int getRow()
	{
		checkingRowStatus();
		ArrayList<Integer> validRows = new ArrayList<Integer>();
		
		int randomRow;
		if (allRowsActive)
		{
			Random rand = new Random();
			randomRow = rand.nextInt(3) + 1;
		}
		else 
		{			
			for(int i = 0; i < boolArray.length; i++)
			{
				if(boolArray[i])
					validRows.add(i+1);
			}
			
			if(validRows.size() == 2)
			{
				int num;
				double d = Math.random();
				num = (d > 0.5)? 1:0;
					
				randomRow = validRows.get(num);
				System.out.println("2 full rows - chosen random num: " + randomRow);
			}
			else {
				int num = validRows.get(0);
				randomRow = num;
			}
			
		}
		System.out.println("Chosen random Row: " + randomRow);
		return randomRow;
	}

	public int getNumToRemove(int rowChosenByComputer)
	{
		int[] possibleRowsToChoose = new int[] {1,2,3};
		
		for(int i = 0; i < possibleRowsToChoose.length; i++)
		{
			if(rowChosenByComputer == possibleRowsToChoose[i])
				possibleNumberOfObjectsToBeRemoved = allRows[i].length;
				
		}
		
		Random rand6 = new Random();
		int chosenNumberToDelete = rand6.nextInt(possibleNumberOfObjectsToBeRemoved) + 1;	
		System.out.println("Number to eliminate: " + chosenNumberToDelete);
		
		return chosenNumberToDelete;
	}

}
