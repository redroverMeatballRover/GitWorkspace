package pack;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Random;
import javax.swing.Timer;

/**
 * 
 * @author cschaffer
 *
 */

//-----------------------------------------------------------------
//This creates the CreaturePanel
//-----------------------------------------------------------------

public class CreaturePanel extends Creature {

	private static final long serialVersionUID = 1L;
	private final Toolkit t = getToolkit();
	private final Dimension s = t.getScreenSize();
	private Timer timer;
	
	
//-----------------------------------------------------------------
//  Constructor
//-----------------------------------------------------------------
	public CreaturePanel() {

		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		setBackground(Color.cyan);

		label = new JLabel("Creature has been caught: " + count);
		add(label);

		CreatureListener listener = new CreatureListener();

		addMouseListener(listener);
		addMouseMotionListener(listener);
	}
//-----------------------------------------------------------------
//  This controls the graphics of the image.
//-----------------------------------------------------------------
	public void paintComponent(Graphics page) {
		super.paintComponent(page);
		image.paintIcon(this, page, numX, numY);
	}

//-----------------------------------------------------------------
// Listens for the ActionListener, MouseListener,MouseMotionListener
//-----------------------------------------------------------------
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

