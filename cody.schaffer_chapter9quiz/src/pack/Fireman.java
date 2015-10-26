package pack;

public class Fireman extends PublicSafetyOfficer implements RescueCertified {

	private double maxLiftWeight;
	private double runDistance;
	private int gearSerial;
	
	
	public Fireman(String fName, String lName, int ageYear, int badge, double maxW, double maxRD, int gear)
	{	
		super(fName, lName, ageYear, badge);
		maxLiftWeight = maxW;
		runDistance = maxRD;
		gearSerial = gear;
		
	}

	@Override
	String getFirstName() {
		return firstName;
	}

	@Override
	String getLastName() {
		return lastName;
	}

	@Override
	int getAge() {
		return age;
	}

	@Override
	int getBadge() {
		return badgeNum;
	}

	double getWeight()
	{
		return maxLiftWeight;
	}
	
	double getRun()
	{
		return runDistance;
	}
	
	int getGear()
	{
		return gearSerial;
	}
	
	public void putOutFire(String address, int dangerLevel)
	{
		System.out.println("The fireman must put out the fire. The fire is at " + address + " and has a dangerlevel of " + dangerLevel);
	}
	
	public void putOnGear()
	{
		System.out.println("The fireman puts on his gear.");
	}

	@Override
	public void locatePerson(String location) {
		System.out.println("The fireman is at: " + location);
		
	}

	@Override
	public void rescuePerson(String location) {
		System.out.println("The person to be rescued is at " + location);
		
	}

	@Override
	public void revivePerson(String revivalType) {
		System.out.println("The victim must be revived by " + revivalType);
		
	}
	

}
