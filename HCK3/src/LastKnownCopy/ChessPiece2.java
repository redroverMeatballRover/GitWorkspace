package LastKnownCopy;

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
import java.awt.Graphics;
import java.io.Serializable;
import java.util.ArrayList;

@SuppressWarnings("serial")
public abstract class ChessPiece2 implements Serializable
{
	private boolean isWhite;
	
	private Location loc;
	
	public ChessPiece2(boolean isWhite, Location loc)
	{
		this.isWhite = isWhite;
		this.loc = loc;
	}
	
	public void setLocation(Location loc)
	{
		this.loc = loc;
	}
	
	public Location getLocation()
	{
		return loc;
	}
	
	public boolean getColor()
	{
		return isWhite;
	}
	
	public abstract void draw(Graphics g);
	
	public abstract ArrayList<Location> getMoves(BoardState board);
	
	public abstract void moveTo(Location moveLoc);
	
//	public static ChessPiece2 clone(ChessPiece2 dolly)
//	{
////		 if(dolly instanceof Rook)
////		{
////			Rook piece = new Rook(dolly.getColor(), dolly.getLocation());
////			piece.setHasMoved(((Rook)dolly).getHasMoved());
////			return piece;
////		}
////		else
////			return null;
//	}
	public String toString()
	{
		if(isWhite)
			return "White";
		else
			return "Black";
	}
}
