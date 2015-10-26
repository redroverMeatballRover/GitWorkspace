package Breakthrough;


public class King extends ChessPiece {
	 int columnEnd;
	 int rowEnd;
	 int columnStart;
	 int rowStart;
	 String name; 
	 boolean valid;
	 static boolean castling;
	 char firstLetter;
	 char secondLetter;
	 boolean pieceDevour;
	 String chessPiece;
	 boolean secondLetterNotNull;
	 static int y;
	 static int x;
	 
	 
	public King(String name) {
		this.name=name;
	}
	@Override
	public String toString() {
		return "King [name=" + name + "]";
	}
	public boolean isMoveValid(ChessPiece[][] pieces, int columnStart,	int rowStart, int columnEnd, int rowEnd) {
	{
boolean kingMoved=false;
kingMoved=true;
 return kingMoved;
	}
	}
	
String King="";
public String print() {
	if(name.charAt(0)=='B'){
		 King="|BKing|";
	     }
	
	else{
		King="|WKing|";
	}
	return King;
}
@Override
public String FindPiece() {
	return this.name;
}
	
	@Override
	public boolean piecesCollision(ChessPiece[][]pieces,int rowStart,int columnStart ,int columnEnd,int rowEnd) {
		boolean KingMoved = false;
		int b=0;
		int rowX=rowEnd-rowStart;
		int columnY=columnEnd-columnStart;
	    boolean rowUpperRangeLimit=false;
	    boolean columnUpperRangeLimit=false;
	    boolean rowLowerRangeLimit=false;
	    boolean columnLowerRangeLimit=false;
	    
   
		if (rowX < 0) {
			rowX = rowX * (-1);
		}
		if (columnY < 0) {
			columnY = columnY * (-1);
		}
		if(rowEnd<8){
		rowUpperRangeLimit=true;	
		}
		if(rowEnd>1){
			rowLowerRangeLimit=true;	
			}
		if(columnEnd<8){
			columnUpperRangeLimit=true;	
			}
		if(columnEnd>1){
			columnLowerRangeLimit=true;	
			}
		
if(rowUpperRangeLimit==true && rowStart+1==rowEnd && columnStart==columnEnd){//Down
	b=1;
}
else if(rowLowerRangeLimit==true && rowStart-1==rowEnd && columnStart==columnEnd){//Up
	b=1;
}
else if(columnUpperRangeLimit==true && columnStart+1==columnEnd  && rowStart==rowEnd){//Right
	b=1;
}
else if(columnLowerRangeLimit==true && columnStart-1==columnEnd && rowStart==rowEnd){// Left
	b=1;
}
else if(columnUpperRangeLimit==true && rowUpperRangeLimit==true && rowStart+1==rowEnd && columnStart+1==columnEnd){//NorthEast
	b=1;
}
else if(columnUpperRangeLimit==true && rowLowerRangeLimit==true && rowStart-1==rowEnd && columnStart+1==columnEnd){//SouthEast
	b=1;
}
else if(columnLowerRangeLimit==true &&  rowUpperRangeLimit==true && rowStart+1==rowEnd && columnStart-1==columnEnd){//NorthWest
	b=1;
}
else if(columnLowerRangeLimit==true &&  rowLowerRangeLimit==true && rowStart-1==rowEnd && columnStart-1==columnEnd) {//SouthWest
	b=1;
}
else{
	b=0;
}
		
		
		
		
	//rowX!=0)?(b!=rowX):(b!=columnY)	
 if(b==0){
	KingMoved = false;
}
    else if(pieces[rowEnd][columnEnd]!=null && piecesDevour(pieces, rowStart, columnStart , columnEnd, rowEnd) ){
    	KingMoved=true;
	
    }	 // IF B SMALLER THAN THE DIFFERENCE BETWEEN COLUMNSTART & COLUMNEND (SPACESY) , GIVE FALSE. OTHERWISE GIVE TRUE.
    else if(pieces[rowEnd][columnEnd]==null && b==1 ){
    	KingMoved=true;
    }
    else{
    	KingMoved=false;
    	
    }
 if(pieces[rowStart][columnStart]!=null && pieces[rowStart][columnStart].FindPiece().charAt(0)=='W' && KingMoved==true){    
     y++;
     
	}
if(pieces[rowStart][columnStart]!=null && pieces[rowStart][columnStart].FindPiece().charAt(0)=='B' && KingMoved==true){    
     x++;
     
	} 
		return KingMoved;
	
	}
	
	
		
	
	
	
/////////End King Piece Collision//////////////////////////End King Piece Collision////////////////////////
	
	
	public static int getX() {
		return x;
		
	}
	public static int getY() {
		return y;
	}
	//at il.co.King.King.piecesDevour(King.java:285)
	//at il.co.King.King.piecesCollision(King.java:193)
////////Castling///////////////////////////////Castling////////////////////////////////////////////////	
	public static boolean castling(ChessPiece[][] pieces, int columnStart, int rowStart, int columnEnd, int rowEnd,  boolean BlackKingToMoveRIGHT, boolean BlackKingToMoveLEFT,  boolean WhiteKingToMoveRIGHT,  boolean whiteKingToMoveLEFT) {
		boolean right = columnEnd > columnStart;
		boolean left = columnEnd < columnStart;
		boolean fieldClearRIGHT=false;
	    boolean fieldClearLEFT=false;
	 
		if((rowStart==8 && columnStart==4 && (columnEnd==6  || columnEnd==2))|| (rowStart==1 && columnStart==4 && (columnEnd==6  || columnEnd==2))){
			 
			castling=true;
		}
		if(castling==true && right){
			if( pieces[8][4]==pieces[rowStart][columnStart]){
			if(WhiteKingToMoveRIGHT==true && pieces[8][5]==null && pieces[8][6]==null && pieces[8][7]==null && pieces[8][8]!=null)
			fieldClearRIGHT=true;
			
			}
			else if(BlackKingToMoveRIGHT==right && pieces[1][4]==pieces[rowStart][columnStart] && (pieces[1][5]==null && pieces[1][6]==null && pieces[1][7]==null && pieces[1][8]!=null)){
				fieldClearRIGHT=true;
				
		    }
			else{
				fieldClearRIGHT=false;
				
			}
					
		
		}
		if(castling==true && left){
			if( pieces[8][4]==pieces[rowStart][columnStart]){
			if(whiteKingToMoveLEFT==true && pieces[8][3]==null && pieces[8][2]==null && pieces[8][1]!=null){
			fieldClearLEFT=true;
		
			}
			}
			else if(BlackKingToMoveLEFT==true && pieces[1][4]==pieces[rowStart][columnStart] && (pieces[1][3]==null && pieces[1][2]==null && pieces[1][1]!=null )){
				fieldClearLEFT=true;
			
		    }
			
			
		}
	
		return fieldClearRIGHT || fieldClearLEFT;
	}
/////////////////Piece Endevour////////////////////////////////////////////////////////////////////////
	
	
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