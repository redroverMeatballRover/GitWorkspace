package pack;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class TicTacToeView extends JPanel
{
	private TicTacToeModel model;
	
	public TicTacToeView(TicTacToeModel model)
	{
		this.model = model;
		this.addMouseListener(new TicTacToeController(this, model));
	}
	
	@Override
	public void paintComponent(Graphics g)
	{
		// draw the board background color
		g.setColor(Color.white);
		g.fillRect(0, 0, getWidth(), getHeight());
		
		int thirdWidth = getWidth() / 3;
		int thirdHeight = getHeight() / 3;
		
		// draw the grid lines on the board
		g.setColor(Color.black);
		g.drawLine(thirdWidth, 0, thirdWidth, getHeight());
		g.drawLine(2 * thirdWidth, 0, 2 * thirdWidth, getHeight());
		g.drawLine(0,  thirdHeight, getWidth(), thirdHeight);
		g.drawLine(0,  2 * thirdHeight, getWidth(), 2 * thirdHeight);
		
		// draw X's and O's on the board
		for(int i = 0; i < TicTacToeModel.BOARD_SIZE; i++)
		{
			for(int j = 0; j < TicTacToeModel.BOARD_SIZE; j++)
			{
				if(model.getPieces()[i][j] != null)
				{
					if(model.getPieces()[i][j] == TicTacToeModel.TicTacToePiece.X)
					{
						g.drawLine(thirdWidth * i, thirdHeight * j,
							thirdWidth * (i + 1), thirdHeight * (j + 1));
						g.drawLine(thirdWidth * (i + 1), thirdHeight * j,
								thirdWidth * i, thirdHeight * (j + 1));
					}
					else if(model.getPieces()[i][j] == TicTacToeModel.TicTacToePiece.O)
					{
						g.drawArc(thirdWidth * i, thirdHeight * j,
								thirdWidth, thirdHeight, 0, 360);
					}
				}
			}
		}
	}
}
