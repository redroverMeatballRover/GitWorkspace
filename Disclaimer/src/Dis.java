
























































public class Dis {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
package pack2;
import java.util.*;

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


public class CityTrek {

	 LinkedList<Cities> citiesList = new LinkedList<Cities>();
    private double totalDistance = 0;
    
    // this method travels between the cities and prints out the distance. 
    protected void travel()
    {
   	 cityToCity(0);
   	 System.out.println("total: " + totalDistance);
    }
    
    //constructor builds the cities and locations. 
    protected CityTrek()
    { 
      Cities cities = new Cities("Seattle", 1, 1);
      citiesList.add(cities);
      
      Cities cities1 = new Cities("Portland", 2, 2);
      citiesList.add(cities1);
      
      Cities cities2 = new Cities("San Fran", 3, 3);
      citiesList.add(cities2);
      
      Cities cities3 = new Cities("Salt Lake City", 4, 4);
      citiesList.add(cities3);
      
      Cities cities4 = new Cities("New York", 5, 5);
      citiesList.add(cities4);
    }
        
    //moves from city to city. 
    protected Cities cityToCity(int i)
    {
   	 int count = i;
   	 //goes to each city
   	 // first city
   	 Cities c = citiesList.get(count);
   	 System.out.println(c.getCity());
   	 
   	 //middle cities and end city
   	 if(citiesList.size() - 1 != count){
   		 Cities next = cityToCity(count + 1);//recursive
   		 next.getX();
   		 next.getY();
   		 totalDistance += dist(next.getX(), c.getX(), next.getY(), c.getY());
   	 }
   	 
   	 return c;
    }
    //computes the distance. 
    double dist(double endX, double startX, double endY, double startY) {
			double result;
			result = Math.sqrt((endX-startX)*(endX-startX) + (endY-startY)*(endY-startY));
			return result;

    }
}



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
