package pack;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class chess3 extends java.applet.Applet implements MouseMotionListener
{
	Image mypic;
	Image mypic2;
	Image [] piecesBK= new Image [16] ;
	int oldx;
	int oldy;

    public void init()
     {
        mypic = getImage(getCodeBase(),"br.gif");
        mypic2 = getImage(getCodeBase(),"bn.gif");
        piecesBK[2]=getImage(getCodeBase(),"bb.gif");

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
       g.fillRect((1+j)*iWidth/8,i*iWidth/8,iWidth/8,iHeight/8);
       g.fillRect(j*iWidth/8,(1+i)*iWidth/8,iWidth/8,iHeight/8);

       //g.setColor(Color.white);
       //g.fillRect(((j+1)*iWidth),0,iWidth/8,iHeight/8);
     }
   }
   //int xPos = 10;
   //25%
   g.drawImage(mypic, 0, 0, iWidth/8, iHeight/8, this);
   g.drawImage(mypic2, iWidth/8, 0, iWidth/8, iHeight/8, this);
   g.drawImage(piecesBK[2], 2*(iWidth/8), 0, iWidth/8, iHeight/8, this);
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
       repaint();
     }
   }

//   class MousePressListener extends MouseAdapter {
//     public void mousePressed(MouseEvent event) {
//       int x = event.getX();
//       int y = event.getY();
//       System.out.println("x="+x+" y="+ y);
//
//       }
//     }



