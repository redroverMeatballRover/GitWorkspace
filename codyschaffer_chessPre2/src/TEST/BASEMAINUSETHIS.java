package TEST;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BASEMAINUSETHIS {

	String chessPiece = "";
	int row1st = 0;
	int row2nd = 0;
	String column1st = " ";
	String column2nd = " ";
	boolean nonCollision = false;
	boolean moveValid = false;
	boolean valid1 = true;
	boolean valid2 = true;
	int colStart = 0;
	int colEnd = 0;
	boolean berzerker = true;
	
//	public static void main(String[] arg) throws NumberFormatException, IOException {
//			doChess();
//	}

	public void doChess() throws NumberFormatException, IOException 
	{
		 ChessPiece[][] pieces = new ChessPiece[9][9];
		
		// SECONDARY
		pieces[7][8] = new Pawn("Bpn1");
		pieces[7][7] = new Pawn("Bpn2");
		pieces[7][6] = new Pawn("Bpn3");
		pieces[7][5] = new Pawn("Bpn4");
		pieces[7][4] = new Pawn("Bpn5");
		pieces[7][3] = new Pawn("Bpn6");
		pieces[7][2] = new Pawn("Bpn7");
		pieces[7][1] = new Pawn("Bpn8");
		pieces[8][1] = new Rook("BR1");
		pieces[8][2] = new Knight("BN1");
		pieces[8][3] = new Bishop("BB1");
		pieces[8][4] = new King("KingD");
		pieces[8][5] = new Queen("BQueen");
		pieces[8][6] = new Bishop("BB2");
		pieces[8][7] = new Knight("BN2");
		pieces[8][8] = new Rook("BR2");
		pieces[2][8] = new Pawn("Wpn1");
		pieces[2][7] = new Pawn("Wpn2");
		pieces[2][6] = new Pawn("Wpn3");
		pieces[2][5] = new Pawn("Wpn4");
		pieces[2][4] = new Pawn("Wpn5");
		pieces[2][3] = new Pawn("Wpn6");
		pieces[2][2] = new Pawn("Wpn7");
		pieces[2][1] = new Pawn("Wpn8");
		pieces[1][8] = new Rook("WR1");
		pieces[1][7] = new Knight("WN1");
		pieces[1][6] = new Bishop("WB1");
		pieces[1][5] = new King("KingL");
		pieces[1][4] = new Queen("WQueen");
		pieces[1][3] = new Bishop("WB2");
		pieces[1][2] = new Knight("WN2");
		pieces[1][1] = new Rook("WR2");

		printTheBoard(row1st, row2nd, pieces, colStart, colEnd);
}

	private static void printTheBoard(int row1st, int row2nd,
	ChessPiece[][] pieces, int colStart, int colEnd) throws IOException 
	{
			print(pieces, row1st, colStart, colEnd, row2nd);
	}

	public static void print(ChessPiece[][] chess, int row1st, int col1st,
			int col2nd, int row2nd) {
		int a;
		int b;
	
		String rows = " hgfedcba";
		String nullSquare = "| Null |";
		String[][] array = new String[9][9];
		for (a = 1; a < 9; a++) {
			for (b = 1; b < 9; b++) {
				if (chess[a][b] != null) { // the problem here
					array[a][b] = chess[a][b].setInBoard();
				} else {
					array[a][b] = nullSquare;
				}
			}
		}
		rows = " hgfedcba";
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
