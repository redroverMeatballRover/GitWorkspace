package NetworkingVersion;

public class TicTacToeModel2
{
	public enum TicTacToePiece
	{
		X, O;
	}
	
	public static int BOARD_SIZE = 3;
	private TicTacToePiece[][] pieces;
	
	public TicTacToeModel2()
	{
		resetGame();
	}
	
	public void resetGame()
	{
		pieces = new TicTacToePiece[BOARD_SIZE][BOARD_SIZE];
	}
	
	public TicTacToePiece[][] getPieces()
	{
		return pieces;
	}
	
	public void placePiece(TicTacToePiece piece, int x, int y)
	{
		// error checking if x y is out of bounds?
		pieces[x][y] = piece;
	}
	
	public boolean checkForWinner(TicTacToePiece player)
	{
		boolean winner = false;
		
		// check for horizontal win
		for(int i = 0; i < BOARD_SIZE; i++)
		{
			if(pieces[0][i] == pieces[1][i] && pieces[0][i] == pieces[2][i]
					&& pieces[0][i] == player)
			{
				winner = true;
			}
		}
		// check for vertical win
		for(int i = 0; i < BOARD_SIZE; i++)
		{
			if(pieces[i][0] == pieces[i][1] && pieces[i][0] == pieces[i][2]
					&& pieces[i][0] == player)
			{
				winner = true;
			}
		}
		// check for diagonal win
		if(pieces[0][0] == pieces[1][1] && pieces[0][0] == pieces[2][2]
				&& pieces[0][0] == player)
		{
			winner = true;
		}
		else if(pieces[2][0] == pieces[1][1] && pieces[2][0] == pieces[0][2]
				&& pieces[2][0] == player)
		{
			winner = true;
		}
		
		return winner;
	}
}
