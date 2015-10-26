package motherFucker;

import java.util.ArrayList;


public class GUIRunner {


	private static final long serialVersionUID = -5502586734068739286L;
	private Location selectedPiece, promotedPiece;
	private BoardState board;
	private GUI gui;
	private boolean isWhiteTurn;
	private boolean highlight;
	private boolean perpetualFlip;
	private ArrayList<Integer> undoMoves;
	private ArrayList<Integer> wasPieceTaken;
	private ArrayList<Location> moves;
	
	
	public GUIRunner()
	{
		board = new BoardState();
		gui = new GUI(board, this);
		highlight = true;
		perpetualFlip=false;
		moves = new ArrayList<Location>();
	}
	
	public void setVisible()
	{
		gui.setVisible(true);
		newGame();
	}
	
	
	public void newGame()
	{
		
		board.resetBoardState(); //sets origin board. 
		
		selectedPiece = null;
		isWhiteTurn = true;
		board.setTurn(isWhiteTurn);
		
		gui.updateBoard(board);
		gui.enableSide(isWhiteTurn);
		
		//undoMoves = new ArrayList<Integer>();
		wasPieceTaken = new ArrayList<Integer>();
		//gui.newGame();
	}

	
	
}
