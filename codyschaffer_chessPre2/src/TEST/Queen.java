package TEST;

public class Queen extends ChessPiece {
	int col2nd;
	int row2nd;
	int col1st;
	int row1st;
	String name;
	boolean valid1;
	boolean valid2;
	char firstLetter;
	char secondLetter;
	boolean enemyDeath;
	String chessPiece;
	boolean secondLetterNotNull;

	public Queen(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Queen [name=" + name + "]";
	}

	public boolean legalMove(ChessPiece[][] chess, int col1st, int row1st,
			int col2nd, int row2nd) {
		int berzerkX = col2nd - col1st;
		berzerkX = berzerkX < 0 ? -berzerkX : berzerkX;
		int berzerkY = row2nd - row1st;
		berzerkY = berzerkY < 0 ? -berzerkY : berzerkY;
		if (berzerkY == berzerkX)
			;
		valid1 = true;

		if (col1st == col2nd & row1st != row2nd || row1st == row2nd
				& col1st != col2nd)
			valid2 = true;
		return valid1 || valid2;
	}

	String Queen = "";

	public String setInBoard() {
		if (name.charAt(0) == 'B') {
			Queen = "| Qdn1 |";
		} else {
			Queen = "| Qln1 |";
		}
		return Queen;
	}

	@Override
	public String findChessPiece() {

		return this.name;
	}

	@Override
	public boolean pieceBarrier(ChessPiece[][] chess, int row1st, int col1st,
			int col2nd, int row2nd) {

		int columnX = col2nd - col1st;
		int rowY = row2nd - row1st;
		boolean bishopNE = false;
		boolean bishopNW = false;
		boolean bishopSW = false;
		boolean bishopSE = false;
		int a = 0;

		boolean moveRight = false;
		boolean moveLeft = false;
		boolean moveDown = false;
		boolean moveUp = false;

		int b = 0;
		int rowX = row2nd - row1st;
		int columnY = col2nd - col1st;

		if (columnY > 0 & rowX == 0) { // check null right

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
				moveRight = false;

			} else if (chess[row2nd][col2nd] != null
					&& enemyDeath(chess, row1st, col1st, col2nd, row2nd)
					&& columnY == b) {
				moveRight = true;

			} // IF B smaller than the dif between COL1st & COLUMn2nd make false. else, true

			else if (chess[row2nd][col2nd] == null && ((columnY == b))) {
				moveRight = true;
			} else {
				moveRight = false;
			}
		}

		
		if (columnY < 0 & rowX == 0) { //check null left

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
				moveLeft = false;

			} else if (chess[row2nd][col2nd] != null
					&& enemyDeath(chess, row1st, col1st, col2nd, row2nd)
					&& columnY == b) {
				moveLeft = true;

			} else if (chess[row2nd][col2nd] == null && ((columnY == b))) {
				moveLeft = true;
			} else {
				moveLeft = false;
			}
			columnY = columnY * (-1);

		}

		
		if (columnY == 0 & rowX > 0) { // check null down

			try {
				while (chess[row1st + b + 1][col1st] == null
						&& row1st + b + 1 != row2nd) { //looks down row
					b++;
				}
				b = b + 1;
			} catch (Exception e) {
				while (chess[8][col1st] == null && row1st + b != row2nd) { 
					b++;
				}
			}

			if (b != rowX) {
				moveDown = false;

			} else if (chess[row2nd][col2nd] != null
					&& enemyDeath(chess, row1st, col1st, col2nd, row2nd)
					&& rowX == b) {
				moveDown = true;

			} else if (chess[row2nd][col2nd] == null && ((rowX == b))) {
				moveDown = true;
			} else {
				moveDown = false;
			}

		}

		if (columnY == 0 & rowX < 0) { // check null up
			try {
				while (chess[row1st - b - 1][col1st] == null
						&& row1st - b - 1 != row2nd) { //check up row
					b++;

				}
				b = b + 1;
			} catch (Exception e) {
				while (chess[1][col1st] == null && row1st - b != row2nd) {
					b++;

				}
			}
			rowX = rowX * (-1);

			if (b != rowX) {
				moveUp = false;

			} else if (chess[row2nd][col2nd] != null
					&& enemyDeath(chess, row1st, col1st, col2nd, row2nd)
					&& rowX == b) {
				moveUp = true;

			} else if (chess[row2nd][col2nd] == null && ((rowX == b))) {
				moveUp = true;
			} else {
				moveUp = false;
			}
		}

		//NW
		if (columnX < 0 && rowY < 0) {
			try {
				while (chess[row1st - 1 - a][col1st - 1 - a] == null
						&& (col1st - 1 - a) != col2nd
						&& (row1st - 1 - a) != row2nd) {
					a++;
				}
				a = a + 1;
			} catch (Exception e) {
				if (row1st < 1) {
					while (chess[8][col2nd] == null) {
						a++;
					}

				} else if (col1st < 1) {
					while (chess[row2nd][8] == null) {
						a++;
					}

				} else {
					while (chess[8][8] == null) {
						a++;
					}
				}
			}

			if (rowY < 0) {
				rowY = rowY * (-1);
			}
			if (columnX < 0) {
				columnX = columnX * (-1);
			}
			if (a != rowY && a != columnX) {
				bishopNW = false;
			} else if (chess[row2nd][col2nd] != null
					&& (enemyDeath(chess, row1st, col1st, col2nd, row2nd) && (a == rowY && a == columnX))) {
				bishopNW = true;

			} else if (chess[row2nd][col2nd] == null
					&& (a == rowY && a == columnX)) {
				bishopNW = true;
			} else {
				bishopNW = false;
			}

			rowY = rowY * (-1);
			columnX = columnX * (-1);
		}

		//SE
		if (rowY > 0 && columnX > 0) {

			try {
				while (chess[row1st + 1 + a][col1st + 1 + a] == null
						&& (col1st + 1 + a) != col2nd
						&& (row1st + 1 + a) != row2nd) {
					a++;
				}
				a = a + 1;
			} catch (Exception e) {
				if (row1st > 8) {
					while (chess[8][col2nd] == null) {
						a++;
					}

				} else if (col1st > 8) {
					while (chess[row2nd][8] == null) {
						a++;
					}

				} else {
					while (chess[8][8] == null) {
						a++;
					}

				}

			}

			if ((a != rowY && a != columnX)) {
				bishopSE = false;
			} else if (chess[row2nd][col2nd] != null
					&& (enemyDeath(chess, row1st, col1st, col2nd, row2nd) && (a == rowY && a == columnX))) {
				bishopSE = true;
			} else if (chess[row2nd][col2nd] == null
					&& (a == rowY && a == columnX)) {
				bishopSE = true;
			} else {
				bishopSE = false;
			}

		}

		//SW
		if (rowY > 0 && columnX < 0) {
			try {
				while (chess[row1st + 1 + a][col1st - 1 - a] == null
						&& (col1st - 1 - a) != col2nd
						&& (row1st + 1 + a) != row2nd) {
					a++;
				}
				a = a + 1;
			}

			catch (Exception e) {
				if (row1st > 8) {
					while (chess[8][col2nd] == null) {
						a++;
					}

				} else if (col1st < 1) {
					while (chess[row2nd][8] == null) {
						a++;
					}

				} else {
					while (chess[8][8] == null) {
						a++;
					}

				}
			}
			if (rowY < 0) {
				rowY = rowY * (-1);
			}
			if (columnX < 0) {
				columnX = columnX * (-1);
			}
			if ((a != rowY && a != columnX)) {
				bishopSW = false;

			} else if (chess[row2nd][col2nd] != null
					&& (enemyDeath(chess, row1st, col1st, col2nd, row2nd) && (a == rowY && a == columnX))) {
				bishopSW = true;

			} else if (chess[row2nd][col2nd] == null
					&& (a == rowY && a == columnX)) {
				bishopSW = true;
			} else {
				bishopSW = false;
			}
			columnX = columnX * (-1);
		}

		//NE
		if (rowY < 0 && columnX > 0) {

			a = 0;
			try {
				while (chess[row1st - 1 - a][col1st + 1 + a] == null
						&& (col1st + 1 + a) != col2nd
						&& (row1st - 1 - a) != row2nd) {
					a++;
				}
				a = a + 1;
			} catch (Exception e) {
				if (row1st < 1) {
					while (chess[8][col2nd] == null) {
						a++;
					}

				} else if (col1st > 8) {
					while (chess[row2nd][8] == null) {
						a++;
					}
				} else {
					while (chess[8][8] == null) {
						a++;
					}
				}
			}
			if (rowY < 0) {
				rowY = rowY * (-1);
			}
			if (columnX < 0) {
				columnX = columnX * (-1);
			}
			if ((a != rowY && a != columnX)) {
				bishopNE = false;

			} else if (chess[row2nd][col2nd] != null
					&& chess[row1st][col1st] != null
					&& (enemyDeath(chess, row1st, col1st, col2nd, row2nd) && (a == rowY && a == columnX))) {
				bishopNE = true;

			} else if (chess[row2nd][col2nd] == null
					&& (a == rowY && a == columnX)) {
				bishopNE = true;

			} else {
				bishopNE = false;

			}

		}

		return bishopSW || bishopNE || bishopSE || bishopNW || moveUp
				| moveDown | moveLeft | moveRight;

	}

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