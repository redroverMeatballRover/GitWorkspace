package pack;
/**
 * 
 * @author cody schaffer
 *
 *This represents an XBOX
 */
public class XBox extends Computers
{

	private int controllers;
	private int games;
	private String console = "xBox";
	//CONSTRUCTOR//
	public XBox(double weigh, double costs, String powerUsage, String manufactuers, String title, int userInt, int compButtons, int dataTerraBytes, int progNum, int control, int game) 
	
	{

		super(weigh, costs, powerUsage, manufactuers, title, userInt, compButtons, dataTerraBytes, progNum);
		controllers = control;
		games = game;
	}
	//plays the games
	public void playGames()
	{
		System.out.println("This electronics system plays games.");
	}

	
	public void setControl(int control)
	{
		controllers = control;
	}
	//GET PAGE
	public int getControl()
	{
		return controllers;
	}
	
	public void setGame(int game)
	{
		games = game;
	}
	//GET PAGE
	public int getGame()
	{
		return games;
	}
	
	public String getConsole()
	{
		return console;
	}
}