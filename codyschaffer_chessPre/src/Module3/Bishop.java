package Module3;


//import il.co.ChessInterface.ChessPiece;
public class Bishop extends ChessPiece {
	int columnEnd;
	int columnStart;
	int rowStart;
	String name;
	boolean valid;
	 char firstLetter;
	 char secondLetter;
	 boolean pieceDevour;
	 String chessPiece;
	 boolean secondLetterNotNull;
	public Bishop(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Bishop [name=" + name + "]";
	}
	// pieces, columnStart,rowStart,columnEnd,rowEnd
	public boolean isMoveValid(ChessPiece[][] pieces, int columnStart,int rowStart, int columnEnd, int rowEnd) {
		int deltaX = columnEnd - columnStart;
		deltaX = deltaX < 0 ? -deltaX : deltaX;
		int deltaY = rowEnd - rowStart;
		deltaY = deltaY < 0 ? -deltaY : deltaY;
		return deltaY == deltaX;
	}
	String Bishop = "";
	public String print() {
		if (name.charAt(0) == 'B') {
			Bishop = "BBishop|";
		}
		else {
			Bishop = "WBishop|";
		}
		return Bishop;
	}
	@Override
	public String FindPiece() {
		return this.Bishop;
	}
	public boolean piecesCollision(ChessPiece[][] pieces, int rowStart,
			int columnStart, int columnEnd, int rowEnd) {
		int columnX = columnEnd - columnStart;
		int rowY = rowEnd - rowStart;
		boolean BishopNorthEast = false;
		boolean BishopNorthWest = false;
		boolean BishopSouthWest = false;
		boolean BishopSouthEast = false;
		int a = 0;
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
		if (rowY > 0 && columnX < 0) {
try{
	while (pieces[rowStart + 1 + a][columnStart - 1 - a] == null && (columnStart - 1 - a) != columnEnd && (rowStart + 1 + a) != rowEnd) {
		a++;
	}
	  a = a + 1;
	//  System.out.println(" The value of a is: "+a + "The value of rowY is: "+ rowY +" The value of columnX is" + columnX );
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
			
			} else if(pieces[rowEnd][columnEnd]!=null && (piecesDevour(pieces, rowStart, columnStart , columnEnd, rowEnd) &&   (a == rowY && a == columnX))){
				// System.out.println(" The value of a is: "+a);
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
		return BishopSouthWest || BishopNorthEast || BishopSouthEast|| BishopNorthWest;
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