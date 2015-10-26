package pack;

public class PoliceOfficer extends PublicSafetyOfficer implements IWeaponHandler {

	private int patrolCarNum;
	private int weaponSerial;
	
	
	public PoliceOfficer(String fName, String lName, int ageYear, int badge, int patrolNum, int weapSer) 
	
	{
		super(fName, lName, ageYear, badge);
		patrolCarNum = patrolNum;
		weaponSerial = weapSer;
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
	
	int getPatrolNum()
	{
		return patrolCarNum;
	}

	int getWeaponSerial()
	{
		return weaponSerial;
	}
	
	
	public void pullCrimminalOver()
	{
		System.out.println("The policeman pulls over the crimminal.");
	}
	
	public void writeTicket(String carLicence, String driversLicence)
	{
		String carLicence1 = "1010000";
		String driversLicence1 = "Gary Convict";
		
		System.out.println("The police officer writes a ticket to the evil crimminal.");
		System.out.println("Please give me your car licence and Drivers Licence.");
		System.out.println("The Drivers Licence is: " + driversLicence1 + ", and the car licence is: " + carLicence1);
	}


	@Override
	public void drawWeapon() {
		System.out.println("The officer draws his weapon.");
		
	}


	@Override
	public void shootWeapon() {
		System.out.println("The office fires his weapon.");
		
	}


	@Override
	public void locatePerson(String location) {
		System.out.println("The police officer is at: " + location );
		
	}
	
	
	
	
	

	

}
