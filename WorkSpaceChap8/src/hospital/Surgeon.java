package hospital;

/*
 * represents a surgeon
 */

public class Surgeon extends Nurse {
	
	private String surgeon;

	public void undertakesSurgery()
	{
		System.out.println("gives a pre-checkup to the patient.");
	}
	
	public void putsPatientUnder()
	{
		System.out.println("puts patient under.");
	}
	
	public void finishesSurgery()
	{
		System.out.println("finsihes the surgery.");
	}
	

}
