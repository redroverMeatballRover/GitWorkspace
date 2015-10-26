package stpwtch;

public class StopWatch {
	 
	/*
	 * This is the main class. It creates a new StopWatchGUI object and calls
	 * the createGUI method.
	 */
	public static void main(String[] args) {
 
		StopWatchPanel sw = new StopWatchPanel();
		sw.createGui();
	}
}


//
//import javax.swing.JFrame;
//
//public class StopWatch {
//
//	public static void main(String[] args) {
//		
//		JFrame frame = new JFrame("Java Stopwatch");
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//		StopWatchPanel panel = new StopWatchPanel();
//		frame.getContentPane().add(panel);
//
//		frame.pack();
//		frame.setVisible(true);
//
//	}
//
//}

//********************************************************************
//LeftRight.java       Java Foundations
//
//Demonstrates the use of one listener for multiple buttons.
//********************************************************************

//import javax.swing.JFrame;
//
//public class StopWatch
//{
////-----------------------------------------------------------------
////  Creates and displays the main program frame.
////-----------------------------------------------------------------
//public static void main (String[] args)
//{
//  JFrame frame = new JFrame ("Left Right");
//  frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
//
//  frame.getContentPane().add(new StopWatchPanel());
//
//  frame.pack();
//  frame.setVisible(true);
//}
//}
