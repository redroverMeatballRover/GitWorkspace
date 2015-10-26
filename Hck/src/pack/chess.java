package pack;

import java.awt.Graphics;
import java.awt.*;
import java.applet.*;

public class chess extends java.applet.Applet
{
	Image mypic;

    public void init()
     {
	 }
    public void paint(Graphics g)
 {
   setSize(400,400);
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
     }
   }

 }
}
