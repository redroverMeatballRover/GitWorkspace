
public class Calculator {

	boolean isOn = false;
	
	public static void main(String args[])
	{
		
	
	}
	
	public int addition(int x, int y)
	{
		return x + y;
	}
	
	public int multiply(int x, int y)
	{
		return x * y;
	}
	
	public void turnOn()
	{
		isOn = true;
	}
	
	public void turnOff()
	{
		isOn = false;
	}
	
	public boolean isOn(){
		return isOn;
	}

}
