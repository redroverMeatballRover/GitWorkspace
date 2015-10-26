package pack;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * 
 * @author cschaffer
 * 
 */

public class StartupPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel saying;
	private JButton duplicateText, eraseText, capitalizeText, lowerCaseText;
	private JTextField userEnter;
	private JLabel enterText, resultText;
	private String text;

	public StartupPanel() {

		saying = new JLabel("");
		saying.setFont(new Font("Helvetica", Font.PLAIN, 36));

		enterText = new JLabel("Enter Your Text Here");
		userEnter = new JTextField(60);
		// resultText = new JLabel("---");

		duplicateText = new JButton("Duplicate the text");
		eraseText = new JButton("Erase the text");
		capitalizeText = new JButton("Capitalize the text");
		lowerCaseText = new JButton("Lower Case the text");

		StartupListener listener = new StartupListener();

		duplicateText.addActionListener((ActionListener) listener);
		eraseText.addActionListener(listener);
		capitalizeText.addActionListener(listener);
		lowerCaseText.addActionListener(listener);
		userEnter.addActionListener(listener);

		add(saying);
		add(userEnter);
		add(enterText);
		add(duplicateText);
		add(eraseText);
		add(capitalizeText);
		add(lowerCaseText);
		// add (resultText);

		setBackground(Color.CYAN);
		setPreferredSize(new Dimension(300, 100));
	}

	private class StartupListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {

		

			String text = userEnter.getText();

			if (event.getSource() == capitalizeText) {
				text = userEnter.getText().toUpperCase();
				userEnter.setText(text);
			}

			if (event.getSource() == lowerCaseText) {
				text = userEnter.getText().toLowerCase();
				userEnter.setText(text);
			}

			if (event.getSource() == eraseText) {
				text=("");
				userEnter.setText(text);
			}

			if (event.getSource() == duplicateText) {
				text = userEnter.getText();
				saying.setText(text);
			}
			// resultText.setText((text));
		}

	}

}
