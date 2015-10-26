package pack;
 
import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;              //for layout managers and more
import java.awt.event.*;        //for action events
import java.io.IOException;
 
public class TextSampler extends JPanel implements ActionListener {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String newline = "\n";
    protected static final String textFieldString = "JTextField";
    protected static final String ftfString = "JFormattedTextField";
 
 
    protected JLabel actionLabel;
 
    public TextSampler() {
        setLayout(new BorderLayout());
        JTextField textField = new JTextField(10);
        JLabel textFieldLabel = new JLabel(textFieldString + ": ");
        textFieldLabel.setLabelFor(textField);

        //Create a label to put messages during an action event.
      //  actionLabel = new JLabel("Type text in a field and press Enter.");
        actionLabel.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
        //Lay out the text controls and the labels.
        JPanel textControlsPane = new JPanel();
        //Create a text area.
        JTextArea textArea = new JTextArea(
                "Welcome to Chapter 6. " +
                "In this chapter, we study GUI's. " +
                "which means that although it can display text " +
                "in any font, all of the text is in the same font.");

        JScrollPane areaScrollPane = new JScrollPane(textArea);
        areaScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        areaScrollPane.setPreferredSize(new Dimension(500, 500));
        areaScrollPane.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createCompoundBorder(
                                BorderFactory.createTitledBorder("Plain Text"),
                                BorderFactory.createEmptyBorder(5,5,5,5)),
                areaScrollPane.getBorder()));
 
      
        JPanel leftPane = new JPanel(new BorderLayout());
        leftPane.add(textControlsPane, 
                     BorderLayout.PAGE_START);
        leftPane.add(areaScrollPane,BorderLayout.CENTER);
 
        add(leftPane, BorderLayout.LINE_START);
        add(leftPane, BorderLayout.LINE_END);
   
    
    
    
    
    }
  
  
    
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event dispatch thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("TextSamplerDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        //Add content to the window.
        frame.add(new TextSampler());
 
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
 
    public static void main(String[] args) {
        //Schedule a job for the event dispatching thread:
        //creating and showing this application's GUI.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                 //Turn off metal's use of bold fonts
        UIManager.put("swing.boldMetal", Boolean.TRUE);
        createAndShowGUI();
            }
        });
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}































//
//public class TextSampler extends JPanel implements ActionListener {
//    /**
//	 * 
//	 */
//	private static final long serialVersionUID = 1L;
//	private String newline = "\n";
//    protected static final String textFieldString = "JTextField";
//    protected static final String ftfString = "JFormattedTextField";
// 
// 
//    protected JLabel actionLabel;
// 
//    public TextSampler() {
//        setLayout(new BorderLayout());
//        JTextField textField = new JTextField(10);
//        JLabel textFieldLabel = new JLabel(textFieldString + ": ");
//        textFieldLabel.setLabelFor(textField);
//
//        //Create a label to put messages during an action event.
//        actionLabel = new JLabel("Type text in a field and press Enter.");
//        actionLabel.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
//        //Lay out the text controls and the labels.
//        JPanel textControlsPane = new JPanel();
//        //Create a text area.
//        JTextArea textArea = new JTextArea(
//                "Welcome to Chapter 6. " +
//                "In this chapter, we study GUI's. " +
//                "which means that although it can display text " +
//                "in any font, all of the text is in the same font.");
//
//        JScrollPane areaScrollPane = new JScrollPane(textArea);
//        areaScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
//        areaScrollPane.setPreferredSize(new Dimension(500, 500));
//        areaScrollPane.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createCompoundBorder(
//                                BorderFactory.createTitledBorder("Plain Text"),
//                                BorderFactory.createEmptyBorder(5,5,5,5)),
//                areaScrollPane.getBorder()));
// 
//      
//        JPanel leftPane = new JPanel(new BorderLayout());
//        leftPane.add(textControlsPane, 
//                     BorderLayout.PAGE_START);
//        leftPane.add(areaScrollPane,
//                     BorderLayout.CENTER);
// 
//        add(leftPane, BorderLayout.LINE_START);
//        add(leftPane, BorderLayout.LINE_END);
//   
//    
//    
//    
//    
//    }
//  
//  
//    
//    /**
//     * Create the GUI and show it.  For thread safety,
//     * this method should be invoked from the
//     * event dispatch thread.
//     */
//    private static void createAndShowGUI() {
//        //Create and set up the window.
//        JFrame frame = new JFrame("TextSamplerDemo");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// 
//        //Add content to the window.
//        frame.add(new TextSampler());
// 
//        //Display the window.
//        frame.pack();
//        frame.setVisible(true);
//    }
// 
//    public static void main(String[] args) {
//        //Schedule a job for the event dispatching thread:
//        //creating and showing this application's GUI.
//        SwingUtilities.invokeLater(new Runnable() {
//            public void run() {
//                 //Turn off metal's use of bold fonts
//        UIManager.put("swing.boldMetal", Boolean.TRUE);
//        createAndShowGUI();
//            }
//        });
//    }
//
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		// TODO Auto-generated method stub
//		
//	}
//}
