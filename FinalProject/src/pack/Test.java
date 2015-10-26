package pack;



	import java.awt.Dimension;
	import java.awt.Toolkit;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import java.awt.event.MouseEvent;
	import java.awt.event.MouseListener;
	import java.awt.event.MouseMotionListener;
	import java.util.Random;

	import javax.swing.ImageIcon;
	import javax.swing.JLabel;
	import javax.swing.JPanel;
	import javax.swing.Timer;

	
	public class Test extends JPanel {

		private static final long serialVersionUID = 1L;
		
		
		private Timer timer;
		public final int WIDTH = 800, HEIGHT = 800;
		public final int DELAY = 2000, IMAGE_SIZE = 150;
		public int numX, numY;
		public int count;
		public JLabel label;
		int buttonX;
		int buttonY;
		
		protected ImageIcon image;
		//-----------------------------------------------------------------
		// constructor
		//-----------------------------------------------------------------
		public Test() {
			image = new ImageIcon("bm.png");
		}
		//-----------------------------------------------------------------
		// Random creature movement
		//-----------------------------------------------------------------
		public void random() {
			Random randLocal = new Random();
			numX = randLocal.nextInt(WIDTH);
			numY = randLocal.nextInt(HEIGHT);
			//repaint();

		}
		//-----------------------------------------------------------------
		// Scores the creature when clicked
		//-----------------------------------------------------------------
		public void creatureClick() {
			if ((buttonX >= numX) && (buttonX <= numX + IMAGE_SIZE)
					&& (buttonY >= numY && buttonY <= numY + IMAGE_SIZE)) {
				System.out.println("hi");
				random();
				count++;
				label.setText("Creature has been caught: " + count + " times.");
				repaint();
			}
		}

	}


