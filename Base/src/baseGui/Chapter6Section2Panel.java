/**
 * 
 */
package baseGui;

import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 * @author dmaldonado
 *
 */
public class Chapter6Section2Panel extends JPanel 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTextArea area;

	public Chapter6Section2Panel()
	{
		setPreferredSize(new Dimension(1000,1000));
		area = new JTextArea("Chapter 6 Section 2");
		area.setEditable(false);
		add(area);
	}
}