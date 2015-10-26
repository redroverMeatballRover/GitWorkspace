package pack2;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Squared extends JFrame implements MouseListener
{
	
	private ImageIcon rookBlack = new ImageIcon("rd.png");
	private ImageIcon rookWhite = new ImageIcon("rl.png");
	private ImageIcon bishopBlack = new ImageIcon("bd.png");
	private ImageIcon bishopWhite = new ImageIcon("bl.png");
	private ImageIcon knightBlack = new ImageIcon("nd.png");
	private ImageIcon knightWhite = new ImageIcon("nl.png");
	private ImageIcon kingBlack = new ImageIcon("kd.png");
	private ImageIcon kingWhite = new ImageIcon("kl.png");
	private ImageIcon queenBlack = new ImageIcon("qd2.png");
	private ImageIcon queenWhite = new ImageIcon("ql.png");
	private ImageIcon pawnBlack = new ImageIcon("pd.gif");
	private ImageIcon pawnWhite = new ImageIcon("pl.png");

	private JPanel[][] chessboxes = new JPanel[8][8];
	private JPanel basic = new JPanel(new GridLayout(8, 8));
	private String[][] board = new String[][] 
			{
			{ "rd", "nd", "bd", "kd", "qd", "bd", "nd", "rd" },
			{ "pd", "pd", "pd", "pd", "pd", "pd", "pd", "pd" },
			{ "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  " },
			{ "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  " },
			{ "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  " },
			{ "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  " },
			{ "pl", "pl", "pl", "pl", "pl", "pl", "pl", "pl" },
			{ "rl", "nl", "bl", "ql", "kl", "bl", "nl", "rl" } 
			};
	
	private boolean moveSucces = false, white = true, checkturnLeader = true;
	private Point moveFrom, moveTo;
	private Container c;
	
	
	public static void main(String[] args)
	{
		final Squared chessTest = new Squared();
	}

	@SuppressWarnings("deprecation")
	public Squared()

	{
		c = getContentPane();
		setBounds(70, 70, 580, 580);
		setBackground(new Color(204, 204, 204));
		setResizable(false);
		c.setLayout(null);
		
		basic.setBounds(3, 3, 460, 460);
		basic.setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("ChessTest");
		c.add(basic);
		this.drawChessBoard();
		this.placePieces();
		show();
	}

	private JLabel definePieces(String piece)
	{
		JLabel pieceDes;
		if (piece.equals("rd"))
			pieceDes = new JLabel(this.rookBlack);

		else if (piece.equals("bd"))
			pieceDes = new JLabel(this.bishopBlack);

		else if (piece.equals("nd"))
			pieceDes = new JLabel(this.knightBlack);

		else if (piece.equals("qd"))
			pieceDes = new JLabel(this.queenBlack);

		else if (piece.equals("kd"))
			pieceDes = new JLabel(this.kingBlack);

		else if (piece.equals("pd"))
			pieceDes = new JLabel(this.pawnBlack);

		else if (piece.equals("rl"))
			pieceDes = new JLabel(this.rookWhite);

		else if (piece.equals("bl"))
			pieceDes = new JLabel(this.bishopWhite);

		else if (piece.equals("nl"))
			pieceDes = new JLabel(this.knightWhite);

		else if (piece.equals("ql"))
			pieceDes = new JLabel(this.queenWhite);

		else if (piece.equals("kl"))
			pieceDes = new JLabel(this.kingWhite);

		else if (piece.equals("pl"))
			pieceDes = new JLabel(this.pawnWhite);
		else
			pieceDes = new JLabel();

		return pieceDes;
	}
	
	//check!
	private void diversifyPieces(boolean movingPiece)
	{
		for (int r = 0; r < this.chessboxes[this.moveFrom.y][this.moveFrom.x].getComponentCount(); r++)
			if (this.chessboxes[this.moveFrom.y][this.moveFrom.x].getComponent(r).getClass().toString().indexOf("JLabel") > -1)
			{
				JLabel label = (JLabel) this.chessboxes[this.moveFrom.y][this.moveFrom.x].getComponent(r);
				label.setEnabled(!movingPiece);
			}
			if (movingPiece)
			{
//				if (this.pawnWhite)
//					//move limitter
			}
	}
	
	private void drawChessBoard()
	{
		for (int x = 0; x < 8; x++)
			for (int y = 0; y < 8; y++)
			{
				chessboxes[x][y] = new JPanel(new BorderLayout());
				chessboxes[x][y].addMouseListener(this);
				
				basic.add(chessboxes[x][y]);
				
				if (x % 2 == 0)
				{
					if (y % 2 != 0)
					{
						chessboxes[x][y].setBackground(Color.LIGHT_GRAY);
					}
				
					else
						chessboxes[x][y].setBackground(Color.WHITE);
				}
				else
				if (y % 2 == 0)
					chessboxes[x][y].setBackground(Color.LIGHT_GRAY);
				else
					chessboxes[x][y].setBackground(Color.WHITE);
			}
	}
	
	private void placePieces()
	{
		for (int x = 0; x < 8; x++)
		{
			for (int y = 0; y < 8; y++)
			{
				this.chessboxes[x][y].add(this.definePieces(board[x][y]),BorderLayout.CENTER);
				this.chessboxes[x][y].validate();
			}
		}
	}
	
	//check
	public void mouseClicked(MouseEvent e)

	{
		if (checkturnLeader)
		{
			Object src = e.getSource();	
			JPanel zPanel = (JPanel) src;
			
			int intX = (zPanel.getX() / 57); 
			int intY = (zPanel.getY() / 57); // QUESTION
			this.moveSucces = !this.moveSucces;

			if (this.moveSucces)
			{
				this.moveFrom = new Point(intX, intY);

				if (this.board[this.moveFrom.y][this.moveFrom.x].toString().trim().equals(""))
					this.moveSucces = !this.moveSucces;

				if ((!this.board[this.moveFrom.y][this.moveFrom.x].toString().trim().equals(""))&& this.white && this.board[this.moveFrom.y][this.moveFrom.x].toString().charAt(1) == 'B')
				{
					this.moveSucces = !this.moveSucces;
					//System.out.println("alert: moved");
				}
				
				if ((!this.board[this.moveFrom.y][this.moveFrom.x].toString().trim().equals("")) && !this.white && this.board[this.moveFrom.y][this.moveFrom.x].toString().charAt(1) == 'W')
					this.moveSucces = !this.moveSucces;

				if (this.moveSucces)	
					this.diversifyPieces(true);
			}

			else
			{
				this.moveTo = new Point(intX, intY);

				if (!this.moveFrom.equals(this.moveTo))
				{
					if (this.board[this.moveFrom.y][this.moveFrom.x].toString().trim() != "")
						if (this.legalMoveTest())
						{
							this.board[this.moveTo.y][this.moveTo.x] = this.board[this.moveFrom.y][this.moveFrom.x].toString();
							this.board[this.moveFrom.y][this.moveFrom.x] = "  ";
							this.mover();
						}

						else
						{
							JOptionPane.showMessageDialog(this,"ILLEGAL MOVE REQUEST.", "Warning",JOptionPane.ERROR_MESSAGE);
							this.diversifyPieces(false);
						}
				}
				else
					this.diversifyPieces(false);
			}
		}
	}

	//check
	private boolean legalMoveTest()
	{
		boolean legalMove = true;
		return legalMove;
	}
//check
	private void mover()
	{
		for (int z = 0; z < this.chessboxes[this.moveTo.y][this.moveTo.x].getComponentCount(); z++)
			if (this.chessboxes[this.moveTo.y][this.moveTo.x].getComponent(z).getClass().toString().indexOf("JLabel") > -1)
			{
				this.chessboxes[this.moveTo.y][this.moveTo.x].remove(z);
				this.chessboxes[this.moveTo.y][this.moveTo.x].repaint();
			}

		for (int z = 0; z < this.chessboxes[this.moveFrom.y][this.moveFrom.x].getComponentCount(); z++)

			if (this.chessboxes[this.moveFrom.y][this.moveFrom.x].getComponent(z).getClass().toString().indexOf("JLabel") > -1)
			{
				this.chessboxes[this.moveFrom.y][this.moveFrom.x].remove(z);
				this.chessboxes[this.moveFrom.y][this.moveFrom.x].repaint();
			}

		this.chessboxes[this.moveTo.y][this.moveTo.x].add(this.definePieces(this.board[this.moveTo.y][this.moveTo.x]),BorderLayout.CENTER);
		this.chessboxes[this.moveTo.y][this.moveTo.x].validate();
	}


	public void mouseEntered(MouseEvent e) {
	}
	public void mouseReleased(MouseEvent e) {
	}
	public void mouseExited(MouseEvent e) {
	}
	public void mousePressed(MouseEvent e) {
	}
	
	
}