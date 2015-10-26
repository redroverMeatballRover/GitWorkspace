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
public class Chapter3Section4Panel extends JPanel 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTextArea area;

	public Chapter3Section4Panel()
	{
		setPreferredSize(new Dimension(1000,1000));
		area = new JTextArea("Chapter 3 Section 4");
		area.setEditable(false);
		add(area);
	}
}
