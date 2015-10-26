package RecentEditedCopy;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import java.util.*;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Rook extends ChessPiece
{
	private static final long serialVersionUID = 3819757220079709631L;
	private static final int TYPE = 0;
	private boolean hasMoved;
	
	BufferedImage img;// = (BufferedImage) new ImageIcon("rl.png");
	BufferedImage buffered;
	Image image;
	
	ImageObserver observer;
	
	public Rook(boolean isWhite, Location loc)
	{
		super(isWhite, loc);
		hasMoved=false;
	}
		
	
	public String getPieceName()
	{
		return "Rook";
	}
	
	public String getPieceColor()
	{
		return "*Color*";
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
				img = ImageIO.read(new File("rl.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			g.drawImage(img, 20, 15, null);
		}
		else
		{
			try {
				img = ImageIO.read(new File("rd.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			g.drawImage(img, 20, 15, null);
		}
	}
	
	public boolean getHasMoved()
	{
		return hasMoved;
	}
	
	public void setHasMoved(boolean input)
	{
		hasMoved=input;
	}
	
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
				locs[z-1] = new Location(y-z%8, x);
			else if(z<=16)
				locs[z-1] = new Location(y, x+z%8);
			else if(z<=24)
				locs[z-1] = new Location(y+z%8, x);
			else
				locs[z-1] = new Location(y, x-z%8);
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
		hasMoved=true;
	}
	
	public String toString()
	{
		return super.toString()+" Rook";
	}

	
}