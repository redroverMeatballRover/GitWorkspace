package pack;
public class Robot {

	public static void main(String[] args) {
		//start robot, go until finds boundary/can
		//while(!allCansNotAccountedFor)
			areaCalculator();
			Explore(0,0);	
			
		missionComplete();			
	}
	
	public static void Explore(int numberOfBoundariesFound, int angleOfRotation)
	{
			//if(boundary found)
			/* ----> boundary()
			 * backup()
			 * getNewAngleDirection from playfield.map.
			 * call Explore(int numberOfBoundariesFound, int angleOfRotation)
			 */
			
			//if(can is found)
			/*  --> moveCan();
			 */
	}
	
	public void boundary() {
		// ---> call: playfield.getBoundary(getTheAreaCalculatedNumber)
		// back up, 
		// --> get new directions from int playfield.getNewAngleOfRotation()
		// ---> call Explore(boundaries, newAngleOfRotation)... or just update the Explore's "AngleOfRotation"	
	}
	
	public void moveCan() {
		//while(!boundaryReached)
		//  --> push can until boundary is found
		//  --> tone is going off
		//update canCountdown
	}
	
	private void backup() {
		//runs backup tone
		//robot backs up certain length
	}
	
	private static void missionComplete() {
		// play finished song
		//robot spins in place for a set amount of time and then powers off. 
	}
	
	private static int areaCalculator() {
		//return distance;
		return 0;
	}
}
