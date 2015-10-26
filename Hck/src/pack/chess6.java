package pack;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class chess6 extends java.applet.Applet implements MouseMotionListener
{
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
        mypic = getImage(getCodeBase(),"br.gif");
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
         addMouseListener(new MousePressListener());
         addMouseMotionListener(this);
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
       //g.setColor(Color.white);
       //g.fillRect(((j+1)*iWidth),0,iWidth/8,iHeight/8);
     }
   }
   //int xPos = 10;
   //25%
    g.drawImage(mypic, 0, 0, iWidth/8, iHeight/8, this);
    g.drawImage(mypic2, iWidth/8, 0, iWidth/8, iHeight/8, this);
    g.drawImage(mypic3, iWidth/8*2, 0, iWidth/8, iHeight/8, this);
    g.drawImage(mypic4, iWidth/8*3, 0, iWidth/8, iHeight/8, this);
    g.drawImage(mypic5, iWidth/8*4, 0, iWidth/8, iHeight/8, this);
    g.drawImage(mypic6, iWidth/8*5, 0, iWidth/8, iHeight/8, this);
    g.drawImage(mypic7, iWidth/8*6, 0, iWidth/8, iHeight/8, this);
    g.drawImage(mypic8, iWidth/8*7, 0, iWidth/8, iHeight/8, this);
    //******************************************
    if(numclicks == 0)
    g.drawImage(mypic9, 0, iHeight/8, iWidth/8, iHeight/8, this);
    System.out.println("numclicks = " + numclicks);
    if(numclicks == 1)
    g.drawImage(mypic9, 0, 2*iHeight/8, iWidth/8, iHeight/8, this);
    //******************************************

    g.drawImage(mypic9, iWidth/8*1, iHeight/8, iWidth/8, iHeight/8, this);
    g.drawImage(mypic9, iWidth/8*2, iHeight/8, iWidth/8, iHeight/8, this);
    g.drawImage(mypic9, iWidth/8*3, iHeight/8, iWidth/8, iHeight/8, this);
    g.drawImage(mypic9, iWidth/8*4, iHeight/8, iWidth/8, iHeight/8, this);
    g.drawImage(mypic9, iWidth/8*5, iHeight/8, iWidth/8, iHeight/8, this);
    g.drawImage(mypic9, iWidth/8*6, iHeight/8, iWidth/8, iHeight/8, this);
    g.drawImage(mypic9, iWidth/8*7, iHeight/8, iWidth/8, iHeight/8, this);

	g.drawImage(mypicwr, 0, iHeight/8*7, iWidth/8, iHeight/8, this);
	g.drawImage(mypicwn, iWidth/8*1, iHeight/8*7, iWidth/8, iHeight/8, this);
	g.drawImage(mypicwb, iWidth/8*2, iHeight/8*7, iWidth/8, iHeight/8, this);
	g.drawImage(mypicwq, iWidth/8*3, iHeight/8*7, iWidth/8, iHeight/8, this);
	g.drawImage(mypicwk, iWidth/8*4, iHeight/8*7, iWidth/8, iHeight/8, this);
	g.drawImage(mypicwb, iWidth/8*5, iHeight/8*7, iWidth/8, iHeight/8, this);
	g.drawImage(mypicwn, iWidth/8*6, iHeight/8*7, iWidth/8, iHeight/8, this);
	g.drawImage(mypicwr, iWidth/8*7, iHeight/8*7, iWidth/8, iHeight/8, this);

	g.drawImage(mypicwp, iWidth/8*7, iHeight/8*6, iWidth/8, iHeight/8, this);
	g.drawImage(mypicwp, iWidth/8*6, iHeight/8*6, iWidth/8, iHeight/8, this);
	g.drawImage(mypicwp, iWidth/8*5, iHeight/8*6, iWidth/8, iHeight/8, this);
	g.drawImage(mypicwp, iWidth/8*4, iHeight/8*6, iWidth/8, iHeight/8, this);
	g.drawImage(mypicwp, iWidth/8*3, iHeight/8*6, iWidth/8, iHeight/8, this);
	g.drawImage(mypicwp, iWidth/8*2, iHeight/8*6, iWidth/8, iHeight/8, this);
	g.drawImage(mypicwp, iWidth/8*1, iHeight/8*6, iWidth/8, iHeight/8, this);
	g.drawImage(mypicwp, 0, iHeight/8*6, iWidth/8, iHeight/8, this);

   //100%
   //xPos += (iWidth/4) +10;
   //screen.drawImage(mypic, xPos, 10, this);
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