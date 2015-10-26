package defaultA;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class LeftRightPanel extends JPanel {

	private JButton left, right;
	private JLabel label;
	private JPanel buttonPanel;
	int count = 0;

	public LeftRightPanel() {
		left = new JButton("Incriment");
		right = new JButton("Decriment");

		ButtonListener listener = new ButtonListener();
		left.addActionListener(listener);
		right.addActionListener(listener);

		label = new JLabel("Push a button");

		buttonPanel = new JPanel();
		buttonPanel.setPreferredSize(new Dimension(200, 400));
		buttonPanel.setBackground(Color.blue);
		buttonPanel.add(left);
		buttonPanel.add(right);

		setPreferredSize(new Dimension(200, 80));
		setBackground(Color.cyan);
		add(label);
		add(buttonPanel);
	}

	private class ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent event)
{
if (event.getSource()== left)
{
	count++;
	label.setText("Count: " + count);
}
else
{
	count--;
	label.setText("Count: " + count);
}	

}
	}
}
