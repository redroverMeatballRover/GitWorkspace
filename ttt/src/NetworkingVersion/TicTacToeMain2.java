package NetworkingVersion;

import javax.swing.JFrame;

public class TicTacToeMain2
{
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Tic-Tac-Toe");
		frame.setSize(500, 500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		
		TicTacToeModel2 model = new TicTacToeModel2();
		TicTacToeView2 view = new TicTacToeView2(model);
		frame.add(view);
	}
}
