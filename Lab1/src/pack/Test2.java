package pack;

import java.util.Scanner;

public class Test2 {
	
	public double distance;
	
	//enumerated type with 5 values
	public enum Vehicle {
		CAR(80), MOTORCYCLE(70), ATV(60), HORSE(20), PLANE(100);

		public double speed;
		public int time = 0;
		double totalDistance;

		//GETTERS AND SETTERS
		// --------------------------------------------------------------------------------
		public double getSpeed() {
			return speed;
		}

		public void setSpeed(double speed) {
			this.speed = speed;
		}

		public int getTime() {
			return time;
		}

		public void setTime(int time) {
			this.time = time;
		}

		// -----------------------------------------------------------------------------------
		
		//constructor
		private Vehicle(double s) {
			speed = s;
		}
		//travel method incriments by one
		public int travel() {
			time = time + 1;
			System.out.println("You have travelled for: " + time + " hours!");
			return time;
		}
		
		//computes distance
		public double computeDistance() {
			double distance = time * speed;
//			return time * speed;
			return distance;
		}

	}
}