package makeBoardofCodyCode;
//package TEST;
//
//import java.io.*;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//
//class ChessMain
//{
//
//	public static void main(String[] arg) 
//	{
//
//		//Console console = System.console();
//		
//		boolean pieceMoves = false;
//		boolean noCollision = false;
//		boolean isWhite = false;
//		String chessPiece = "";
//		int row1st = 0;
//		int row2nd = 0;
////		String column1st = " ";
////		String column2nd = " ";
//		boolean enemyDeath = false;
//		ChessPiece[][] pieces = new ChessPiece[9][9];
//		boolean nonCollision = false;
//		boolean moveValid = false;
//		boolean valid1 = false;
//		boolean valid2 = false;
//		int col1st = 0;
//		int col2nd = 0;
//		int b = 0;
//		int a = 0;
//		boolean berzerker = true;
//
////		renema
//		pieces[2][1] = new Pawn("Bpn1");
//		pieces[2][2] = new Pawn("Bpn2");
//		pieces[2][3] = new Pawn("Bpn3");
//		pieces[2][4] = new Pawn("Bpn4");
//		pieces[2][5] = new Pawn("Bpn5");
//		pieces[2][6] = new Pawn("Bpn6");
//		pieces[2][7] = new Pawn("Bpn7");
//		pieces[2][8] = new Pawn("Bpn8");
//		pieces[1][1] = new Rook("BR1");
//		pieces[1][2] = new Knight("BN1");
//		pieces[1][3] = new Bishop("BB1");
//		pieces[1][4] = new King("KingD");
//		pieces[1][5] = new Queen("BQueen");
//		pieces[1][6] = new Bishop("BB2");
//		pieces[1][7] = new Knight("BN2");
//		pieces[1][8] = new Rook("BR2");
//		pieces[7][1] = new Pawn("Wpn1");
//		pieces[7][2] = new Pawn("Wpn2");
//		pieces[7][3] = new Pawn("Wpn3");
//		pieces[7][4] = new Pawn("Wpn4");
//		pieces[7][5] = new Pawn("Wpn5");
//		pieces[7][6] = new Pawn("Wpn6");
//		pieces[7][7] = new Pawn("Wpn7");
//		pieces[7][8] = new Pawn("Wpn8");
//		pieces[8][1] = new Rook("WR1");
//		pieces[8][2] = new Knight("WN1");
//		pieces[8][3] = new Bishop("WB1");
//		pieces[8][4] = new King("KingL");
//		pieces[8][5] = new Queen("WQueen");
//		pieces[8][6] = new Bishop("WB2");
//		pieces[8][7] = new Knight("WN2");
//		pieces[8][8] = new Rook("WR2");
//		
//		int i = 0;
//
//		//while (int i < numberOfLines) // print out this code
////		rla8 a6 
////		rla6 d3
////		nlb8 a6
//		
//		
////		while (i < 1)
////		{
//		do {
//			
//			MyFile myFile = new MyFile();
//			String input = myFile.readTextFile("ChessTest.txt");
//			
//			Pattern x1 = Pattern.compile("(q|k|r|b|p|n)(d|l)([A-Ha-h])([1-9]) ?([A-Ha-h])?([1-9])?");
//			Matcher y1 = x1.matcher(input);
//			
//			
//			
//			while (y1.find())
//			{
//				String aaa = y1.group(3);
//				//column1stC = y1.group(3);
//				row1st = Integer.parseInt(y1.group(4));
//				
//				String bbb = y1.group(5);
//				//column2ndC = y1.group(5);
//				row2nd = Integer.parseInt(y1.group(6));
//			}
//			
//			
//			
//			
////			print(pieces, row1st, colStart, colEnd, row2nd);
////			System.out.println("\n what piece do you want to move(piece name)?");
////			chessPiece = readLine();
////			
////			System.out.println("where is the piece located?(letter-number format)");
////			Pattern p1 = Pattern.compile("([A-Ha-h])([1-9])");
////			Matcher m1 = p1.matcher(readLine());
////			
////			while (m1.find())
////			{
////				//part1 = m1.group(1) + m1.group(2);\
////				column1st = m1.group(1);
////				row1st = Integer.parseInt(m1.group(2));
////			}	
////			
////			System.out.println("where do you want to move it to(letter-number format)?");
////			Pattern s1 = Pattern.compile("([A-Ha-h])([1-9])");
////			Matcher v1 = s1.matcher(readLine());
////			
////			while (v1.find())
////			{
////				column2nd = v1.group(1);
////				row2nd = Integer.parseInt(v1.group(2));
////			}
//				
//			valid1 = true;
//			valid2 = true;
//		
//			
//			//POSITIONS-------------------------------------------------------------------------------------------------------------------------//
//			
//			//switch (column1stC.charAt(0)) 
//			switch (column1stC.charAt(0)) 
//			{
//			case 'a':
//				col1st = 1;
//				break;
//			case 'b':
//				col1st = 2;
//				break;
//			case 'c':
//				col1st = 3;
//				break;
//			case 'd':
//				col1st = 4;
//				break;
//			case 'e':
//				col1st = 5;
//				break;
//			case 'f':
//				col1st = 6;
//				break;
//			case 'g':
//				col1st = 7;
//				break;
//			case 'h':
//				col1st = 8;
//				break;
//			default:
//				valid1 = false;
//				break;
//			}
//			switch (column2ndC.charAt(0)) {
//			case 'a':
//				col2nd = 1;
//				break;
//			case 'b':
//				col2nd = 2;
//				break;
//			case 'c':
//				col2nd = 3;
//				break;
//			case 'd':
//				col2nd = 4;
//				break;
//			case 'e':
//				col2nd = 5;
//				break;
//			case 'f':
//				col2nd = 6;
//				break;
//			case 'g':
//				col2nd = 7;
//				break;
//			case 'h':
//				col2nd = 8;
//				break;
//			default:
//				valid2 = false;
//				break;
//			}
//			
//			//END POSITIONS-------------------------------------------------------------------------------------------------------------------------//
//			
//			if (valid2 == false && valid1 == false) {
//				System.out.println("Column doesnt exist , please try again");
//			}
//
//			if (pieces[row1st][col1st] != null && pieces[row1st][col1st].pieceBarrier(pieces, row1st, col1st, col2nd, row2nd)) {
//				nonCollision = true;
//			} else {
//				nonCollision = false;
//			}
//			if (pieces[row1st][col1st] != null
//					&& pieces[row1st][col1st].legalMove(pieces,
//							col1st, row1st, col2nd, row2nd)
//					&& nonCollision) {
//				pieces[row2nd][col2nd] = pieces[row1st][col1st];
//				pieces[row1st][col1st] = null;
//				moveValid = true;
//			} else {
//				moveValid = false;
//				System.out.println("MOVE WAS NOT VALID");
//
//			}
//			
//			//end valid move methods-----------------------------------------------//
//			isWhite = false;
//			pieceMoves = false;
//			noCollision = false;
//			b++;
//		} 
//		while (berzerker = true);
//	}
//
//	static String readLine() {
//		try {
//			return new BufferedReader(new InputStreamReader(System.in)).readLine();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return null;
//	}
////end main-----------------------------------------------------------------------------------------------------//
//	
//	
//	
//	public static void print(ChessPiece[][] pieces, int rowStart,
//			int columnStart, int columnEnd, int rowEnd) {
//		int a;
//		int b;
//		String rows = " abcdefgh";
//		String nullSquare = "| Null |";
//		String[][] array = new String[9][9];
//		for (a = 1; a < 9; a++) {
//			for (b = 1; b < 9; b++) {
//				if (pieces[a][b] != null) {
//					array[a][b] = pieces[a][b].setInBoard();
//				} else {
//					array[a][b] = nullSquare;
//				}
//			}
//		}
//		rows = " abcdefgh";
//		int i = 0;
//		int j = 0;
//		for (i = 0; i < 9; i++) {
//			for (j = 1; j < 9; j++) {
//				if (i == 0) {
//					System.out.print("    " + rows.charAt(j) + "   ");
//				} else {
//					if (i > 0)
//						System.out.print(array[i][j]);
//				}
//			}
//			if (i == 0)
//				System.out.println();
//			if (i > 0) {
//				System.out.println(i);
//			}
//		}
//
//	}
//}
