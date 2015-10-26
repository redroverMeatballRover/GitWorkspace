package chess;

public class King extends ChessPiece {
	int col2nd;
	int col1st;
	int row2nd;
	int row1st;
	String name;
	boolean valid;
	char firstLetter;
	char secondLetter;
	boolean enemyDeath;
	String chessPiece;
	boolean secondLetterNotNull;
	static int x;
	static int y;

	public King(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "King [name=" + name + "]";
	}

	public boolean legalMove(ChessPiece[][] chess, int col1st, int row1st, int col2nd, int row2nd) {
		{
			boolean kingMoved = false;
			kingMoved = true;
			return kingMoved;
		}
	}

	String King = "";

	public String setInBoard() {
		if (name.charAt(0) == 'B') {
			King = "| Kdn1 |";
		}

		else {
			King = "| Kln1 |";
		}
		return King;
	}

	@Override
	public String findChessPiece() {
		return this.name;
	}

	@Override
	public boolean pieceBarrier(ChessPiece[][] chess, int row1st,
			int col1st, int col2nd, int row2nd) {
		boolean KingMoved = false;
		int b = 0;
		int rowX = row2nd - row1st;
		int columnY = col2nd - col1st;
		boolean rowUpperRangeLimit = false;
		boolean columnUpperRangeLimit = false;
		boolean rowLowerRangeLimit = false;
		boolean columnLowerRangeLimit = false;

		if (rowX < 0) {
			rowX = rowX * (-1);
		}
		if (columnY < 0) {
			columnY = columnY * (-1);
		}
		if (row2nd < 8) {
			rowUpperRangeLimit = true;
		}
		if (row2nd > 1) {
			rowLowerRangeLimit = true;
		}
		if (col2nd < 8) {
			columnUpperRangeLimit = true;
		}
		if (col2nd > 1) {
			columnLowerRangeLimit = true;
		}

		if (rowUpperRangeLimit == true && row1st + 1 == row2nd
				&& col1st == col2nd) {// Down
			b = 1;
		} else if (rowLowerRangeLimit == true && row1st - 1 == row2nd
				&& col1st == col2nd) {// Up
			b = 1;
		} else if (columnUpperRangeLimit == true
				&& col1st + 1 == col2nd && row1st == row2nd) {// Right
			b = 1;
		} else if (columnLowerRangeLimit == true
				&& col1st - 1 == col2nd && row1st == row2nd) {// Left
			b = 1;
		} else if (columnUpperRangeLimit == true && rowUpperRangeLimit == true
				&& row1st + 1 == row2nd && col1st + 1 == col2nd) {// NorthEast
			b = 1;
		} else if (columnUpperRangeLimit == true && rowLowerRangeLimit == true
				&& row1st - 1 == row2nd && col1st + 1 == col2nd) {// SouthEast
			b = 1;
		} else if (columnLowerRangeLimit == true && rowUpperRangeLimit == true
				&& row1st + 1 == row2nd && col1st - 1 == col2nd) {// NorthWest
			b = 1;
		} else if (columnLowerRangeLimit == true && rowLowerRangeLimit == true
				&& row1st - 1 == row2nd && col1st - 1 == col2nd) {// SouthWest
			b = 1;
		} else {
			b = 0;
		}


		if (b == 0) {
			KingMoved = false;
		} else if (chess[row2nd][col2nd] != null && enemyDeath(chess, row1st, col1st, col2nd, row2nd)) {
			KingMoved = true;
		} //if b smaller than dif between col1st and col2nd, false. else true
		else if (chess[row2nd][col2nd] == null && b == 1) {
			KingMoved = true;
		} else {
			KingMoved = false;

		}
		if (chess[row1st][col1st] != null
				&& chess[row1st][col1st].findChessPiece().charAt(0) == 'W'
				&& KingMoved == true) {
			y++;
		}
		if (chess[row1st][col1st] != null
				&& chess[row1st][col1st].findChessPiece().charAt(0) == 'B'
				&& KingMoved == true) {
			x++;
		}
		return KingMoved;
	}

	public static int getX() {
		return x;
	}

	public static int getY() {
		return y;
	}

	public boolean enemyDeath(ChessPiece[][] chess, int row1st,int col1st, int col2nd, int row2nd) 
	{

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