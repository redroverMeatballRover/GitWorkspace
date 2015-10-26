package pack;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.LineBorder;

public class Feint {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Random rand = new Random();
		final int secrets = rand.nextInt(100) + 1;
		
		JFrame frame = new JFrame("Window");
		frame.setSize(740, 580);
		frame.setVisible(true);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(Color.black,10));
		
		
		JSpinner spin = new JSpinner();
		final SpinnerNumberModel snm = new SpinnerNumberModel(50,1,100,1);
		spin.setModel(snm);
		panel.add(spin);
		
		
		JButton button = new JButton("Submit");
		
		button.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent arg0) {
			System.out.println("Secret number: " + secrets);
			System.out.println(snm.getNumber());
			}
	});
		
		button.addActionListener(new ActionListener())
		{
		public void actionPerformed(ActionEvent e)
		{
			if (number is to high)
			{
				//num = too high
			}
			else if(number is to low) {
				//num = too low
			}
		}
		}
		panel.add(button);
		
		JLabel l = new JLabel("Make a guess");
		panel.add(l);
		
	
		
		
		frame.add(panel);
		frame.revalidate();

	}

}
