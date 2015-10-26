package Module3;

//package il.co.Queen;
//import il.co.ChessInterface.ChessPiece;
public class Queen extends ChessPiece{
	 int columnEnd;
	 int rowEnd;
	 int columnStart;
	 int rowStart;
	 String name; 
	 boolean valid1;
	 boolean valid2;
	 char firstLetter;
	 char secondLetter;
	 boolean pieceDevour;
	 String chessPiece;
	 boolean secondLetterNotNull;
	 
	public Queen(String name) {
		this.name=name;
	}
	@Override
	public String toString() {
		return "Queen [name=" + name + "]";
	}
	public boolean isMoveValid(ChessPiece[][] pieces, int columnStart,int rowStart, int columnEnd, int rowEnd)
	{
		int deltaX=columnEnd-columnStart;
		deltaX=deltaX<0?-deltaX:deltaX;
		int deltaY=rowEnd-rowStart;
		deltaY=deltaY<0?-deltaY:deltaY;
		 if(deltaY==deltaX);
		 valid1=true;
		 
        if(columnStart==columnEnd & rowStart!=rowEnd || rowStart==rowEnd & columnStart!=columnEnd)
            valid2=true;
        
		
		 
		 
         return valid1 || valid2;
	}
	String Queen="";
	public String print() {
		if(name.charAt(0)=='B'){
		 Queen="|BQueen|";
		}
		else{
		 Queen="|WQueen|";
		}
		return Queen;
	}
	@Override
	public String FindPiece() {
		
		return this.name;
	}
	@Override
	public boolean piecesCollision(ChessPiece[][]pieces,int rowStart,int columnStart,int columnEnd,int rowEnd) {
		
		int columnX = columnEnd - columnStart;
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
		
		int columnY=columnEnd-columnStart;
		   
		    
	 
			  
		  //while(pieces[rowStart-1-a][columnStart+1+a]==null && (columnStart+1+a)!=columnEnd && (rowStart-1-a)!=rowEnd){						
			
			
			
			
			////////////////////////////////////////////////////////////////////////////////////////////////////////////
			if(columnY>0 & rowX==0){ // RIGHT SIDE (CHECK FOR NULL)
					  	  
				 
						
			 
			try{
			  while(pieces[rowStart][columnStart+b+1]==null  && columnStart+b+1<columnEnd ){
							     b++;
				 
			   }
			  b=b+1;
			}
			  catch(Exception e){
				  while(pieces[rowStart][8]==null && columnStart+b!=columnEnd ){
					     b++;
		             }
				  
			  }
			  
			  
				
				   
				  
			    if( b!=columnY  ){
				isRookMovingRight=false;
				
		        }
		        else if(pieces[rowEnd][columnEnd]!=null && piecesDevour(pieces, rowStart, columnStart , columnEnd, rowEnd) && columnY==b){
				isRookMovingRight=true;
				
		        }	 // IF B SMALLER THAN THE DIFFERENCE BETWEEN COLUMNSTART & COLUMNEND (SPACESY) , GIVE FALSE. OTHERWISE GIVE TRUE.
			
		        else if(pieces[rowEnd][columnEnd]==null &&  ((columnY==b))){
		        	isRookMovingRight=true;
			    }
		        else{
		        	isRookMovingRight=false;
		        }
			}
			
			//////////////////////////////////////////////////////////////////////////////////////////////////////
			
			
			
			
			if(columnY<0 & rowX==0){ // LEFT SIDE (CHECK FOR NULL)
							  	  
					
			try{				  
			while(pieces[rowStart][columnStart-b-1]==null  && columnStart-b-1!=columnEnd ){
							     b++;
						
				}
			b=b+1;
			}
			catch(Exception e){
				while(pieces[rowStart][1]==null  && columnStart-b!=columnEnd ){
				     b++;
			
		  }
			}
			
			
			
			columnY=columnY*(-1); 
			if( b!=columnY  ){
					isRookMovingLeft=false;
				
			     }
			else if(pieces[rowEnd][columnEnd]!=null && piecesDevour(pieces, rowStart, columnStart , columnEnd, rowEnd) && columnY==b){
					isRookMovingLeft=true;
				
			     }
		    else if(pieces[rowEnd][columnEnd]==null &&  ((columnY==b))){
		    	isRookMovingLeft=true;
		    }
		    else{
		    	isRookMovingLeft=false;
		    } 
			columnY=columnY*(-1); 
							  
			}		
						  
				
			
			
			
			//////////////////////////////////////////////////////////////////////////////////////////////////////////
			
	   if(columnY==0 & rowX>0){ // DOWN SIDE (CHECK FOR NULL)
		  	  
			 
		   
			try{	
			   while(pieces[rowStart+b+1][columnStart]==null && rowStart+b+1!=rowEnd ){ // CHECKS THE down ROW.
									   b++;			
			   }
			 b=b+1;
			}
		catch(Exception e){
			 while(pieces[8][columnStart]==null && rowStart+b!=rowEnd ){ // CHECKS THE down ROW.
				   b++;						   
	}
		}
		   
		    if( b!=rowX  ){
			isRookMovingDown=false;
		
         }
		    else if(pieces[rowEnd][columnEnd]!=null && piecesDevour(pieces, rowStart, columnStart , columnEnd, rowEnd) && rowX==b){
			isRookMovingDown=true;
			
         }
		    else if(pieces[rowEnd][columnEnd]==null &&  ((rowX==b))){
		    	isRookMovingDown=true;
		    }
		    else{
		    	isRookMovingDown=false;
		    } 
							  
		}	  
								  
			/////////////////////////////////////////////////////////////////////////////////////						  
			  if(columnY==0 & rowX<0){ // UP SIDE (CHECK FOR NULL)			  
				 // (array[columnStart-b]!=0 && array[columnStart-b]!=array[columnEnd]&& array[columnEnd]!=0 )	
			try{
		     while(pieces[rowStart-b-1][columnStart]==null && rowStart-b-1!=rowEnd ){ // CHECKS THE UPPER ROW.
									   b++;	 
									  
									    }
		     b=b+1;
			}
			catch(Exception e){
			    while(pieces[1][columnStart]==null && rowStart-b!=rowEnd ){ // CHECKS THE UPPER ROW.
					   b++;	 
					  
					    }
			}
		 rowX=rowX*(-1);   							
					
		 if( b!=rowX ){
			isRookMovingUp=false;
		
		 }
		 else if(pieces[rowEnd][columnEnd]!=null && piecesDevour(pieces, rowStart, columnStart , columnEnd, rowEnd) && rowX==b){
			isRookMovingUp=true;
			 
		     }	
		 else if(pieces[rowEnd][columnEnd]==null &&  ((rowX==b))){
			 isRookMovingUp=true;
		 }
		 else{
			 isRookMovingUp=false;
		 } 
		}		  
			 	
	 
		// //////////////////BishopNorthWest////////////////////////////////////
		// BishopNorthWest////////////////////////////////////////
		// BishopNorthWest///////////////////////////
		// 1--
				if (columnX < 0 && rowY < 0) {
		try{
		while (pieces[rowStart - 1 - a][columnStart - 1 - a] == null && (columnStart - 1 - a) != columnEnd && (rowStart - 1 - a) != rowEnd) {
						a++;
					}
					a = a + 1;
		}
		catch(Exception e){
			if(rowStart<1){
				while (pieces[8][columnEnd] == null) {
					a++;
				}
				
				
			}
			else if(columnStart<1){
					while (pieces[rowEnd][8] == null) {
						a++;
					}
					
				
			}
			else{
				while (pieces[8][8] == null) {
					a++;
				}
		}
		}
			
					if (rowY < 0) {
						rowY = rowY * (-1);
					}
					if (columnX < 0) {
						columnX = columnX * (-1);
					}
					if (a != rowY && a != columnX) {
						BishopNorthWest = false;
					}else if(pieces[rowEnd][columnEnd]!=null && (piecesDevour(pieces, rowStart, columnStart , columnEnd, rowEnd) &&  (a == rowY && a == columnX))){
						BishopNorthWest = true;
			
					}
					else if(pieces[rowEnd][columnEnd]==null &&   (a == rowY && a == columnX)){
						BishopNorthWest = true;
					}
					else{
						BishopNorthWest = false;
					}
					
					rowY = rowY * (-1);
					columnX = columnX * (-1);
				}
				
				// ///////////////////////////// BishopSouthEast
				// //////////////////////////////////////////////////BishopSouthEast
				// ////////////////////////////////////////////BishopSouthEast
				// 2++
				 
				if (rowY > 0 && columnX > 0) {
					
		try{
					while (pieces[rowStart + 1 + a][columnStart + 1 + a] == null && (columnStart + 1 + a) != columnEnd && (rowStart + 1 + a) != rowEnd) {
						a++;
					}
					a = a + 1;
		}
		catch(Exception e){
			if(rowStart>8){
				while (pieces[8][columnEnd] == null) {
					a++;
				}
				
				
			}
			else if(columnStart>8){
					while (pieces[rowEnd][8] == null) {
						a++;
					}
					
				
			}
			else{
				while (pieces[8][8] == null) {
					a++;
				}
			
			}
			
		}
				   
					if ((a !=rowY && a != columnX)) {
						BishopSouthEast = false;
					} else if(pieces[rowEnd][columnEnd]!=null && (piecesDevour(pieces, rowStart, columnStart , columnEnd, rowEnd) &&   (a == rowY && a == columnX))){
						BishopSouthEast = true;
					}
					else if(pieces[rowEnd][columnEnd]==null &&   (a == rowY && a == columnX)){
						BishopSouthEast = true;
					}
					else{
						BishopSouthEast = false;
					}
					
				}
				
				// /////////////////////
				// BishopSouthWest//////////////////////////////////////
				// BishopNorthEast////////////////////////////////////
				// BishopNorthEast//////////////////////// //3-+
				if (rowY > 0 && columnX < 0) {
		try{
					while (pieces[rowStart + 1 + a][columnStart - 1 - a] == null && (columnStart - 1 - a) != columnEnd && (rowStart + 1 + a) != rowEnd) {
						a++;
					}
					  a = a + 1;
		}
		       
		catch(Exception e){
			if(rowStart>8){
				while (pieces[8][columnEnd] == null) {
					a++;
				}
				
				
			}
			else if(columnStart<1){
					while (pieces[rowEnd][8] == null) {
						a++;
					}
					
				
			}
			else{
				while (pieces[8][8] == null) {
					a++;
				}
			
		}
		}
					if (rowY < 0) {
						rowY = rowY * (-1);
					}
					if (columnX < 0) {
						columnX = columnX * (-1);
					}
					if ((a !=rowY && a != columnX)) {
						BishopSouthWest = false;
			
					} else if(pieces[rowEnd][columnEnd]!=null && (piecesDevour(pieces, rowStart, columnStart , columnEnd, rowEnd) &&  (a == rowY && a == columnX))){
						BishopSouthWest = true;
				
					}
					else if(pieces[rowEnd][columnEnd]==null &&   (a == rowY && a == columnX)){
						BishopSouthWest = true;
					}
					else{
						BishopSouthWest = false;
					}
					columnX = columnX * (-1);
			}	
				
				// /////////////////////////BishopNorthEast
				// ////////////////////////////////////////BishopSouthWest///////////////////////////////////////////BishopSouthWest////////////////////////////
				// 4+-
			
if (rowY < 0 && columnX > 0) {
	
	a=0;
	try{
				while (pieces[rowStart - 1 - a][columnStart + 1 + a] == null && (columnStart + 1 + a) != columnEnd && (rowStart - 1 - a) != rowEnd) {
					a++;
				}
				a = a + 1;
	}
	catch(Exception e){
		if(rowStart<1){
			while (pieces[8][columnEnd] == null) {
				a++;
			}
			
			
		}
		else if(columnStart>8){
				while (pieces[rowEnd][8] == null) {
					a++;
				}
		}
		else{
			while (pieces[8][8] == null) {
				a++;
			}
		}
	}			if (rowY < 0) {
					rowY = rowY * (-1);
				}
				if (columnX < 0) {
					columnX = columnX * (-1);
				}
				if ((a!=rowY && a!= columnX)) {
					BishopNorthEast = false;
				
				} else if(pieces[rowEnd][columnEnd]!=null && pieces[rowStart][columnStart]!=null &&(piecesDevour(pieces, rowStart, columnStart , columnEnd, rowEnd) &&   (a == rowY && a == columnX))){
					BishopNorthEast = true;
				
				}
				else if(pieces[rowEnd][columnEnd]==null &&  (a == rowY && a == columnX)){
					BishopNorthEast = true;
					
				}
				else{
					BishopNorthEast = false;
				
				}
				
				
			
	}		
					
	
		return BishopSouthWest ||BishopNorthEast || BishopSouthEast || BishopNorthWest || isRookMovingUp | isRookMovingDown | isRookMovingLeft | isRookMovingRight;	
			
	}
	public boolean piecesDevour(ChessPiece[][]pieces,int rowStart,int columnStart ,int columnEnd,int rowEnd){
	       firstLetter = pieces[rowStart][columnStart].FindPiece().charAt(0);
			if (pieces[rowEnd][columnEnd] != null) {
				secondLetterNotNull = true;
				secondLetter = pieces[rowEnd][columnEnd].FindPiece().charAt(0);
			} else {
				secondLetterNotNull = false;
			}
			
			if (secondLetter != firstLetter && secondLetterNotNull == true) {
				pieceDevour = true;
			} else {
				pieceDevour = false;
			}
		return pieceDevour;
	}
}