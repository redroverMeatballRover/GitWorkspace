
public class FakeLightSensor implements ILightSensor {

	boolean seesPlayfieldSurface = true;
//	Playfield playfield = new Playfield(567);
	Playfield playfield = new Playfield();
	
	@Override
	public boolean detectsPlayfield() {
		return seesPlayfieldSurface;
	}

	public int getNormalizedLightValue()
	{
		return playfield.getColor(); //this can read any color on the board.
	}
	
	public void setSurface(boolean b)
	{
		seesPlayfieldSurface = b;
	}

	@Override
	public void setFloodlight(boolean b) {
		if (b)
			System.out.println("- Floodlight ON -");
		else
			System.out.println("- Floodlight OFF -");
	}
}	
