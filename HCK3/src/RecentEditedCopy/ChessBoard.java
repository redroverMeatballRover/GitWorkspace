package RecentEditedCopy;

/*
G Chess version 1.0
Copyright (c) 2010 Gary Menezes

Copyright Notice
  You may use the accompanying code under the following conditions:
  You may:
    1. Use this code for non-commercial, educational, and personal purposes.
    2. Redistribute this code *as is* along with included copyright notices.
  You may not:
    1. Use this code for any commercial purpose.
    2. Create any derivative works for redistribution.
*/
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.swing.*;
import java.io.Serializable;

public class ChessBoard extends JPanel implements Serializable
{
	private static final long serialVersionUID = -1246957520079405796L;
	private BoardState boardState;
	
	//THIS IS AN ISSUE // ---------------------------// RENAMING AND DISGUISING THE METHOD IS NEEDED
	private boolean isFlipped;
	//-------------------------------------------------//
	
	transient private GUI listener;
	private JButton[][] squares;
	private Color whiteSquare;
	private Color redSquare;
	BufferedImage img;
	
	public ChessBoard(BoardState boardState, GUI listener, Dimension size)
	{
		super(new GridLayout(8,8));
		
		this.boardState = boardState;
		isFlipped = false;
		this.listener = listener;
		//***
	
		whiteSquare = new Color(255,255,255);
		redSquare = new Color(178,34,34);

		
		setOpaque(true);
		setBackground(redSquare);
		setPreferredSize(size);
		
		
		//THIS IS AN ENTIRE CLASS
		//-----------------------------------------------------------------------//
		@SuppressWarnings("serial")
		class PaintedButton extends JButton
		{
			private BoardState boardState;
			public PaintedButton(BoardState boardState)
			{
				this.boardState = boardState;
			}
			public void paintComponent(Graphics g) {
				super.paintComponent(g); // Paint background, border
				int x = -1;
				int y = -1;
				for(int a=0; a<boardState.getState().length; a++)
					for(int b=0; b<boardState.getState()[a].length; b++)
						if(squares[a][b].equals(this))
						{
							y=a;
							x=b;
						}
				if(x!=-1 && y!=-1)
				{
					x = processLocation(new Location(x,y)).getRow();
					y = processLocation(new Location(x,y)).getCol();
					if(boardState.getState()[y][x]!=null)
					{
						//change the .draw(g) to an image type. 
						boardState.getState()[y][x].draw(g);
						//boardState.getState()[y][x].getImage(img);
					}
				}
			}
		}
		//--------------------------------------------------------------------//
		
		squares = new PaintedButton[8][8];
		
		for(int y=0; y<squares.length; y++)
			for(int x=0; x<squares.length; x++)
			{
				squares[y][x] = new PaintedButton(this.boardState);
				squares[y][x].setBorder(BorderFactory.createRaisedBevelBorder());
				squares[y][x].setActionCommand(""+y+x);
				//squares[y][x].addMouseListener();
				//squares[y][x].addMouseListener(new DynamicStatusBarUpdate(listener));
			}
		
		for(int y=0; y<squares.length; y++)
			for(int x=0; x<squares.length; x++)
				add(squares[y][x]);
		resetBackground();
	}
	
	public void setListener(GUI listener)
	{
		this.listener = listener;
	}
	
	public int getSide()
	{
		return squares.length;
	}
	
	//CHECK THIS
	public Location processLocation(Location loc)
	{
		if(!isFlipped)
			return loc;
		else
			return new Location(7-loc.getRow(),7-loc.getCol());
	}
	
	//----------------------------------------------------------------------------///
	public JButton getAtLocation(Location loc)
	{
		loc = processLocation(loc);
		return squares[loc.getRow()][loc.getCol()]; //SEARCHING FOR WHEREVER THIS GOES
	}
	//-------------------------------------------------------------------------//
	
	
	//MAGIC NUMBERS ISSUE
	public JButton getButton(int y, int x)
	{
		if(y >= 0 && y <= 7 && x >=0 && x <= 7)
			return squares[y][x];
		else
			return null;
	}
	
	
	public boolean hasActionListener(Location loc)
	{
		ActionListener[] list = squares[loc.getRow()][loc.getCol()].getActionListeners();
		if(list.length > 0)
				return true;
		return false;
	}
	
	public void disableEverything()
	{
		for(int y=0; y<squares.length; y++)
			for(int x=0; x<squares.length; x++)
				if(hasActionListener(new Location(y,x)))
					squares[y][x].removeActionListener(listener);
	}
	
	//CHECK
	public void enableSide(boolean turn)
	{
		disableEverything();
		for(int y=0; y<squares.length; y++)
			for(int x=0; x<squares.length; x++)
				if(boardState.getState()[y][x]!=null && boardState.getState()[y][x].getColor()==turn && !hasActionListener(processLocation(new Location(y,x))))
					getAtLocation(new Location(y,x)).addActionListener(listener);
	}
	
	//POSSIBLE RENAME AND DELETION
	public void enableLocation(Location loc)
	{
		if(!hasActionListener(new Location(loc.getRow(),loc.getCol())))
			squares[loc.getRow()][loc.getCol()].addActionListener(listener);
	}
	
	//POSSIBLE RENAME AND DELETION
	public void flipBoard()
	{
		isFlipped = !isFlipped;
		updateBoard(boardState);
	}
	
	//CHECK THIS
	public void resetBorders()
	{
		for(int y=0; y<squares.length; y++)
			for(int x=0; x<squares.length; x++)
				squares[y][x].setBorder(BorderFactory.createRaisedBevelBorder());
	}
	
	//CHECK THIS
	public void resetBackground()
	{
		int start = 0;
		
		for(int y=0; y<squares.length; y++)
			for(int x=0; x<squares.length; x++)
			{
				if(y%2==0)
					if(x%2==start)
						squares[y][x].setBackground(whiteSquare);
					else
						squares[y][x].setBackground(redSquare);
				else
					if(x%2==start)
						squares[y][x].setBackground(redSquare);
					else
						squares[y][x].setBackground(whiteSquare);
			}
		repaint();
	}
	
	//POSSIBLE RENAME AND DELETION
	public void enable(Location loc, boolean highlight)
	{
		loc = processLocation(loc);
		enableLocation(loc);
		if(highlight)
			highlight(loc);
	}
	
	//HIGHLIGHT SYSTEM
	public void highlight(Location loc)
	{
		squares[loc.getRow()][loc.getCol()].setBackground(new Color(255,255,51));
	}
	
	
	
	//-------------------------------------------------------------------------------------------//
	public void selected(Location loc)
	{
		getAtLocation(new Location(loc.getRow(),loc.getCol())).setBorder(BorderFactory.createLineBorder(Color.GREEN, 5));
		
//		if( Location(loc.getRow(),loc.getCol()) != null)
//		{
//			System.out.println("THIS PIECE HAS SOMETHING ON IT");
//		}
		
//		if(squares[loc.getRow()][loc.getCol()] != null)
//		{
//			System.out.println("THIS PIECE HAS SOMETHING ON IT");
//		}
		
	}
	//-------------------------------------------------------------------------------------------//
	
	
	public void updateBoard(BoardState boardState)
	{
		resetBackground();
		resetBorders();
		repaint();
	}
}
