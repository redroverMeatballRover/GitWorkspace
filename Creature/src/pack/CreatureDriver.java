package pack;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class CreatureDriver
{
//-----------------------------------------------------------------
//  Displays the main frame of the program.
//-----------------------------------------------------------------
public static void main (String[] args)
{
  JFrame frame = new JFrame ("Creature");
  frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

  
  CreaturePanel panel = new CreaturePanel();
  frame.getContentPane().add(panel);
  
  frame.pack();
  frame.setVisible(true);
}
}
