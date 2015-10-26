package pack;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.*;
import java.util.Calendar;
import java.text.SimpleDateFormat;

class Spacing1 {

	private JPanel welcomePanel;

	Spacing1() {
		welcomeTab();
		welcomePanel.setBorder(new TitledBorder("The Welcome Panel"));
		JOptionPane.showMessageDialog(null, welcomePanel);

	}

	private void welcomeTab() {
		welcomePanel = new JPanel(new GridLayout(0, 1, 1, 10));
		// String currentTime = SimpleDateFormat.getInstance().format(
		// Calendar.getInstance().getTime());
		final JLabel welcomeLabel = new JLabel("Welcome!", JLabel.CENTER);
		// final JLabel dateLabel = new JLabel ("Today's date is: " +
		// currentTime, JLabel.CENTER);
		welcomePanel.add(welcomeLabel);
		// welcomePanel.add(dateLabel);

		// one (kludgy) way to addd space.
		welcomePanel.add(new JLabel(""));
		welcomePanel.add(new JLabel(""));

		welcomePanel.add(createExitButton());

	}

	private JComponent createExitButton() {
		JButton exit = new JButton("Exit");
		// the FlowLayout is to center the JButton;
		JPanel exitPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		exitPanel.add(exit);
		return exitPanel;
	}

	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() 
		{
			public void run() 
			{
				Spacing1 wl = new Spacing1();
			}
		});
		
	}
}


































//import java.awt.*;
//import javax.swing.*;
//import javax.swing.border.*;
//import java.util.Calendar;
//import java.text.SimpleDateFormat;
//
//class Spacing1 {
//
//  private JPanel welcomePanel;
//
//  Spacing1() {
//      welcomeTab();
//      welcomePanel.setBorder(new TitledBorder("The Welcome Panel"));
//      JOptionPane.showMessageDialog(null, welcomePanel);
//  }
//
//  private void welcomeTab() {
//      welcomePanel = new JPanel(new GridLayout(0,1,1,1));
//      String currentTime = SimpleDateFormat.getInstance().format(
//      Calendar.getInstance().getTime());
//      final JLabel welcomeLabel = new JLabel("Welcome!", JLabel.CENTER);
//      final JLabel dateLabel = new JLabel ("Today's date is: " + currentTime, JLabel.CENTER);
//      welcomePanel.add(welcomeLabel);
//      welcomePanel.add(dateLabel);
//
//      // one (kludgy) way to addd space.
//      welcomePanel.add(new JLabel(""));
//      welcomePanel.add(new JLabel(""));
//
//      welcomePanel.add( createExitButton() );
//  }
//
//  private JComponent createExitButton() {
//      JButton exit = new JButton("Exit");
//      // the FlowLayout is to center the JButton;
//      JPanel exitPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
//      exitPanel.add(exit);
//      return exitPanel;
//  }
//
//  public static void main(String[] args) {
//      SwingUtilities.invokeLater(new Runnable() {
//          public void run() {
//              Spacing1 wl = new Spacing1();
//          }
//      });
//  }
//}
