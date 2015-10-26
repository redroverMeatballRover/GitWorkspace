package RecentEditedCopy;


import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.*;

import javax.imageio.ImageIO;

public class Bishop extends ChessPiece
{
	private static final long serialVersionUID = -7644829780638720717L;
	BufferedImage img;// = (BufferedImage) new ImageIcon("rl.png");
	BufferedImage buffered;
	Image image;
	
	
	public Bishop(boolean isWhite, Location loc)
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
				img = ImageIO.read(new File("bl.png"));
			} catch (IOException e) {
				e.printStackTrace();
			}
			g.drawImage(img, 20, 15, null);
		}
		else
		{
			try {
				img = ImageIO.read(new File("bd.png"));
			} catch (IOException e) {
				e.printStackTrace();
			}
			g.drawImage(img, 20, 15, null);
		}
	}
	
	//NUMBERS IN THIS ONE
	public ArrayList<Location> getMoves(BoardState board)
	{
		ArrayList<Location> possibleMoves = new ArrayList<Location>();
		int y = getLocation().getRow();
		int x = getLocation().getCol();
		
		boolean[] isRowBlocked = new boolean[4];
		
		Location[] locs = new Location[32];
		
		for(int z=1; z<=32; z++)
		{
			if(z<=8)
				locs[z-1] = new Location(y-z%8, x-z%8);
			else if(z<=16)
				locs[z-1] = new Location(y-z%8, x+z%8);
			else if(z<=24)
				locs[z-1] = new Location(y+z%8, x+z%8);
			else
				locs[z-1] = new Location(y+z%8, x-z%8);
		}

		if(getColor())
		{
			for(int i=0; i<locs.length; i++)
				if(board.isValid(locs[i]) && !isRowBlocked[i/8] && (board.isEmpty(locs[i]) || !board.isPieceWhite(locs[i])))
				{
					possibleMoves.add(locs[i]);
					if(!board.isEmpty(locs[i]) && !board.isPieceWhite(locs[i]))
						isRowBlocked[i/8]=true;
				}
				else
					isRowBlocked[i/8]=true;
		}
		else
		{
			for(int i=0; i<locs.length; i++)
				if(board.isValid(locs[i]) && !isRowBlocked[i/8] && (board.isEmpty(locs[i]) || board.isPieceWhite(locs[i])))
				{
					possibleMoves.add(locs[i]);
					if(!board.isEmpty(locs[i]) && board.isPieceWhite(locs[i]))
						isRowBlocked[i/8]=true;
				}
				else
					isRowBlocked[i/8]=true;
		}
		return possibleMoves;
	}
	
	
	public void moveTo(Location moveLoc)
	{
		setLocation(moveLoc);
	}
	
	
	public String toString()
	{
		return super.toString()+" Bishop";
	}
}