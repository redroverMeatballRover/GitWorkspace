package CheckBoxes;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class StyleOptions {
	
	public static void main(String[] args) {
		
	
		
		JFrame frame = new JFrame("Style Options");
		
		frame.getContentPane().add(new StyleOptionsPanel());
	
		frame.pack();
		frame.setVisible(true);
	}
}