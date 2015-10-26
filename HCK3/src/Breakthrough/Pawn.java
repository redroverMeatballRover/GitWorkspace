package Breakthrough;

public class Pawn extends ChessPiece{
int columnEnd;
int rowEnd;
int columnStart;
int rowStart;
String name;
boolean simpleMove;
boolean twoSquareMove;
boolean devourMove;
boolean valid;        
String chessPiece;
boolean pieceDevour;
char firstLetter;
char secondLetter;
boolean secondLetterNotNull;
public Pawn(String name){
	this.name=name;
}
@Override
public String toString() {
	return "Pawn [name=" + name + "]";
}
//pieces, columnStart,rowStart,columnEnd,rowEnd
public boolean isMoveValid(ChessPiece[][] pieces, int columnStart,	int rowStart, int columnEnd, int rowEnd) {
		int deltaX = rowEnd - rowStart;
		if (deltaX == 1 || deltaX == -1)
			simpleMove = true;
 boolean pieceMove1 = false;
 boolean pieceMove2 = false;
 boolean pieceMove3 = false;
 boolean pieceMove4 = false;
 pieceMove1 = true;
  pieceMove2 = true;
  pieceMove3 = true;
  pieceMove4 = true;
	return pieceMove1  || pieceMove2 || pieceMove3 || pieceMove4;
}	
String pawn="";
public String print() {
	if(name.charAt(0)=='B'){
		pawn= "| "+ name + " |";   
	}	
	else{
		pawn="| "+ name + " |";
	    }
	return pawn;		    	    
}
	public String FindPiece() {
		return this.name;
	}
	
//pieces,rowStart,columnStart ,columnEnd,rowEnd
public boolean piecesCollision(ChessPiece[][]pieces,int rowStart,int columnStart ,int columnEnd,int rowEnd) {	
	boolean isPawnMovingUP=false;
	boolean isPawnMovingUP2=false;
	boolean isPawnMovingRIGHT=false;
	boolean isPawnMovingDOWN=false;
	boolean isPawnMovingDOWN2=false;
	boolean isPawnMovingLEFT=false;
///White///////////////////////Moving up/////////////////////////Moving up/////////////////////////////////////
if(pieces[rowStart][columnStart].FindPiece().charAt(0)=='W'){	
if(rowStart==7 && (rowEnd==6 ||  rowEnd==5) && columnStart==columnEnd){
	isPawnMovingUP = true;
	
}
  else if((rowStart-1)==rowEnd && pieces[rowEnd][columnEnd]==null && columnStart==columnEnd){
	isPawnMovingUP2 = true;
	
  }
  else{
	  isPawnMovingUP = false;
	  isPawnMovingUP2 = false;
	 
  }
}
 //Black//////////////////Moving Down/////////////////////////////////Moving Down////////////////////////////////  
if(pieces[rowStart][columnStart].FindPiece().charAt(0)=='B'){	
	if(rowStart==2 && (rowEnd==4 ||  rowEnd==3)&& columnStart==columnEnd){
		isPawnMovingDOWN = true;
		
	}
	  else if((rowStart+1)==rowEnd && pieces[rowEnd][columnEnd]==null && columnStart==columnEnd){
		isPawnMovingDOWN2 = true;
		
	  }
	  else{
		  isPawnMovingDOWN = false;
		  isPawnMovingDOWN2 = false;
		 
	  }
	}
//White//////////////////Moving Left/////////////////////////////////Moving Left////////////////////////////////  
if(pieces[rowStart][columnStart].FindPiece().charAt(0)=='W'){	
	if(isPawnMovingDOWN2 == false && isPawnMovingDOWN == false && (rowStart-1)==rowEnd && (columnStart-1)==columnEnd  && pieces[rowEnd][columnEnd]!=null && piecesDevour(pieces, rowStart, columnStart , columnEnd, rowEnd)==true && columnStart!=columnEnd){
		isPawnMovingLEFT=true;
	
	}
	else if(isPawnMovingDOWN2 == false && isPawnMovingDOWN == false &&(rowStart-1)==rowEnd && (columnStart+1)==columnEnd  && pieces[rowEnd][columnEnd]!=null && piecesDevour(pieces, rowStart, columnStart , columnEnd, rowEnd)==true&& columnStart!=columnEnd){
		isPawnMovingRIGHT=true;
	
	}
	else{
		isPawnMovingLEFT=false;
		isPawnMovingRIGHT=false;
	
	}
}
	//Black//////////////////Moving Left/////////////////////////////////Moving Left////////////////////////////////  
	//Black//////////////////Moving Left/////////////////////////////////Moving Left//////////////////////////////// 
	
	if(pieces[rowStart][columnStart].FindPiece().charAt(0)=='B'){		
	if(isPawnMovingUP==false && isPawnMovingUP2==false && (rowStart+1)==rowEnd && (columnStart-1)==columnEnd && pieces[rowEnd][columnEnd]!=null && piecesDevour(pieces, rowStart, columnStart , columnEnd, rowEnd)==true && columnStart!=columnEnd){
		isPawnMovingLEFT=true;
	
	}
	else if(isPawnMovingUP==false && isPawnMovingUP2==false &&  (rowStart+1)==rowEnd && (columnStart+1)==columnEnd && pieces[rowEnd][columnEnd]!=null && piecesDevour(pieces, rowStart, columnStart , columnEnd, rowEnd)==true && columnStart!=columnEnd){
		isPawnMovingRIGHT=true;
		
	}
	else{
		isPawnMovingLEFT=false;
		isPawnMovingRIGHT=false;
		
	}
	}
	return isPawnMovingUP || isPawnMovingRIGHT|| isPawnMovingDOWN || isPawnMovingLEFT || isPawnMovingUP2 || isPawnMovingDOWN2;
  }
//////////////////PieceDevour method//////////////////////////////////////////////////////////////////////
//////////////////PieceDevour method//////////////////////////////////////////////////////////////////////
//////////////////PieceDevour method//////////////////////////////////////////////////////////////////////
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