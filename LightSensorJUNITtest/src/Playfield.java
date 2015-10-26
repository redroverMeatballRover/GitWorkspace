import java.util.Random;


public class Playfield {

	int color;
		
	public Playfield()
	{
		color = playfieldValues();
	}
	
	public void setColor(int newColor)
	{
		color = newColor;		
	}
	
	public int getColor()
	{
		return color; //return playfieldValues? what if the boundary shows up???
	}
	
	public int playfieldValues()
	{
		Random rand = new Random();
		int possibleValue = (rand.nextInt(600) + 400);
		return possibleValue;
	}
}
