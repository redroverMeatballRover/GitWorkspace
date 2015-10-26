package Queens;

public class QueensDriver {
/**
 * Cody Schaffer
 * 
 * This program runs a chessgame in which 8 queens are on the chessboard and cannot attack each other. 
 * 
 */
	//DRIVER	- 
	public static void main(String[] args) {

		int boardSize = 8;
		Queens2 b = new Queens2(boardSize);
		b.nonAttackingQueens();
	} 
}


