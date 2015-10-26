import static org.junit.Assert.*;

import org.junit.Test;


public class CalculatorTest {

	Calculator c = new Calculator();
	
	@Test
	public void test()
	{
		c.turnOn();
		assertTrue("Calculator should be on",c.isOn);
		
		assertEquals("5 + 5 should = 10 ", 10, c.addition(5, 5));
		
		c.turnOff();
		assertFalse("Calculator should be off", c.isOn);
	}

}


//