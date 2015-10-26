package PIG;

public class PairOfDice {
		
		// Needed: 
		//2 die objects
		//setters/getters for value
		//rollDice Method
		//CurrentSum Method = total of both dice rolls
		
		final int ROLLS = 1000;
		int num1;
		int num2;
		int count = 0;
		int addDiceTotal = 0;
		
		Die die1 = new Die();
		Die die2 = new Die();
		
	public void rollDice()
	{
		num1 =  die1.roll();
		num2 =  die2.roll();
		System.out.println(num1 );
		System.out.println(num2);
	}	
	
	public void currentSum()
	{
		addDiceTotal = num1 + num2;
		System.out.println(addDiceTotal);
	}
	
	public int combined() {
		return num1 + num2;
	}
	
	
		
	//	System.out.println();
//		for (int roll=1; roll<= ROLLS; roll++)
//		{
//			num1 =die1.roll();
//			num2 =die2.roll();
//			
//			if (num1 == 1 && num2 == 1)
//				count++;
//		}
//		
		//System.out.println();
		

	

}
