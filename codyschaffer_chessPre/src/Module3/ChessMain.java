package Module3;

//package il.co.ChessInterface;
//import il.co.Bishop.Bishop;
//import il.co.King.King;
//import il.co.Knight.Knight;
//import il.co.Pawn.Pawn;
//import il.co.Queen.Queen;
//import il.co.Rook.Rook;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;


//class ChessInterface
class ChessMain
{

	public static void main(String[] arg) 
	{

		//Console console = System.console();
		
		boolean pieceMoves = false;
		boolean pieceDoesntCollide = false;
		boolean pieceIsWhite = false;
		String chessPiece = "";
		int rowStart = 0;

		boolean pieceDevour = false;
		int rowEnd = 0;

		
		ChessPiece[][] pieces = new ChessPiece[9][9];
		boolean nonCollision = false;
	
		boolean moveValid = false;
		boolean valid1 = false;
		boolean valid2 = false;
		int columnStart = 0;
		int columnEnd = 0;
		int e = 1;

		pieces[2][1] = new Pawn("Bpn1");
		pieces[2][2] = new Pawn("Bpn2");
		pieces[2][3] = new Pawn("Bpn3");
		pieces[2][4] = new Pawn("Bpn4");
		pieces[2][5] = new Pawn("Bpn5");
		pieces[2][6] = new Pawn("Bpn6");
		pieces[2][7] = new Pawn("Bpn7");
		pieces[2][8] = new Pawn("Bpn8");
		
		pieces[1][1] = new Rook("BR1");
		pieces[1][2] = new Knight("BN1");
		pieces[1][3] = new Bishop("BB1");
		pieces[1][4] = new King("BKing");
		pieces[1][5] = new Queen("BQueen");
		pieces[1][6] = new Bishop("BB2");
		pieces[1][7] = new Knight("BN2");
		pieces[1][8] = new Rook("BR2");
		
		pieces[7][1] = new Pawn("Wpn1");
		pieces[7][2] = new Pawn("Wpn2");
		pieces[7][3] = new Pawn("Wpn3");
		pieces[7][4] = new Pawn("Wpn4");
		pieces[7][5] = new Pawn("Wpn5");
		pieces[7][6] = new Pawn("Wpn6");
		pieces[7][7] = new Pawn("Wpn7");
		pieces[7][8] = new Pawn("Wpn8");
		pieces[8][1] = new Rook("WR1");
		
		pieces[8][2] = new Knight("WN1");
		pieces[8][3] = new Bishop("WB1");
		pieces[8][4] = new King("WKing");
		pieces[8][5] = new Queen("WQueen");
		pieces[8][6] = new Bishop("WB2");
		pieces[8][7] = new Knight("WN2");
		pieces[8][8] = new Rook("WR2");

		//int z = 50;
		int b = 0;
		int a = 0;
		boolean whiteTurn = false;
		boolean blackTurn = true;
		//boolean even = false;
		//boolean uneven = false;
		//boolean DestinyNotNull = false;
		boolean berzerker = true;
		
		do {

			if (e % 2 != 0) {
				System.out.println("Blacks turn");
			} else {
				System.out.println("Whites turn");
			}
			System.out.println(e);

			print(pieces, rowStart, columnStart, columnEnd, rowEnd);
			System.out.println("\n what piece do you want to move?");
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
			// System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
			valid1 = true;
			valid2 = true;
			System.out
					.println("//////////////////////////////////MOVE VALIDITY//////////////////////////////////////////////////////");
			switch (columnStartC.charAt(0)) {
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
			if (valid2 == false && valid1 == false) {
				System.out.println("Column doesnt exist , please try again");
			}

			if (pieces[rowStart][columnStart] != null
					&& pieces[rowStart][columnStart].piecesCollision(pieces,
							rowStart, columnStart, columnEnd, rowEnd)) {
				nonCollision = true;
			} else {
				nonCollision = false;

			}
			if (pieces[rowStart][columnStart] != null
					&& pieces[rowStart][columnStart].isMoveValid(pieces,
							columnStart, rowStart, columnEnd, rowEnd)
					&& nonCollision) {
				pieces[rowEnd][columnEnd] = pieces[rowStart][columnStart];
				pieces[rowStart][columnStart] = null;
				moveValid = true;
			} else {
				moveValid = false;

			}
			System.out.println("//////////////////////////////////MOVE VALIDITY: SEE NOTES ABOVE//////////////////////////////////////////////////////");
			
			// //////////////////END OF VALID MOVES// METHODS///////////////////////////////////////////////////////////////////
		


			pieceIsWhite = false;
			pieceMoves = false;
			pieceDoesntCollide = false;
			b++;

			//print(pieces, rowStart, columnStart, columnEnd, rowEnd);
		} 
		while (berzerker = true);
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

	// method/////////////End of main method////////End of main method/////////

	public static void print(ChessPiece[][] pieces, int rowStart,
			int columnStart, int columnEnd, int rowEnd) {
		int a;
		int b;
		String rows = " abcdefgh";
		String nullSquare = "| Null |";
		String[][] array = new String[9][9];
		for (a = 1; a < 9; a++) {
			for (b = 1; b < 9; b++) {
				if (pieces[a][b] != null) {
					array[a][b] = pieces[a][b].print();
				} else {
					array[a][b] = nullSquare;
				}
			}
		}
		rows = " abcdefgh";
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
//		System.out
//				.println("                                                                             \n ");
//		System.out.println("Moves made: ");
//		System.out.print("From Row: " + rowStart + "  From Column: "
//				+ columnStart + "    Square presentation: ");
//		System.out.println(array[rowStart][columnStart]);
//		System.out.print("From Row: " + rowEnd + "  From Column: " + columnEnd
//				+ "    Square presentation: ");
//		System.out.println(array[rowEnd][columnEnd]);
//		System.out
//				.println("                                                                             \n ");
	}
}