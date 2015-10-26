package pack;

import java.awt.List;
import java.util.ArrayList;
import java.util.Random;

public class AIComputer {
	
	int possibleNumberOfObjectsToBeRemoved;
	boolean allRowsActive;
	boolean r1 = true;
	boolean r2 = true;
	boolean r3 = true;
	
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
		
		System.out.println("---------------------------------------");
		System.out.println("Computer Checkup");
		System.out.println("Row1 length: " + row1.length);
		System.out.println("Row2 length: " + row2.length);
		System.out.println("Row3 length: " + row3.length);
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
			if (row1.length == emptyRow)
			{
				r1 = false;
			}
			if (row2.length == emptyRow)
			{
				r2 = false;
			}
			if (row3.length == emptyRow)
			{
				r3 = false;
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
			if (r1)
				validRows.add(1);
			if (r2)
				validRows.add(2);
			if(r3)
				validRows.add(3);
			
			//random choice of index in validrows, whichever index is chosen, 
			//the value at that index becomes randomRow
			if(validRows.size() == 2)
			{
				int num;
				double d = Math.random();
//				if (d > 0.5)
//					num = 1;
//				else
//					num = 0;
				
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
		if(rowChosenByComputer == 1)
		{
			possibleNumberOfObjectsToBeRemoved = row1.length;
		}
		else if (rowChosenByComputer == 2)
		{
			possibleNumberOfObjectsToBeRemoved = row2.length;
		}
		else if (rowChosenByComputer == 3)
		{
			possibleNumberOfObjectsToBeRemoved = row3.length;
		}
			
		Random rand6 = new Random();
		int chosenNumberToDelete = rand6.nextInt(possibleNumberOfObjectsToBeRemoved) + 1;	
		
		System.out.println("Number to eliminate: " + chosenNumberToDelete);
		
		return chosenNumberToDelete;
	}
}
