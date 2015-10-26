package rebrd;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Rebound
{
//-----------------------------------------------------------------
//  Displays the main frame of the program.
//-----------------------------------------------------------------
public static void main (String[] args)
{
  JFrame frame = new JFrame ("Creature");
  frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

  
  ReboundPanel panel = new ReboundPanel();
  frame.getContentPane().add(panel);
  
  frame.pack();
  frame.setVisible(true);
}
}
