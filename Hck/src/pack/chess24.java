package pack;

//this identifies the piece selected, and moves a piece anywhere the user chooses
//even where there is another piece
//beginning to check for check of king
//confirm check of king by pawn, king can move anywhere to test
//all illegal or legal moves allowed -
//^ operator = xor
//************************************
//chess20 has previous bugs fixed plus knights and move and check the king
//************************************
//Chess21 has logic for moving bishops and taking pieces, but there are bugs
//************************************
//Chess22 has logic for detecting squares attacked by pawns
//next step is to break this into two arrays to handle exceptions of white
//and black attacking the same square
//or use a another code: 3 to denote attacked by both white and black
//Chess 23
//king rules for movement
//pawn rules for movement, check, squares attacked
//knight rules for movement, check, squares attacked
//bishop rules for movement
//Chess 24
//king rules for movement, N/A
//pawn rules for movement, check, squares attacked
//knight rules for movement, check, squares attacked
//bishop rules for movement, check
import java.awt.Graphics;
import java.awt.Image;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import javax.swing.*;

public class chess24 extends java.applet.Applet implements MouseMotionListener
{
	// changed class structure to allow globals declared
	// here to determine what square on the board has
	// been clicked | 1/24/05
	//black king = 4 white king = 28
	class piece //this allows us to track all the information
	{           //about the pieces
		int IDNum;
		int row;		//int row;
		int column;		//int column;
		int xposition;
		int yposition;

		Image mypic;	//Image mypic;
		boolean visible;//boolean visible;	//counts as taken
		boolean firstmove;
		String color;	//String color;
		String name;	//String name;

	};

	//piece 0 at 0,0 is black rook, piece 31 at 7,7 is white rook
    //using top to bottom, and left to right to indentify pieces
	public static piece [] pieces=new piece[32]; //allows us use specific pieces

	// globals
	public static int ChessBoard[][] = new int [8][8];
	static int counter = 0;
	boolean ok = false;		//this is for seeing if its ok to move
	int pieceChosen = 0;	//this identifies which piece to move
	int numclicks = 0;
	int oldx;
	int oldy;
	int wsquares[][] = new int [12][12];

	public void GetFileAndName(int rowIndex, int colIndex)
	{
		String fileName;
		String blackName = "brbnbbbqbk";
		String whiteName = "wrwnwbwqwk";
		String tempName = "";
		String fileExt = ".gif";

		if (rowIndex == 1)
			tempName = blackName;
		else if (rowIndex == 8)
			tempName = whiteName;
		if (rowIndex == 2 || rowIndex == 7)
		{
			pieces[counter].name = "Pawn";
			if (rowIndex == 2)
				pieces[counter].mypic = getImage(getCodeBase(), "bp.gif");
			else
				pieces[counter].mypic = getImage(getCodeBase(), "wp.gif");
		}
		else
		{
			switch(colIndex)
			{
				case 1:
				case 8:
				{
					fileName = tempName.substring(0,2) + fileExt;
					pieces[counter].mypic = getImage(getCodeBase(), fileName);
					pieces[counter].name = "Rook";
					break;
				}
				case 2:
				case 7:
				{
					fileName = tempName.substring(2,4) + fileExt;
					pieces[counter].mypic = getImage(getCodeBase(), fileName);
					pieces[counter].name = "Knight";
					break;
				}
				case 3:
				case 6:
				{
					fileName = tempName.substring(4,6) + fileExt;
					pieces[counter].mypic = getImage(getCodeBase(), fileName);
					pieces[counter].name = "Bishop";
					break;
				}
				case 4:
				{
					fileName = tempName.substring(6,8) + fileExt;
					pieces[counter].mypic = getImage(getCodeBase(), fileName);
					pieces[counter].name = "Queen";
					break;
				}
				case 5:
				{
					fileName = tempName.substring(8,10) + fileExt;
					pieces[counter].mypic = getImage(getCodeBase(), fileName);
					pieces[counter].name = "King";
					break;
				}
			}
		}
	}

	public void init()
	{

		//*************************************
		//this declares the pieces, can't use them without this
		for (int i=0; i< 32; i++)
		{
			pieces[i]=new piece();
		}
		//This puts pieces in their original settings in the class
		//top left corner is [0][0]
		//bottom right is [7][7]
		int rowArray[] = {1,2,7,8};
		for (int k = 0; k < 4; k++)
		{
			for (int l = 0; l < 8; l++)
			{
				pieces[counter].IDNum = counter;
				pieces[counter].row = rowArray[k];
				pieces[counter].column = l + 1;
				pieces[counter].xposition = 0;
				pieces[counter].yposition = 0;
				pieces[counter].visible = true;
				pieces[counter].firstmove = true;
				if (rowArray[k] < 3)
					pieces[counter].color = "black";
				else
					pieces[counter].color = "white";
				GetFileAndName(rowArray[k],l+1);
				counter++;
			}
		}
		for (int i = 0; i < 8; i++)
		{
			for (int j = 0; j < 8; j++)
			{
				wsquares[i][j] = 0;
			}
		}
		addMouseListener(new MousePressListener());
		addMouseMotionListener(this);
	}

	public int rowToX(int r)
	{
		int myx;
		int iHeight = getHeight();
		myx=r*iHeight/8 - 50;
		return myx;
	}
	public int colToY(int c)
	{
		int myy;
		int iWidth = getWidth();
		myy = c*iWidth/8 - 50;
		return myy;
	}
	public void paint(Graphics g)
	{
		setSize(400,400);

		int iWidth = getWidth();
		int iHeight = getHeight();
		for (int i=0; i<8; i=i+2)
		{
			for (int j=0; j<8; j=j+2)
			{
				g.setColor(Color.red);
				g.fillRect(j*iWidth/8,(1+i)*iWidth/8,iWidth/8,iHeight/8);
				g.fillRect((1+j)*iWidth/8,i*iWidth/8,iWidth/8,iHeight/8);
			}
		}

		for (int i = 0; i < 32; i++)
		{
			pieces[i].xposition=rowToX(pieces[i].column);
			pieces[i].yposition=colToY(pieces[i].row);
			if (pieces[i].visible)
				g.drawImage(pieces[i].mypic,pieces[i].xposition,pieces[i].yposition,iWidth/8,iHeight/8,this);
		}

		if (ok)
		{
			g.setColor(Color.green);
			g.drawRect(pieces[pieceChosen].xposition, pieces[pieceChosen].yposition,50,50);
		}
 	}

	public void mouseMoved(MouseEvent event)
	{
	}
	public void mouseDragged(MouseEvent event)
	{
		int x = event.getX();
		int y = event.getY();

		oldx=x;
		oldy=y;
	}

	class MousePressListener extends MouseAdapter
	{
		public void mousePressed(MouseEvent event)
		{
			int x = event.getX();
			int y = event.getY();

			//System.out.println("x = " + (x / 50));
			//System.out.println("y = " + (y / 50));
			numclicks = (numclicks+1) % 2;
			//this way we can move pieces with alternating mouse clicks
			// when ok = true movement takes place
			if (ok)
				MovePiece(x, y);
			else	//when ok = false we look for a piece
				BoardID(x, y);
			repaint();
		}

		public void BoardID(int x, int y)
		{
			for (int i = 0; i < 32; i++)
			{
				if (((y / 50) + 1 == pieces[i].row) && ((x / 50) + 1 == pieces[i].column))
				{
					pieceChosen = i;	//this identifies which piece has been selected
					ok = true;	// this says we found a piece and we are ready to move it
				}
			}
		}

		//y controls columns x controls row
		public boolean KingRules(int y, int x, boolean piecefound, int pieceNum)
		{
			String color1, color2;
			boolean canmove = false;
			//System.out.println("name = " + pieces[pieceChosen].name);
			if (pieces[pieceChosen].name.equals("King"))
			{
				y = y / 50 + 1;
				x = x / 50 + 1;

				if (pieces[pieceChosen].column == y - 1 && pieces[pieceChosen].row == x - 1)
					canmove = true;
				else if (pieces[pieceChosen].column == y && pieces[pieceChosen].row == x - 1)
					canmove = true;
				else if (pieces[pieceChosen].column == y + 1 && pieces[pieceChosen].row == x - 1)
					canmove = true;
				else if (pieces[pieceChosen].column == y - 1 && pieces[pieceChosen].row == x)
					canmove = true;
				else if (pieces[pieceChosen].column == y + 1 && pieces[pieceChosen].row == x)
					canmove = true;
				else if (pieces[pieceChosen].column == y - 1 && pieces[pieceChosen].row == x + 1)
					canmove = true;
				else if (pieces[pieceChosen].column == y  && pieces[pieceChosen].row == x + 1)
					canmove = true;
				else if (pieces[pieceChosen].column == y + 1 && pieces[pieceChosen].row == x + 1)
					canmove = true;
				if (canmove)
				{
					if (piecefound)
					{
						color1 = pieces[pieceChosen].color;
						color2 = pieces[pieceNum].color;
						if (color1.equals(color2))
							canmove = false;
					}
				}
			}
			return canmove;
		}

		public boolean KnightRules(int y, int x, boolean piecefound, int pieceNum)
		{
			boolean canmove = false;
			String color1, color2;

			if (pieces[pieceChosen].name.equals("Knight"))
			{
				y = y / 50 + 1;
				x = x / 50 + 1;
				if (((pieces[pieceChosen].row == x - 1) || (pieces[pieceChosen].row == x + 1)) && ((pieces[pieceChosen].column == y + 2) || (pieces[pieceChosen].column == y - 2)))
					canmove = true;
				if ((pieces[pieceChosen].row == x - 2 || pieces[pieceChosen].row == x + 2) && ((pieces[pieceChosen].column == y + 1) || (pieces[pieceChosen].column == y - 1)))
					canmove = true;
				if (canmove)
				{
					if (piecefound)
					{
						color1 = pieces[pieceChosen].color;
						color2 = pieces[pieceNum].color;
						if (color1.equals(color2))
							canmove = false;
					}
				}
			}
			if (pieceNum != 40)
				if (pieces[pieceNum].name.equals("King"))
					canmove = false;
			return canmove;
		}

		public boolean BishopRules(int y, int x, boolean piecefound, int pieceNum)
		{
			int movecase = 0, length = 0;
			int tempcoor [] = new int[2];
			boolean canmove = false;
			String color1, color2;

			if (pieces[pieceChosen].name.equals("Bishop"))
			{
				y = y / 50 + 1;
				x = x / 50 + 1;
				if (pieces[pieceChosen].row - x == pieces[pieceChosen].column - y)
				{
					if (pieces[pieceChosen].row - x > 0 && pieces[pieceChosen].column - y > 0)
					{
						//System.out.println("case 1");
						length = pieces[pieceChosen].row - x;
						movecase = 0;	//up to the left
						canmove = true;
					}
				}
				if (pieces[pieceChosen].row - x == y - pieces[pieceChosen].column)
				{
					if (pieces[pieceChosen].row - x > 0 && y - pieces[pieceChosen].column > 0)
					{
						//System.out.println("case 2");
						length = pieces[pieceChosen].row - x;
						movecase = 1;	//up to the right
						canmove = true;
					}
				}
				if (x - pieces[pieceChosen].row == y - pieces[pieceChosen].column)
				{
					if (x - pieces[pieceChosen].row > 0 && y - pieces[pieceChosen].column > 0)
					{
						//System.out.println("case 3");
						length = x - pieces[pieceChosen].row;
						movecase = 2;	//down to the right
						canmove = true;
					}
				}
				if (x - pieces[pieceChosen].row == pieces[pieceChosen].column - y)
				{
					if (x - pieces[pieceChosen].row > 0 && pieces[pieceChosen].column - y > 0)
					{
						//System.out.println("case 4");
						length = x - pieces[pieceChosen].row;
						movecase = 3;	//down to the left
						canmove = true;
					}
				}
				if (canmove)
				{
					tempcoor[0] = pieces[pieceChosen].row;
					tempcoor[1] = pieces[pieceChosen].column;
					for (int i = 0; i < length - 1; i++)
					{
						UpdateCoordinates(tempcoor,movecase);
						for (int j = 0; j < 32; j++)
						{
							if (tempcoor[0] == pieces[j].row && tempcoor[1] == pieces[j].column)
								canmove = false;
						}
					}
				}
				if (canmove)
				{
					if (piecefound)
					{
						color1 = pieces[pieceChosen].color;
						color2 = pieces[pieceNum].color;
						if (color1.equals(color2))
							canmove = false;
					}
				}
			}
			if (pieceNum != 40)
				if (pieces[pieceNum].name.equals("King"))
					canmove = false;
			return canmove;
		}

		public void UpdateCoordinates(int coor[], int movecase)
		{

			switch (movecase)
			{
				case 0:	//up to the left
				{
					coor[0]--;
					coor[1]--;
					break;
				}
				case 1:	// up to the right
				{
					coor[0]--;
					coor[1]++;
					break;
				}
				case 2:	// down to the right
				{
					coor[0]++;
					coor[1]++;
					break;
				}
				case 3:	// down to the left
				{
					coor[0]++;
					coor[1]--;
					break;
				}
			}
			//System.out.println("coor0 = " + coor[0]);
			//System.out.println("coor1 = " + coor[1]);
		}

		public boolean PawnRules(int y, int x, boolean piecefound, int pieceNum)
		{
			boolean canmove = false;

			//*************************************
			//logic for pawn
			//doesn't handle last row
			if (pieces[pieceChosen].name.equals("Pawn"))
			{
				y = y / 50 + 1;
				x = x / 50 + 1;
				if (pieces[pieceChosen].color.equals("white"))
				{
					if (pieces[pieceChosen].column == y)
					{
						//generic white pawn move
						if (pieces[pieceChosen].row == x + 1)
						{
							//detects if there isn't a piece
							if (!piecefound)		//can move
							{
								pieces[pieceChosen].firstmove = false;
								canmove = true;
							}
						}
						//exception for the first move to move two places
						if (pieces[pieceChosen].row == x + 2 && pieces[pieceChosen].firstmove)
						{
							if (!piecefound)
							{
								pieces[pieceChosen].firstmove = false;
								canmove = true;
							}
						}
					}
					//handles white pawn taking pieces diagonally
					else if (pieces[pieceChosen].column == y + 1 || pieces[pieceChosen].column == y - 1)
					{
						if (pieces[pieceChosen].row == x + 1)
						{
							if (pieceNum < 16)
							{
								if (piecefound)
								{
									pieces[pieceChosen].firstmove = false;
									canmove = true;
								}
							}
						}
					}
				}
				if (pieces[pieceChosen].color.equals("black"))
				{
					if (pieces[pieceChosen].column == y)
					{
						if (pieces[pieceChosen].row == x - 1)
						{
							if (!piecefound)
							{
								pieces[pieceChosen].firstmove = false;
								canmove = true;
							}
						}
						if (pieces[pieceChosen].row == x - 2 && pieces[pieceChosen].firstmove)
						{
							if (!piecefound)
							{
								pieces[pieceChosen].firstmove = false;
								canmove = true;
							}
						}
					}
					//handles black pawn taking pieces diagonally
					else if (pieces[pieceChosen].column == y + 1 || pieces[pieceChosen].column == y - 1)
					{
						if (pieces[pieceChosen].row == x - 1)
						{
							if (pieceNum < 32 && pieceNum > 15)
							{
								if (piecefound)
								{
									pieces[pieceChosen].firstmove = false;
									canmove = true;
								}
							}
						}
					}
				}
			}
			//************************************
			if (pieceNum != 40)
				if (pieces[pieceNum].name.equals("King"))
					canmove = false;
			return canmove;
		}

		public boolean CheckMethod()
		{
			//have to handle white putting white in check
			//have to handle black putting white in check
			//and vice versa
			for (int i = 0; i < 32; i++)
			{
				HandlePieceType(pieces[i].color, pieces[i].name, i);
			}
			return true;
		}

		//black king = 4 white king = 28
		public void HandlePieceType(String mycolor, String myname, int index)
		{
			if (myname.equals("Pawn") && mycolor.equals("white"))
			{
				if (pieces[4].row == pieces[index].row - 1 && pieces[4].column == pieces[index].column + 1)
					JOptionPane.showMessageDialog(null, "check");
				if (pieces[4].row == pieces[index].row - 1 && pieces[4].column == pieces[index].column - 1)
					JOptionPane.showMessageDialog(null, "check");
			}
			if (myname.equals("Pawn") && mycolor.equals("black"))
			{
				if (pieces[28].row == pieces[index].row + 1 && pieces[28].column == pieces[index].column + 1)
					JOptionPane.showMessageDialog(null, "check");
				if (pieces[28].row == pieces[index].row + 1 && pieces[28].column == pieces[index].column - 1)
					JOptionPane.showMessageDialog(null, "check");
			}
			if (myname.equals("Knight") && mycolor.equals("white"))
			{
				if ((pieces[4].row == pieces[index].row - 1 || pieces[4].row == pieces[index].row + 1)  && (pieces[4].column == pieces[index].column - 2 || pieces[4].column == pieces[index].column + 2))
					JOptionPane.showMessageDialog(null, "check");
				if ((pieces[4].row == pieces[index].row - 2 || pieces[4].row == pieces[index].row + 2)  && (pieces[4].column == pieces[index].column - 1 || pieces[4].column == pieces[index].column + 1))
					JOptionPane.showMessageDialog(null, "check");
			}
			if (myname.equals("Knight") && mycolor.equals("black"))
			{
				if ((pieces[28].row == pieces[index].row - 1 || pieces[28].row == pieces[index].row + 1)  && (pieces[28].column == pieces[index].column - 2 || pieces[28].column == pieces[index].column + 2))
					JOptionPane.showMessageDialog(null, "check");
				if ((pieces[28].row == pieces[index].row - 2 || pieces[28].row == pieces[index].row + 2)  && (pieces[28].column == pieces[index].column - 1 || pieces[28].column == pieces[index].column + 1))
					JOptionPane.showMessageDialog(null, "check");
			}
			if (myname.equals("Bishop") && mycolor.equals("white"))
			{
				//case 0 up to the left
				if (pieces[4].row - pieces[index].row == pieces[4].column - pieces[index].column)
					if (pieces[4].row - pieces[index].row > 0 && pieces[4].column - pieces[index].column > 0)
						BishopCheck(0,index,4);
				//case 1 up to the right
				if (pieces[4].row - pieces[index].row == pieces[index].column - pieces[4].column)
					if (pieces[4].row - pieces[index].row > 0 && pieces[index].column - pieces[4].column > 0)
						BishopCheck(1,index,4);
				//case 2 down to the right
				if (pieces[index].row - pieces[4].row == pieces[index].column - pieces[4].column)
					if (pieces[index].row - pieces[4].row > 0 && pieces[index].column - pieces[4].column > 0)
						BishopCheck(2,index,4);
				//case 3 down to the left
				if (pieces[index].row - pieces[4].row == pieces[4].column - pieces[index].column)
					if (pieces[index].row - pieces[4].row > 0 && pieces[4].column - pieces[index].column > 0)
						BishopCheck(3,index,4);
			}
			if (myname.equals("Bishop") && mycolor.equals("black"))
			{
				//case 0 up to the left
				if (pieces[28].row - pieces[index].row == pieces[28].column - pieces[index].column)
					if (pieces[28].row - pieces[index].row > 0 && pieces[28].column - pieces[index].column > 0)
						BishopCheck(0,index,28);
				//case 1 up to the right
				if (pieces[28].row - pieces[index].row == pieces[index].column - pieces[28].column)
					if (pieces[28].row - pieces[index].row > 0 && pieces[index].column - pieces[28].column > 0)
						BishopCheck(1,index,28);
				//case 2 down to the right
				if (pieces[index].row - pieces[28].row == pieces[index].column - pieces[28].column)
					if (pieces[index].row - pieces[28].row > 0 && pieces[index].column - pieces[28].column > 0)
						BishopCheck(2,index,28);
				//case 3 down to the left
				if (pieces[index].row - pieces[28].row == pieces[28].column - pieces[index].column)
					if (pieces[index].row - pieces[28].row > 0 && pieces[28].column - pieces[index].column > 0)
						BishopCheck(3,index,28);
			}
			if (myname.equals("Rook") && mycolor.equals("white"))
			{
			}
			if (myname.equals("Rook") && mycolor.equals("black"))
			{
			}
			if (myname.equals("Queen") && mycolor.equals("white"))
			{
			}
			if (myname.equals("Queen") && mycolor.equals("black"))
			{
			}
		}

		public void BishopCheck(int control, int index, int kingnum)
		{
			int length;
			int tempcoor[] = new int[2];
			boolean check;

			length = Math.abs(pieces[kingnum].row - pieces[index].row);
			tempcoor[0] = pieces[kingnum].row;
			tempcoor[1] = pieces[kingnum].column;
			check = true;
			for (int i = 0; i < length - 1; i++)
			{
				UpdateCoordinates(tempcoor, control);
				for (int j = 0; j < 32; j++)
					if (tempcoor[0] == pieces[j].row && tempcoor[1] == pieces[j].column)
						check = false;
			}
			if (check)
				JOptionPane.showMessageDialog(null, "check");
		}

		// this determines squares attacked
		//pieces 0 - 15 = black; pieces 16 - 31 = white
		//0 - square not attacked
		//1 - sqaure attacked by white
		//2 - square attacked by black
		//3 - square attacked by both
		public boolean SquaresAttacked()
		{
			for (int i = 8; i < 24; i++)	// this loop handles black and white pawns
			{
				if (pieces[i].color.equals("white"))
				{
					if (pieces[i].column == 1)	// to handle pawns on the first column
					{
						if (wsquares[pieces[i].row-2][pieces[i].column] == 2)
							wsquares[pieces[i].row-2][pieces[i].column] += 1;
						else
							wsquares[pieces[i].row-2][pieces[i].column] = 1;
					}
					else if (pieces[i].column == 8)	// to handle pawns on the last column
					{
						if (wsquares[pieces[i].row-2][pieces[i].column-2] == 2)
							wsquares[pieces[i].row-2][pieces[i].column-2] += 1;
						else
							wsquares[pieces[i].row-2][pieces[i].column-2] = 1;
					}
					else	// to handle pawns in between first and last columns
					{
						if (wsquares[pieces[i].row-2][pieces[i].column] == 2)
							wsquares[pieces[i].row-2][pieces[i].column] += 1;
						else
							wsquares[pieces[i].row-2][pieces[i].column] = 1;
						if (wsquares[pieces[i].row-2][pieces[i].column-2] == 2)
							wsquares[pieces[i].row-2][pieces[i].column-2] += 1;
						else
							wsquares[pieces[i].row-2][pieces[i].column-2] = 1;
					}
				}
				if (pieces[i].color.equals("black"))
				{
					if (pieces[i].column == 1)	// to handle pawns on the first column
					{
						if (wsquares[pieces[i].row][pieces[i].column] == 1)
							wsquares[pieces[i].row][pieces[i].column] += 2;
						else
							wsquares[pieces[i].row][pieces[i].column] = 2;
					}
					else if (pieces[i].column == 8)	// to handle pawns on the last column
					{
						if (wsquares[pieces[i].row][pieces[i].column-2] == 1)
							wsquares[pieces[i].row][pieces[i].column-2] += 2;
						else
							wsquares[pieces[i].row][pieces[i].column-2] = 2;
					}
					else	// to handle pawns in between first and last columns
					{
						if (wsquares[pieces[i].row][pieces[i].column] == 1)
							wsquares[pieces[i].row][pieces[i].column] += 2;
						else
							wsquares[pieces[i].row][pieces[i].column] = 2;
						if (wsquares[pieces[i].row][pieces[i].column-2] == 1)
							wsquares[pieces[i].row][pieces[i].column-2] += 2;
						else
							wsquares[pieces[i].row][pieces[i].column-2] = 2;
					}
				}
			}

			int tempcoor[] = new int[2];
			int oldx, oldy, x, y;
			// black pieces on the back row
			for (int i = 0; i < 8; i++)
			{
				tempcoor[0] = pieces[i].row;
				tempcoor[1] = pieces[i].column;
				tempcoor[0]--;
				tempcoor[1]--;
				oldx = tempcoor[0];
				oldy = tempcoor[1];
				if (pieces[i].name.equals("Knight"))
				{
					for (int j = 0; j < 8; j++)
					{
						KnightCoor(tempcoor, j);
						x = tempcoor[0];
						y = tempcoor[1];
						//System.out.println("x = " + x);
						//System.out.println("y = " + y);
						if (tempcoor[0] < 8 && tempcoor[0] >= 0)
						{
							if (tempcoor[1] < 8 && tempcoor[1] >= 0)
							{
								if (wsquares[x][y] == 1)
									wsquares[x][y] += 2;
								else
									wsquares[x][y] = 2;
							}
						}
						tempcoor[0] = oldx;
						tempcoor[1] = oldy;
					}
				}
			}

			// white pieces on the back row
			for (int i = 24; i < 32; i++)
			{
				tempcoor[0] = pieces[i].row;
				tempcoor[1] = pieces[i].column;
				tempcoor[0]--;
				tempcoor[1]--;
				oldx = tempcoor[0];
				oldy = tempcoor[1];
				if (pieces[i].name.equals("Knight"))
				{
					for (int j = 0; j < 8; j++)
					{
						KnightCoor(tempcoor, j);
						x = tempcoor[0];
						y = tempcoor[1];
						//System.out.println("x = " + x);
						//System.out.println("y = " + y);
						if (tempcoor[0] < 8 && tempcoor[0] >= 0)
						{
							if (tempcoor[1] < 8 && tempcoor[1] >= 0)
							{
								if (wsquares[x][y] == 2)
									wsquares[x][y] += 1;
								else
									wsquares[x][y] = 1;
							}
						}
						tempcoor[0] = oldx;
						tempcoor[1] = oldy;
					}
				}
			}

			for (int i = 0; i < 8; i++)	//this displays the squares attacked
			{
				for (int j = 0; j < 8; j++)
				{
					System.out.print(wsquares[i][j]);
				}
				System.out.println("");
			}
			System.out.println("********************");
			for (int i = 0; i < 8; i++)	// need to reinitialize for the next iteration
			{
				for (int j = 0; j < 8; j++)
				{
					wsquares[i][j] = 0;
				}
			}
			return true;
		}

		public void KnightCoor(int tempcoor[], int movecase)
		{
			switch(movecase)
			{
				case 0:
				{
					tempcoor[0] -= 2;
					tempcoor[1] += 1;
					break;
				}
				case 1:
				{
					tempcoor[0] -= 1;
					tempcoor[1] += 2;
					break;
				}
				case 2:
				{
					tempcoor[0] += 1;
					tempcoor[1] += 2;
					break;
				}
				case 3:
				{
					tempcoor[0] += 2;
					tempcoor[1] += 1;
					break;
				}
				case 4:
				{
					tempcoor[0] += 2;
					tempcoor[1] -= 1;
					break;
				}
				case 5:
				{
					tempcoor[0] += 1;
					tempcoor[1] -= 2;
					break;
				}
				case 6:
				{
					tempcoor[0] -= 1;
					tempcoor[1] -= 2;
					break;
				}
				case 7:
				{
					tempcoor[0] -= 2;
					tempcoor[1] -= 1;
					break;
				}
			}
		}

		//this function does the assignment that allows for movement
		//x and y are the coordinates of the square you're moving to
		public void MovePiece(int x, int y)
		{
			ok = false; // needed to release the current piece if you can't move it
			//this detects if there is a piece or not to the destination square
			boolean foundpiece = false;	//added chess 15
			boolean function[] = new boolean[4];

			int pieceNum = 40;

			oldx = y/50+1;
			oldy = x/50+1;
			for (int i = 0; i < 32; i++)
			{
				if (pieceChosen != i)
				{
					if (oldx == pieces[i].row && oldy == pieces[i].column)
					{
						foundpiece = true;
						pieceNum = i;
					}
				}
			}

			function[0] = PawnRules(x,y,foundpiece,pieceNum);
			function[1] = KingRules(x,y,foundpiece,pieceNum);
			function[2] = KnightRules(x,y,foundpiece,pieceNum);
			function[3] = BishopRules(x,y,foundpiece,pieceNum);
			if (function[0] ^ function[1] ^ function[2] ^ function[3])
			{
				oldx = pieces[pieceChosen].row;
				oldy = pieces[pieceChosen].column;
				pieces[pieceChosen].row = y/50+1;
				pieces[pieceChosen].column = x/50+1;

				for (int i = 0; i < 32; i++)	//checks for another piece
				{
					if (pieceChosen != i)	//don't take self
					{
						if (pieces[pieceChosen].row == pieces[i].row && pieces[pieceChosen].column == pieces[i].column && !pieces[i].name.equals("King"))
						{
							pieces[i].row = 11;		//actually removes piece from board
							pieces[i].column = 11;
							pieces[i].visible = false;
						}
					}

				}
				CheckMethod();
				SquaresAttacked();
				//after the calculation repaint is called to display the movement
				repaint();
			}
			else
			{
				repaint();
			}
		}
	}
}
		//boolean piece_taken = false;
		//System.out.println("piece = " + pieceChosen);
		//pieces[pieceChosen].row = oldx;
		//pieces[pieceChosen].column = oldy;
		//piece_taken = true;
		//System.out.println("found = " + foundpiece);
		//oldx = pieces[pieceChosen].row;
		//oldy = pieces[pieceChosen].column;
		//System.out.println("canmove = " + canmove);
		//System.out.println("Got a pawn");
		//System.out.println("Legal move pawn");
		//System.out.println("found = " + piecefound);
		//System.out.println("x1 = " + pieces[pieceChosen].row);
		//System.out.println("x2 = " + x);
		//System.out.println("y1 = " + pieces[pieceChosen].column);
		//System.out.println("y2 = " + y);
		//System.out.println("piece2 = " + pieceChosen);
		//System.out.println("color = " + pieces[pieceChosen].color);
		//System.out.println("x="+x+" y="+ y);
		//System.out.println("k = " + rowArray[k]);
		//System.out.print("row = " + pieces[counter].row);
		//System.out.print(" column = " + pieces[counter].column);
		//System.out.println(" color = " + pieces[counter].color);

		//System.out.println(j*iWidth+ " ");
		//System.out.println("numclicks = " + numclicks);
							//System.out.println("xcoor = " + tempcoor[0]);
							//System.out.println("ycoor = " + tempcoor[1]);
							//System.out.println("x = " + x);
							//System.out.println("y = " + y);
					//System.out.println("length = " + length);