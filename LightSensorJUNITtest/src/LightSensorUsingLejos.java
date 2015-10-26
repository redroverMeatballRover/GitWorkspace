import lejos.nxt.LCD;
import lejos.nxt.LightSensor;
import lejos.nxt.SensorPort;
import lejos.nxt.Sound;
import lejos.util.Delay;

import lejos.nxt.LightSensor;
import lejos.nxt.SensorPort;


public class LightSensorUsingLejos implements ILightSensor{

	public LightSensor light = new LightSensor(SensorPort.S4);
	
	
	@Override
	public boolean detectsPlayfield() {
		
		int value = light.getNormalizedLightValue();
		return false;
	}


	@Override
	public int getNormalizedLightValue() {
		return light.getNormalizedLightValue();
	}


	@Override
	public void setFloodlight(boolean b) {
		light.setFloodlight(true);
		
	}
	
}
