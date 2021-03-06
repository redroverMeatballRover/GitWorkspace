package NetworkingVersion;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;

public class TicTacToeController2 implements MouseListener
{
	private boolean winner = false;
	private TicTacToeView2 view;
	private TicTacToeModel2 model;
	private TicTacToeModel2.TicTacToePiece turn = TicTacToeModel2.TicTacToePiece.X; 
	
	public TicTacToeController2(TicTacToeView2 view, TicTacToeModel2 model)
	{
		this.view = view;
		this.model = model;
	}
	
	@Override
	public void mouseClicked(MouseEvent e)
	{
		int cellWidth = view.getWidth() / TicTacToeModel2.BOARD_SIZE;
		int cellHeight = view.getHeight() / TicTacToeModel2.BOARD_SIZE;
		
		// goal is to translate a clicked position to
		// a simplified x,y coordinate in the form of
		// (0, 0) or (0, 1)
		int x = e.getX() / cellWidth;
		int y = e.getY() / cellHeight;
		model.placePiece(turn, x, y);
		view.repaint();
		
		// check for winner
		winner = model.checkForWinner(turn);
		if(winner)
		{
			JOptionPane.showMessageDialog(view, turn + "'s WIN!",
					"Game Over", JOptionPane.INFORMATION_MESSAGE);
			model.resetGame();
			view.repaint();
		}
		// change turns
		else if(turn == TicTacToeModel2.TicTacToePiece.X)
		{
			turn = TicTacToeModel2.TicTacToePiece.O;
		}
		else
		{
			turn = TicTacToeModel2.TicTacToePiece.X;
		}
	}

	@Override
	public void mouseEntered(MouseEvent e)
	{
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseExited(MouseEvent e)
	{
		// TODO Auto-generated method stub
	}

	@Override
	public void mousePressed(MouseEvent e)
	{
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseReleased(MouseEvent e)
	{
		// TODO Auto-generated method stub
	}
	
}
