package Breakthrough;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

class ChessInterface {
public static void main(String[] arg){
	   	   	   
	   Console console=System.console();
	   int blackkingRow=0;
	   int whitekingRow=0;
	   int whitekingColumn=0;
	   int blackkingColumn=0;
	   int kingColumn2=0;
	   int kingRow2=0;
	   boolean pieceMovesKing=false;
	   boolean pieceDoesntCollideKing=false;
	   boolean pieceMoves=false;
	   boolean pieceDoesntCollide=false;
	   boolean pieceIsWhite=false;
	   boolean checkMatt=false;  
	   boolean dynamicCheckWhite=false;
	   boolean dynamicCheckBlack=false;
	   //checks any threatening piece
	   boolean mate=false;
	   boolean mateWKing=false;
	   boolean mateBKing=false;   
		String chessPiece = "";
		int rowStart = 0;
		int number = 0;
		int moveCount = 0;
		char firstLetter = ' ';
		char secondLetter = ' ';
		boolean pieceDevour = false;
		int rowEnd = 0;
		int kingColumn = 0;
		int kingRow = 0;
		int e=1;
		ChessPiece[][] pieces = new ChessPiece[9][9];
		boolean nonCollision = false;
		boolean secondLetterNotNull = false;
		boolean checkMate = false;
		boolean checkSafe = false;
		boolean promotion = false;
		boolean validPromotion = false;
		boolean moveValid = false;
		boolean valid1 = false;
		boolean valid2 = false;
		int columnStart = 0;
		int columnEnd = 0;
		boolean pieceIsntNull=false;
		boolean validPromotion2 = false;
		boolean validPromotion1 = false;
		boolean rightTurnNumber=false;
		 boolean TurnTrue =false;
		 
		 
		pieces[2][1] = new Pawn("Bpn1");
		pieces[2][2] = new Pawn("Bpn2");
		pieces[2][3] = new Pawn("Bpn3");
		pieces[2][4] = new Pawn("Bpn4");
		pieces[2][5] = new Pawn("Bpn5");
		pieces[2][6] = new Pawn("Bpn6");
		pieces[2][7] = new Pawn("Bpn7");
		pieces[2][8] = new Pawn("Bpn8");
		pieces[1][1] = new Rook("BR1");
		pieces[1][2] = new Knight("BN1");
		pieces[1][3] = new Bishop("BB1");
		pieces[1][4] = new King("BKing");
		pieces[1][5] = new Queen("BQueen");
		pieces[1][6] = new Bishop("BB2");
		pieces[1][7] = new Knight("BN2");
		pieces[1][8] = new Rook("BR2");
		pieces[7][1] = new Pawn("Wpn1");
		pieces[7][2] = new Pawn("Wpn2");
		pieces[7][3] = new Pawn("Wpn3");
		pieces[7][4] = new Pawn("Wpn4");
		pieces[7][5] = new Pawn("Wpn5");
		pieces[7][6] = new Pawn("Wpn6");
		pieces[7][7] = new Pawn("Wpn7");
		pieces[7][8] = new Pawn("Wpn8");
		pieces[8][1] = new Rook("WR1");
		pieces[8][2] = new Knight("WN1");
		pieces[8][3] = new Bishop("WB1");
		pieces[8][4] = new King("WKing");
		pieces[8][5] = new Queen("WQueen");
		pieces[8][6] = new Bishop("WB2");
		pieces[8][7] = new Knight("WN2");
		pieces[8][8] = new Rook("WR2");
					  
					  
			        	 
	 
	   boolean DestinyIsWhite=true;
	   boolean DestinyIsBlack=true;
	            
		int z = 50;
		int b = 0;
		int a = 0;
		boolean whiteTurn=false;
		boolean blackTurn=true;
		boolean even=false;
		boolean uneven=false;	
		boolean DestinyNotNull=false;
do{
	       
  
		
	if(e%2!=0){
	System.out.println("Blacks turn");
	}
	else{
		System.out.println("Whites turn");
	}
     System.out.println(e);
     
			print(pieces, rowStart, columnStart, columnEnd, rowEnd);
			System.out.println("what piece do you want to move?");
			chessPiece = readLine();
			System.out.println("where is the piece located?(type row number)");
			rowStart = Integer.parseInt(readLine());
			System.out.println("where is the piece located?(type column letter)");
			String columnStartC = readLine();
			System.out.println("where do you want to move it to?(type row number)");
			rowEnd = Integer.parseInt(readLine());
			System.out.println("where do you want to move it to?(type column letter)");
			String columnEndC = readLine();
			//System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");    
			valid1 = true;
			valid2 = true;
			System.out.println("//////////////////////////////////MOVE VALIDITY//////////////////////////////////////////////////////");
			switch (columnStartC.charAt(0)) {
			case 'a':
				columnStart = 1;
				break;
			case 'b':
				columnStart = 2;
				break;
			case 'c':
				columnStart = 3;
				break;
			case 'd':
				columnStart = 4;
				break;
			case 'e':
				columnStart = 5;
				break;
			case 'f':
				columnStart = 6;
				break;
			case 'g':
				columnStart = 7;
				break;
			case 'h':
				columnStart = 8;
				break;
			default:
				valid1 = false;
				break;
			}
			switch (columnEndC.charAt(0)) {
			case 'a':
				columnEnd = 1;
				break;
			case 'b':
				columnEnd = 2;
				break;
			case 'c':
				columnEnd = 3;
				break;
			case 'd':
				columnEnd = 4;
				break;
			case 'e':
				columnEnd = 5;
				break;
			case 'f':
				columnEnd = 6;
				break;
			case 'g':
				columnEnd = 7;
				break;
			case 'h':
				columnEnd = 8;
				break;
			default:
				valid2 = false;
				break;
			}
			if (valid2 == false && valid1 == false) {
				System.out.println("Column doesnt exist , please try again");
			}      
			
			
 
     
//////////////////////////////////////////////////////////////////////////////////////////////////////////
//if(pieces[rowEnd][columnEnd] != null && e%2==0 && pieces[rowEnd][columnEnd].FindPiece().charAt(0)=='W' ){
 	//System.out.println(pieces[rowStart][columnStart].FindPiece());
 //	System.out.println("black turn");
 //	whiteTurn=true;
// }
// else{
//	 whiteTurn=false;
// }
 //if(pieces[rowEnd][columnEnd] != null && e%2!=0 && pieces[rowEnd][columnEnd].FindPiece().charAt(0)=='B' ){ 
 //	//System.out.println(pieces[rowStart][columnStart].FindPiece());
 //	System.out.println("black turn");
 //	blackTurn=true;
 //}
 //else{
	
//	 blackTurn=false;
// }				
/////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////				
if (pieces[rowStart][columnStart] != null && pieces[rowStart][columnStart].piecesCollision(pieces, rowStart,columnStart, columnEnd, rowEnd)) {
	nonCollision = true;
} else {
	nonCollision = false;
	
}
if ( pieces[rowStart][columnStart] != null && pieces[rowStart][columnStart].isMoveValid(pieces,columnStart, rowStart, columnEnd, rowEnd) && nonCollision) {
	pieces[rowEnd][columnEnd] = pieces[rowStart][columnStart];
	pieces[rowStart][columnStart] = null;
	moveValid = true;
} 
else {
	moveValid = false;
	
	}
System.out.println("//////////////////////////////////MOVE VALIDITY: SEE NOTES ABOVE//////////////////////////////////////////////////////");	
////////////////////END OF VALID MOVES METHODS///////////////////////////////////////////////////////////////////
////////////////////END OF VALID MOVES METHODS///////////////////////////////////////////////////////////////////
////////////////////END OF VALID MOVES METHODS///////////////////////////////////////////////////////////////////
////////////////////END OF VALID MOVES METHODS///////////////////////////////////////////////////////////////////
////////////////////END OF VALID MOVES METHODS///////////////////////////////////////////////////////////////////
////////////////////END OF VALID MOVES METHODS///////////////////////////////////////////////////////////////////	
	int whiteMoveCount=King.getY();
	 System.out.println("Number of times the white king has moved: "+whiteMoveCount);
	 int blackMoveCount=King.getX();
	 System.out.println("Number of times the black king has moved: "+blackMoveCount);
//System.out.println("castling begins");
 ///castling////////////////////////////////castling///////////////////////////////castling/////////////////////////////////////////     
        boolean BlackKingToMoveRIGHT=false;
        boolean BlackKingToMoveLEFT=false;
        boolean WhiteKingToMoveRIGHT=false;
        boolean whiteKingToMoveLEFT=false;
	
	
	
		if((rowStart==8 && columnStart==4 && (columnEnd==6  || columnEnd==2))|| (rowStart==1 && columnStart==4 && (columnEnd==6  || columnEnd==2))){
			
			
	 
			boolean right = columnEnd > columnStart;
			boolean left = columnEnd < columnStart;
			if (left) {
				whiteKingToMoveLEFT=true;
				if (whiteMoveCount==0 && rowStart==8 & rowEnd==8 & columnStart==4 & columnEnd==2 && King.castling(pieces, columnStart, rowStart, columnEnd, rowEnd,BlackKingToMoveRIGHT,BlackKingToMoveLEFT, WhiteKingToMoveRIGHT,whiteKingToMoveLEFT)) {
					pieces[8][3] = new Rook("WR2");
					pieces[8][1] = null;
					pieces[8][2] = new King("WKing");
					pieces[8][4] = null;
				
				
				}
				whiteKingToMoveLEFT=false;
				BlackKingToMoveLEFT=true;
				 if (blackMoveCount==0 && rowStart==1 & rowEnd==1 & columnStart==4 & columnEnd==2 && King.castling(pieces, columnStart, rowStart, columnEnd, rowEnd,BlackKingToMoveRIGHT,BlackKingToMoveLEFT, WhiteKingToMoveRIGHT,whiteKingToMoveLEFT)) {
					pieces[1][3] = new Rook("BR2");
					pieces[1][1] = null;
					pieces[1][2] = new King("BKing");
					pieces[1][4] = null;
				
					
				}
			}
			if (right) {
				whiteKingToMoveLEFT=false;
				BlackKingToMoveLEFT=false;
				WhiteKingToMoveRIGHT=true;
				if (whiteMoveCount==0 && rowStart==8 & rowEnd==8 & columnStart==4 & columnEnd==6 && King.castling(pieces, columnStart, rowStart, columnEnd, rowEnd,BlackKingToMoveRIGHT,BlackKingToMoveLEFT, WhiteKingToMoveRIGHT,whiteKingToMoveLEFT)) {
					pieces[8][5] = new Rook("WR1");
					pieces[8][8] = null;
					pieces[8][6] = new King("WKing");
					pieces[8][4] = null;
				
				
				}
				whiteKingToMoveLEFT=false;
				BlackKingToMoveLEFT=false;
				WhiteKingToMoveRIGHT=false;
				BlackKingToMoveRIGHT=true;
				if (blackMoveCount==0 && rowStart==1 & rowEnd==1 & columnStart==4 & columnEnd==6 && King.castling(pieces, columnStart, rowStart, columnEnd, rowEnd,BlackKingToMoveRIGHT,BlackKingToMoveLEFT, WhiteKingToMoveRIGHT,whiteKingToMoveLEFT)) {
					
					pieces[1][5] = new Rook("BR1");
					pieces[1][8] = null;
					pieces[1][6] = new King("BKing");
					pieces[1][4] = null;
				
				
				}
			}
		}
		System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");    
	
			
		
	
////////end of castling/////////////////////end of castling///////////////////////////////////end of castling///////////////////////////
		     
			         		    
				
		
		
		
		
		
		
/////////Pawn promotion method//////////////Pawn promotion method///////////////////////Pawn promotion method//////////////Pawn promotion method///////////////Pawn promotion method/////////////////////Pawn promotion method///////////////////Pawn promotion method////				         		    
   		    
if (pieces[rowEnd][columnEnd] != null && pieces[rowEnd][columnEnd].FindPiece().charAt(1) == 'p' && (rowEnd==1 || rowEnd==8)) {
	System.out.println(pieces[rowEnd][columnEnd].FindPiece());
	System.out.println(pieces[rowEnd][columnEnd].FindPiece().charAt(1));
	
	if(pieces[rowEnd][columnEnd].FindPiece().charAt(0) == 'B'){
		 validPromotion1 = true;
	}
	else{
		 validPromotion2 = true;
	}
		Object[][] choice = new Object[1][5];
		
		choice[0][1] = new Rook("BR3");
		choice[0][2] = new Knight("BN3");
		choice[0][3] = new Bishop("BB3");
		choice[0][4] = new Queen("BQueen2");
		
		Object[][] choice2 = new Object[1][5];
		choice2[0][1] = new Rook("WR3");
		choice2[0][2] = new Knight("WN3");
		choice2[0][3] = new Bishop("WB3");
		choice2[0][4] = new Queen("WQueen2");
		if (validPromotion1 == true) {
			for (int num = 1; num < 5; num++) {
				System.out.println(num + "  " + choice[0][num]);
			}
	
			number = Integer.parseInt(readLine());
			pieces[rowEnd][columnEnd]=(ChessPiece) choice[0][number];
		}
		
		if (validPromotion2 == true) {
			for (int num = 1; num < 5; num++) {
				System.out.println(num + "   " + choice2[0][num]);
			}
			
			number = Integer.parseInt(readLine());
			pieces[rowEnd][columnEnd]=(ChessPiece) choice2[0][number];
		}
	
		
}
	
		
//////////////////End of PAwn Promotion////////////////////////////////End of PAwn Promotion///////////////
//////////////////Start of a check Algorithm//////////////////////////////Start of a check Algorithm///////////////
		
boolean checkCheck=false;
String checkOrpiece="";
Boolean checkOrPiece=false;
//////////////////Start of Black King check////////////////////////////////Start of Black King check///////////////
if(pieces[rowEnd][columnEnd]!=null && pieces[rowEnd][columnEnd].FindPiece().charAt(0)=='W'){
	
chessPiece = "BKing";
checkSafe = false;
 kingRow=0;
 kingColumn=0;	
 //do{	
if(chessPiece.equals("BKing")){	 
for (int row = 0; row < pieces.length; row++) {  //Find where the king.
	for (int column = 0; column < pieces[row].length; column++) {
		if (pieces[row][column] != null && pieces[row][column].FindPiece().equals(chessPiece)){
			blackkingRow = row;
			blackkingColumn = column;
		}
	}
}
	for (int z1 = 0; z1 < pieces.length && checkSafe==false; z1++) {  //Find Threatening piece
		for (int j = 0; j < pieces[z1].length && checkSafe==false;j++) {
			
	if (pieces[z1][j] != pieces[blackkingRow][blackkingColumn] &&  pieces[z1][j]!= null && pieces[z1][j].FindPiece().charAt(0)=='W' && pieces[z1][j].piecesCollision(pieces, z1,j, blackkingColumn , blackkingRow)==true && pieces[z1][j].isMoveValid(pieces,j,z1, blackkingColumn ,blackkingRow)==true){
		dynamicCheckBlack=true;
	
		System.out.println("Piece Threat :  " +pieces[z1][j].FindPiece());
	}
}  
		
	}
	}
	 chessPiece = "WKing";
if(chessPiece.equals("WKing")){	 
		for (int row = 0; row < pieces.length; row++) {  //Find where the king.
			for (int column = 0; column < pieces[row].length; column++) {
				if (pieces[row][column] != null && pieces[row][column].FindPiece().equals(chessPiece)){
					whitekingRow = row;
					whitekingColumn= column;
				}
			}
		}
			
		
	for (int z1 = 0; z1 < pieces.length && checkSafe==false; z1++) {  //Find Threatening piece
		for (int j = 0; j < pieces[z1].length && checkSafe==false;j++) {
			
if (pieces[z1][j] != pieces[whitekingRow][whitekingColumn] &&  pieces[z1][j] != null && pieces[z1][j].FindPiece().charAt(0)=='B' && pieces[z1][j].piecesCollision(pieces, z1,j, whitekingColumn, whitekingRow)==true && pieces[z1][j].isMoveValid(pieces,j,z1, whitekingColumn, whitekingRow)==true){
		dynamicCheckWhite=true;
		
		System.out.println("Piece Threat :  " +pieces[z1][j].FindPiece());
	}
		}  
	}	
}	
	print(pieces, rowStart, columnStart, columnEnd, rowEnd);
	
	  
		if(dynamicCheckBlack==true || dynamicCheckWhite==true){
			if(dynamicCheckBlack==true ){
				
			kingRow = blackkingRow;
			kingColumn = blackkingColumn;
			}
			else{
				kingRow = whitekingRow;
				kingColumn = whitekingColumn;
			}
	    if(Mate( pieces, kingRow, kingColumn )==true){
			mate=true;
	    }else{
	    	do{	
	    	print(pieces, rowStart, columnStart, columnEnd, rowEnd);
	    	
		System.out.println("//////////////////////////  check //////////////////////////////////");
		System.out.println("//////////////////////////  check //////////////////////////////////");
		
		System.out.println("Do you want to move a piece or the king ");
		checkOrpiece=readLine();
		if(checkOrpiece.equals("Piece")){
			checkOrPiece=true;
		}
		else{	
			checkCheck=true;
		System.out.println("You are in check, move your king to a new position");
		System.out.println("What row would you like to move your king?.Enter a NUMBER");
		kingRow2 = Integer.parseInt(readLine());
		System.out.println("What column would you like to move your king.Enter a NUMBER");
		kingColumn2 = Integer.parseInt(readLine());
		for (int z1 = 0; z1 < pieces.length ; z1++) {  //Find Threatening piece
			for (int j = 0; j < pieces[z1].length ;j++) {
				if (pieces[z1][j] != null && pieces[z1][j].FindPiece().charAt(0)!=pieces[kingRow][kingColumn].FindPiece().charAt(0) && pieces[z1][j].piecesCollision(pieces, z1,j, kingColumn2, kingRow2)==true && pieces[z1][j].isMoveValid(pieces,j,z1,kingColumn2, kingRow2)==true){
			checkCheck=false;
			
			System.out.println("Piece Threat :  " +pieces[z1][j].FindPiece() +". You cant move into that position. Try again");
		  }
				
			
		   }	
	      }
        }
	    	}while(checkCheck==false && checkOrPiece==false);
	    
			if(checkCheck==true &&  checkOrPiece==false){
		//after getting a new king position checks if the move was valid.
	   if( pieces[kingRow][kingColumn]!=null && mate==false && pieces[kingRow][kingColumn].piecesCollision(pieces, kingRow,kingColumn, kingColumn2, kingRow2)==true){
	   System.out.println("Piece collision :King is moving");
	   pieceDoesntCollideKing=true;
		}
		if(pieces[kingRow][kingColumn]!=null && pieces[kingRow][kingColumn].isMoveValid(pieces,kingColumn,kingRow, kingColumn2,kingRow2)==true){
			System.out.println("Piece valid move :King is moving");
			pieceMovesKing=true;
		}
		if(pieces[kingRow][kingColumn]!=null && mate==false && pieceMovesKing==true && pieceDoesntCollideKing==true) {
			checkSafe = true; 
			
			pieces[kingRow2][kingColumn2]=pieces[kingRow][kingColumn];
			pieces[kingRow][kingColumn]=null;
		
			
		}
		
			}
 }
		}
		
		dynamicCheckWhite=false; 
		dynamicCheckBlack=false; 
		
	//}while(checkSafe==true);
}
if(mate==true){
	System.out.println("MATE: YOU HAVE LOST");
}
//////////////////Black Check Algorithm/////////////////////////////////////////////////End
///////////////////White Check	Algorithm//////////////////////////////////////////////////
//////////////////End of print method/////////////////////////////////////////////////////////////////////
	      
  		 
		    		
pieceIsWhite=false;
pieceMoves=false;
pieceDoesntCollide=false;
b++;
///////////////End of Pawn Promotion Algorithm///////////////////////////////////////////////////////////////
		
/////////////////Check Algorithm: Black King//////////////////////////////////////////////////////////////////////
if(pieces[rowEnd][columnEnd]!=null && pieces[rowEnd][columnEnd].FindPiece().charAt(0)=='B'){
//	do{
	chessPiece = "WKing";
	checkSafe = false;
	 kingRow=0;
	 kingColumn=0;	
	 
	 chessPiece = "WKing";
	for (int row = 0; row < pieces.length; row++) {  //Find where the king.
		for (int column = 0; column < pieces[row].length; column++) {
			if (pieces[row][column] != null && pieces[row][column].FindPiece().equals(chessPiece)){
				whitekingRow = row;
				whitekingColumn= column;
			}
		}
	}
for (int z1 = 0; z1 < pieces.length && checkSafe==false; z1++) {  //Find Threatening piece
	for (int j = 0; j < pieces[z1].length && checkSafe==false;j++) {
		
if (pieces[z1][j] != null && pieces[z1][j].FindPiece().charAt(0)=='B' && pieces[z1][j].piecesCollision(pieces, z1,j, whitekingColumn, whitekingRow)==true && pieces[z1][j].isMoveValid(pieces,j,z1, whitekingColumn, whitekingRow)==true){
	dynamicCheckWhite=true;
	System.out.println("Piece Threat :  " +pieces[z1][j].FindPiece());
}
	}  
}
chessPiece = "BKing";
for (int row = 0; row < pieces.length; row++) {  //Find where the king.
	for (int column = 0; column < pieces[row].length; column++) {
		if (pieces[row][column] != null && pieces[row][column].FindPiece().equals(chessPiece)){
			
			blackkingRow = row;
			blackkingColumn = column;
		}
	}
}
for (int z1 = 0; z1 < pieces.length && checkSafe==false; z1++) {  //Find Threatening piece
	for (int j = 0; j < pieces[z1].length && checkSafe==false;j++) {
		
if (pieces[z1][j] != null && pieces[z1][j].FindPiece().charAt(0)=='W' && pieces[z1][j].piecesCollision(pieces, z1,j, blackkingColumn, blackkingRow)==true && pieces[z1][j].isMoveValid(pieces,j,z1,blackkingColumn, blackkingRow)==true){
	dynamicCheckBlack=true;
	System.out.println("Piece Threat :  " +pieces[z1][j].FindPiece());
}
}
}
    //searching and finding if there is a threatening piece
	if((dynamicCheckWhite==true || dynamicCheckBlack==true)){
		if(dynamicCheckBlack==true ){
			
			kingRow = blackkingRow;
			kingColumn = blackkingColumn;
			}
			else{
				kingRow = whitekingRow ;
				kingColumn = whitekingColumn;
			}
	
		if(Mate( pieces,kingRow, kingColumn)==true){
			mate=true;
		}else{
	    	do{	
		    	print(pieces, rowStart, columnStart, columnEnd, rowEnd);
		    	
			System.out.println("//////////////////////////  check //////////////////////////////////");
			System.out.println("//////////////////////////  check //////////////////////////////////");
			
			System.out.println("Do you want to move a piece or the king ");
			checkOrpiece=readLine();
			if(checkOrpiece.equals("Piece")){
				checkOrPiece=true;
			}
			else{	
				checkCheck=true;
			System.out.println("You are in check, move your king to a new position");
			System.out.println("What row would you like to move your king?.Enter a NUMBER");
			kingRow2 = Integer.parseInt(readLine());
			System.out.println("What column would you like to move your king.Enter a NUMBER");
			kingColumn2 = Integer.parseInt(readLine());
			
			for (int z1 = 0; z1 < pieces.length ; z1++) {  //Find Threatening piece
				for (int j = 0; j < pieces[z1].length ;j++) {
					
				if (pieces[z1][j] != null && pieces[z1][j].FindPiece().charAt(0)!=pieces[kingRow][kingColumn].FindPiece().charAt(0) && pieces[z1][j].piecesCollision(pieces, z1,j, kingColumn2, kingRow2)==true && pieces[z1][j].isMoveValid(pieces,j,z1,kingColumn2, kingRow2)==true){
				checkCheck=false;
				
				System.out.println("Piece Threat :  " +pieces[z1][j].FindPiece() +". You cant move into that position. Try again");
			  }
				
			   }	
		      }
	        }
		    	}while(checkCheck==false && checkOrPiece==false);
		
		if(checkCheck==true &&  checkOrPiece==false){
	//after getting a new king position checks if the move was valid.
   if(pieces[kingRow][kingColumn]!=null && mate==false && pieces[kingRow][kingColumn].piecesCollision(pieces, kingRow,kingColumn, kingColumn2, kingRow2)==true){
 
   pieceDoesntCollideKing=true;
	}
	if(pieces[kingRow][kingColumn]!=null && mate==false && pieces[kingRow][kingColumn].isMoveValid(pieces,kingColumn,kingRow, kingColumn2,kingRow2)==true){
		
		pieceMovesKing=true;
	}
	}	
	
	if(pieces[kingRow][kingColumn]!=null && mate==false && pieceMovesKing==true && pieceDoesntCollideKing==true) {
		checkSafe = true; 
		
		pieces[kingRow2][kingColumn2]=pieces[kingRow][kingColumn];
		pieces[kingRow][kingColumn]=null;
	
		
	}
		}
	
	}
	
	dynamicCheckWhite=false; 
	dynamicCheckBlack=false;
	 if(mate==true){
		 System.out.println("MATE: YOU HAVE LOST THE GAME");
	 }
}
print(pieces, rowStart, columnStart, columnEnd, rowEnd);
}while(mate==false && b!=100);
		
	
 
//}while(checkSafe==true);
/////////////////Check Algorithm: White King////////////////////////////////////////////////////////////////
		
    		    	
//}
//		}
//	}	
//	else{
//		System.out.println("no check");
//		checkSafe=false;
//	}	
	    
	    
//	    pieceMoves=true;
//	    pieceDoesntCollide=true;
//	    print(pieces, rowStart, columnStart, columnEnd, rowEnd);
//		}while(checkSafe==true);
//	if(checkMatt==true){
//		System.out.println("Checkmate, you have lost");
//	}
 
////white check////////////////////////////white check////////////////////////////////white check///////////////////////////////////
	
		
}
 
         	           
static String readLine() {
	  try {
	   return new BufferedReader(new InputStreamReader(System.in))
	     .readLine();
	  } catch (IOException e) {
	   // TODO Auto-generated catch block
	   e.printStackTrace();
	  }
	  return null;
}                               
                
/////////////////////////////////////////////
				         		    
                                 
	                         
				       
///////////End of main method//////////////////////End of main method///////////////////////End of main method////////////////////End of main method////////////////End of main method///////////////End of main method/////////////End of main method////////End of main method/////////		       
  
				                    
 public static void print(ChessPiece[][] pieces, int rowStart, int columnStart , int columnEnd, int rowEnd){
		int a;
		int b;
		String rows = " abcdefgh";
		String nullSquare = "| Null |";
		String[][] array = new String[9][9];
		for (a = 1; a < 9; a++) {
			for (b = 1; b < 9; b++) {
				if (pieces[a][b] != null) {
					array[a][b] = pieces[a][b].print();
				}
				else {
					array[a][b] = nullSquare;
				}
			}
		}
		rows = " abcdefgh";
		int i = 0;
		int j = 0;
		for (i = 0; i < 9; i++) {
			for (j = 1; j < 9; j++) {
				if (i == 0) {
					System.out.print("    " + rows.charAt(j) + "   ");
				} else {
					if (i > 0)
						System.out.print(array[i][j]);
				}
			}
			if (i == 0)
				System.out.println();
			if (i > 0) {
				System.out.println(i);
			}
		}
		System.out
				.println("                                                                             \n ");
		System.out.println("Moves made: ");
		System.out.print("From Row: " + rowStart + "  From Column: "
				+ columnStart + "    Square presentation: ");
		System.out.println(array[rowStart][columnStart]);
		System.out.print("From Row: " + rowEnd + "  From Column: " + columnEnd
				+ "    Square presentation: ");
		System.out.println(array[rowEnd][columnEnd]);
		System.out
				.println("                                                                             \n ");
	}
///////////////CHECKING MATE////////////////////////////////////////////////////////////////////////////////
 
///////////////CHECKING MATE////////////////////////////////////////////////////////////////////////////////
 
 
///////////////CHECKING MATE////////////////////////////////////////////////////////////////////////////////
 
 
///////////////CHECKING MATE////////////////////////////////////////////////////////////////////////////////
 
///////////////CHECKING MATE////////////////////////////////////////////////////////////////////////////////
 
 
///////////////CHECKING MATE////////////////////////////////////////////////////////////////////////////////
 
///////////////CHECKING MATE////////////////////////////////////////////////////////////////////////////////
 
 
public static boolean Mate(ChessPiece[][] pieces,  int kingRow2, int kingColumn2 ){
	boolean mate = false;
	boolean checkSafe=false;
	boolean dynamicCheckWhite=false;
	boolean dynamicCheck=false;
    int b= 1;
    int m=1;
    int f=1;
    int l=1;
    int kingRow=0;
    int kingColumn=0;
    int kingRowArray []=new int[7];
    int kingColumnArray []=new int[7];  
    int kingRowArray2 []=new int[7];
    int kingColumnArray2 []=new int[7];  
    int threatenedRow=0;
    int threatenedColumn=0;
    b= 1;
     m=1;
    f=1;
    l=1;
 
    System.out.println("Kings position: King row2  "+kingRow2);
    System.out.println("Kings position: King column2  "+kingColumn2);   
    
    
//////////////SEARCHING THE LEGAL KING MOVES/////////////////////////////////////////////////////////////////////////////////////////	    
for (int z1 = 1; z1 < pieces.length && checkSafe==false; z1++) {  //Find the potential king position
for (int j = 1; j < pieces[z1].length && checkSafe==false;j++) {
	
if(pieces[kingRow2][kingColumn2]!=null && pieces[kingRow2][kingColumn2].piecesCollision(pieces, kingRow2, kingColumn2, j, z1)==true && pieces[kingRow2][kingColumn2].isMoveValid(pieces, kingColumn2, kingRow2,j, z1)==true){
	
	
	try{
	kingRowArray[f++]= z1 ;
	kingColumnArray[l++]=j;	
	}catch(Exception d){
		kingRowArray[6]= z1 ;
		kingColumnArray[6]=j;	
	}
}
}
}
	
                                                                                                                                            // isMoveValid(pieces,columnStart, rowStart, columnEnd, rowEnd)
do{	
	
//////////////RELEASING THE LEGAL KING MOVES/////////////////////////////////////////////////////////////////////////////////////////	
	
	
	
	if(b<7 && kingRowArray[b]!=0 && kingColumnArray[b]!=0){
	try{
	
	kingRow= kingRowArray[b];
	kingColumn=kingColumnArray[b];
	}
	catch(Exception c){
		kingRow= kingRowArray[6] ;
		kingColumn=kingColumnArray[6];
	}
	}
	System.out.println("000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");	
	System.out.println("PIECES GOING INTO THE LOOP. possible Row position: "+ kingRow);
	System.out.println("PIECES GOING INTO THE LOOP. possible Column position: "+ kingColumn);
	System.out.println("000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
	
	
	dynamicCheck=false;
	for (int z1 = 1; z1 < pieces.length ; z1++) {                       //piecesCollision(pieces, rowStart,columnStart, columnEnd, rowEnd)                                          isMoveValid(pieces,columnStart, rowStart, columnEnd, rowEnd) )      
		for (int j = 1; j < pieces[z1].length ;j++) {		
if (pieces[z1][j] != null && pieces[z1][j].FindPiece().charAt(0)!=pieces[kingRow2][kingColumn2].FindPiece().charAt(0) && pieces[z1][j].piecesCollision(pieces, z1,j, kingColumn, kingRow)==true && pieces[z1][j].isMoveValid(pieces,j,z1,kingColumn, kingRow)==true){
		dynamicCheck=true;	
System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");		
		threatenedRow=kingRow;
	    threatenedColumn=kingColumn;
	    System.out.println("dynamicCheck is TRUE  ");
		System.out.println("PIECES INSIDE THE THREATENING LOOP. The threatened row  "+threatenedRow);
		System.out.println("PIECES INSIDE THE THREATENING LOOP.The threatened column  "+threatenedColumn);
		System.out.println("PIECES GOING IN THE LOOP. possible Row position: "+ kingRow);
		System.out.println("PIECES GOING IN THE LOOP. possible Column position: "+ kingColumn);
		System.out.println("PIECE THREATENING  "+pieces[z1][j].FindPiece());
		
     System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");	
		}
	}
	}
	if(dynamicCheck==false){
		pieces[kingRow][kingColumn]=pieces[kingRow2][kingColumn2] ;
		pieces[kingRow2][kingColumn2]=null;
	for (int z1 = 1; z1 < pieces.length ; z1++) {                       //piecesCollision(pieces, rowStart,columnStart, columnEnd, rowEnd)                                          isMoveValid(pieces,columnStart, rowStart, columnEnd, rowEnd) )      
		for (int j = 1; j < pieces[z1].length ;j++) {	
	if (pieces[kingRow][kingColumn]!= null && pieces[z1][j] != null && pieces[z1][j].FindPiece().charAt(0)!=pieces[kingRow][kingColumn].FindPiece().charAt(0) && pieces[z1][j].piecesCollision(pieces, z1,j, kingColumn, kingRow)==true && pieces[z1][j].isMoveValid(pieces,j,z1,kingColumn, kingRow)==true){
		dynamicCheck=true;
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");		
		threatenedRow=kingRow;
	    threatenedColumn=kingColumn;
	    System.out.println("dynamicCheck is TRUE  ");
		System.out.println("PIECES INSIDE THE THREATENING LOOP. The threatened row  "+threatenedRow);
		System.out.println("PIECES INSIDE THE THREATENING LOOP.The threatened column  "+threatenedColumn);
		System.out.println("PIECES GOING IN THE LOOP. possible Row position: "+ kingRow);
		System.out.println("PIECES GOING IN THE LOOP. possible Column position: "+ kingColumn);
		System.out.println("PIECE THREATENING  "+pieces[z1][j].FindPiece());
		
     System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	
	}
		}
	}
	pieces[kingRow2][kingColumn2]=pieces[kingRow][kingColumn] ;
	pieces[kingRow][kingColumn]=null;
	}
	
	
	
	if(dynamicCheck==false  ){
		mate=false;
		System.out.println("Mate if false. b is" +b);
		break;
	}
b++;
}while(b<=8);
if(b==9){
	mate=true;
	System.out.println("Mate is true. b is" +b);
}else{
	mate=false;
	System.out.println("Mate is false. b is" +b);
}
System.out.println("///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");  
for(Integer d:kingRowArray){
	System.out.print( " "+ d);
}
System.out.println("                                                                                                          ");
for(Integer d:kingColumnArray){
	System.out.print( " "+ d);
}
System.out.print( " ");
System.out.println("////////////////////////////////////////////////////MATE: SEE NOTES ABOVE///////////////////////////////////////////////////////////////////////////////////////////////////////////");
	return mate;
}
public static int getTurnX() {
	int e = 0;
	return e;
	
}
}