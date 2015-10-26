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
public class CityDriver {
	//driver
	public static void main(String[] args){
   	CityTrek ct = new CityTrek();
   	
   	ct.travel();
   	 
   
	}

}
