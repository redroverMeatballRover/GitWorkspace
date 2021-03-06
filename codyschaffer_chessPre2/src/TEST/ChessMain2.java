package TEST;


import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


class ChessMain2 {

	public static void main(String[] arg) throws NumberFormatException,
			IOException {
		doChess();
	}

	public static void doChess() throws NumberFormatException, IOException {
		// Console console = System.console();

		boolean pieceMoves = false;
		boolean noCollision = false;
		boolean isWhite = false;
		String chessPiece = "";
		int row1st = 0;
		int row2nd = 0;
		String column1st = " ";
		String column2nd = " ";
		boolean enemyDeath = false;
		ChessPiece[][] pieces = new ChessPiece[9][9];
		boolean nonCollision = false;
		boolean moveValid = false;
		boolean valid1 = false;
		boolean valid2 = false;
		int colStart = 0;
		int colEnd = 0;
		int b = 0;
		int a = 0;
		boolean berzerker = true;

		String partX = " ";
		String part1 = " ";
		String part2 = " ";
		String p = " ";
		String type = " ";
		
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

		FileReader reader = new FileReader("ChessTest.txt");
		BufferedReader buffer = new BufferedReader(reader);

		String checker = " ";
		String temp = "dark";

		String columnTemp = " ";
		int rowTemp = 0;
		int e=1;
		
//-------------------------------------------------------------------------------------//		
//		boolean blackTurn = false;
//
//		while (buffer.ready()) {
//			print(pieces, row1st, colStart, colEnd, row2nd);
//			String input = buffer.readLine();
//
//			Pattern x1 = Pattern
//					.compile("(q|k|r|b|p|n)?(d|l)?([A-Ha-h])([1-9]) ?([A-Ha-h])?([1-9])?");
//			Matcher y1 = x1.matcher(input);
//
//			while (y1.find()) {
//				if (y1.group(2).equals("l") && temp.equals("dark")) {
//					checker = "white";
//					temp = "white";
//					System.out.println("It is whites turn.");
//
//					column1st = y1.group(3);
//					row1st = Integer.parseInt(y1.group(4));
//
//					if (columnTemp.equals(column1st) && rowTemp == row1st) {
//						// potential problems with this...
//						// for example, can only protect the other player from
//						// evil hands right after the move is made.
//						// possible way to handle: put all moves into an list of
//						// some sort, iterate through it to check pieces
//						System.out.println("ILLEGAL HANDLING: this piece is not yours. You have tried to move another players piece. Please Choose Another piece to move.");
//						temp = "white";// ensures that the player must go again
//						// restarts the proccess
//					} else {
//
//						// END POSITION-----------------------//
//
//						Pattern z1 = Pattern
//								.compile("(q|k|r|b|p|n)?(d|l)?([A-Ha-h])([1-9]) ?([A-Ha-h])?([1-9])?");
//						Matcher a1 = z1.matcher(input);
//
//						while (a1.find()) {
//							column2nd = a1.group(5);
//							row2nd = Integer.parseInt(a1.group(6));
//
//							columnTemp = a1.group(5);
//							rowTemp = Integer.parseInt(a1.group(6));
//						}
//						System.out.println(column1st + row1st + " to "
//								+ column2nd + row2nd);
//					}
//				}
//
//				else if (y1.group(2).equals("d") && temp.equals("white")) {
//					checker = "dark";
//					temp = "dark";
//					System.out.println("It is black's turn");
//
//					column1st = y1.group(3);
//					row1st = Integer.parseInt(y1.group(4));
//
//					// checking that black does not touch white's piece
//					if (columnTemp.equals(column1st) && rowTemp == row1st) {
//						// potential problems with this...
//						// for example, can only protect the other player from
//						// evil hands right after the move is made.
//						// possible way to handle: put all moves into an list of
//						// some sort, iterate through it to check pieces
//						System.out
//								.println("ILLEGAL HANDLING: this piece is not yours. You have tried to move another players piece. Please Choose Another piece to move.");
//						temp = "white";// ensures that the player must go again
//						// restarts the proccess
//					} else {
//
//						// END POSITION-----------------------//
//
//						Pattern z1 = Pattern
//								.compile("(q|k|r|b|p|n)?(d|l)?([A-Ha-h])([1-9]) ?([A-Ha-h])?([1-9])?");
//						Matcher a1 = z1.matcher(input);
//
//						while (a1.find()) {
//							column2nd = a1.group(5);
//							row2nd = Integer.parseInt(a1.group(6));
//
//							columnTemp = a1.group(5);
//							rowTemp = Integer.parseInt(a1.group(6));
//						}
//						System.out.println(column1st + row1st + " to "
//								+ column2nd + row2nd);
//					}
//				} else if (y1.group(2).equals("l") && temp.equals("white")) {
//					System.out.println("It is not your turn! BLACK must move.");
//				} else if (y1.group(2).equals("d") && temp.equals("dark")) {
//					checker = "dark";
//					temp = "dark";
//					System.out.println("It is not your turn! WHITE must move.");
//				}
//
//				// column1st = y1.group(3);
//				// row1st = Integer.parseInt(y1.group(4));
//			}
//
//			// Pattern z1 =
//			// Pattern.compile("([A-Ha-h])([1-9]) ?([A-Ha-h])?([1-9])?");
//			// Matcher a1 = z1.matcher(input);
//			//
//			// while (a1.find())
//			// {
//			// column2nd = a1.group(3);
//			// row2nd = Integer.parseInt(a1.group(4));
//			// }
		//-------------------------------------------------------------------------------------//	
		//-------------------------------------------------------------------------------------//	
		
			// ------------------------------------------------------------------------------------------//
			// USER INPUT VERSION
			// -------------------------------------------------------------------------------------//

		boolean blackTurn = false;

		while (buffer.ready()) {
			
			
			print(pieces, row1st, colStart, colEnd, row2nd);
			String input = buffer.readLine();

			Pattern x1 = Pattern.compile("(q|k|r|b|p|n)?(d|l)?([A-Ha-h])([1-9]) ?([A-Ha-h])?([1-9])?");
			Matcher y1 = x1.matcher(input);

			// for turns
//			if (blackTurn = false) 
//			{
//				System.out.println("BLACK");
//			} 
//			else 
//			{
//				System.out.println("WHITE");
//			}
			
			blackTurn = true; 
			System.out.println("\n what piece do you want to move(piece name)?");	
			chessPiece = readLine();
			
//			if (array[a][b] == nullsquare)
			

			System.out.println("where is the piece located?(letter-number format)");
			Pattern p1 = Pattern.compile("([A-Ha-h])([1-9])");
			Matcher m1 = p1.matcher(readLine());

			while (m1.find()) {
				column1st = m1.group(1);
				row1st = Integer.parseInt(m1.group(2));
			}

			System.out
					.println("where do you want to move it to(letter-number format)?");
			Pattern s1 = Pattern.compile("([A-Ha-h])([1-9])");
			Matcher v1 = s1.matcher(readLine());

			while (v1.find()) {
				column2nd = v1.group(1);
				row2nd = Integer.parseInt(v1.group(2));

			}

			// ------------------------------------------------------------------------------------------//

			valid1 = true;
			valid2 = true;
			
			// POSITIONS-------------------------------------------------------------------------------------------------------------------------//

			switch (column1st.charAt(0)) {
			case 'h':
				colStart = 1;
				break;
			case 'g':
				colStart = 2;
				break;
			case 'f':
				colStart = 3;
				break;
			case 'e':
				colStart = 4;
				break;
			case 'd':
				colStart = 5;
				break;
			case 'c':
				colStart = 6;
				break;
			case 'b':
				colStart = 7;
				break;
			case 'a':
				colStart = 8;
				break;
			default:
				valid1 = false;
				break;
			}
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
				valid2 = false;
				break;
			}

			// END
			// POSITIONS-------------------------------------------------------------------------------------------------------------------------//

			if (valid2 == false && valid1 == false) {
				System.out.println("Column doesnt exist , please try again");
			}

			if (pieces[row1st][colStart] != null && pieces[row1st][colStart].pieceBarrier(pieces, row1st, colStart, colEnd, row2nd)) {
				nonCollision = true;
			} 
			else {
				nonCollision = false;
			}
			if (pieces[row1st][colStart] != null && pieces[row1st][colStart].legalMove(pieces, colStart, row1st, colEnd, row2nd) && nonCollision) {
				pieces[row2nd][colEnd] = pieces[row1st][colStart];
				pieces[row1st][colStart] = null;
				moveValid = true;
			} 
			else {
				moveValid = false;
				System.out.println("MOVE WAS NOT VALID");
			}
			print(pieces, row1st, colStart, colEnd, row2nd);
		}
		while (berzerker = true);// print(pieces, row1st, col1st, col2nd, row2nd);
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

	// end
	// main-----------------------------------------------------------------------------------------------------//

	public static void print(ChessPiece[][] chess, int row1st, int col1st,
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
