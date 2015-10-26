package pack;

import javax.swing.JFrame;

public class TicTacToeMain
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
		
		TicTacToeModel model = new TicTacToeModel();
		TicTacToeView view = new TicTacToeView(model);
		frame.add(view);
	}
}
