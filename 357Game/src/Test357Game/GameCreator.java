package Test357Game;

public class GameCreator {

	
	public XObject xOb = new XObject();
	String pieceRepresentation = "x";
	public String[][] board = new String[3][7]; 
	//calls GameUpdater(takes in the board)
	
	
	public void newGame()
	{
		print();
		
		GameUpdater_PvP startGame = new GameUpdater_PvP();
		startGame.initiateGame(board);
		
	}

	public void print() //XObject[][] piecesSetup
	{
		int a;
		int b;
		String nullSquare = " - ";
		//String[][] array = new String[3][7];
		
		
		//sets up origin board //--------------------------------------------------//
		for (a = 0; a < 3; a++)
		{
			for (b = 0; b < 7; b++)
			{
				if (a == 0) //ROW 1
				{
					if(b <= 2)
						board[a][b] = xOb.setInBoard();
					else
						board[a][b] = nullSquare;
				}
				
				if (a == 1) // ROW 2 
				{
					if(b <= 4)
						board[a][b] = xOb.setInBoard();
						
					else
						board[a][b] = nullSquare;
				}
				
				if (a == 2) // ROW 3
				{
					board[a][b] = xOb.setInBoard();
				}	
			}
		}
		
		//prints board
		//------------------------------------------------------------------------------//
		int i = 0;
		int j = 0;
		
		for (i = 0; i < 3; i++) 
		{
			for (j = 0; j < 7; j++) 
			{
					if (i >= 0)
						System.out.print(board[i][j]);
			}
			if (i == 0)
				System.out.println();
			if (i > 0) 
				System.out.println();
		}	
	}
	
}
