package pack;

import javax.swing.JFrame;

public class QuizDriver {
	
	public static void main(String[] args) {
	
		JFrame frame = new JFrame("Style Options");
		
		frame.getContentPane().add(new Quiz());
	
		frame.pack();
		frame.setVisible(true);
	}
}


















//
//
//import javax.swing.JFrame;
//
//public class QuizDriver {
//	
//	public static void main(String[] args) {
//	
//		JFrame frame = new JFrame("Style Options");
//		
//		frame.getContentPane().add(new Quiz());
//	
//		frame.pack();
//		frame.setVisible(true);
//		
//		
//	}
//}
