package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * Author Cody Schaffer
 */

/*-----------------------------------------------------
 * This class sets up the panel to listen for mouse events. 
 * We are creating variables to measure the distance the mouse 
 * travels in the panel. 
 -----------------------------------------------------*/

public class CoordinatesPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	private final int SIZE = 6; // diameter of dot

	private int x = 50, y = 50; // coordinates of mouse press
	private int x2 = 0, y2 = 0;
	static int dTotal = 0;
	static int distance = 0;
	private JLabel label;

	// -----------------------------------------------------------------
	// Constructor sets up panel to listen for mouse events.
	// the constructer sets up a mouseListener and a motionlistener
	// in order to constantly measure the mouse. 
	// -----------------------------------------------------------------
	public CoordinatesPanel() {
		label = new JLabel();
		CoordinatesListener listener = new CoordinatesListener();
		addMouseListener(listener);
		addMouseMotionListener(listener);
		add(label);
		label.setText("Total Distance = " + dTotal);

		setBackground(Color.yellow);
		setPreferredSize(new Dimension(300, 200));
	}

	// -----------------------------------------------------------------
	// Graphics area. This fills the colors and sets the size. 
	// -----------------------------------------------------------------
	public void paintComponent(Graphics page) {
		super.paintComponent(page);

		page.setColor(Color.green);

		page.fillOval(x, y, SIZE, SIZE);

		page.drawString("Coordinates: (" + x + ", " + y + ")", 5, 15);
	}

	/*--------------------------------------------------------
	 * Listener for mouse events. This checks the entry point 
	 * of the mouse, then uses the distance formula to calculate 
	 * the constantly moving mouse. 
	 --------------------------------------------------------*/
	private class CoordinatesListener implements MouseListener,
			MouseMotionListener {
		/*--------------------------------------------------------
		 * Recalculates mouse as it moves. 
		 --------------------------------------------------------*/
		public void mouseMoved(MouseEvent event) {
			x = event.getX();
			y = event.getY();

			distance = (int) Math.sqrt((Math.pow(x2, 2) - Math.pow(x, 2))
					+ (Math.pow(y2, 2) - Math.pow(y, 2)));
			dTotal = dTotal + distance;

			x2 = x;
			y2 = y;

			label.setText("Total Distance = " + dTotal);

		}
		/*--------------------------------------------------------
		 * provide empty definitions for unused event methods. 
		 --------------------------------------------------------*/
		
		public void mousePressed(MouseEvent event) {

		}

		public void mouseClicked(MouseEvent event) {
		}

		public void mouseReleased(MouseEvent event) {
		}

		public void mouseEntered(MouseEvent event) {
		}

		public void mouseExited(MouseEvent event) {
		}

		public void mouseDragged(MouseEvent event) {

		}

	}
}
