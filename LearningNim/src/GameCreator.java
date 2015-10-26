
import java.util.InputMismatchException;
import java.util.Scanner;

public class GameCreator {
	
	public static void gameType(int gameChoice){
		if(gameChoice == 1){
			beginPlayerVsPlayer();		
		}
		else if(gameChoice == 2){
			beginPlayerVsComputer();
		}
		else if(gameChoice == 3){
			beginComputerVsComputer();
		}
		else{
			System.out.println("Invalid selection, please choose a game type (1-3).");
			LearningNim.displayMenu();
		}
	}
	
	public static void beginPlayerVsPlayer(){
		System.out.print("Player vs. Player");
		Board.generateNewBoard(3, 5, 7);
		Board.beginPlayerVsPlayerGame();
	}
	
	public static void beginPlayerVsComputer(){
		System.out.println("Player vs. Computer");
	}
	
	public static void beginComputerVsComputer(){
		System.out.println("Computer vs. Computer" + "\n");
		System.out.println("How many games would you like the computers to play against each other?");
		
		Scanner sc = new Scanner(System.in);
		boolean isValidNumber = false;
		
	    while(!isValidNumber){
	    	try{
				int numComputerVsComputerGames = sc.nextInt();
				//System.out.println("# Computer Games = " + numComputerVsComputerGames);
				isValidNumber = true;
			}
			catch(InputMismatchException error){
				System.out.println("That is not a number. Please try again.");
				sc.next();
			}
	    }
	}
}