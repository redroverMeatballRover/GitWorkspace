package mod8InteractiveChess;


import java.awt.*;
import javax.swing.*;

public class PawnPromotion extends AlertPawn
{
	private static final long serialVersionUID = 5337411370661157823L;

	public PawnPromotion(GUI listener)
	{
		super(listener, "Promote Pawn To:");
		setLayout(new GridLayout(2,2));
		JButton[] pieces = new JButton[4];
		pieces[0] = new JButton("Queen");
		pieces[1] = new JButton("Rook");
		pieces[2] = new JButton("Bishop");
		pieces[3] = new JButton("Knight");
		
		for(int x=0; x<pieces.length; x++)
		{
			pieces[x].addActionListener(listener);
			pieces[x].setActionCommand("-"+(x+1));
			add(pieces[x]);
		}
		
		pack();
		reset();
	}
}