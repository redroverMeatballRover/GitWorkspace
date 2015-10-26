package BornOfOsiris;



public class Rook extends ChessPiece {
	 int colEnd;
	 int rowEnd;
	 int colStart;
	 int rowStart;
	 String name; 
	 boolean basic;
	 char firstLetter;
	 String rook="";
	 char secondLetter;
	 boolean enemyDeath;
	 String chessPiece;
	 boolean secondLetterNotNull;
	
	 public Rook(String name) 
	 {
		this.name=name;
	 }
	public boolean isMoveLegal(ChessPiece[][] piece, int colStart,int rowStart, int colEnd, int rowEnd)
	{
        if(colStart==colEnd & rowStart!=rowEnd || rowStart==rowEnd & colStart!=colEnd)
           basic=true;
		return basic;
	}
	
	
	public String check() 
	{
		if(name.charAt(0)=='B')
		{
			rook="|Brook|";
		}
		
		else
		{
			rook="|Wrook|";     
		}
		return rook;
	}
	@Override
	public String Find() 
	{
		return this.name;
	}

	@Override
	public String toString() {
		return "Rook [name=" + name + "]";
	}
public boolean pieceBarrier(ChessPiece[][]pieces,int rowStart,int colStart ,int colEnd,int rowEnd) 
{		
	boolean moveRight=false;
	boolean moveLeft=false;
	boolean moveDown=false;
	boolean moveUp=false;
  
	int b=0;
	int rowX=rowEnd-rowStart;
	int colY=colEnd-colStart;
	   

//while(pieces[rowStart-1-a][columnStart+1+a]==null && (columnStart+1+a)!=columnEnd && (rowStart-1-a)!=rowEnd){						
						
	if(colY>0 & rowX==0)// RIGHT SIDE (CHECK FOR NULL) 
	{ 
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
	    if( b!=colY  ){
		moveRight=false;
	
       }
       else if(pieces[rowEnd][colEnd]!=null && enemyDeath(pieces, rowStart, colStart , colEnd, rowEnd) && colY==b){
		moveRight=true;
	
       }	 // IF B SMALLER THAN THE DIFFERENCE BETWEEN COLUMNSTART & COLUMNEND (SPACESY) , GIVE FALSE. OTHERWISE GIVE TRUE.
	
       else if(pieces[rowEnd][colEnd]==null &&  ((colY==b))){
       	moveRight=true;
	    }
       else{
       	moveRight=false;
       }
	}
	
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
			moveLeft=false;		
		}
		else if(pieces[rowEnd][colEnd]!=null && enemyDeath(pieces, rowStart, colStart , colEnd, rowEnd) && colY==b)
		{
			moveLeft=true;		
		}
		else if(pieces[rowEnd][colEnd]==null &&  ((colY==b)))
		{
		   moveLeft=true;
		}
		else
		{
			moveLeft=false;
		} 
	colY=colY*(-1); 				  
	}			  
	
	colY=colY*(-1); 	
	if(colY==0 & rowX>0)
	{	 // DOWN SIDE (CHECK FOR NULL) 
		try
		{	
			while(pieces[rowStart+b+1][colStart]==null && rowStart+b+1!=rowEnd )
			{ // CHECKS THE down ROW.
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
		moveDown=false;		
	    }
	    else if(pieces[rowEnd][colEnd]!=null && enemyDeath(pieces, rowStart, colStart , colEnd, rowEnd) && rowX==b)
	    {
		moveDown=true;
    }
	    else if(pieces[rowEnd][colEnd]==null &&  rowX==b)
	    {	
	    	moveDown=true;
	    }
	    else
	    {
	    	moveDown=false;	
	    } 				  
	}	 
						  					  
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
				moveUp=false;	
			}
			else if(pieces[rowEnd][colEnd]!=null && enemyDeath(pieces, rowStart, colStart , colEnd, rowEnd) && rowX==b)
			{
				moveUp=true;
			}	
			else if(pieces[rowEnd][colEnd]==null &&  ((rowX==b)))
			{
				 moveUp=true;
			}
			else
			{
				 moveUp=false;
			} 
	  }
			return moveUp | moveDown | moveLeft | moveRight;
	}
public boolean enemyDeath(ChessPiece[][]pieces,int rowStart,int colStart ,int colEnd,int rowEnd)
{
       firstLetter = pieces[rowStart][colStart].Find().charAt(0);
		if (pieces[rowEnd][colEnd] != null) 
		{
			secondLetterNotNull = true;
			secondLetter = pieces[rowEnd][colEnd].Find().charAt(0);
		} 
		else 
		{
			secondLetterNotNull = false;
		}
		
		if (secondLetter != firstLetter && secondLetterNotNull == true) 
		{
			enemyDeath = true;
		} else {
			enemyDeath = false;
		}
	return enemyDeath;
}
}