package BornOfOsiris;




public class Knight extends ChessPiece
{
	 int colEnd;
	 int rowEnd;
	 int colStart;
	 int rowStart;
	 String kName; 
	 char firstLetter;
	 char secondLetter;
	 boolean enemyDeath;
	 String Knight="";
	 String chessPiece;
	 boolean secondLetterNotNull;
	public Knight(String name) {
		// TODO Auto-generated constructor stub
		this.kName=name;
	}
	@Override
	public String toString() {
		return "Knight [name=" + kName + "]";
	}
	public boolean isMoveLegal(ChessPiece[][] piece, int colStart,int rowStart, int colEnd, int rowEnd)
	{
		int moveX=colEnd-colStart;
		moveX=moveX<0?-moveX:moveX;
		int moveY=rowEnd-rowStart;
		moveY=moveY<0?-moveY:moveY;
						
		return (moveY==2 && moveX==1) || (moveY==1 && moveX==2);
	}
	
	public String check() 
	{
		if(kName.charAt(0)=='B')
		{
		 Knight="|Bknight|";
		}
		else
		{
			 Knight="|Wknight|";
		}
		return Knight;
	}
	
	@Override
	public String Find() 
	{
		return this.kName;
	}
	
	public boolean pieceBarrier(ChessPiece[][]piece,int rowStart,int colStart ,int colEnd,int rowEnd) 
	{
		boolean isKnightMoving = false;	
		if(piece[rowEnd][colEnd]!=null && enemyDeath(piece, rowStart, colStart , colEnd, rowEnd))
		{
			 isKnightMoving = true;
	    }	 
	    else if(piece[rowEnd][colEnd]==null )
	    {
	    	isKnightMoving=true;
		}
	    else
	    {
        	 isKnightMoving=false;
        }
		return isKnightMoving;
	}
		
	public boolean enemyDeath(ChessPiece[][]piece,int rowStart,int colStart ,int colEnd,int rowEnd)
	{
	       firstLetter = piece[rowStart][colStart].Find().charAt(0);
			if (piece[rowEnd][colEnd] != null) 
			{
				secondLetterNotNull = true;
				secondLetter = piece[rowEnd][colEnd].Find().charAt(0);
			} 
			else 
			{
				secondLetterNotNull = false;
			}
			
			if (secondLetter != firstLetter && secondLetterNotNull == true) 
			{
				enemyDeath = true;
			} 
			else 
			{
				enemyDeath = false;
			}
		return enemyDeath;
	}
	
}
