package NetworkingVersion;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class TicTacToeView2 extends JPanel
{
	private TicTacToeModel2 model;
	
	public TicTacToeView2(TicTacToeModel2 model)
	{
		this.model = model;
		this.addMouseListener(new TicTacToeController2(this, model));
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
		for(int i = 0; i < TicTacToeModel2.BOARD_SIZE; i++)
		{
			for(int j = 0; j < TicTacToeModel2.BOARD_SIZE; j++)
			{
				if(model.getPieces()[i][j] != null)
				{
					if(model.getPieces()[i][j] == TicTacToeModel2.TicTacToePiece.X)
					{
						g.drawLine(thirdWidth * i, thirdHeight * j,
							thirdWidth * (i + 1), thirdHeight * (j + 1));
						g.drawLine(thirdWidth * (i + 1), thirdHeight * j,
								thirdWidth * i, thirdHeight * (j + 1));
					}
					else if(model.getPieces()[i][j] == TicTacToeModel2.TicTacToePiece.O)
					{
						g.drawArc(thirdWidth * i, thirdHeight * j,
								thirdWidth, thirdHeight, 0, 360);
					}
				}
			}
		}
	}
}
