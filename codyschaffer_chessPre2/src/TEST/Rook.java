package TEST;

public class Rook extends ChessPiece {
	int col2nd;
	int row2nd;
	int col1st;
	int row1st;
	String name;
	boolean valid;
	char firstLetter;
	char secondLetter;
	boolean enemyDeath;
	String chessPiece;
	boolean secondLetterNotNull;

	public Rook(String name) {
		this.name = name;
	}

	public boolean legalMove(ChessPiece[][] chess, int col1st, int row1st, int col2nd, int row2nd) {
		
		if (col1st == col2nd & row1st != row2nd || row1st == row2nd & col1st != col2nd)
			valid = true;
		
			return valid;
	}

	String rook = "";

	public String setInBoard() {
		if (name.charAt(0) == 'B') 
		{
			rook = "| rdn1 |";
		} 
		else 
		{
			rook = "| rln1 |";
		}
		return rook;
	}

	@Override
	public String findChessPiece() {
		return this.name;
	}

	@Override
	public String toString() {
		return "Rook [name=" + name + "]";
	}

	public boolean pieceBarrier(ChessPiece[][] chess, int row1st, int col1st, int col2nd, int row2nd) {

		boolean isRookMovingRight = false;
		boolean isRookMovingLeft = false;
		boolean isRookMovingDown = false;
		boolean isRookMovingUp = false;

		int b = 0;
		int rowX = row2nd - row1st;

		int columnY = col2nd - col1st;

		if (columnY > 0 & rowX == 0) 
		{ // check right null

			try {
				while (chess[row1st][col1st + b + 1] == null
						&& col1st + b + 1 < col2nd) {
					b++;
				}
				b = b + 1;
			} catch (Exception e) {
				while (chess[row1st][8] == null && col1st + b != col2nd) {
					b++;
				}
			}

			if (b != columnY) {
				isRookMovingRight = false;

			} else if (chess[row2nd][col2nd] != null
					&& enemyDeath(chess, row1st, col1st, col2nd, row2nd)
					&& columnY == b) {
				isRookMovingRight = true;

			} // if b smaller than dif, false. else, true

			else if (chess[row2nd][col2nd] == null && ((columnY == b))) {
				isRookMovingRight = true;
			} else {
				isRookMovingRight = false;
			}
		}

		if (columnY < 0 & rowX == 0) { // left side check null

			try {
				while (chess[row1st][col1st - b - 1] == null
						&& col1st - b - 1 != col2nd) {
					b++;

				}
				b = b + 1;
			} catch (Exception e) {
				while (chess[row1st][1] == null && col1st - b != col2nd) {
					b++;
				}
			}

			columnY = columnY * (-1);
			if (b != columnY) {
				isRookMovingLeft = false;

			} else if (chess[row2nd][col2nd] != null
					&& enemyDeath(chess, row1st, col1st, col2nd, row2nd)
					&& columnY == b) {
				isRookMovingLeft = true;

			} else if (chess[row2nd][col2nd] == null && ((columnY == b))) {
				isRookMovingLeft = true;
			} else {
				isRookMovingLeft = false;
			}
			columnY = columnY * (-1);

		}

		columnY = columnY * (-1);

		if (columnY == 0 & rowX > 0) { // //down check null

			try {
				while (chess[row1st + b + 1][col1st] == null
						&& row1st + b + 1 != row2nd) { // check down row
					b++;
				}
				b = b + 1;
			} catch (Exception e) {
				while (chess[8][col1st] == null && row1st + b != row2nd) { // checks
																			// up
																			// row
					b++;
				}
			}

			if (b != rowX) {
				isRookMovingDown = false;

			} else if (chess[row2nd][col2nd] != null
					&& enemyDeath(chess, row1st, col1st, col2nd, row2nd)
					&& rowX == b) {
				isRookMovingDown = true;

			} else if (chess[row2nd][col2nd] == null && rowX == b) {

				isRookMovingDown = true;
			} else {
				isRookMovingDown = false;

			}

		}

		if (columnY == 0 & rowX < 0) { // check up null
			try {
				while (chess[row1st - b - 1][col1st] == null
						&& row1st - b - 1 != row2nd) { // check upper row
					b++;

				}
				b = b + 1;
			} catch (Exception e) {
				while (chess[1][col1st] == null && row1st - b != row2nd) { // checks
																			// up
																			// row
					b++;

				}
			}
			rowX = rowX * (-1);

			if (b != rowX) {
				isRookMovingUp = false;

			} else if (chess[row2nd][col2nd] != null
					&& enemyDeath(chess, row1st, col1st, col2nd, row2nd)
					&& rowX == b) {
				isRookMovingUp = true;

			} else if (chess[row2nd][col2nd] == null && ((rowX == b))) {
				isRookMovingUp = true;
			} else {
				isRookMovingUp = false;
			}
		}
		return isRookMovingUp | isRookMovingDown | isRookMovingLeft
				| isRookMovingRight;
	}

	public boolean enemyDeath(ChessPiece[][] chess, int row1st, int col1st,
			int col2nd, int row2nd) {
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