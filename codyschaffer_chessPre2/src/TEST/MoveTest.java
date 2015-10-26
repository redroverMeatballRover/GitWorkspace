package TEST;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class MoveTest {

	String chessPiece = "";
	public int row1st = 0;
	public int row2nd = 0;
	public String column1st = " ";
	public String column2nd = " ";

	ChessPiece[][] pieces = new ChessPiece[9][9];
	boolean nonCollision = false;
	boolean moveValid = false;
	boolean valid1 = true;
	boolean valid2 = true;
	public int colStart = 0;
	public int colEnd = 0;
	int b = 0;
	int a = 0;
	boolean berzerker = true;
	
	//generates pieces, then runs system.
	public void doChess() throws NumberFormatException, IOException {
		pieceGeneration(pieces);
		runnerSystem(row1st, row2nd, column1st, column2nd, pieces, valid1, valid2, colStart, colEnd);
	}
	
	
	
	//With board printed, checks where the user will move the pieces. 
	private void runnerSystem(int row1st, int row2nd, String column1st, String column2nd, ChessPiece[][] pieces, boolean valid1, boolean valid2, int colStart, int colEnd) throws FileNotFoundException, IOException 
	{
		boolean blackTurn = false;
		while (blackTurn == false)
		{
			print(pieces, row1st, colStart, colEnd, row2nd); //origin setup
	
			whatPieceAndWhere(); //which piece will you move?
			movePieceHere(); // where will you place it?

			colStart = letterToNumberColumnOne(column1st, colStart); //get starting position
			colEnd = letterToNumberColumnTwo(column2nd, colEnd); //get end position

			validateMove(row1st, row2nd, pieces, valid1, valid2, colStart,colEnd); //validates if the position is legal
			print(pieces, row1st, colStart, colEnd, row2nd); // prints out the resulting board
		}
	}

	private void movePieceHere() 
	{
		System.out.println("where do you want to move it to(letter-number format)?");
		Pattern s1 = Pattern.compile("([A-Ha-h])([1-9])");
		Matcher v1 = s1.matcher(readLine());

		while (v1.find()) {
			column2nd = getSecondColumn(v1);
			row2nd = getSecondRow(v1);
		}
	}

	private void whatPieceAndWhere() 
	{		
		System.out.println("What piece will you move?(letter-number format)");
		Pattern p1 = Pattern.compile("([A-Ha-h])([1-9])");
		Matcher m1 = p1.matcher(readLine());

		while (m1.find()) {
			column1st = getSecondColumn(m1);
			row1st = getSecondRow(m1);
		}
	}

	private String getSecondColumn(Matcher v1) 
	{
		String column2nd;
		column2nd = v1.group(1);
		return column2nd;
	}

	private int getSecondRow(Matcher v1) 
	{
		int row2nd;
		row2nd = Integer.parseInt(v1.group(2));
		return row2nd;
	}

	private void validateMove(int row1st, int row2nd, ChessPiece[][] pieces, boolean valid1, boolean valid2, int colStart, int colEnd) 
	{
//		boolean nonCollision;
//		boolean moveValid;
		
//		if (valid2 == false && valid1 == false) 
//		{
//			System.out.println("Column doesnt exist , please try again");
//		}

//		if (pieces[row1st][colStart] != null) // && pieces[row1st][colStart].pieceBarrier(pieces, row1st, colStart, colEnd, row2nd)) 
//		{
//			nonCollision = true;
//		} 
//		else 
//		{
//			nonCollision = false;
//		}
		
		if (pieces[row1st][colStart] != null)// && nonCollision) 
		{
			pieces[row2nd][colEnd] = pieces[row1st][colStart];
			pieces[row1st][colStart] = null;
			moveValid = true;
			print(pieces, row1st, colStart, colEnd, row2nd); 
			
		} 
		else 
		{
//			moveValid = false;
			System.out.println("MOVE WAS NOT VALID");
			
			pieces[row2nd][colEnd] = pieces[4][4];
			pieces[row1st][colStart] = null;
			moveValid = true;
			print(pieces, row1st, colStart, colEnd, row2nd); 
			
			
			
		}
	}
	
	private int letterToNumberColumnTwo(String column2nd, int colEnd) {
		switch (column2nd.charAt(0)) {
		case 'h':
			colEnd = 1;
			break;
		case 'g':
			colEnd = 2;
			break;
		case 'f':
			colEnd = 3;
			break;
		case 'e':
			colEnd = 4;
			break;
		case 'd':
			colEnd = 5;
			break;
		case 'c':
			colEnd = 6;
			break;
		case 'b':
			colEnd = 7;
			break;
		case 'a':
			colEnd = 8;
			break;
		default:
			//valid2 = false;
			break;
		}
		return colEnd;
	}

	private int letterToNumberColumnOne(String column1st, int colStart) {
		colStart = letterToNumberColumnTwo(column1st, colStart);
		return colStart;
	}

	private void pieceGeneration(ChessPiece[][] pieces) {
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
	}

	private String readLine() {
		try {
			return new BufferedReader(new InputStreamReader(System.in))
					.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public void print(ChessPiece[][] chess, int row1st, int col1st,
			int col2nd, int row2nd) {
		int a;
		int b;
//		String rows = " abcdefgh";
		String rows = " hgfedcba";
		String nullSquare = "| Null |";
		String[][] array = new String[9][9];
		for (a = 1; a < 9; a++) {
			for (b = 1; b < 9; b++) {
//			for (b = 9; b > 1; b--) {
//				for (a = 9; a > 1; a--) {
				if (chess[a][b] != null) { //the problem here
					array[a][b] = chess[a][b].setInBoard();
				} else {
					array[a][b] = nullSquare;
				}
			}
		}
		rows = " hgfedcba";
//		rows = " abcdefgh";
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

