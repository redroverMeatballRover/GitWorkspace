package BornOfOsiris;

public class Pawn extends ChessPiece {

	int columnEnd;
	int rowEnd;
	int columnStart;
	int rowStart;
	String pName;// name
	boolean basic;
	boolean twoSquareMove;
	boolean attackMove;// devour move
	boolean valid;
	String chessPiece;
	boolean enemyDeath; // piecedevour
	String pawn = "";
	char firstLetter;// check this
	char secondLetter;// theck this

	boolean secondLetterNotNull;// check this

	public Pawn(String pName) {
		this.pName = pName;
	}

	public boolean isMoveLegal(ChessPiece[][] piece, int colStart,
			int rowStart, int colEnd, int rowEnd) {
		int moveX = rowEnd - rowStart;
		if (moveX == 1 || moveX == -1) {
			basic = true;
		}
		boolean move1 = true; // used to be false
		boolean move2 = true;
		boolean move3 = true;
		boolean move4 = true;
		// move1 = true;
		// move2 = true;
		// move3 = true;
		// move4 = true;

		return move1 || move2 || move3 || move4;
	}

	public String check() // print()
	{
		if (pName.charAt(0) == 'B') {
			pawn = "[ " + pName + " ]";
		} else {
			pawn = "[ " + pName + "[]";
		}
		return pawn;
	}

	public String find() // findPiece()
	{
		return this.pName;
	}

	public boolean pieceBarrier(ChessPiece[][] piece, int rowStart,
			int colStart, int colEnd, int rowEnd) {
		boolean UPMove = false;
		boolean UPMove2 = false;
		boolean RIGHTMove = false;
		boolean DOWNMove = false;
		boolean DOWNMove2 = false;
		boolean LEFTMove = false;

		// white moving up
		if (piece[rowStart][colStart].Find().charAt(0) == 'W') {
			if (rowStart == 7 && (rowEnd == 6 || rowEnd == 5)
					&& columnStart == columnEnd) {
				UPMove = true;
			} else if ((rowStart - 1) == rowEnd
					&& piece[rowEnd][colEnd] == null && colStart == colEnd) {
				UPMove2 = true;
			} else {
				UPMove = false;
				UPMove2 = false;
			}
		}
		// WHITE MOVING LEFT
		if (piece[rowStart][colStart].Find().charAt(0) == 'W') {
			if (DOWNMove2 == false
					&& DOWNMove == false
					&& (rowStart - 1) == rowEnd
					&& (colStart - 1) == colEnd
					&& piece[rowEnd][colEnd] != null
					&& pieceAttack(piece, rowStart, colStart, colEnd, rowEnd) == true
					&& colStart != colEnd) {
				LEFTMove = true;

			} else if (DOWNMove2 == false
					&& DOWNMove == false
					&& (rowStart - 1) == rowEnd
					&& (colStart + 1) == colEnd
					&& piece[rowEnd][colEnd] != null
					&& pieceAttack(piece, rowStart, colStart, colEnd, rowEnd) == true
					&& colStart != colEnd) {
				RIGHTMove = true;

			} else {
				LEFTMove = false;
				RIGHTMove = false;
			}
		}

		// Black--Moving Down//
		if (piece[rowStart][colStart].Find().charAt(0) == 'B') {
			if (rowStart == 2 && (rowEnd == 4 || rowEnd == 3)
					&& colStart == colEnd) {
				DOWNMove = true;
			} else if ((rowStart + 1) == rowEnd
					&& piece[rowEnd][colEnd] == null && colStart == colEnd) {
				DOWNMove2 = true;
			} else {
				DOWNMove = false;
				DOWNMove2 = false;
			}
		}

		if (piece[rowStart][colStart].Find().charAt(0) == 'B') {
			if (UPMove == false
					&& UPMove2 == false
					&& (rowStart + 1) == rowEnd
					&& (colStart - 1) == colEnd
					&& piece[rowEnd][colEnd] != null
					&& pieceAttack(piece, rowStart, colStart, colEnd, rowEnd) == true
					&& colStart != colEnd) {
				LEFTMove = true;

			} else if (UPMove == false
					&& UPMove2 == false
					&& (rowStart + 1) == rowEnd
					&& (colStart + 1) == colEnd
					&& piece[rowEnd][colEnd] != null
					&& pieceAttack(piece, rowStart, colStart, colEnd, rowEnd) == true
					&& colStart != colEnd) {
				RIGHTMove = true;
			} else {
				LEFTMove = false;
				RIGHTMove = false;
			}
		}
		return UPMove || RIGHTMove || DOWNMove || LEFTMove || UPMove2
				|| DOWNMove2;
	}

	public boolean pieceAttack(ChessPiece[][] piece, int rowStart,
			int colStart, int colEnd, int rowEnd) {
		firstLetter = piece[rowStart][colStart].Find().charAt(0);
		if (piece[rowEnd][colEnd] != null) {
			secondLetterNotNull = true;
			secondLetter = piece[rowEnd][colEnd].Find().charAt(0);
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

	public String toString()// return to this
	{
		return "Pawn [name=" + pName + "]";
	}
}


























