import static org.junit.Assert.*;

import org.junit.Test;


public class testLightSensor {

	@Test
	public void test() {
		
		FakeLightSensor fls = new FakeLightSensor();
		Manager manager = new Manager(fls);
		
		
		//tests valid white surface
		int whitePlayfield = 590;
		manager.calibrateColorsKnownWhiteColor();
		assertTrue("The sensor succeeds when the sensor is over a valid surface: ", manager.seesWhitePlayfieldSurface(whitePlayfield));

		
		//tests invalid black boundary
		int invalidSurfaceBoundary = 440;
		manager.calibrateColorsKnownWhiteColor();
		assertFalse("The sensor fails when the sensor is over an invalid surface: ", manager.seesWhitePlayfieldSurface(invalidSurfaceBoundary));
		
		
////		manager.light.setFloodlight(true);
////		assertTrue("The floodlight is on.", manager.light.setFloodlight(true));
////		
////		manager.light.setFloodlight(false);
////		assertFalse("The floodlight is off", manager.light.setFloodlight(false));
	
		
		
		//sensor can detect playfield
		fls.setSurface(true);
		assertTrue("The light sensor detects the surface.", manager.light.detectsPlayfield());
		
		
		//sensor won't detect playfield
		fls.setSurface(false);
		assertFalse("The fake sensor detects the surface.", manager.light.detectsPlayfield());
		
		
		//automated playfield value from sensor
		manager.getPlayfieldColor();
		assertNotNull("The light sensor can automatically get the value of the playfield surface.", manager.playfieldColor);
	}

}
