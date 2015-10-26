package hospital;

/*
 *this class represents a receptionist. 
 */

public class Receptionist extends Employee {
	//inherits abstract class
	void checksIn()
	{
		System.out.println("checks in");
	}
	//takes phone calls
	public void takesCalls()
	{
		System.out.println("takes calls.");
	}
	//schedules appointments
	public void schedulesAppointments()
	{
		System.out.println("schedules appointments.");
	}
	// keeps records
	public void keepsRecords()
	{
		System.out.println("keeps records.");
	}
}
