package pack;

public class Fir extends Conifer {

	protected int daysTilChristmas;
	
	public Fir(int numLeaf, String title, int daysTilChopping)
	
	{
		super(numLeaf, title);
		daysTilChristmas = daysTilChopping;
	}


	public void usedForChristmasTree()
	{
		System.out.println("This tree will be a christmas tree in december.");
	}
	
	public void setChop(int daysTilChopping)
	{
		daysTilChristmas = daysTilChopping;
	}
	
	public int getChop()
	{
		return daysTilChristmas;
	}


}
