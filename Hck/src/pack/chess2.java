package pack;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.*;
import java.applet.*;

public class chess2 extends java.applet.Applet
{
	Image mypic;

    public void init()
     {
        mypic = getImage(getCodeBase(),
         //"images/world.jpg");
         "bb.gif");
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
       g.fillRect(j*iWidth/8,i*iWidth/8,iWidth/8,iHeight/8);
       g.fillRect((1+j)*iWidth/8,(1+i)*iWidth/8,iWidth/8,iHeight/8);
       //g.setColor(Color.white);
       //g.fillRect(((j+1)*iWidth),0,iWidth/8,iHeight/8);
     }
   }
   //int xPos = 10;
   //25%
   g.drawImage(mypic, 0, 0, iWidth/8, iHeight/8, this);
   //100%
   //xPos += (iWidth/4) +10;
   //screen.drawImage(mypic, xPos, 10, this);
 }
}
