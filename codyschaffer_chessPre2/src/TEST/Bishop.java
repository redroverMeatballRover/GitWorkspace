package TEST;

public class Bishop extends ChessPiece {
	int col2nd;
	int col1st;
	int row1st;
	int row2nd;
	String name;
	boolean valid;
	char firstLetter;
	char secondLetter;
	boolean enemyDeath;
	String chessPiece;
	boolean secondLetterNotNull;

	public Bishop(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Bishop [name=" + name + "]";
	}

	public boolean legalMove(ChessPiece[][] chess, int col1st, int row1st,
			int col2nd, int row2nd) {
		int berzerkX = col2nd - col1st;
		berzerkX = berzerkX < 0 ? -berzerkX : berzerkX;
		int berzerkY = row2nd - row1st;
		berzerkY = berzerkY < 0 ? -berzerkY : berzerkY;
		return berzerkY == berzerkX;
	}

	String Bishop = "";

	public String setInBoard() {
		if (name.charAt(0) == 'B') {
			Bishop = "| bdn1 |";
		} else {
			Bishop = "| bln1 |";
		}
		return Bishop;
	}

	@Override
	public String findChessPiece() {
		return this.Bishop;
	}

	public boolean pieceBarrier(ChessPiece[][] chess, int row1st, int col1st,
			int col2nd, int row2nd) {
		int columnX = col2nd - col1st;
		int rowY = row2nd - row1st;
		boolean bishopNE = false;
		boolean bishopNW = false;
		boolean bishopSW = false;
		boolean bishopSE = false;
		int a = 0;

		// NW
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

		// SE
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

		// SW
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
		// NE
		if (rowY < 0 && columnX > 0) {
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
		return bishopSW || bishopNE || bishopSE || bishopNW;
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