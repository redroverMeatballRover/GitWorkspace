package makeBoardofCodyCode;


public class Knight extends ChessPiece
{
	 int col2nd;
	 int row2nd;
	 int col1st;
	 int row1st;
	 String name; 
	 char firstLetter;
	 char secondLetter;
	 boolean enemyDeath;
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
	public boolean legalMove(ChessPiece[][] chess, int col1st,int row1st, int col2nd, int row2nd)
	{
		int berzerkX=col2nd-col1st;
		berzerkX=berzerkX<0?-berzerkX:berzerkX;
		int berzerkY=row2nd-row1st;
		berzerkY=berzerkY<0?-berzerkY:berzerkY;
						
		return (berzerkY==2 && berzerkX==1) || (berzerkY==1 && berzerkX==2);
	}
	String Knight="";
	public String setInBoard() {
		if(name.charAt(0)=='B'){
		 Knight="| ndp1 |";
		}
		else{
			 Knight="| nlp1 |";
		}
		return Knight;
	}
	@Override
	public String findChessPiece() {
	
		return this.name;
	}
	
	public boolean pieceBarrier(ChessPiece[][]chess,int row1st,int col1st ,int col2nd,int row2nd) {
		boolean isKnightMoving = false;
		
		
		if(chess[row2nd][col2nd]!=null && enemyDeath(chess, row1st, col1st , col2nd, row2nd)){
			 isKnightMoving = true;
		
	        }	 
		
	        else if(chess[row2nd][col2nd]==null ){
	        	 isKnightMoving=true;
		    }
	        else{
	        	 isKnightMoving=false;
	        }
		return  isKnightMoving;
	}
		
	public boolean enemyDeath(ChessPiece[][]chess,int row1st,int col1st ,int col2nd,int row2nd){
	       firstLetter = chess[row1st][col1st].findChessPiece().charAt(0);
			if (chess[row2nd][col2nd] != null) {
				secondLetterNotNull = true;
				secondLetter = chess[row2nd][col2nd].findChessPiece().charAt(0);
			} else {
				secondLetterNotNull = false;
			}
			
			if (secondLetter != firstLetter && secondLetterNotNull == true) {
				enemyDeath = true;
			} else {
				enemyDeath = false;
			}
		return enemyDeath;
	}
	
}