import lejos.nxt.Button;


public class Manager {

public ILightSensor light;
	
	int playfieldSurface_white = 0;
	final int whiteBoard_mean = 567;
	public int playfieldColor;

	public Manager(ILightSensor _light)
	{
		light = _light;
	}
	
	//using known white surface 
	public void calibrateColorsKnownWhiteColor()
	{
		light.setFloodlight(true);
		playfieldColor = whiteBoard_mean;
		playfieldSurface_white = (playfieldColor);
	}
	
	//automated surface determined
	public void getPlayfieldColor()
	{
		light.setFloodlight(true);
		playfieldColor = light.getNormalizedLightValue();
		playfieldSurface_white = (playfieldColor);
	}
	
	public boolean seesWhitePlayfieldSurface(int value)
	{
		if (value >= playfieldSurface_white)
			return true;
		else 
			return false;
	}	
}
