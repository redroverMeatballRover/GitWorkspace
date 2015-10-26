package hospital;

/*
 * this class represents a nurse 
 */

public class Nurse extends Employee {

	private String nurse;
	
	//inherits a checkIn
	void checksIn()
	{
		System.out.println("checks in");
	}
	//gives a precheck
	public void givesPreCheckup()
	{
		System.out.println("gives a pre-checkup to the patient.");
	}
	//takes temp
	public void takesTemperature()
	{
		System.out.println("takes patient's temperature.");
	}
	//gives to doctor
	public void givesToDoctor()
	{
		System.out.println("gives the stats to the doctor.");
	}
	

}
