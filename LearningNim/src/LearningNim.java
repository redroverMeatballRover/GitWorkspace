import java.util.InputMismatchException;
import java.util.Scanner;


public class LearningNim {
	
	public static void nimStartup(){
		System.out.println("Welcome to the Game of Nim! Please select a game mode below.");	
		displayMenu();
	}
	
	public static void displayMenu()
	{	
		System.out.println("[1] Player vs. Player");
		System.out.println("[2] Player vs. Computer");
		System.out.println("[3] Computer vs. Computer" + "\n");
		
		Scanner sc = new Scanner(System.in);	
		boolean isValidGameSelection = false;
		
	    while(!isValidGameSelection){
	    	try{
				int gameChoice = sc.nextInt();
				GameCreator.gameType(gameChoice);
				isValidGameSelection = true;
			}
			catch(InputMismatchException error){
				System.out.println("Invalid selection, please choose a game type (1-3).");
				sc.next();
			}
	    }
	}
}