package Queens;

/**
 * 
 * @author cschaffer
 * 
 *         This program runs a chessgame in which 8 queens are on the chessboard
 *         and cannot attack each other. Recursive program.
 */
public class Queens2 {

	protected int boardSize = 8; // the size of the board.
	protected boolean[][] boardRC; //the rows and columns of the chessboard

	//constructor
	public Queens2(int boardSize) {
		this.boardSize = boardSize;
		boardRC = new boolean[boardSize][boardSize];

		//creates board
		for (int row = 0; row < boardSize; row++) {
			for (int col = 0; col < boardSize; col++) {
				
				boardRC[row][col] = false; //filled up with queens
			}
		}
	}

	//determines if queens have been placed or not
	protected boolean placeQueen(int col) {
		int row;

		if (col == boardSize) {
			return true;
		} else {
			boolean successful = false;
			row = 0;

			while ((row < boardSize) && !successful) {
				if (danger(row, col)) {
					row++;
				} else {
					boardRC[row][col] = true;
					successful = placeQueen(col + 1);

					if (!successful) {
						boardRC[row][col] = false;
						row++;
					}
				}
			}

			return successful;
		}
	}
	//determines if queens are safe to be placed on the board
	protected boolean danger(int row, int col) {
		
		//test the row
		for (int c = 0; c < col; c++) {
			if (boardRC[row][c]) {
				return true;
			}
		}
		
		// test diagonals
		for (int c = 1; c <= col; c++) {
			if (row < c) {
				break;
			}
			if (boardRC[row - c][col - c]) {
				return true;
			}
		}

		for (int c = 1; c <= col; c++) {
			if (row + c >= boardSize) {
				break;
			}

			if (boardRC[row + c][col - c]) {
				return true;
			}
		}
		return false;
	} 
	//prints out the location of the boxes of the board and where the queens go
	protected void makeGame() {
	
		for (int row = 0; row < boardSize; row++) {
			for (int col = 0; col < boardSize; col++) {
				if (boardRC[row][col])//where the queens can be set 
					{
					System.out.print("Q ");
				} else {
					System.out.print(". ");
				}
			}

			System.out.println();
		}

		System.out.println();
	} 

	//runs the game
	public void nonAttackingQueens() {
		if (placeQueen(0)) {
			makeGame();
		} else {
			System.out.println("THE QUEENS KILL EACH OTHER");
		}
	} 
}
