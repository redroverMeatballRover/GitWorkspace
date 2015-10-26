package mod8InteractiveChess;


import javax.swing.SwingUtilities;

public class Driver {
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {	
			public void run() {
				RunGUI run = new RunGUI();
				run.setVisible();
			}
		});
	}
}
