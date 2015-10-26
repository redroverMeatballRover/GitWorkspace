package BornOfOsiris;



public class Bishop extends ChessPiece {
	int colEnd;
	int rowEnd;
	int colStart;
	int rowStart;
	String bName;
	boolean basic;
	boolean enemyDeath;
	String chessPiece;
	String Bishop = "";
	 
	boolean secondLetterNotNull;
	char firstLetter;
	char secondLetter;
	 
	public Bishop(String bName) 
	{
		this.bName = bName;
	}
	
	public boolean isMoveLegal(ChessPiece[][] piece, int colStart,int rowStart, int colEnd, int rowEnd) 
	{
		int moveX = colEnd - colStart;
		moveX = moveX < 0 ? -moveX : moveX;
		int moveY = rowEnd - rowStart;
		moveY = moveY < 0 ? -moveY : moveY;
		return moveY == moveX;
	}
	
	public String check() {
		if (bName.charAt(0) == 'B') 
		{
			Bishop = "BBishop|";
		}
		else 
		{
			Bishop = "WBishop|";
		}
		return Bishop;
	}
	
	@Override
	public String Find() 
	{
		return this.Bishop; //return this.bName
	}
	
	public boolean pieceBarrier(ChessPiece[][] piece, int rowStart, int colStart, int colEnd, int rowEnd) 
	{
		int colX = colEnd - colStart;
		int rowY = rowEnd - rowStart;
		boolean BishopNorthEast = false;
		boolean BishopNorthWest = false;
		boolean BishopSouthWest = false;
		boolean BishopSouthEast = false;
		int a = 0;
		if (colX < 0 && rowY < 0) 
		{
			try
			{
				while (piece[rowStart - 1 - a][colStart - 1 - a] == null && (colStart - 1 - a) != colEnd && (rowStart - 1 - a) != rowEnd) 
				{
					a++;
				}
				a = a + 1;
			}
			catch(Exception e)
			{
				if(rowStart<1)
				{
					while (piece[8][colEnd] == null) 
					{
						a++;
					}
				}
				else if(colStart<1)
				{
					while (piece[rowEnd][8] == null) 
					{
						a++;
					}
				}
				else
				{
					while (piece[8][8] == null) 
					{
						a++;
					}
				}
			}
	
			if (rowY < 0) 
			{
				rowY = rowY * (-1);
			}
			if (colX < 0) 
			{
				colX = colX * (-1);
			}
			if (a != rowY && a != colX) 
			{
				BishopNorthWest = false;
			}
			else if(piece[rowEnd][colEnd]!=null && (pieceAttack(piece, rowStart, colStart , colEnd, rowEnd) &&  (a == rowY && a == colX)))
			{
				BishopNorthWest = true;
			}
			else if(piece[rowEnd][colEnd]==null && (a == rowY && a == colX))
			{
				BishopNorthWest = true;
			}
			else
			{
				BishopNorthWest = false;
			}
			rowY = rowY * (-1);
			colX = colX * (-1);
		}
			 
		if (rowY > 0 && colX > 0) 
		{
			try
			{
				while (piece[rowStart + 1 + a][colStart + 1 + a] == null && (colStart + 1 + a) != colEnd && (rowStart + 1 + a) != rowEnd) 
				{
				a++;
				}
				a = a + 1;
			}
			catch(Exception e)
			{
				if(rowStart>8)
				{
					while (piece[8][colEnd] == null) 
					{
						a++;
					}
				}
				else if(colStart>8)
				{
					while (piece[rowEnd][8] == null) 
					{
						a++;
					}
				}
				else
				{
					while (piece[8][8] == null) 
					{
						a++;
					}
				}
			}
			if ((a !=rowY && a != colX)) 
			{
				BishopSouthEast = false;	
			} 
			else if(piece[rowEnd][colEnd]!=null && (enemyDeath(piece, rowStart, colStart , colEnd, rowEnd) &&   (a == rowY && a == colX)))
			{
				BishopSouthEast = true;		
			}
			else if(piece[rowEnd][colEnd]==null &&   (a == rowY && a == colX))
			{
				BishopSouthEast = true;
			}
			else
			{
				BishopSouthEast = false;
			}
		}
		
		if (rowY > 0 && colX < 0) 
		{
			try{
				while (piece[rowStart + 1 + a][colStart - 1 - a] == null && (colStart - 1 - a) != colEnd && (rowStart + 1 + a) != rowEnd) 
				{
					a++;
				}
					a = a + 1;
					//  System.out.println(" The value of a is: "+a + "The value of rowY is: "+ rowY +" The value of columnX is" + columnX );
				}
       
			catch(Exception e)
			{
				if(rowStart>8)
				{
					while (piece[8][colEnd] == null) 
					{
						a++;
					}	
				}
				else if(colStart<1)
				{
					while (piece[rowEnd][8] == null) 
					{
						a++;
					}
				}
				else
				{
					while (piece[8][8] == null) 
					{
						a++;
					}
				}
			}
			if (rowY < 0) 
			{
				rowY = rowY * (-1);
			}
			if (colX < 0) 
			{
				colX = colX * (-1);
			}
			
			if ((a !=rowY && a != colX)) 
			{
			
			} 
			else if(piece[rowEnd][colEnd]!=null && (enemyDeath(piece, rowStart, colStart , colEnd, rowEnd) &&   (a == rowY && a == colX)))
			{
				// System.out.println(" The value of a is: "+a);
				 BishopSouthWest = true;
			}
			else if(piece[rowEnd][colEnd]==null &&   (a == rowY && a == colX))
			{
				BishopSouthWest = true;
			}
			else
			{
				BishopSouthWest = false;
			}
			colX = colX * (-1);
		}	
		//BishopNorthEast

		if (rowY < 0 && colX > 0) 
		{
			try
			{
				while (piece[rowStart - 1 - a][colStart + 1 + a] == null && (colStart + 1 + a) != colEnd && (rowStart - 1 - a) != rowEnd) 
				{
					a++;
				}
				a = a + 1;
			}
			catch(Exception e)
			{
				if(rowStart<1)
				{
					while (piece[8][colEnd] == null) 
					{
						a++;
					}
				}
				else if(colStart>8)
				{
					while (piece[rowEnd][8] == null) 
					{
							a++;
					}
				}
				else
				{
					while (piece[8][8] == null) 
					{
						a++;
					}
				}
			}			
			if (rowY < 0) 
			{
				rowY = rowY * (-1);
			}
			
			if (colX < 0) 
			{
				colX = colX * (-1);
			}
			if ((a!=rowY && a!= colX)) 
			{
				BishopNorthEast = false;
			} 
			else if(piece[rowEnd][colEnd]!=null && piece[rowStart][colStart]!=null &&(enemyDeath(piece, rowStart, colStart , colEnd, rowEnd) &&   (a == rowY && a == colX)))
			{
				BishopNorthEast = true;
			}
			else if(piece[rowEnd][colEnd]==null &&  (a == rowY && a == colX))
			{
				BishopNorthEast = true;
			}
			else
			{
				BishopNorthEast = false;
			}
		}		
		return BishopSouthWest || BishopNorthEast || BishopSouthEast|| BishopNorthWest;
	}
				
		public boolean pieceAttack(ChessPiece[][]piece,int rowStart,int colStart ,int colEnd,int rowEnd)
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
				
		@Override
		public String toString()
		{
			return "Bishop [name=" + bName + "]";
		}
	}
