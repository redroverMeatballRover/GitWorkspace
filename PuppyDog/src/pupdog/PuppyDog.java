package pupdog;

public class PuppyDog {

	private String furColor;
	private String furPattern;
	double age;
	double weightDog;
	String dogName;
	boolean sleeping = false;
	boolean sitting = true;
	boolean running = true;
	int sleepTime = 30;
	String directionRun;
	String dogBark = "Ruff Ruff Ruff";
	String dogBite = "bite";
	String dogTackle = " tackle";
	String dogGotoSleep = "go to sleep";
	
	PuppyDog(String fur, String pattern, int dogAge, int weight, String name)
	{
		furColor = fur;
		furPattern = pattern;
		age = dogAge;
		weightDog = weight;
		dogName = name;
	}
	
	public  String getFurColor()
	{
		
		return furColor;
	}
	
	public static String setFurColor(String newFurColor)
	{
		String furColor = newFurColor;
		return furColor;
	}
	
	public  String getDogName()
	{
		
		return dogName;
	}
	
	public static String setDogName(String newDogName)
	{
		String dogName = newDogName;
		return dogName;
	}
	
	public String getFurPattern()
	{
		
		return furPattern;
	}
	
	public String setFurPattern(String newFurPattern)
	{
		String furPattern = newFurPattern;
		return furPattern;
	}
	
	public double getAge()
	{
		
		return age;
	}
	
	public double setAge(double newAge)
	{
		double age = newAge;
		return age;
	}
	
	public double getWeightDog()
	{
		
		return weightDog;
	}
	
	public double setWeightDog(double newWeight)
	{
		double weightDog = newWeight;
		return weightDog;
	}
	
	public boolean getSleeping()
	{
		return sleeping;
	}
	public boolean setSleeping(boolean newSleep)
	{
		boolean sleeping = newSleep;
		return sleeping;
	}
	
	public boolean getSitting()
	{
		return sitting;
	}
	public boolean setSitting(boolean newSit)
	{
		boolean sitting = newSit;
		return sitting;
	}
	
	public boolean getRunning()
	{
		return running;
	}
	public boolean setRunning(boolean newRun)
	{
		boolean running = newRun;
		return running;
	}
	
	public int getSleepTime()
	{
		
		return sleepTime;
	}
	
	public int setSleepTime(int newSleepTime)
	{
		int sleepTime = newSleepTime;
		return sleepTime;
	}
	
	public String getDirectionRun()
	{
		
		return directionRun;
	}
	
	public String getDirectionRun(String newDirection)
	{
		String directionRun = newDirection;
		return directionRun;
	}
	
	/////////////////////////////////////////////////////////////////	
	public String getdogBark()
	{
		return dogBark;
	}
	
	public String getDogBite()
	{
		return dogBite;
	}
	

	public void dogRollOver()
	{
		System.out.println("rolls over");
	}
	
	public String getDogTackle()
	{
		return dogTackle;
	}
	
	
	public String getDogGoToSleep()
	{
		return dogGotoSleep;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	
}


