package Module3;

//package il.co.Knight;
//import il.co.ChessInterface.ChessPiece;
public class Knight extends ChessPiece
{
	 int columnEnd;
	 int rowEnd;
	 int columnStart;
	 int rowStart;
	 String name; 
	 char firstLetter;
	 char secondLetter;
	 boolean pieceDevour;
	 String chessPiece;
	 boolean secondLetterNotNull;
	public Knight(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
	}
	@Override
	public String toString() {
		return "Knight [name=" + name + "]";
	}
	public boolean isMoveValid(ChessPiece[][] pieces, int columnStart,int rowStart, int columnEnd, int rowEnd)
	{
		int deltaX=columnEnd-columnStart;
		deltaX=deltaX<0?-deltaX:deltaX;
		int deltaY=rowEnd-rowStart;
		deltaY=deltaY<0?-deltaY:deltaY;
						
		return (deltaY==2 && deltaX==1) || (deltaY==1 && deltaX==2);
	}
	String Knight="";
	public String print() {
		if(name.charAt(0)=='B'){
		 Knight="|Bknight|";
		}
		else{
			 Knight="|Wknight|";
		}
		return Knight;
	}
	@Override
	public String FindPiece() {
	
		return this.name;
	}
	
	public boolean piecesCollision(ChessPiece[][]pieces,int rowStart,int columnStart ,int columnEnd,int rowEnd) {
		boolean isKnightMoving = false;
		
		
		if(pieces[rowEnd][columnEnd]!=null && piecesDevour(pieces, rowStart, columnStart , columnEnd, rowEnd)){
			 isKnightMoving = true;
		
	        }	 
		
	        else if(pieces[rowEnd][columnEnd]==null ){
	        	 isKnightMoving=true;
		    }
	        else{
	        	 isKnightMoving=false;
	        }
		return  isKnightMoving;
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