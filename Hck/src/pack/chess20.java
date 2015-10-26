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
import java.awt.Graphics;
import java.awt.Image;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class chess20 extends java.applet.Applet implements MouseMotionListener
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

			System.out.println("x = " + (x / 50));
			System.out.println("y = " + (y / 50));
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
			return canmove;
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
					System.out.println("check");
				if (pieces[4].row == pieces[index].row - 1 && pieces[4].column == pieces[index].column - 1)
					System.out.println("check");
			}
			if (myname.equals("Pawn") && mycolor.equals("black"))
			{
				if (pieces[28].row == pieces[index].row + 1 && pieces[28].column == pieces[index].column + 1)
					System.out.println("check");
				if (pieces[28].row == pieces[index].row + 1 && pieces[28].column == pieces[index].column - 1)
					System.out.println("check");
			}
			if (myname.equals("Knight") && mycolor.equals("white"))
			{
				if ((pieces[4].row == pieces[index].row - 1 || pieces[4].row == pieces[index].row + 1)  && (pieces[4].column == pieces[index].column - 2 || pieces[4].column == pieces[index].column + 2))
					System.out.println("check");
				if ((pieces[4].row == pieces[index].row - 2 || pieces[4].row == pieces[index].row + 2)  && (pieces[4].column == pieces[index].column - 1 || pieces[4].column == pieces[index].column + 1))
					System.out.println("check");
			}
			if (myname.equals("Knight") && mycolor.equals("black"))
			{
				if ((pieces[28].row == pieces[index].row - 1 || pieces[28].row == pieces[index].row + 1)  && (pieces[28].column == pieces[index].column - 2 || pieces[28].column == pieces[index].column + 2))
					System.out.println("check");
				if ((pieces[28].row == pieces[index].row - 2 || pieces[28].row == pieces[index].row + 2)  && (pieces[28].column == pieces[index].column - 1 || pieces[28].column == pieces[index].column + 1))
					System.out.println("check");
			}
			if (myname.equals("Bishop") && mycolor.equals("white"))
			{
			}
			if (myname.equals("Bishop") && mycolor.equals("black"))
			{
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
		//this function does the assignment that allows for movement
		//x and y are the coordinates of the square you're moving to
		public void MovePiece(int x, int y)
		{
			ok = false; // needed to release the current piece if you can't move it
			//this detects if there is a piece or not to the destination square
			boolean foundpiece = false;	//added chess 15
			boolean function[] = new boolean[3];

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
			if (function[0] ^ function[1] ^ function[2])
			{
				oldx = pieces[pieceChosen].row;
				oldy = pieces[pieceChosen].column;
				pieces[pieceChosen].row = y/50+1;
				pieces[pieceChosen].column = x/50+1;

				for (int i = 0; i < 32; i++)	//checks for another piece
				{
					if (pieceChosen != i)	//don't take self
					{
						if (pieces[pieceChosen].row == pieces[i].row && pieces[pieceChosen].column == pieces[i].column)// && !pieces[pieceChosen].color.equals(pieces[i].color)) //&& !pieces[i].name.equals("King"))
						{
							//actually removes piece from board
							pieces[i].row = 11;
							pieces[i].column = 11;
							pieces[i].visible = false;
						}
					}

				}
				CheckMethod();
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