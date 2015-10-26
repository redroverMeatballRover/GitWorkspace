package Module2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//CODY SCHAFFER// MOD 2

public class Module2 extends JFrame implements MouseListener
{
	private static final long serialVersionUID = 1L;
	private ImageIcon rookBlack = new ImageIcon("rd.png");
	private ImageIcon rookWhite = new ImageIcon("rl.png");
	private ImageIcon bishopBlack = new ImageIcon("bd.png");
	private ImageIcon bishopWhite = new ImageIcon("bl.png");
	private ImageIcon knightBlack = new ImageIcon("nd.png");
	private ImageIcon knightWhite = new ImageIcon("nl.png");
	private ImageIcon kingBlack = new ImageIcon("kd.png");
	private ImageIcon kingWhite = new ImageIcon("kl.png");
	private ImageIcon queenBlack = new ImageIcon("qd.png");
	private ImageIcon queenWhite = new ImageIcon("ql.png");
	private ImageIcon pawnBlack = new ImageIcon("pd.png");
	private ImageIcon pawnWhite = new ImageIcon("pl.png");
	
	private Container c;
	public static JPanel[][] chessBoxes = new JPanel[8][8];
	public static JPanel basic = new JPanel(new GridLayout(8, 8));
	public static String[][] strChessBoard = new String[][] 
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
		
	@SuppressWarnings("deprecation")
	public Module2()
	{
		c = getContentPane();
		setBounds(70, 70, 580, 580);
		setResizable(false);
		c.setLayout(null);
		basic.setBounds(3, 3, 460, 460);
		basic.setBackground(new Color(55, 55, 55));
		
		c.add(basic);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("ChessTest");
		this.makeBoard();
		this.placePieces();
		show();
	}
	
	public static void main(String[] args)
	{
		Module2 module2 = new Module2();	
	}

	private void makeBoard()
	{
		for (int x = 0; x < 8; x++)
			for (int y = 0; y < 8; y++)
			{
				chessBoxes[x][y] = new JPanel(new BorderLayout());
				//chessBoxes[x][y].addMouseListener(mouseListener);
				basic.add(chessBoxes[x][y]);
				
				if (x % 2 == 0)
				{
					if (y % 2 != 0)
						chessBoxes[x][y].setBackground(Color.white);
					else
						chessBoxes[x][y].setBackground(Color.black);
				}
				else
				{
				if (y % 2 == 0)
					chessBoxes[x][y].setBackground(Color.white);
				else
					chessBoxes[x][y].setBackground(Color.black);
				}
			}
	}
	
	private JLabel definePieces(String piece)
	{
		JLabel piecDes;
		if (piece.equals("rd"))
			piecDes = new JLabel(this.rookBlack);

		else if (piece.equals("bd"))
			piecDes = new JLabel(this.bishopBlack);

		else if (piece.equals("nd"))
			piecDes = new JLabel(this.knightBlack);

		else if (piece.equals("qd"))
			piecDes = new JLabel(this.queenBlack);

		else if (piece.equals("kd"))
			piecDes = new JLabel(this.kingBlack);

		else if (piece.equals("pd"))
			piecDes = new JLabel(this.pawnBlack);

		else if (piece.equals("rl"))
			piecDes = new JLabel(this.rookWhite);

		else if (piece.equals("bl"))
			piecDes = new JLabel(this.bishopWhite);

		else if (piece.equals("nl"))
			piecDes = new JLabel(this.knightWhite);

		else if (piece.equals("ql"))
			piecDes = new JLabel(this.queenWhite);

		else if (piece.equals("kl"))
			piecDes = new JLabel(this.kingWhite);

		else if (piece.equals("pl"))
			piecDes = new JLabel(this.pawnWhite);
		else
			piecDes = new JLabel();
		return piecDes;
	}
	
	public void placePieces()
	{
		for (int x = 0; x < 8; x++)
			for (int y = 0; y < 8; y++)
			{
				chessBoxes[x][y].add(this.definePieces(strChessBoard[x][y]),BorderLayout.CENTER);
				chessBoxes[x][y].validate();
			}
	}

	@Override	
	public void mouseClicked(MouseEvent arg0) 
	{}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub	
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub	
	}
}
