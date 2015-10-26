package FinalPack;

import java.awt.BorderLayout;
import java.awt.Color;
 
import javax.swing.*;
 
 
 
public class Matthew extends JFrame
{
                private static JTabbedPane study;
                private static JPanel main;
                private static JPanel home, review, chapter6, chapter7, chapter8, chapter9, chapter10, chapter11;
                private static JTextArea textArea;
               
                public Matthew()
                {
                                study = new JTabbedPane();
                                main = new JPanel();
                                setSize(800,800);
                                main.setBackground(Color.gray);
                                study.setForeground(Color.blue);
                               
                                main.setLayout(new BorderLayout());
                                getContentPane().add(main);
                               
                                createPages();
                               
                                study= new JTabbedPane();
                                study.addTab("Home", home);
                                study.addTab("Review", review);
                                study.addTab("Chapter 6", chapter6);
                                study.addTab("Chapter 7", chapter7);
                                study.addTab("Chapter 8", chapter8);
                                study.addTab("Chapter 9", chapter9);
                                study.addTab("Chapter 10", chapter10);
                                study.addTab("Chapter 11", chapter11);
                                main.add(study, BorderLayout.CENTER);
                                add(main);
                                setVisible(true);
                               
                }
               
                public static void createPages()
                {
                                home();
                                review();
                                chapter6();
                                chapter7();
                                chapter8();
                                chapter9();
                                chapter10();
                                chapter11();
                }
               
                public static void home()
                {
                                home = new JPanel();
                                textArea = new JTextArea("Text and stuff", 70, 70);
                                textArea.setBounds(0, 0, 600, 600);
                                textArea.setEditable(false);
                                home.add(textArea);
                }
               
                public static void review()
                {
                                review = new JPanel();
                                textArea = new JTextArea("Review and stuff AFADSF Review and stuff AFADSF Review and stuff AFADSFReview and stuff AFADSFReview and stuff AFADSFReview and stuff AFADSFReview and stuff AFADSFReview and stuff AFADSFReview and stuff AFADSFReview and stuff AFADSF", 70, 70);
                                textArea.setBounds(0, 0, 600, 600);
                                textArea.setEditable(false);
                                review.add(textArea);
                }
               
                public static void chapter6()
                {
                                chapter6 = new JPanel();
                                textArea = new JTextArea("Chapter 6 and stuff", 70, 70);
                                textArea.setBounds(0, 0, 600, 600);
                                textArea.setEditable(false);
                                chapter6.add(textArea);
                }
               
                public static void chapter7()
                {
                                chapter7 = new JPanel();
                                textArea = new JTextArea("Chapter 7 and stuff", 70, 70);
                                textArea.setBounds(0, 0, 600, 600);
                                textArea.setEditable(false);
                                chapter7.add(textArea);
                }
               
                public static void chapter8()
                {
                                chapter8 = new JPanel();
                                textArea = new JTextArea("Chapter 8 and stuff", 70, 70);
                                textArea.setBounds(0, 0, 600, 600);
                                textArea.setEditable(false);
                                chapter8.add(textArea);
                }
               
                public static void chapter9()
                {
                                chapter9 = new JPanel();
                                textArea = new JTextArea("Chapter 9 and stuff", 70, 70);
                                textArea.setBounds(0, 0, 600, 600);
                                textArea.setEditable(false);
                                chapter9.add(textArea);
                }
               
                public static void chapter10()
                {
                                chapter10 = new JPanel();
                                textArea = new JTextArea("Chapter 10 and stuff", 70, 70);
                                textArea.setBounds(0, 0, 600, 600);
                                textArea.setEditable(false);
                                chapter10.add(textArea);
                }
               
                public static void chapter11()
                {
                                chapter11 = new JPanel();
                                textArea = new JTextArea("Chapter 11 and stuff", 70, 70);
                                textArea.setBounds(0, 0, 600, 600);
                                textArea.setEditable(false);
                                chapter11.add(textArea);
                }
               
                public static void main(String[]args)
                {
                                Matthew one = new Matthew();
                }
}
