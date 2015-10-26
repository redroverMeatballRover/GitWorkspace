package GUIQuotes;

//********************************************************************
//QuoteOptionsPanel.java       Java Foundations
//
//Demonstrates the use of radio buttons.
//********************************************************************

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class QuotesPanel extends JPanel
{
private JLabel quizQuestion;
private JRadioButton Question1, Question2, Question3;
private String comedyQuote, philosophyQuote, carpentryQuote;

//-----------------------------------------------------------------
//  Sets up a panel with a label and a set of radio buttons
//  that control its text.
//-----------------------------------------------------------------
public QuotesPanel()
{
  comedyQuote = "1 + 1 + 1 = ";
  philosophyQuote = "2 + 2 = ";
  carpentryQuote = "3 + 3 = ";

  quizQuestion = new JLabel (comedyQuote);
  quizQuestion.setFont (new Font ("Helvetica", Font.BOLD, 24));

  Question1 = new JRadioButton ("3", true);
  Question1.setBackground (Color.green);
  Question2 = new JRadioButton ("4");
  Question2.setBackground (Color.green);
  Question3 = new JRadioButton ("6");
  Question3.setBackground (Color.green);

  ButtonGroup group = new ButtonGroup();
  group.add (Question1);
  group.add (Question2);
  group.add (Question3);

  QuoteListener listener = new QuoteListener();
  Question1.addActionListener (listener);
  Question2.addActionListener (listener);
  Question3.addActionListener (listener);

  add (quizQuestion);
  add (Question1);
  add (Question2);
  add (Question3);

  setBackground (Color.green);
  setPreferredSize (new Dimension(300, 100));
}

//*****************************************************************
//  Represents the listener for all radio buttons
//*****************************************************************
private class QuoteListener implements ActionListener
{
  //--------------------------------------------------------------
  //  Sets the text of the label depending on which radio
  //  button was pressed.
  //--------------------------------------------------------------
  public void actionPerformed (ActionEvent event)
  {
     Object source = event.getSource();

     if (source == Question1)
        quizQuestion.setText (comedyQuote);
     else
        if (source == Question2)
           quizQuestion.setText (philosophyQuote);
        else
           quizQuestion.setText (carpentryQuote);
  }
}
}


















//public class QuotesPanel extends JPanel
//{
//private JLabel quote;
//private JRadioButton comedy, philosophy, carpentry;
//private String comedyQuote, philosophyQuote, carpentryQuote;
//
////-----------------------------------------------------------------
////  Sets up a panel with a label and a set of radio buttons
////  that control its text.
////-----------------------------------------------------------------
//public QuotesPanel()
//{
//  comedyQuote = "Take my wife, please.";
//  philosophyQuote = "I think, therefore I am.";
//  carpentryQuote = "Measure twice. Cut once.";
//
//  quote = new JLabel (comedyQuote);
//  quote.setFont (new Font ("Helvetica", Font.BOLD, 24));
//
//  comedy = new JRadioButton ("Comedy", true);
//  comedy.setBackground (Color.green);
//  philosophy = new JRadioButton ("Philosophy");
//  philosophy.setBackground (Color.green);
//  carpentry = new JRadioButton ("Carpentry");
//  carpentry.setBackground (Color.green);
//
//  ButtonGroup group = new ButtonGroup();
//  group.add (comedy);
//  group.add (philosophy);
//  group.add (carpentry);
//
//  QuoteListener listener = new QuoteListener();
//  comedy.addActionListener (listener);
//  philosophy.addActionListener (listener);
//  carpentry.addActionListener (listener);
//
//  add (quote);
//  add (comedy);
//  add (philosophy);
//  add (carpentry);
//
//  setBackground (Color.green);
//  setPreferredSize (new Dimension(300, 100));
//}
//
////*****************************************************************
////  Represents the listener for all radio buttons
////*****************************************************************
//private class QuoteListener implements ActionListener
//{
//  //--------------------------------------------------------------
//  //  Sets the text of the label depending on which radio
//  //  button was pressed.
//  //--------------------------------------------------------------
//  public void actionPerformed (ActionEvent event)
//  {
//     Object source = event.getSource();
//
//     if (source == comedy)
//        quote.setText (comedyQuote);
//     else
//        if (source == philosophy)
//           quote.setText (philosophyQuote);
//        else
//           quote.setText (carpentryQuote);
//  }
//}