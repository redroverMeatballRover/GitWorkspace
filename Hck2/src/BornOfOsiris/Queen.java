package BornOfOsiris;

	
	public class Queen extends ChessPiece{
		 int colEnd;
		 int rowEnd;
		 int colStart;
		 int rowStart;
		 String name; 
		 boolean basic1;
		 boolean basic2;
		 char firstLetter;
		 char secondLetter;
		 boolean enemyDeath;
		 String Queen="";
		 String chessPiece;
		 boolean secondLetterNotNull;
		 
		public Queen(String name) 
		{
			this.name=name;
		}
		@Override
		public String toString() 
		{
			return "Queen [name=" + name + "]";
		}
		
		public boolean isMoveLegal(ChessPiece[][] pieces, int colStart,int rowStart, int colEnd, int rowEnd)
		{
			int moveX=colEnd-colStart;
			moveX=moveX<0?-moveX:moveX;
			int movey=rowEnd-rowStart;
			movey=movey<0?-movey:movey;
			 if(movey==moveX);
			 basic1=true;
			 
	      if(colStart==colEnd & rowStart!=rowEnd || rowStart==rowEnd & colStart!=colEnd)
	          basic2=true;

	       return basic1 || basic2;
		}
		
		public String check() 
		{
			if(name.charAt(0)=='B')
			{
				Queen="|BQueen|";
			}
			else
			{
				Queen="|WQueen|";
			}
			return Queen;
		}
		@Override
		public String Find() 
		{	
			return this.name;
		}
		@Override
		public boolean pieceBarrier(ChessPiece[][]pieces,int rowStart,int colStart,int colEnd,int rowEnd) 
		{	
			int columnX = colEnd - colStart;
			int rowY = rowEnd - rowStart;
			boolean BishopNorthEast = false;
			boolean BishopNorthWest = false;
			boolean BishopSouthWest = false;
			boolean BishopSouthEast = false;
			int a = 0;
			
			boolean isRookMovingRight=false;
			boolean isRookMovingLeft=false;
			boolean isRookMovingDown=false;
			boolean isRookMovingUp=false;
		   
			int b=0;
			int rowX=rowEnd-rowStart;
			
			int colY=colEnd-colStart;
			   		  
			//while(pieces[rowStart-1-a][columnStart+1+a]==null && (columnStart+1+a)!=columnEnd && (rowStart-1-a)!=rowEnd){						
	
			if(colY>0 & rowX==0)
			{ // RIGHT SIDE (CHECK FOR NULL)
				try
				{
				  while(pieces[rowStart][colStart+b+1]==null  && colStart+b+1<colEnd )
				  {
				     b++;				 
				  }
				  b=b+1;
				}
				  catch(Exception e)
				  {
					  while(pieces[rowStart][8]==null && colStart+b!=colEnd )
					  {
					     b++;
					  }
				  }
				  
			    if( b!=colY  )
			    {
				isRookMovingRight=false;
		        }
		        else if(pieces[rowEnd][colEnd]!=null && enemyDeath(pieces, rowStart, colStart , colEnd, rowEnd) && colY==b)
		        {
		        	isRookMovingRight=true;
		        }	 // IF B SMALLER THAN THE DIFFERENCE BETWEEN COLUMNSTART & COLUMNEND (SPACESY) , GIVE FALSE. OTHERWISE GIVE TRUE.
			
		        else if(pieces[rowEnd][colEnd]==null &&  ((colY==b)))
		        {
		        	isRookMovingRight=true;
			    }
		        else
		        {
		        	isRookMovingRight=false;
		        }
			}
				
				//////////////////////////////////////////////////////////////////////////////////////////////////////
				
				if(colY<0 & rowX==0)
				{ // LEFT SIDE (CHECK FOR NULL)				  	  
					try
					{				  
						while(pieces[rowStart][colStart-b-1]==null  && colStart-b-1!=colEnd )
						{
							b++;
						}
						b=b+1;
					}
					catch(Exception e)
					{
						while(pieces[rowStart][1]==null  && colStart-b!=colEnd )
						{
					     b++;
						}
					}
				
					colY=colY*(-1); 
					if( b!=colY  )
					{
						isRookMovingLeft=false;	
					}
					else if(pieces[rowEnd][colEnd]!=null && enemyDeath(pieces, rowStart, colStart , colEnd, rowEnd) && colY==b)
					{
						isRookMovingLeft=true;		
					}
				    else if(pieces[rowEnd][colEnd]==null &&  ((colY==b)))
				    {
				    	isRookMovingLeft=true;
				    }
				    else
				    {
				    	isRookMovingLeft=false;
				    } 
					colY=colY*(-1); 			  
				}		
				//////////////////////////////////////////////////////////////////////////////////////////////////////////
				
		   if(colY==0 & rowX>0)
		   { // DOWN SIDE (CHECK FOR NULL)
			  	  
				 
			   
				try{	
				   while(pieces[rowStart+b+1][colStart]==null && rowStart+b+1!=rowEnd ){ // CHECKS THE down ROW.
										   b++;			
				   }
				 b=b+1;
				}
			catch(Exception e)
			{
				 while(pieces[8][colStart]==null && rowStart+b!=rowEnd )
				 { // CHECKS THE down ROW.
					   b++;						   
				 }
			}
			   
			    if( b!=rowX  )
			    {
				isRookMovingDown=false;
			    }
			    else if(pieces[rowEnd][colEnd]!=null && enemyDeath(pieces, rowStart, colStart , colEnd, rowEnd) && rowX==b)
			    {
			    	isRookMovingDown=true;
			    }
			    else if(pieces[rowEnd][colEnd]==null &&  ((rowX==b)))
			    {
			    	isRookMovingDown=true;
			    }
			    else
			    {
			    	isRookMovingDown=false;
			    } 				  
			}	  				  
				/////////////////////////////////////////////////////////////////////////////////////						  
		  if(colY==0 & rowX<0)
		  { // UP SIDE (CHECK FOR NULL)			  
			 // (array[columnStart-b]!=0 && array[columnStart-b]!=array[columnEnd]&& array[columnEnd]!=0 )	
			  try
			  {
			     while(pieces[rowStart-b-1][colStart]==null && rowStart-b-1!=rowEnd )
			     { // CHECKS THE UPPER ROW.
					   b++;
			     }
			     b=b+1;
			  }
				catch(Exception e)
				{
				    while(pieces[1][colStart]==null && rowStart-b!=rowEnd )
				    { // CHECKS THE UPPER ROW.
						   b++;	 
				    }
				}
			 rowX=rowX*(-1);   							
						
			 if( b!=rowX )
			 {
				isRookMovingUp=false;
			 }
			 else if(pieces[rowEnd][colEnd]!=null && enemyDeath(pieces, rowStart, colStart , colEnd, rowEnd) && rowX==b)
			 {
				isRookMovingUp=true;	 
			 }	
			 else if(pieces[rowEnd][colEnd]==null &&  ((rowX==b)))
			 {
				 isRookMovingUp=true;
			 }
			 else
			 {
				 isRookMovingUp=false;
			 } 
			}		  
				 	
			// BishopNorthWest///////////////////////////
			// 1--
			if (columnX < 0 && rowY < 0) 
			{
				try
				{
					while (pieces[rowStart - 1 - a][colStart - 1 - a] == null && (colStart - 1 - a) != colEnd && (rowStart - 1 - a) != rowEnd) 
					{
						a++;
					}
						a = a + 1;
				}
				catch(Exception e)
				{
					if(rowStart<1)
					{
						while (pieces[8][colEnd] == null) 
						{
							a++;
						}
					}
					else if(colStart<1)
						{
							while (pieces[rowEnd][8] == null)
							{
								a++;
							}
					}
					else
					{
						while (pieces[8][8] == null) 
						{
							a++;
						}
					}
				}
			
					if (rowY < 0) 
					{
						rowY = rowY * (-1);
					}
					if (columnX < 0)
					{
						columnX = columnX * (-1);
					}
					if (a != rowY && a != columnX) 
					{
						BishopNorthWest = false;
					}
					else if(pieces[rowEnd][colEnd]!=null && (enemyDeath(pieces, rowStart, colStart , colEnd, rowEnd) &&  (a == rowY && a == columnX)))
					{
						BishopNorthWest = true;
					}
					else if(pieces[rowEnd][colEnd]==null &&   (a == rowY && a == columnX))
					{
						BishopNorthWest = true;
					}
					else
					{
						BishopNorthWest = false;
					}
					
					rowY = rowY * (-1);
					columnX = columnX * (-1);
			}
					
					
					// ////////////////////////////////////////////BishopSouthEast
					// 2++
					 
			if (rowY > 0 && columnX > 0) 
			{		
				try
				{
					while (pieces[rowStart + 1 + a][colStart + 1 + a] == null && (colStart + 1 + a) != colEnd && (rowStart + 1 + a) != rowEnd) 
					{
						a++;
					}
					a = a + 1;
				}
			catch(Exception e)
			{
				if(rowStart>8)
				{
					while (pieces[8][colEnd] == null) 
					{
						a++;
					}
				}
				else if(colStart>8)
				{
					while (pieces[rowEnd][8] == null) 
					{
						a++;
					}			
				}
				else
				{
					while (pieces[8][8] == null) 
					{
						a++;
					}
				}
			}
			   
				if ((a !=rowY && a != columnX)) 
				{
					BishopSouthEast = false;
				} else if(pieces[rowEnd][colEnd]!=null && (enemyDeath(pieces, rowStart, colStart , colEnd, rowEnd) &&   (a == rowY && a == columnX)))
				{
					BishopSouthEast = true;
				}
				else if(pieces[rowEnd][colEnd]==null &&   (a == rowY && a == columnX))
				{
					BishopSouthEast = true;
				}
				else
				{
					BishopSouthEast = false;
				}
			}	
					
			// BishopNorthEast//////////////////////// //3-+
			if (rowY > 0 && columnX < 0) 
			{
				try
				{
					while (pieces[rowStart + 1 + a][colStart - 1 - a] == null && (colStart - 1 - a) != colEnd && (rowStart + 1 + a) != rowEnd) 
					{
						a++;
					}
					a = a + 1;
				}   
			catch(Exception e)
				{
					if(rowStart>8)
						{
							while (pieces[8][colEnd] == null) 
							{
								a++;
							}	
						}
					else if(colStart<1)
					{
						while (pieces[rowEnd][8] == null) 
						{
							a++;
						}			
					}
					else
					{
						while (pieces[8][8] == null) 
						{
							a++;
						}
					}
				}
						if (rowY < 0) 
						{
							rowY = rowY * (-1);
						}
						if (columnX < 0) 
						{
							columnX = columnX * (-1);
						}
						if ((a !=rowY && a != columnX)) 
						{
							BishopSouthWest = false;
						} 
						
						else if(pieces[rowEnd][colEnd]!=null && (enemyDeath(pieces, rowStart, colStart , colEnd, rowEnd) &&  (a == rowY && a == columnX)))
						{
							BishopSouthWest = true;
						}
						else if(pieces[rowEnd][colEnd]==null &&   (a == rowY && a == columnX))
						{
							BishopSouthWest = true;
						}
						else
						{
							BishopSouthWest = false;
						}
						columnX = columnX * (-1);
				}	
					
					
					// ////////////////////////////////////////BishopSouthWest///////////////////////////////////////////BishopSouthWest////////////////////////////
					// 4+-
				
			if (rowY < 0 && columnX > 0) 
			{
				a=0;
				try
				{
					while (pieces[rowStart - 1 - a][colStart + 1 + a] == null && (colStart + 1 + a) != colEnd && (rowStart - 1 - a) != rowEnd) 
					{
						a++;
					}
					a = a + 1;
				}
				catch(Exception e)
				{
					if(rowStart<1)
					{
						while (pieces[8][colEnd] == null) 
						{
							a++;
						}
					}
			else if(colStart>8)
			{
					while (pieces[rowEnd][8] == null) 	
					{
						a++;
					}
			}
			else
			{
				while (pieces[8][8] == null) 
				{
					a++;
				}
			}
		}			
		if (rowY < 0)
		{
			rowY = rowY * (-1);
		}
		if (columnX < 0) 
		{
			columnX = columnX * (-1);
		}
		if ((a!=rowY && a!= columnX)) 
		{
			BishopNorthEast = false;
		} 
		else if(pieces[rowEnd][colEnd]!=null && pieces[rowStart][colStart]!=null &&(enemyDeath(pieces, rowStart, colStart , colEnd, rowEnd) &&   (a == rowY && a == columnX)))
		{
			BishopNorthEast = true;
		}
		else if(pieces[rowEnd][colEnd]==null &&  (a == rowY && a == columnX))
		{
			BishopNorthEast = true;
		}
		else
		{
			BishopNorthEast = false;
		}
	}		
		return BishopSouthWest ||BishopNorthEast || BishopSouthEast || BishopNorthWest || isRookMovingUp | isRookMovingDown | isRookMovingLeft | isRookMovingRight;	
				
}
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
				enemyDeath = true;
			}
			else 
			{
				enemyDeath = false;
			}
			return enemyDeath;
		}
	}