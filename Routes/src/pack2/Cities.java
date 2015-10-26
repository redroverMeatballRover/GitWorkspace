package pack2;
/**
 * author cody schaffer
 * 
 * This program runs through a list of cities. Each city has an x and y coordinate that 
 * we use to compute the distance between cities. Once the program recursively goes though each 
 * city, returnin the name and x and y, it prints out the distance between all of the cities. 
 * 
 * NOTE: Cobb confirmed that there was no need to have the user enter in the cities with the X and Y
 * coordinates. Also, the goal of the program is to print out the total distance between cities. 
 */

//this class sets up the cities. 
public class Cities {

	private String city;
	private double X;
	private double Y;
	
	//constructor
	 protected Cities(String name, int x, int y)
     { 
         city = name;
         X =x;
         Y =y;
     }
	 
	 //getters and setters
		public double getX() {
			return X;
		}

		public void setX(double x) {
			X = x;
		}

		public double getY() {
			return Y;
		}

		public void setY(double y) {
			Y = y;
		}

		public String getCity() {
			return city;
		}


	 
}
