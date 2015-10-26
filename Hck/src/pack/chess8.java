package pack;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class chess8 extends java.applet.Applet implements MouseMotionListener
{
	class piece //this allows us to track all the information
	{           //about the pieces
		int row;
		int column;
		int xposition;
		int yposition;

		Image mypic;
		boolean visible;
		String color;
		String name;

	};
	//piece 0 at 0,0 is black rook, piece 31 at 7,7 is white rook
    //using top to bottom, and left to right to indentify pieces
	public static piece [] pieces=new piece[32]; //allows us use specific pieces

	// globals
	public static int ChessBoard[][] = new int [8][8];

	int numclicks = 0;

	// changed class structure to allow globals declared
	// here to determine what square on the board has
	// been clicked | 1/24/05

	/*
	2/1/05 | allows pawn to move while alternating clicks
	of the mouse.
	*/

	/*
	top left corner is [0][0]
	bottom right is [7][7]
	*/

	Image mypic;
	Image mypic2;
	Image mypic3;
	Image mypic4;
	Image mypic5;
	Image mypic6;
	Image mypic7;
	Image mypic8;
	Image mypic9;
	Image mypicwr;
	Image mypicwn;
	Image mypicwb;
	Image mypicwk;
	Image mypicwq;
	Image mypicwp;
	int oldx;
	int oldy;

    public void init()
     {
		 //*************************************
		for (int i=0; i< 32; i++)
		{//this declares the pieces, can't use them without this
			pieces[i]=new piece();
		}

    	pieces[0].row=1;
		pieces[0].column=1;
		pieces[0].xposition=0;
		pieces[0].yposition=0;
		pieces[0].mypic=getImage(getCodeBase(),"br.gif");
		pieces[0].visible=true;
		pieces[0].color="black";
		pieces[0].name="Rook";
		//******************
		pieces[1].row=1;
		pieces[1].column=2;
		pieces[1].xposition=0;
		pieces[1].yposition=0;
		pieces[1].mypic=getImage(getCodeBase(),"bn.gif");
		pieces[1].visible=true;
		pieces[1].color="black";
		pieces[1].name="Knight";
		//******************
		pieces[2].row=1;
		pieces[2].column=3;
		pieces[2].xposition=0;
		pieces[2].yposition=0;
		pieces[2].mypic=getImage(getCodeBase(),"bb.gif");
		pieces[2].visible=true;
		pieces[2].color="black";
		pieces[2].name="Bishop";
		//******************
		pieces[3].row=1;
		pieces[3].column=4;
		pieces[3].xposition=0;
		pieces[3].yposition=0;
		pieces[3].mypic=getImage(getCodeBase(),"bq.gif");
		pieces[3].visible=true;
		pieces[3].color="black";
		pieces[3].name="Queen";
		//******************
		pieces[4].row=1;
		pieces[4].column=5;
		pieces[4].xposition=0;
		pieces[4].yposition=0;
		pieces[4].mypic=getImage(getCodeBase(),"bk.gif");
		pieces[4].visible=true;
		pieces[4].color="black";
		pieces[4].name="King";
		//******************
		pieces[5].row=1;
		pieces[5].column=6;
		pieces[5].xposition=0;
		pieces[5].yposition=0;
		pieces[5].mypic=getImage(getCodeBase(),"bb.gif");
		pieces[5].visible=true;
		pieces[5].color="black";
		pieces[5].name="Bishop";
		//******************
		pieces[6].row=1;
		pieces[6].column=7;
		pieces[6].xposition=0;
		pieces[6].yposition=0;
		pieces[6].mypic=getImage(getCodeBase(),"bn.gif");
		pieces[6].visible=true;
		pieces[6].color="black";
		pieces[6].name="Knight";
		//******************
		pieces[7].row=1;
		pieces[7].column=8;
		pieces[7].xposition=0;
		pieces[7].yposition=0;
		pieces[7].mypic=getImage(getCodeBase(),"br.gif");
		pieces[7].visible=true;
		pieces[7].color="black";
		pieces[7].name="Rook";
		//******************
		pieces[8].row=2;
		pieces[8].column=1;
		pieces[8].xposition=0;
		pieces[8].yposition=0;
		pieces[8].mypic=getImage(getCodeBase(),"bp.gif");
		pieces[8].visible=true;
		pieces[8].color="black";
		pieces[8].name="Pawn";


		pieces[9].row=2;
		pieces[9].column=2;
		pieces[9].xposition=0;
		pieces[9].yposition=0;
		pieces[9].mypic=getImage(getCodeBase(),"bp.gif");
		pieces[9].visible=true;
		pieces[9].color="black";
		pieces[9].name="Pawn";

		pieces[10].row=2;
		pieces[10].column=3;
		pieces[10].xposition=0;
		pieces[10].yposition=0;
		pieces[10].mypic=getImage(getCodeBase(),"bp.gif");
		pieces[10].visible=true;
		pieces[10].color="black";
		pieces[10].name="Pawn";

		pieces[11].row=2;
		pieces[11].column=4;
		pieces[11].xposition=0;
		pieces[11].yposition=0;
		pieces[11].mypic=getImage(getCodeBase(),"bp.gif");
		pieces[11].visible=true;
		pieces[11].color="black";
		pieces[11].name="Pawn";

		pieces[12].row=2;
		pieces[12].column=5;
		pieces[12].xposition=0;
		pieces[12].yposition=0;
		pieces[12].mypic=getImage(getCodeBase(),"bp.gif");
		pieces[12].visible=true;
		pieces[12].color="black";
		pieces[12].name="Pawn";

		pieces[13].row=2;
		pieces[13].column=6;
		pieces[13].xposition=0;
		pieces[13].yposition=0;
		pieces[13].mypic=getImage(getCodeBase(),"bp.gif");
		pieces[13].visible=true;
		pieces[13].color="black";
		pieces[13].name="Pawn";

		pieces[14].row=2;
		pieces[14].column=7;
		pieces[14].xposition=0;
		pieces[14].yposition=0;
		pieces[14].mypic=getImage(getCodeBase(),"bp.gif");
		pieces[14].visible=true;
		pieces[14].color="black";
		pieces[14].name="Pawn";

		pieces[15].row=2;
		pieces[15].column=8;
		pieces[15].xposition=0;
		pieces[15].yposition=0;
		pieces[15].mypic=getImage(getCodeBase(),"bp.gif");
		pieces[15].visible=true;
		pieces[15].color="black";
		pieces[15].name="Pawn";

		//white pieces
		pieces[24].row=8;
		pieces[24].column=1;
		pieces[24].xposition=0;
		pieces[24].yposition=0;
		pieces[24].mypic=getImage(getCodeBase(),"wr.gif");
		pieces[24].visible=true;
		pieces[24].color="white";
		pieces[24].name="Rook";
		//******************
		pieces[25].row=8;
		pieces[25].column=2;
		pieces[25].xposition=0;
		pieces[25].yposition=0;
		pieces[25].mypic=getImage(getCodeBase(),"wn.gif");
		pieces[25].visible=true;
		pieces[25].color="white";
		pieces[25].name="Knight";
		//*****2************
		pieces[26].row=8;
		pieces[26].column=3;
		pieces[26].xposition=0;
		pieces[26].yposition=0;
		pieces[26].mypic=getImage(getCodeBase(),"wb.gif");
		pieces[26].visible=true;
		pieces[26].color="white";
		pieces[26].name="Bishop";
		//******************
		pieces[27].row=8;
		pieces[27].column=4;
		pieces[27].xposition=0;
		pieces[27].yposition=0;
		pieces[27].mypic=getImage(getCodeBase(),"wq.gif");
		pieces[27].visible=true;
		pieces[27].color="white";
		pieces[27].name="Queen";
		//******************
		pieces[28].row=8;
		pieces[28].column=5;
		pieces[28].xposition=0;
		pieces[28].yposition=0;
		pieces[28].mypic=getImage(getCodeBase(),"wk.gif");
		pieces[28].visible=true;
		pieces[28].color="white";
		pieces[28].name="King";
		//******************
		pieces[29].row=8;
		pieces[29].column=6;
		pieces[29].xposition=0;
		pieces[29].yposition=0;
		pieces[29].mypic=getImage(getCodeBase(),"wb.gif");
		pieces[29].visible=true;
		pieces[29].color="white";
		pieces[29].name="Bishop";
		//******************
		pieces[30].row=8;
		pieces[30].column=7;
		pieces[30].xposition=0;
		pieces[30].yposition=0;
		pieces[30].mypic=getImage(getCodeBase(),"wn.gif");
		pieces[30].visible=true;
		pieces[30].color="white";
		pieces[30].name="Knight";
		//******0***********
		pieces[31].row=8;
		pieces[31].column=8;
		pieces[31].xposition=0;
		pieces[31].yposition=0;
		pieces[31].mypic=getImage(getCodeBase(),"wr.gif");
		pieces[31].visible=true;
		pieces[31].color="white";
		pieces[31].name="Rook";
		//*****3************
		pieces[16].row=7;
		pieces[16].column=1;
		pieces[16].xposition=0;
		pieces[16].yposition=0;
		pieces[16].mypic=getImage(getCodeBase(),"wp.gif");
		pieces[16].visible=true;
		pieces[16].color="white";
		pieces[16].name="Pawn";

		pieces[17].row=7;
		pieces[17].column=2;
		pieces[17].xposition=0;
		pieces[17].yposition=0;
		pieces[17].mypic=getImage(getCodeBase(),"wp.gif");
		pieces[17].visible=true;
		pieces[17].color="white";
		pieces[17].name="Pawn";

		pieces[18].row=7;
		pieces[18].column=3;
		pieces[18].xposition=0;
		pieces[18].yposition=0;
		pieces[18].mypic=getImage(getCodeBase(),"wp.gif");
		pieces[18].visible=true;
		pieces[18].color="white";
		pieces[18].name="Pawn";

		pieces[19].row=7;
		pieces[19].column=4;
		pieces[19].xposition=0;
		pieces[19].yposition=0;
		pieces[19].mypic=getImage(getCodeBase(),"wp.gif");
		pieces[19].visible=true;
		pieces[19].color="white";
		pieces[19].name="Pawn";

		pieces[20].row=7;
		pieces[20].column=5;
		pieces[20].xposition=0;
		pieces[20].yposition=0;
		pieces[20].mypic=getImage(getCodeBase(),"wp.gif");
		pieces[20].visible=true;
		pieces[20].color="white";
		pieces[20].name="Pawn";

		pieces[21].row=7;
		pieces[21].column=6;
		pieces[21].xposition=0;
		pieces[21].yposition=0;
		pieces[21].mypic=getImage(getCodeBase(),"wp.gif");
		pieces[21].visible=true;
		pieces[21].color="white";
		pieces[21].name="Pawn";

		pieces[22].row=7;
		pieces[22].column=7;
		pieces[22].xposition=0;
		pieces[22].yposition=0;
		pieces[22].mypic=getImage(getCodeBase(),"wp.gif");
		pieces[22].visible=true;
		pieces[22].color="white";
		pieces[22].name="Pawn";

		pieces[23].row=7;
		pieces[23].column=8;
		pieces[23].xposition=0;
		pieces[23].yposition=0;
		pieces[23].mypic=getImage(getCodeBase(),"wp.gif");
		pieces[23].visible=true;
		pieces[23].color="white";
		pieces[23].name="Pawn";
		 //This 3uts pieces in their original settings in the class

		 //pieces[0].row=1;
		 //pieces[0].column=1;
		 //pieces[0].mypic=getImage(getCodeBase(),"br.gif");
		 //pieces[0].visible=true;
		 //pieces[0].color="black";
		 //pieces[0].name="rook";
		 //**********************


		 //int row;
		 //int column;
		 //Image mypic;
		 //boolean visible;
		 //String color;
		 //String name;
		 //*************************************
        //mypic = getImage(getCodeBase(),"br.gif");
        /*
        mypic2 = getImage(getCodeBase(),"bn.gif");
        mypic3 = getImage(getCodeBase(),"bb.gif");
        mypic4 = getImage(getCodeBase(),"bq.gif");
        mypic5 = getImage(getCodeBase(),"bk.gif");
        mypic6 = getImage(getCodeBase(),"bb.gif");
        mypic7 = getImage(getCodeBase(),"bn.gif");
        mypic8 = getImage(getCodeBase(),"br.gif");
        mypic9 = getImage(getCodeBase(),"bp.gif");
        mypicwr = getImage(getCodeBase(),"wr.gif");
        mypicwn = getImage(getCodeBase(),"wn.gif");
        mypicwb = getImage(getCodeBase(),"wb.gif");
        mypicwk = getImage(getCodeBase(),"wk.gif");
        mypicwq = getImage(getCodeBase(),"wq.gif");
        mypicwp = getImage(getCodeBase(),"wp.gif");
        */
        addMouseListener(new MousePressListener());
         addMouseMotionListener(this);
	 }

	public int rowToX(int r)
	{
		int myx;
		int iHeight = getHeight();
		myx=r*iHeight/8 - 50;
		return myx;
	}
	public int colToY(int c)
	{
		int myy;
		int iWidth = getWidth();
		myy = c*iWidth/8 - 50;
		return myy;
	}
    public void paint(Graphics g)
 {
   setSize(400,400);
   //int iWidth = mypic.getWidth(this);
   //int iHeight = mypic.getHeight(this);
   int iWidth = getWidth();
   int iHeight = getHeight();
   for (int i=0; i<8; i=i+2)
   {
     for (int j=0; j<8; j=j+2)
     {
	   System.out.println(j*iWidth+ " ");
       g.setColor(Color.red);
       g.fillRect(j*iWidth/8,(1+i)*iWidth/8,iWidth/8,iHeight/8);
       g.fillRect((1+j)*iWidth/8,i*iWidth/8,iWidth/8,iHeight/8);
     }
   }
   //int xPos = 10;
   //25%
   for (int i = 0; i < 32; i++)
   {
	   pieces[i].xposition=rowToX(pieces[i].column);
	   pieces[i].yposition=colToY(pieces[i].row);
	   g.drawImage(pieces[i].mypic,pieces[i].xposition,pieces[i].yposition,iWidth/8,iHeight/8,this);
   }
 }

 public void mouseMoved(MouseEvent event) { }
   public void mouseDragged(MouseEvent event) {
     int x = event.getX();
     int y = event.getY();

       oldx=x;
       oldy=y;
       //repaint();
     }


   class MousePressListener extends MouseAdapter
   {
     public void mousePressed(MouseEvent event)
     {
       int x = event.getX();
       int y = event.getY();
       //System.out.println("x="+x+" y="+ y);
       numclicks = (numclicks+1) % 2;
       BoardID(x, y);

       repaint();
   }


       public void BoardID(int x, int y)
       {
		   //ChessBoard[1][1] = 1;
		   if(y > 0 && y <= 50)
		   {
		   if(x > 0 && x<= 50)
		   {
			   System.out.println("you clicked [0][0]");
			   //System.out.println("numclicks = " + numclicks);
		   }
		   if(x > 50 && x <= 100)
		   {
		   	   System.out.println("you clicked [0][1]");
		   	   //System.out.println("numclicks = " + numclicks);
		   }
	   }
		   if(y > 50 && y <= 100)
		   {
			   if(x > 0 && x <= 50)
			   {
				   System.out.println("You clicked [1][0]");
				   //System.out.println("numclicks = " + numclicks);
			   }
		   }

		   if(y > 100 && y <= 150)
		   {
			   if(x > 0 && x <= 50)
			   {
				   System.out.println("You clicked [2][0]");
				   //System.out.println("numclicks = " + numclicks);
			   }
		   }

		   if(y > 150 && y <= 200)
		   {
			   if(x > 0 && x <= 50)
			   {
				   System.out.println("You clicked [3][0]");
				   //System.out.println("numclicks = " + numclicks);
			   }
		   }
	   }

 }
}