package RecentEditedCopy;


import javax.swing.SwingUtilities;

//REFORMAT//-----------------------------------------------------------------------//
public class Game {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				GUIRunner run = new GUIRunner();
				run.setVisible();
			}
		});
	}
}
