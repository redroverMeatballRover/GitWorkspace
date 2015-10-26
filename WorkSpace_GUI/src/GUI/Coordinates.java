package GUI;

import javax.swing.JFrame;
/**
 * Author Cody Schaffer
 */
public class Coordinates
{
//-----------------------------------------------------------------
//  Creates and displays the GUI in which we measure the distance 
//  of how far the mouse travels. 
//-----------------------------------------------------------------
public static void main (String[] args)
{
  JFrame frame = new JFrame ("Coordinates");
  frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

  frame.getContentPane().add (new CoordinatesPanel());

  frame.pack();
  frame.setVisible(true);
}
}
