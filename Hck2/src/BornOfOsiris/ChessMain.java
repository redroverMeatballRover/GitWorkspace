package BornOfOsiris;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

class ChessInterface {
	public static void main(String[] arg) {
		Console console = System.console();
		
		// checks any threatening piece
		boolean schwarma = false;
		String chessPiece = "";
		int rowStart = 0;
//		int number = 0;
//		int moveCount = 0;
//		char firstLetter = ' ';
//		char secondLetter = ' ';
//		boolean enemyDeath = false;
		int rowEnd = 0;
		int e = 1;
		ChessPiece[][] pieces = new ChessPiece[9][9];
		boolean nonCollision = false;
		boolean secondLetterNotNull = false;
		boolean moveValid = false;
		boolean valid1 = false;
		boolean valid2 = false;
		int columnStart = 0;
		int columnEnd = 0;
		boolean pieceIsntNull = false;
		boolean rightTurnNumber = false;
		boolean turn = false;

		pieces[2][1] = new Pawn("pdn1");
		pieces[2][2] = new Pawn("pdn2");
		pieces[2][3] = new Pawn("pdn3");
		pieces[2][4] = new Pawn("pdn4");
		pieces[2][5] = new Pawn("pdn5");
		pieces[2][6] = new Pawn("pdn6");
		pieces[2][7] = new Pawn("pdn7");
		pieces[2][8] = new Pawn("pdn8");
		pieces[1][1] = new Rook("rd1");
		pieces[1][2] = new Knight("nd1");
		pieces[1][3] = new Bishop("bd1");
		pieces[1][4] = new King("Kd");
		pieces[1][5] = new Queen("qd");
		pieces[1][6] = new Bishop("bd2");
		pieces[1][7] = new Knight("nd2");
		pieces[1][8] = new Rook("rd2");
		pieces[7][1] = new Pawn("pln1");
		pieces[7][2] = new Pawn("pln2");
		pieces[7][3] = new Pawn("pln3");
		pieces[7][4] = new Pawn("pln4");
		pieces[7][5] = new Pawn("pln5");
		pieces[7][6] = new Pawn("pln6");
		pieces[7][7] = new Pawn("pln7");
		pieces[7][8] = new Pawn("pln8");
		pieces[8][1] = new Rook("rl1");
		pieces[8][2] = new Knight("nl1");
		pieces[8][3] = new Bishop("bl1");
		pieces[8][4] = new King("kl");
		pieces[8][5] = new Queen("ql");
		pieces[8][6] = new Bishop("bl2");
		pieces[8][7] = new Knight("nl2");
		pieces[8][8] = new Rook("rl2");

		boolean DestinyIsWhite = true;
		boolean DestinyIsBlack = true;

		int z = 50;
		int b = 0;
		int a = 0;
		boolean whiteTurn = false;
		boolean blackTurn = true;
		boolean even = false;
		boolean uneven = false;
		boolean DestinyNotNull = false;

		do {
			
			System.out.println(e);

			print(pieces, rowStart, columnStart, columnEnd, rowEnd);
			System.out.println("choose piece");
			chessPiece = readLine();
			System.out.println("where is the piece located?(type row number)");
			rowStart = Integer.parseInt(readLine());
			System.out
					.println("where is the piece located?(type column letter)");
			String columnStartC = readLine();
			System.out
					.println("where do you want to move it to?(type row number)");
			rowEnd = Integer.parseInt(readLine());
			System.out
					.println("where do you want to move it to?(type column letter)");
			String columnEndC = readLine();

			valid1 = true;
			valid2 = true;
			System.out
					.println("//MOVE VALIDITY//");

			
			//determining positions
			switch (columnStartC.charAt(0)) 
			{
			case 'a':
				columnStart = 1;
				break;
			case 'b':
				columnStart = 2;
				break;
			case 'c':
				columnStart = 3;
				break;
			case 'd':
				columnStart = 4;
				break;
			case 'e':
				columnStart = 5;
				break;
			case 'f':
				columnStart = 6;
				break;
			case 'g':
				columnStart = 7;
				break;
			case 'h':
				columnStart = 8;
				break;
			default:
				valid1 = false;
				break;
			}

			switch (columnEndC.charAt(0)) {
			case 'a':
				columnEnd = 1;
				break;
			case 'b':
				columnEnd = 2;
				break;
			case 'c':
				columnEnd = 3;
				break;
			case 'd':
				columnEnd = 4;
				break;
			case 'e':
				columnEnd = 5;
				break;
			case 'f':
				columnEnd = 6;
				break;
			case 'g':
				columnEnd = 7;
				break;
			case 'h':
				columnEnd = 8;
				break;
			default:
				valid2 = false;
				break;
			}

			if (valid2 == false && valid1 == false) 
			{
				System.out.println("Column doesnt exist , please try again");
			}

			if (pieces[rowStart][columnStart] != null
					&& pieces[rowStart][columnStart].pieceBarrier(pieces,
							rowStart, columnStart, columnEnd, rowEnd)) {
				nonCollision = true;
			} else {
				nonCollision = false;
			}

			if (pieces[rowStart][columnStart] != null
					&& pieces[rowStart][columnStart].isMoveLegal(pieces,
							columnStart, rowStart, columnEnd, rowEnd)
					&& nonCollision) {
				pieces[rowEnd][columnEnd] = pieces[rowStart][columnStart];
				pieces[rowStart][columnStart] = null;
				moveValid = true;
			} else {
				moveValid = false;
			}
			System.out
					.println("//MOVE VALIDITY//");
			//END OF VALID MOVES
			print(pieces, rowStart, columnStart, columnEnd, rowEnd);
		} while (schwarma == false);

	}

	static String readLine() {
		try {
			return new BufferedReader(new InputStreamReader(System.in))
					.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	//End -------------------------------------------------------------------------------------//
	
	public static void print(ChessPiece[][] pieces, int rowStart,
			int columnStart, int columnEnd, int rowEnd) {
		int x;
		int y;
		String rows = " abcdefgh";
		String nullSquare = "| Null |";
		String[][] array = new String[9][9];
		for (x = 1; x < 9; x++) {
			for (y = 1; y < 9; y++) {
				if (pieces[x][y] != null) {
					array[x][y] = pieces[x][y].check();
				} else {
					array[x][y] = nullSquare;
				}
			}
		}
		int i = 0;
		int j = 0;
		for (i = 0; i < 9; i++) {
			for (j = 1; j < 9; j++) {
				if (i == 0) {
					System.out.print("    " + rows.charAt(j) + "   ");
				} else {
					if (i > 0)
						System.out.print(array[i][j]);
				}
			}
			if (i == 0)
				System.out.println();
			if (i > 0) {
				System.out.println(i);
			}
		}
	}

}
