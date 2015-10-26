package Hybrid;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.io.Serializable;

import javax.swing.BorderFactory;
import javax.swing.JButton;

import TEST.ChessPiece;


public class ChessBoard implements Serializable { //this will later extend jPanel

	private static final long serialVersionUID = -1246957520079405796L;
	private BoardState boardState;
	//private boolean isFlipped;
	//transient private GUI listener;
	//private JButton[][] squares;
//	private Color cream;
//	private Color green;

	//public ChessBoard(BoardState boardState, GUI listener, Dimension size)
	public ChessBoard(BoardState boardState, Dimension size)
	{
		//NON-GUI VERSION---------------------------------------------------------------------//
		this.boardState = boardState;
		
		
		
	
		
		//---------------------------------------------------------------------------------//
		//NON GUI VERSION END
		//NON GUI VERSION END
		//NON GUI VERSION END
		
		
		//super(new GridLayout(8,8)); 	-- WHERE IS THIS FROM
		//isFlipped = false;
		//this.listener = listener;
		//setOpaque(true);
		//setBackground(green);
		//setPreferredSize(size);
//		green = new Color(51,102,255);
//		cream = new Color(46,184,0);
		
		//THIS IS WHERE THE BOARD IS MADE-------------------------------------------------------------//
		//THIS IS WHERE THE BOARD IS MADE-------------------------------------------------------------//
		//THIS IS WHERE THE BOARD IS MADE-------------------------------------------------------------//
		//THIS IS WHERE THE BOARD IS MADE-------------------------------------------------------------//
		
		
//		@SuppressWarnings("serial")
//		class PaintedButton extends JButton
//		{
//			private BoardState boardState;
//			public PaintedButton(BoardState boardState)
//			{
//				this.boardState = boardState;
//			}
//			public void paintComponent(Graphics g) 
//			{
//				super.paintComponent(g); // Paint background, border
//				int x = -1;
//				int y = -1;
//				for(int a=0; a<boardState.getState().length; a++)
//					for(int b=0; b<boardState.getState()[a].length; b++)
//						if(squares[a][b].equals(this))
//						{
//							y=a;
//							x=b;
//						}
//				if(x!=-1 && y!=-1)
//				{
//					x = processLocation(new Location(x,y)).getRow();
//					y = processLocation(new Location(x,y)).getCol();
//					if(boardState.getState()[y][x]!=null)
//					{
//						boardState.getState()[y][x].draw(g);
//					}
//				}
//			}
//		}
//		
//		squares = new PaintedButton[8][8];
//		
//		for(int y=0; y<squares.length; y++)
//			for(int x=0; x<squares.length; x++)
//			{
//				squares[y][x] = new PaintedButton(this.boardState);
//				squares[y][x].setBorder(BorderFactory.createRaisedBevelBorder());
//				squares[y][x].setActionCommand(""+y+x);
//				squares[y][x].addMouseListener(new DynamicStatusBarUpdate(listener));
//			}
//		
//		for(int y=0; y<squares.length; y++)
//			for(int x=0; x<squares.length; x++)
//				add(squares[y][x]);
//		resetBackground();
	}
	
	public static void doChess() {
		
		String chessPiece = "";
		int row1st = 0;
		int row2nd = 0;
		String column1st = " ";
		String column2nd = " ";
		ChessPiece[][] pieces = new ChessPiece[9][9];
		
		boolean moveValid = false;
		boolean valid1 = false;
		boolean valid2 = false;
		int colStart = 0;
		int colEnd = 0;
		int b = 0;
		int a = 0;
		
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
		pieces[1][4] = new King("KingD");
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
		pieces[8][4] = new King("KingL");
		pieces[8][5] = new Queen("WQueen");
		pieces[8][6] = new Bishop("WB2");
		pieces[8][7] = new Knight("WN2");
		pieces[8][8] = new Rook("WR2");
		
		
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
				if (chess[a][b] != null) { //the problem here
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

