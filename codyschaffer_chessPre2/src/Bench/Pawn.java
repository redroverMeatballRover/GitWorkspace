package Bench;

import TEST.ChessPiece;

public class Pawn extends ChessPiece {
	int col2nd;
	int row2nd;
	int col1st;
	int row1st;
	String name;
	boolean basic;
	boolean basic2;
	boolean attack;
	boolean valid;
	String chessPiece;
	boolean enemyDeath;
	char firstLetter;
	char secondLetter;
	boolean secondLetterNotNull;

	public Pawn(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Pawn [name=" + name + "]";
	}

	
	public boolean legalMove(ChessPiece[][] chess, int col1st,int row1st, int col2nd, int row2nd) {
		int berzerkX = row2nd - row1st;
		if (berzerkX == 1 || berzerkX == -1)
			basic = true;
		boolean move1 = true;
		boolean move2 = true;
		boolean move3 = true;
		boolean move4 = true;
//		move1 = true;
//		move2 = true;
//		move3 = true;
//		move4 = true;
		return move1 || move2 || move3 || move4;
	}

	String pawn = "";

	public String setInBoard() {
		if (name.charAt(0) == 'B') {
			// pawn= "| "+ name + " |";
			pawn = "|  pd  |";
		} else {
			pawn = "|  pl  |";
		}
		return pawn;
	}

	public String findChessPiece() {
		return this.name;
	}


	public boolean pieceBarrier(ChessPiece[][] chess, int row1st,	int col1st, int col2nd, int row2nd) {
		boolean moveUP = false;
		boolean moveUP2 = false;
		boolean moveRight = false;
		boolean moveLeft = false;
		boolean moveDown = false;
		boolean moveDown2 = false;
		
		// white moves up
		if (chess[row1st][col1st].findChessPiece().charAt(0) == 'W') {
			if (row1st == 7 && (row2nd == 6 || row2nd == 5)
					&& col1st == col2nd) {
				moveUP = true;

			} else if ((row1st - 1) == row2nd
					&& chess[row2nd][col2nd] == null
					&& col1st == col2nd) {
				moveUP2 = true;

			} else {
				moveUP = false;
				moveUP2 = false;

			}
		}
		
		//white move left //right
				if (chess[row1st][col1st].findChessPiece().charAt(0) == 'W') {
					if (moveDown2 == false
							&& moveDown == false
							&& (row1st - 1) == row2nd
							&& (col1st - 1) == col2nd
							&& chess[row2nd][col2nd] != null
							&& enemyDeath(chess, row1st, col1st, col2nd,
									row2nd) == true && col1st != col2nd) {
						moveLeft = true;

					} else if (moveDown2 == false
							&& moveDown == false
							&& (row1st - 1) == row2nd
							&& (col1st + 1) == col2nd
							&& chess[row2nd][col2nd] != null
							&& enemyDeath(chess, row1st, col1st, col2nd,
									row2nd) == true && col1st != col2nd) {
						moveRight = true;

					} else {
						moveLeft = false;
						moveRight = false;

					}
				}
		
		// black moves up
		if (chess[row1st][col1st].findChessPiece().charAt(0) == 'B') {
			if (row1st == 2 && (row2nd == 4 || row2nd == 3)
					&& col1st == col2nd) {
				moveDown = true;

			} else if ((row1st + 1) == row2nd
					&& chess[row2nd][col2nd] == null
					&& col1st == col2nd) {
				moveDown2 = true;

			} else {
				moveDown = false;
				moveDown2 = false;

			}
		}
		
		//black move left //right
				if (chess[row1st][col1st].findChessPiece().charAt(0) == 'B') {
					if (moveUP == false
							&& moveUP2 == false
							&& (row1st + 1) == row2nd
							&& (col1st - 1) == col2nd
							&& chess[row2nd][col2nd] != null
							&& enemyDeath(chess, row1st, col1st, col2nd,
									row2nd) == true && col1st != col2nd) {
						moveLeft = true;

					} else if (moveUP == false
							&& moveUP2 == false
							&& (row1st + 1) == row2nd
							&& (col1st + 1) == col2nd
							&& chess[row2nd][col2nd] != null
							&& enemyDeath(chess, row1st, col1st, col2nd,
									row2nd) == true && col1st != col2nd) {
						moveRight = true;

					} else {
						moveLeft = false;
						moveRight = false;

					}
				}
		
		return moveUP || moveRight || moveDown
				|| moveLeft || moveUP2 || moveDown2;
	}

	//enemyDeath
	public boolean enemyDeath(ChessPiece[][] chess, int row1st,
			int col1st, int col2nd, int row2nd) {
		firstLetter = chess[row1st][col1st].findChessPiece().charAt(0);
		if (chess[row2nd][col2nd] != null) {
			secondLetterNotNull = true;
			secondLetter = chess[row2nd][col2nd].findChessPiece().charAt(0);
		} else {
			secondLetterNotNull = false;
		}

		if (secondLetter != firstLetter && secondLetterNotNull == true) {
			enemyDeath = true;
		} else {
			enemyDeath = false;
		}
		return enemyDeath;
	}
}