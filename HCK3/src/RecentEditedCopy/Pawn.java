package RecentEditedCopy;


import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.*;

import javax.imageio.ImageIO;

@SuppressWarnings("serial")
public class Pawn extends ChessPiece
{
	BufferedImage img;// = (BufferedImage) new ImageIcon("rl.png");
	BufferedImage buffered;
	Image image;
	
	private boolean doubleMove;
	
	public Pawn(boolean isWhite, Location loc)
	{
		super(isWhite, loc);
	}
		
	
	//this just draws and places the R
	public void draw(Graphics g)
	{
		final int x = 20;
		final int y = 40;
		final int width = 40;
		
		if(getColor())
		{
			try {
				img = ImageIO.read(new File("pl.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			g.drawImage(img, 20, 15, null);
		}
		else
		{
			try {
				img = ImageIO.read(new File("pd.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			g.drawImage(img, 20, 15, null);
		}
	}
	
	public boolean getDoubleMove()
	{
		return doubleMove;
	}
	
	public void setDoubleMove(boolean input)
	{
		doubleMove=input;
	}
	
	public ArrayList<Location> getMoves(BoardState board)
	{
		ArrayList<Location> possibleMoves = new ArrayList<Location>();
		int y = getLocation().getRow();
		int x = getLocation().getCol();
		
		Location whiteOne = new Location(y-1,x);
		Location whiteTwo = new Location(y-2,x);
		Location whiteLeft = new Location(y-1,x-1);
		Location whiteRight = new Location(y-1,x+1);
		
		Location enPassantLeft = new Location(y,x-1);
		Location enPassantRight = new Location(y,x+1);
				
		Location blackOne = new Location(y+1,x);
		Location blackTwo = new Location(y+2,x);
		Location blackLeft = new Location(y+1,x-1);
		Location blackRight = new Location(y+1,x+1);
		
		if(getColor())
		{
			if(y!=0)
			{
				if(board.isValid(whiteOne) && board.isEmpty(whiteOne))
					possibleMoves.add(whiteOne);
				if(board.isValid(whiteTwo) && getLocation().getRow()==6 && board.isEmpty(whiteTwo) && board.isEmpty(whiteOne))
					possibleMoves.add(whiteTwo);
				if(board.isValid(whiteLeft) && !board.isEmpty(whiteLeft) && !board.isPieceWhite(whiteLeft))
					possibleMoves.add(whiteLeft);
				if(board.isValid(whiteRight) && !board.isEmpty(whiteRight) && !board.isPieceWhite(whiteRight))
					possibleMoves.add(whiteRight);
				if(board.isValid(whiteRight) && board.isEmpty(whiteRight) && board.isValid(enPassantRight) && !board.isEmpty(enPassantRight) && !board.isPieceWhite(enPassantRight) && board.getState()[enPassantRight.getRow()][enPassantRight.getCol()] instanceof Pawn)
					if(enPassantRight.getRow()==3 && ((Pawn)board.getState()[enPassantRight.getRow()][enPassantRight.getCol()]).getDoubleMove())
						possibleMoves.add(whiteRight);
				if(board.isValid(whiteLeft) && board.isEmpty(whiteLeft) && board.isValid(enPassantLeft) && !board.isEmpty(enPassantLeft) && !board.isPieceWhite(enPassantLeft) && board.getState()[enPassantLeft.getRow()][enPassantLeft.getCol()] instanceof Pawn)
					if(enPassantLeft.getRow()==3 && ((Pawn)board.getState()[enPassantLeft.getRow()][enPassantLeft.getCol()]).getDoubleMove())
						possibleMoves.add(whiteLeft);
			}
		}
		else
		{
			if(y!=7)
			{
				if(board.isValid(blackOne) && board.isEmpty(blackOne))
					possibleMoves.add(blackOne);
				if(board.isValid(blackTwo) && getLocation().getRow()==1 && board.isEmpty(blackTwo) && board.isEmpty(blackOne))
					possibleMoves.add(blackTwo);
				if(board.isValid(blackLeft) && !board.isEmpty(blackLeft) && board.isPieceWhite(blackLeft))
					possibleMoves.add(blackLeft);
				if(board.isValid(blackRight) && !board.isEmpty(blackRight) && board.isPieceWhite(blackRight))
					possibleMoves.add(blackRight);
				if(board.isValid(blackRight) && board.isEmpty(blackRight) && board.isValid(enPassantRight) && !board.isEmpty(enPassantRight) && board.isPieceWhite(enPassantRight) && board.getState()[enPassantRight.getRow()][enPassantRight.getCol()] instanceof Pawn)
					if(enPassantRight.getRow()==4 && ((Pawn)board.getState()[enPassantRight.getRow()][enPassantRight.getCol()]).getDoubleMove())
						possibleMoves.add(blackRight);
				if(board.isValid(blackLeft) && board.isEmpty(blackLeft) && board.isValid(enPassantLeft) && !board.isEmpty(enPassantLeft) && board.isPieceWhite(enPassantLeft) && board.getState()[enPassantLeft.getRow()][enPassantLeft.getCol()] instanceof Pawn)
					if(enPassantLeft.getRow()==4 && ((Pawn)board.getState()[enPassantLeft.getRow()][enPassantLeft.getCol()]).getDoubleMove())
						possibleMoves.add(blackLeft);
			}
		}
		return possibleMoves;
	}
	
	public void moveTo(Location moveLoc)
	{
		if((int)Math.abs(getLocation().getRow()-moveLoc.getRow()) > 1)
			doubleMove = true;
		else
			doubleMove = false;
		setLocation(moveLoc);
	}
	
	public String toString()
	{
		return super.toString()+" Pawn";
	}
}