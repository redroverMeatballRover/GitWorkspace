package PIG;

import java.util.Scanner;

public class PigGame {

	static Scanner scan = new Scanner(System.in);
	boolean whoseTurnIsIt = true;
	
	public static void main(String[] args) {
	
	int usersSayRoll; 
	PairOfDice PairOfDice = new PairOfDice();
	//int scoreTotalCount = PairOfDice.combined() + PairOfDice.addDiceTotal;
	
	
	//public static void startGame()
	//{
		System.out.println("Time to play PIG!");
		System.out.println("Your turn! Enter any number to roll: ");
		usersSayRoll = scan.nextInt(); 
		int totalScore1;
		
		Die die1 = new Die();
		Die die2 = new Die();
		
		while (PairOfDice.num1 != 1 && PairOfDice.num2 != 1) {

			if (PairOfDice.num1 != 1) {
				if (PairOfDice.num2 != 1) {
					
					PairOfDice.num1 = die1.roll();
					PairOfDice.num2 = die2.roll();

					PairOfDice.addDiceTotal = PairOfDice.num1 + PairOfDice.num2;
					System.out.println("You rolled a " + PairOfDice.num1 + " and a  " + PairOfDice.num2 + ".");
					int totalScore = PairOfDice.addDiceTotal;
				}
				
				
				
				else if (PairOfDice.num1 == 1 && PairOfDice.num2 == 1) {
					PairOfDice.num1 = 0;
					PairOfDice.num2 = 0;

					System.out
							.println("You rolled a snake eyes. It is now the computers turn.");
				}

			}
			
			int turnTotal = totalScore1 + PairOfDice.addDiceTotal;
			System.out.println(turnTotal);
		}
		
		
		System.out.println("Your score is " + PairOfDice.addDiceTotal + ".");
		
		
	//}
		
		
		
		
		
		
		
		
		
		
	
}
}