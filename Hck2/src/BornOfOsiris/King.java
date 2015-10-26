package BornOfOsiris;

//not corrected
public class King extends ChessPiece {
	 int colEnd;
	 int rowEnd;
	 int colStart;
	 int rowStart;
	 String name; 
	 boolean basic;
	 static boolean castling;
	 char firstLetter;
	 char secondLetter;
	 boolean enenmyDeath;
	 String chessPiece;
	 boolean secondLetterNotNull;
	 static int y;
	 static int x;
	 String King="";
	 
	 
	public King(String name) 
	{
		this.name=name;
	}
	@Override
	public String toString() 
	{
		return "King [name=" + name + "]";
	}
	public boolean isMoveLegal(ChessPiece[][] pieces, int colStart,	int rowStart, int colEnd, int rowEnd) 
	{
		boolean kingMoved=false;
		kingMoved=true;
		return kingMoved;	
	}
	

	public String check() 
	{
		if(name.charAt(0)=='B')
		{
			 King="|BKing|";
	     }
		
		else
		{
			King="|WKing|";
		}
		return King;
	}
	@Override
	public String Find() 
	{
		return this.name;
	}
	@Override
	public boolean pieceBarrier(ChessPiece[][]pieces,int rowStart,int colStart ,int colEnd,int rowEnd) 
	{
		boolean KingMoved = false;
		int b=0;
		int rowX=rowEnd-rowStart;
		int colY=colEnd-colStart;
	    
		//check
		boolean rowUpperRangeLimit=false;
	    boolean columnUpperRangeLimit=false;
	    boolean rowLowerRangeLimit=false;
	    boolean columnLowerRangeLimit=false;
	    
 
		if (rowX < 0) 
		{
			rowX = rowX * (-1);
		}
		if (colY < 0) 
		{
			colY = colY * (-1);
		}
		if(rowEnd<8)
		{
		rowUpperRangeLimit=true;	
		}
		
		if(rowEnd>1)
		{
			rowLowerRangeLimit=true;	
		}
		if(colEnd<8)
		{
			columnUpperRangeLimit=true;	
		}
		if(colEnd>1)
		{
			columnLowerRangeLimit=true;	
		}
		
		if(rowUpperRangeLimit==true && rowStart+1==rowEnd && colStart==colEnd)
			{//Down
			b=1;
			}
		else if(rowLowerRangeLimit==true && rowStart-1==rowEnd && colStart==colEnd)
			{//Up
				b=1;
			}
		else if(columnUpperRangeLimit==true && colStart+1==colEnd  && rowStart==rowEnd)
			{//Right
				b=1;
			}
		else if(columnLowerRangeLimit==true && colStart-1==colEnd && rowStart==rowEnd)
			{// Left
				b=1;
			}
		else if(columnUpperRangeLimit==true && rowUpperRangeLimit==true && rowStart+1==rowEnd && colStart+1==colEnd)
			{//NorthEast
				b=1;
			}
		else if(columnUpperRangeLimit==true && rowLowerRangeLimit==true && rowStart-1==rowEnd && colStart+1==colEnd)	
			{//SouthEast
				b=1;
			}
		else if(columnLowerRangeLimit==true &&  rowUpperRangeLimit==true && rowStart+1==rowEnd && colStart-1==colEnd)
			{//NorthWest
				b=1;
			}
		else if(columnLowerRangeLimit==true &&  rowLowerRangeLimit==true && rowStart-1==rowEnd && colStart-1==colEnd) 
			{//SouthWest
				b=1;
			}
		else	
			{
				b=0;
			}
		
	
	//rowX!=0)?(b!=rowX):(b!=columnY)	
		if(b==0)
		{
			KingMoved = false;
		}
		  else if(pieces[rowEnd][colEnd]!=null && enemyDeath(pieces, rowStart, colStart , colEnd, rowEnd) )
		  {
			  KingMoved=true;
		  }	 // IF B SMALLER THAN THE DIFFERENCE BETWEEN COLUMNSTART & COLUMNEND (SPACESY) , GIVE FALSE. OTHERWISE GIVE TRUE.
		  else if(pieces[rowEnd][colEnd]==null && b==1 )
		  {
		  	KingMoved=true;
		  }
		  else
		  {
		  	KingMoved=false;	
		  }
		if(pieces[rowStart][colStart]!=null && pieces[rowStart][colStart].Find().charAt(0)=='W' && KingMoved==true)
		{    
		   y++;   
		}
		if(pieces[rowStart][colStart]!=null && pieces[rowStart][colStart].Find().charAt(0)=='B' && KingMoved==true)
		{    
		   x++;   
		} 
		return KingMoved;
	}
	//--------------------------------------------------------------end
	
	
	public static int getX() 
	{
		return x;	
	}
	public static int getY() 
	{
		return y;
	}
	
////////Castling///////////////////////////////Castling////////////////////////////////////////////////	
	public static boolean castling(ChessPiece[][] pieces, int colStart, int rowStart, int colEnd, int rowEnd,  boolean BlackKingToMoveRIGHT, boolean BlackKingToMoveLEFT,  boolean WhiteKingToMoveRIGHT,  boolean whiteKingToMoveLEFT) {
		boolean right = colEnd > colStart;
		boolean left = colEnd < colStart;
		boolean fieldClearRIGHT=false;
	    boolean fieldClearLEFT=false;
	 
		if((rowStart==8 && colStart==4 && (colEnd==6  || colEnd==2))|| (rowStart==1 && colStart==4 && (colEnd==6  || colEnd==2)))
		{	 
			castling=true;
		}
		if(castling==true && right)
		{
			if( pieces[8][4]==pieces[rowStart][colStart])
			{
				if(WhiteKingToMoveRIGHT==true && pieces[8][5]==null && pieces[8][6]==null && pieces[8][7]==null && pieces[8][8]!=null)
					fieldClearRIGHT=true;
			}
			else if(BlackKingToMoveRIGHT==right && pieces[1][4]==pieces[rowStart][colStart] && (pieces[1][5]==null && pieces[1][6]==null && pieces[1][7]==null && pieces[1][8]!=null))
			{
				fieldClearRIGHT=true;	
		    }
			else
			{
				fieldClearRIGHT=false;	
			}
		}
		if(castling==true && left)
		{
			if( pieces[8][4]==pieces[rowStart][colStart])
			{
				if(whiteKingToMoveLEFT==true && pieces[8][3]==null && pieces[8][2]==null && pieces[8][1]!=null)
				{
					fieldClearLEFT=true;
				}
			}
			else if(BlackKingToMoveLEFT==true && pieces[1][4]==pieces[rowStart][colStart] && (pieces[1][3]==null && pieces[1][2]==null && pieces[1][1]!=null ))
			{
				fieldClearLEFT=true;
		    }
		}
		return fieldClearRIGHT || fieldClearLEFT;
	}
/////////////////Piece Endevour////////////////////////////////////////////////////////////////////////
	
	
	public boolean enemyDeath(ChessPiece[][]pieces,int rowStart,int columnStart ,int columnEnd,int rowEnd)
	{	
	       firstLetter = pieces[rowStart][columnStart].Find().charAt(0);
			if (pieces[rowEnd][columnEnd] != null) 
			{
				secondLetterNotNull = true;
				secondLetter = pieces[rowEnd][columnEnd].Find().charAt(0);
			} 
			else 
			{
				secondLetterNotNull = false;
			}
			
			if (secondLetter != firstLetter && secondLetterNotNull == true) 
			{
				enenmyDeath = true;
			}
			else 
			{
				enenmyDeath = false;
			}
		return enenmyDeath;
	}
}