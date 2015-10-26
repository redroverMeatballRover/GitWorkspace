package pack;

public class Pine extends Conifer {

protected int pineConeNum;
	
	public Pine(int numLeaf, String title, int coneCount)
	
	{
		super(numLeaf, title);
		pineConeNum = coneCount;
	}

	public void isInATemperateClimate()
	{
		System.out.println("This tree exsists in a temperate climate");
	}
	
	public void hardWood()//THIS METHOD OVERRIDES
	{
		System.out.println("The pine tree is the hardest of all conifer trees.");
	}
	
	public void setCones(int coneCount)
	{
		pineConeNum = coneCount;
	}
	
	public int getDaysTilFall()
	{
		return pineConeNum;
	}


}
