package RecentEditedCopy;

import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;

import javax.swing.*;

public class GUI extends JFrame implements ActionListener
{
	private static final long serialVersionUID = -5825115473793035743L;

	private GUIRunner runner;
	
	private ChessBoard board;
	
	//MORE DELETION//---------------------------------------------------------------//
	private PromotionPopup promotion;
	//private GameOverPopup gameOver;
	//private VerifyExitPopup verify;
	
	//GET THIS
	private Flipped isFlipped;
	//POSSIBLE DELTION
	//private StatusBar statusBar;
	//POSSIBLE DELTION
	private PGNDisplay pgnPanel;
	//------------------------------------------------------------------------------//
	
	
	//CHECK THIS FOR DELETION OF STUFF
	public GUI(BoardState boardState, GUIRunner runner)
	{
		//super("G Chess");
		
		// GET THIS SHIT DONE
		//--------------------------------------------------------------------------------------//
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension boardSize = new Dimension(600,600);
		Dimension pgnPanelSize = new Dimension(160,461);
		Dimension southSize = new Dimension(712, 41);
		Dimension statusBarSize = new Dimension(712, 27);
		Dimension toolBarSize = new Dimension(70,482);
		//-----------------------------------------------------------------------------------//

		this.runner = runner;
		
		//RENAME
		isFlipped = new Flipped();
		
		//"this" Main Frame***********************************************************
		setLayout(new BorderLayout());
		setResizable(false);
		//****************************************************************************
		
		//South Panel*****************************************************************
		JPanel south = new JPanel();
		south.setPreferredSize(southSize);
		south.setLayout(new BoxLayout(south, BoxLayout.PAGE_AXIS));
		JPanel southTop = new JPanel();
		southTop.setOpaque(true);
		southTop.setBackground(new Color(51,102,255));
		JPanel southBottom = new JPanel();
		southBottom.setOpaque(true);
		southBottom.setBackground(new Color(51,102,255));
		//****************************************************************************

		//Status Bar**** CURRENTLY DISABLED *********************************************************
		//statusBar = new StatusBar(statusBarSize);
//		southBottom.add(statusBar);
		//****************************************************************************
		
		south.add(southTop);
		south.add(southBottom);
		add(south, BorderLayout.SOUTH);

		//PGN Panel**********DISABLED*********************************************************		
		pgnPanel = new PGNDisplay(pgnPanelSize);
		//add(pgnPanel,BorderLayout.WEST);
		//****************************************************************************

		//Button Panel******DISABLED**********************************************************
		//ToolBar toolBar = new ToolBar(this, toolBarSize);
		//add(toolBar,BorderLayout.EAST);
		//****************************************************************************

		//Game Board******************************************************************
		board = new ChessBoard(boardState, this, boardSize);
		updateBoard(boardState);		
		add(board,BorderLayout.CENTER);
		//****************************************************************************

		//Menu Bar********************************************************************
		//Menu menuBar = new Menu(this);
		//setJMenuBar(menuBar);
		//****************************************************************************

		pack();
		setLocation(screen.width/2-getSize().width/2, screen.height/2-getSize().height/2);
		repaint();
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	}
	
	public ChessBoard getChessBoard()
	{
		return board;
	}
	
	//GET THIS
	public Flipped getIsFlipped()
	{
		return isFlipped;
	}
	
	//ALL THIS//------------------------------------------//
//	public StatusBar getStatusBar()
//	{
//		//return statusBar;
//	}
	public PGNDisplay getPgnPanel()
	{
		return pgnPanel;
	}
	public Location processLocation(Location loc)
	{
		if(!isFlipped.getFlip())
			return loc;
		else
			return new Location(7-loc.getRow(),7-loc.getCol());
	}
	public boolean getFlipped()
	{
		return isFlipped.getFlip();
	}
	public void verifyExit()
	{
//		verify = new VerifyExitPopup(this);
//		setEnabled(false);
//		verify.setVisible(true);
	}
	//-------------------------------------------------------//
	
	
	//CHECK THIS //----------------------------------------------//
	public void gameOver(int outcome)
	{
		if(outcome==1)
		{
			//gameOver = new GameOverPopup(this, " White Win");
			System.out.println("CHECKMATE - WHITE WINS");
			
			System.out.println("Press any button to close.");
			Scanner scan = new Scanner(System.in);
			String acceptDefeat = "";
			acceptDefeat = scan.nextLine();
			System.exit(0);
		}
		else if(outcome==-1)
		{
			//gameOver = new GameOverPopup(this, " Black Win");
			System.out.println("CHECKMATE - BLACK WINS");
			System.exit(0);
			
			System.out.println("Press any button to close.");
			Scanner scan = new Scanner(System.in);
			String acceptDefeat = "";
			acceptDefeat = scan.nextLine();
			System.exit(0);
		}
		else
		{
			//gameOver = new GameOverPopup(this, " Draw");
			System.out.println("NO WINNER - GAME IS A TIE");
			System.exit(0);
			
			System.out.println("Press any button to close.");
			Scanner scan = new Scanner(System.in);
			String acceptDefeat = "";
			acceptDefeat = scan.nextLine();
			System.exit(0);
		}
		setEnabled(false);
		//gameOver.setVisible(true);
	}
	
	public void newGame()
	{
		setEnabled(true);
//		if(gameOver!=null)
//			gameOver.dispose();
		clearPGN();
		updateStatusBar("New Game!", true);
		flipBoard();
		flipBoard();
	}
	public void updatePGN(Location start, Location end)
	{
		pgnPanel.updatePGN(start, end, runner.getTurn());
	}
	
	public void backPGN()
	{
		pgnPanel.backPGN(runner.getTurn());
	}
	
	public void clearPGN()
	{
		pgnPanel.clearPGN();
	}
	
	public void promotion()
	{
		setEnabled(false);
		promotion = new PromotionPopup(this);
		//promotion.setVisible(true);
	}
	
	public void endPromotion()
	{
		setEnabled(true);
		//promotion.dispose();
	}
	
	public void enableSide(boolean turn)
	{
		board.enableSide(turn);
	}
	
	public void flipBoard()
	{
		isFlipped.flip();
		board.flipBoard();
	}
	
	public void resetBorders()
	{
		board.resetBorders();
	}
	
	public void resetBackground()
	{
		board.resetBackground();
	}
	
	public void enable(Location loc, boolean highlight)
	{
		board.enable(loc, highlight);
	}
	
	//-------------------------------------------------------------------------------------------//
	public void selected(Location loc)
	{
		board.selected(loc);
	}
	//-------------------------------------------------------------------------------------------//
	
	public void dynamicUpdateStatusBar(JButton button)
	{
		for(int y=0; y<board.getSide(); y++)
			for(int x=0; x<board.getSide(); x++)
				if(button==board.getButton(y,x))
					updateStatusBar(""+processLocation(new Location(y,x)), false);
	}
	
	public void updateStatusBar(String output, boolean isAlert)
	{
		//statusBar.update(output, isAlert);
	}
	
	public void updateBoard(BoardState boardState)
	{
		board.updateBoard(boardState);
	}
	
	public void actionPerformed(ActionEvent event)
	{
		int command = Integer.parseInt(event.getActionCommand());
		
		if(command >= 0)
		{
			int x = command%10;
			int y = command/10;
			
			Location loc = processLocation(new Location(y,x)); 
			runner.processOne(loc);
		}
		else
			runner.processTwo(command);
	}

//------------------------------------------------------------------------------//

}