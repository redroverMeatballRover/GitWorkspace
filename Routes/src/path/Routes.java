package path;

import java.awt.List;

public class Routes {

//	Write a program that prompts the user for a list of cities, 
//	where each city has a name and x and y coordinates. After all cities have been entered, 
//	the program should use a recursive algorithm to print the length of all possible routes 
//	that start at the first city entered, end at the last city entered, and visit every city 
//	in the list. For each route, the program should print the name of each city visited, 
//	followed by the length of the route.
	
	String city = "";
	double rLength;
	int x;
	int y;
	
	public Routes(String c, int x, int y)
	{
		city = c;
		this.x = x;
		this.y = y;
	}
	
	public static void main(String[] args) {
		
	}
	
	//constructor?
	
	
	
	//create an array list of cities
	protected List cities(String city)
	{
		List cityCol = new List();
		cityCol.add("Seattle");
		cityCol.add("Portland");
		cityCol.add("San Fransisco");
		cityCol.add("Annaheim");
		cityCol.add("New York");
			
		return cityCol;
	}
//	
//	protected List coordinates(int x, int y)
//	{
//
//		List cor = new List();
//		cor.add(1, 9);
//		cor.add("Portland");
//		cor.add("San Fransisco");
//		cor.add("Annaheim");
//		cor.add("New York");
//	}
//	
	
	//each city has x and y coordinates
	
	// recursive program to print the length of all the possible routes starting at the first city entered, 
	// end at last city, and visit every city. 
	
	//print out: city, then length of the route to it.
	

}
