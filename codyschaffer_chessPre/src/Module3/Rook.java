package Module3;

//package il.co.Rook;
//import il.co.ChessInterface.ChessPiece;
 public class Rook extends ChessPiece {
	 int columnEnd;
	 int rowEnd;
	 int columnStart;
	 int rowStart;
	 String name; 
	 boolean valid;
	 char firstLetter;
	 char secondLetter;
	 boolean pieceDevour;
	 String chessPiece;
	 boolean secondLetterNotNull;
	public Rook(String name) {
		this.name=name;
		}
	public boolean isMoveValid(ChessPiece[][] pieces, int columnStart,
			int rowStart, int columnEnd, int rowEnd)
	{
         if(columnStart==columnEnd & rowStart!=rowEnd || rowStart==rowEnd & columnStart!=columnEnd)
            valid=true;
		return valid;
	}
	String rook="";
	
	public String print() {
		if(name.charAt(0)=='B'){
			rook="|Brook|";
		}
		else{
			rook="|Wrook|";
		     
		}
		return rook;
	}
	@Override
	public String FindPiece() {
	
		return this.name;
	}
////////////new method//////////////new method//////////////////new method///////////////new method//////////////////new method//////////////////new method//////////////////////	
	
//////////// new method//////////////new method//////////////////new method///////////////new method//////////////////new method//////////////////new method//////////////////////	
@Override
	public String toString() {
		return "Rook [name=" + name + "]";
	}
public boolean piecesCollision(ChessPiece[][]pieces,int rowStart,int columnStart ,int columnEnd,int rowEnd) {
		
	
	
	
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
				  
	columnY=columnY*(-1); 	
	
	
	
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
	    else if(pieces[rowEnd][columnEnd]==null &&  rowX==b){
	    	
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
	return isRookMovingUp | isRookMovingDown | isRookMovingLeft | isRookMovingRight;
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