package hospital;

public class Hospital {

	/**
	 * AUTHOR: CODY SCHAFFER
	 * 
	 * This class shows inheritence between classes for employees in a hospital. many of their employees in this hospital 
	 * inherit jobs from each other. In this program we see how they all inherit different jobs. 
	 */
	
	public static void main(String[] args) {
		
		Janitor jan = new Janitor();
		Receptionist rec = new Receptionist();
		Admin admin = new Admin();
		
		
		Nurse nur = new Nurse();
		Surgeon sur = new Surgeon();
		Doctor doc = new Doctor();
		
		//------------------------------------------------------------------------------------------//
		//for the janitor:
		System.out.println("------------------------------------\n");
		System.out.println("During the day, The janitor: ");
		jan.checksIn();// shows inheritence from employee
		jan.cleansUpMesses();
		jan.carriesKeys();
		jan.maintainsWorkPlace();
		//------------------------------------------------------------------------------------------//
		
		//------------------------------------------------------------------------------------------//
		//for the Receptionist
		System.out.println("---------------------------------------------\n");
		System.out.println("\nDuring the day, the receptionist: ");
		rec.checksIn(); //shows inheritance from employee
		rec.schedulesAppointments();
		rec.keepsRecords();
		rec.takesCalls();
		
		
		//for the admin
		System.out.println("----------------------------------------------\n");
		System.out.println("\nDuring the day, the administration:");
		admin.checksIn();//shows inheritence from employee
		admin.takesCalls(); // shows inheritence from receptionist
		admin.managesMoney();
		admin.administratesHospital();
		admin.continuesMoneyFlow();
		//------------------------------------------------------------------------------------------//
		
		//------------------------------------------------------------------------------------------//
		//for the nurse
		System.out.println("----------------------------------------------\n");
		System.out.println("\nDuring the day, the nurse: ");
		nur.checksIn(); // shows inheritence from employee
		nur.givesPreCheckup();
		nur.givesToDoctor();
		
		//for the surgeon
		System.out.println("----------------------------------------------\n");
		System.out.println("\nDuring the day, the Surgeon: ");
		sur.checksIn();//shows inheritence from employee
		sur.givesPreCheckup(); //shows inheritence from nurse
		sur.putsPatientUnder();
		sur.finishesSurgery();
		
		//for the doctor
		System.out.println("----------------------------------------------\n");
		System.out.println("\nDuring the day, the Doctor: ");
		doc.checksIn(); //shows inheritence from employee
		doc.givesPreCheckup();//shows inheritence from nurse
		doc.putsPatientUnder();
		doc.advisesPatientHealth();
		//------------------------------------------------------------------------------------------//
	}

}
