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

public class Startup extends JPanel {

	public static void main(String[] args) {
		rockpapersissors();
	}

	public static void rockpapersissors() {

		Random rand = new Random();
		final int weapon;
		weapon = rand.nextInt(3) + 1;

		JFrame frame = new JFrame("Rock Paper Sissors Game");
		frame.setSize(740, 580);
		frame.setVisible(true);

		final JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(Color.black, 10));

		JButton rock = new JButton("Rock");
		JButton paper = new JButton("Paper");
		JButton sissors = new JButton("Sissors");

		JLabel l = new JLabel("Make a guess");
		final JLabel resultLabel = new JLabel("---");
		panel.add(l);
		panel.add(rock);
		panel.add(paper);
		panel.add(sissors);
		panel.add(resultLabel);

		// choice---------------------------------------//

		rock.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (weapon == 1) {
					// System.out.println("Computer chose rock -- Its a draw!");
					resultLabel.setText("Computer chose rock--its a draw!");
				}

				else if (weapon == 2) {
					// System.out.println("Computer chose paper -- you lose!");
					resultLabel.setText("Computer chose sissors--YOU WIN !");
				}

				else if (weapon == 3) {
					// System.out.println("you win!");
					resultLabel.setText("Computer chose paper--YOU LOSE!");
				}
			}
		});

		sissors.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (weapon == 1) {
					// System.out.println("Computer chose rock -- Its a draw!");
					resultLabel.setText("Computer chose rock--YOU LOSE!");
				}

				else if (weapon == 2) {
					// System.out.println("Computer chose paper -- you lose!");
					resultLabel.setText("Computer chose sissors--ITS A DRAW !");
				}

				else if (weapon == 3) {
					// System.out.println("you win!");
					resultLabel.setText("Computer chose paper--YOU WIN!");
				}
			}
		});

		paper.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (weapon == 1) {
					// System.out.println("Computer chose rock -- Its a draw!");
					resultLabel.setText("Computer chose rock--YOU WIN!");
				}

				else if (weapon == 2) {
					// System.out.println("Computer chose paper -- you lose!");
					resultLabel.setText("Computer chose sissors--YOU LOSE !");
				}

				else if (weapon == 3) {
					// System.out.println("you win!");
					resultLabel.setText("Computer chose paper--ITS A DRAW!");
				}
			}
		});
		frame.add(panel);
		frame.revalidate();
	}

}
