package YouTubeCheatCodes;

/*
G Chess version 1.0
Copyright (c) 2010 Gary Menezes

Copyright Notice
  You may use the accompanying code under the following conditions:
  You may:
    1. Use this code for non-commercial, educational, and personal purposes.
    2. Redistribute this code *as is* along with included copyright notices.
  You may not:
    1. Use this code for any commercial purpose.
    2. Create any derivative works for redistribution.
*/
import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class VerifyExitPopup extends PopupWindow implements ActionListener
{
	private static final long serialVersionUID = 3910994590510963574L;
	private JLabel text;
	private JButton yes, no;
	private GUI parent;
	
	public VerifyExitPopup(GUI parent)
	{
		super(parent, "Are You Sure?");
		
		this.parent = parent;
		
		text = new JLabel("Are you sure you want to exit G CHESS?");
		no = new JButton("No");
		no.addActionListener(this);
		yes = new JButton("Yes");
		yes.setActionCommand("-12");
		yes.addActionListener(parent);
		
		JPanel top = new JPanel();
		top.setBackground(new Color(0,0,0,0));
		top.add(text);
		JPanel bottom = new JPanel();
		bottom.setBackground(new Color(0,0,0,0));
		bottom.add(no);
		bottom.add(yes);
		add(top);
		add(bottom);
		
		pack();
		resetLocation();
	}
	
	public void actionPerformed(ActionEvent event)
	{
		parent.setEnabled(true);
		dispose();
	}
}