package pack;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class chess9 extends java.applet.Applet implements MouseMotionListener
{
	// changed class structure to allow globals declared
	// here to determine what square on the board has
	// been clicked | 1/24/05
	class piece //this allows us to track all the information
	{           //about the pieces
		int row;		//int row;
		int column;		//int column;
		int xposition;
		int yposition;

		Image mypic;	//Image mypic;
		boolean visible;//boolean visible;
		String color;	//String color;
		String name;	//String name;

	};
	//piece 0 at 0,0 is black rook, piece 31 at 7,7 is white rook
    //using top to bottom, and left to right to indentify pieces
	public static piece [] pieces=new piece[32]; //allows us use specific pieces

	// globals
	public static int ChessBoard[][] = new int [8][8];
	static int counter = 0;
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
				pieces[counter].row = rowArray[k];
				pieces[counter].column = l + 1;
				pieces[counter].xposition = 0;
				pieces[counter].yposition = 0;
				pieces[counter].visible = true;
				if (k < 3)
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
				System.out.println(j*iWidth+ " ");
				g.setColor(Color.red);
				g.fillRect(j*iWidth/8,(1+i)*iWidth/8,iWidth/8,iHeight/8);
				g.fillRect((1+j)*iWidth/8,i*iWidth/8,iWidth/8,iHeight/8);
				//g.setColor(Color.white);
				//g.fillRect(((j+1)*iWidth),0,iWidth/8,iHeight/8);
			}
		}
		//int xPos = 10;
		//25%
		for (int i = 0; i < 32; i++)
		{
			pieces[i].xposition=rowToX(pieces[i].column);
			pieces[i].yposition=colToY(pieces[i].row);
			g.drawImage(pieces[i].mypic,pieces[i].xposition,pieces[i].yposition,iWidth/8,iHeight/8,this);
		}

		// 2/1/05 | allows pawn to move while alternating clicks
		// of the mouse.
		//******************************************
		if(numclicks == 0)
			g.drawImage(pieces[8].mypic, 0, iHeight/8, iWidth/8, iHeight/8, this);
		System.out.println("numclicks = " + numclicks);
		if(numclicks == 1)
			g.drawImage(pieces[8].mypic, 0, 2*iHeight/8, iWidth/8, iHeight/8, this);
		//******************************************
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
		//repaint();
	}


	class MousePressListener extends MouseAdapter
	{
		public void mousePressed(MouseEvent event)
		{
			int x = event.getX();
			int y = event.getY();
			//System.out.println("x="+x+" y="+ y);
			numclicks = (numclicks+1) % 2;
			BoardID(x, y);
			repaint();
		}

		public void BoardID(int x, int y)
		{
			//ChessBoard[1][1] = 1;
			if(y > 0 && y <= 50)
			{
				if(x > 0 && x<= 50)
				{
					System.out.println("you clicked [0][0]");
					//System.out.println("numclicks = " + numclicks);
				}
				if(x > 50 && x <= 100)
				{
					System.out.println("you clicked [0][1]");
					//System.out.println("numclicks = " + numclicks);
				}
			}
			if(y > 50 && y <= 100)
			{
				if(x > 0 && x <= 50)
				{
					System.out.println("You clicked [1][0]");
					//System.out.println("numclicks = " + numclicks);
				}
			}
			if(y > 100 && y <= 150)
			{
				if(x > 0 && x <= 50)
				{
					System.out.println("You clicked [2][0]");
					//System.out.println("numclicks = " + numclicks);
				}
			}
			if(y > 150 && y <= 200)
			{
				if(x > 0 && x <= 50)
				{
					System.out.println("You clicked [3][0]");
					//System.out.println("numclicks = " + numclicks);
				}
			}
		}
	}
}