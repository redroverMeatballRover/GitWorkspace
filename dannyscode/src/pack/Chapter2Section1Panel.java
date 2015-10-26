package pack;

import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 * @author dmaldonado
 *
 */
public class Chapter2Section1Panel extends JPanel 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTextArea area;

	public Chapter2Section1Panel()
	{
		setPreferredSize(new Dimension(1000,1000));
		area = new JTextArea("Chapter 2 Section 1");
		area.setEditable(false);
		add(area);
	}
}
