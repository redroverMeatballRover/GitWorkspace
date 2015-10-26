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

public class Knight extends ChessPiece
{
	BufferedImage img;// = (BufferedImage) new ImageIcon("rl.png");
	BufferedImage buffered;
	Image image;
	
	private static final long serialVersionUID = 851797694201220077L;
	
	public Knight(boolean isWhite, Location loc)
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
				img = ImageIO.read(new File("nl.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			g.drawImage(img, 20, 15, null);
		}
		else
		{
			try {
				img = ImageIO.read(new File("nd.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			g.drawImage(img, 20, 15, null);
		}
	}
	
	public ArrayList<Location> getMoves(BoardState board)
	{
		ArrayList<Location> possibleMoves = new ArrayList<Location>();
		int y = getLocation().getRow();
		int x = getLocation().getCol();
		
		Location[] locs = new Location[8];
		locs[0] = new Location(y-1,x-2);
		locs[1] = new Location(y-2,x-1);
		locs[2] = new Location(y-2,x+1);
		locs[3] = new Location(y-1,x+2);
		locs[4] = new Location(y+1,x+2);
		locs[5] = new Location(y+2,x+1);
		locs[6] = new Location(y+2,x-1);
		locs[7] = new Location(y+1,x-2);
		
		if(getColor())
		{
			for(Location z: locs)
				if(board.isValid(z) && (board.isEmpty(z) || !board.isPieceWhite(z)))
					possibleMoves.add(z);
		}
		else
		{
			for(Location z: locs)
				if(board.isValid(z) && (board.isEmpty(z) || board.isPieceWhite(z)))
					possibleMoves.add(z);
		}
		return possibleMoves;
	}
	
	public void moveTo(Location moveLoc)
	{
		setLocation(moveLoc);
	}
	
	public String toString()
	{
		return super.toString()+" Knight";
	}
}