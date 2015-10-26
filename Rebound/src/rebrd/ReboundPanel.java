package rebrd;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Random;

public class ReboundPanel extends Creature {

	private final Toolkit t = getToolkit();
	private final Dimension s = t.getScreenSize();

	private static final long serialVersionUID = 1L;
	private Timer timer;

	public ReboundPanel() {

		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		setBackground(Color.cyan);

		label = new JLabel("Creature has been caught: " + count);
		add(label);

		CreatureListener listener = new CreatureListener();

		addMouseListener(listener);
		addMouseMotionListener(listener);
	}

	public void paintComponent(Graphics page) {
		super.paintComponent(page);
		image.paintIcon(this, page, numX, numY);
	}

	public class CreatureListener implements ActionListener, MouseListener,
			MouseMotionListener {

		public void actionPerformed(ActionEvent event) {

			random();
			repaint();
		}

		public void mouseMoved(MouseEvent event) {

			buttonX = event.getX();
			buttonY = event.getY();
		}

		public void mousePressed(MouseEvent event) {

		}

		public void mouseClicked(MouseEvent event) {

			creatureClick();

		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseDragged(MouseEvent arg0) {
			// TODO Auto-generated method stub

		}

	}

}

