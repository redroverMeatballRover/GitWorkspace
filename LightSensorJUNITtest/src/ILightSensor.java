
public interface ILightSensor {

	boolean detectsPlayfield();
	
	int getNormalizedLightValue();
	
	void setFloodlight(boolean b);
}

