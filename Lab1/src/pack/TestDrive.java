package pack;

import java.util.Scanner;

import pack.Test2.Vehicle;

//NOTE: no if or switch statements used. 
public class TestDrive extends Test2 {

	public static void main(String[] args) {

		choiceVehicle();
	}

	public static void choiceVehicle() {
		Vehicle a = Vehicle.CAR;
		Vehicle b = Vehicle.MOTORCYCLE;
		Vehicle c = Vehicle.ATV;
		Vehicle d = Vehicle.HORSE;
		Vehicle e = Vehicle.PLANE;

		System.out.println("Choose a vehicle to travel by: CAR, MOTORCYCLE, ATV, HORSE, or PLANE. Choose STOP to end the test driving.");
		Scanner scan = new Scanner(System.in);
		String choice = scan.next();

		while (choice.equals("CAR")) {
			System.out.println("You chose a car.");

			while (a.computeDistance() < 100) {
				a.travel();
				System.out.println("You have travelled: " + a.computeDistance()
						+ " miles!");
			}
			System.out.println("You have completed the test drive! \n");
			choiceVehicle();
		}

		while (choice.equals("MOTORCYCLE")) {
			System.out.println("You chose a motorcycle.");

			while (b.computeDistance() < 100) {
				b.travel();
				System.out.println("You have travelled: " + b.computeDistance()
						+ " miles!");
			}
			System.out.println("You have completed the test drive! \n");
			choiceVehicle();
		}
		while (choice.equals("ATV")) {
			System.out.println("You chose an ATV.");

			while (c.computeDistance() < 100) {
				c.travel();
				System.out.println("You have travelled: " + c.computeDistance()
						+ " miles!");
			}
			System.out.println("You have completed the test drive! \n");
			choiceVehicle();
		}
		while (choice.equals("HORSE")) {
			System.out.println("You chose a horse.");

			while (d.computeDistance() < 100) {
				d.travel();
				System.out.println("You have travelled: " + d.computeDistance()
						+ " miles!");
			}
			System.out.println("You have completed the test drive! \n");
			choiceVehicle();
		}
		while (choice.equals("PLANE")) {
			System.out.println("You chose a plane.");

			while (e.computeDistance() < 100) {
				e.travel();
				System.out.println("You have travelled: " + e.computeDistance()
						+ " miles!");
			}
			System.out.println("You have completed the test drive! \n");
			choiceVehicle();
		}

		// STOP system
		while (choice.equals("STOP")) {
			System.out.println("The Test Driving is concluded.");
			System.exit(0);
		}

		// exception handling
		while (choice != "CAR" || choice != "HORSE" || choice != "ATV" || choice != "MOTORCYCLE" || choice != "PLANE" ) {
			System.out.println("That was not a appropriate command. Please type the vehicle again: \n"); // exception
																										// handling
			choiceVehicle();
		}

	}

}

