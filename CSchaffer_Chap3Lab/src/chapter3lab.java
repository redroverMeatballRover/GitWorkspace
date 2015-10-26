import java.util.Scanner;
import java.text.DecimalFormat;

/*--------------------------------------------------------------------------------------------------
*This code is a calculator that asks for the user to decide on the values for area or perimeter
*of whatever object they choose. The object choices they can calculate are a cicumference of a circle,
*the area of a triangle, volume of a box, volume of a cylinder, and area of a box.
*-----------------------------------------------------------------------------------------------------
*/

public class chapter3lab {

	enum Flavor {vannila, chocolate, strawberry, fudgeRipple, FudgeRipple, coffee, rockyRoad, mintChocChip, cookieDough, orangeSorbet}
	//this is the main driver method that runs the area calculator
	
	public static void main(String[] args) 
	{
		//prints out the options for the user to choose from. 
		System.out.println ("Choose the number of the shape you want:\n 1: Triangle \n 2: Box \n 3: Volume of a box \n 4: Volume of a cylinder \n 5: Circumference of a circle");
		
		//scans for user integer
		Scanner scan = new Scanner (System.in);
		int choice = scan.nextInt();
		
		//if user chooses 1, the user is asked to input the dimensions of the triangle. 
		if(choice == 1) { 
			Triangle_1();
		} 
		//if user chooses 2, the user is asked to input the dimensions of the box(which is actually the rectangle).
		if(choice == 2) { 
			Box_2();
		} 
		//if user chooses 3, the user is asked to input the values for the calculation of volume for the box.
		if(choice == 3) { 
			Volume_of_box_3();
		}
		//if user chooses 4 then they are asked to input values to calculate the volume of a cylinder. 
		if(choice == 4) { 
			Volume_of_cyl_5();
		} 
		// user chooses 5 then you are asked to input values to calculate the circle circumference
		if(choice == 5) { 
			Circle();
		} 
		
//		Circle();
//		Triangle_1(); //Put these in the main method to allow other objects to be read.
//		Box_2();
//		Volume_of_box_3(); 
//		Volume_of_cyl_5();
//		IceCream();
	}	
	
	public static void Circle()
	{
		/*area of a circle_4
		 * This part of the code calculates the circumference of a circle based on what users 
		 * enter for the radius. the formula for the circle circumference is below. 
		*/
		
		double radius;
		double area, circumference; 
		
		Scanner scan = new Scanner (System.in); 
		System.out.print("enter the circle's radius" );
		radius = scan.nextInt();
		
		//----------------------------------------------------------------------------------------
		// formula for circle circumference
		area = Math.PI * Math.pow(radius, 2); 
		circumference = 2 * Math.PI * radius;
		//----------------------------------------------------------------------------------------
		DecimalFormat fmt = new DecimalFormat ("0.###");
		System.out.println ("The circle's area: " + fmt.format(area)); 
		System.out.println ("the circle's circumference: " + fmt.format(circumference)); 
		
	}
	public static void Triangle_1()
	{
		/*area of a triangle
		 * This code computes the area of the triangle based on heron's formula. The user enters 
		 * the sides of the triangle and the code computes it into a area of a triangle. 
		*/
		double a, b, c, s; // s = (a + b + c)/2
		double area;
		
		Scanner scan = new Scanner (System.in);
		System.out.print("enter the length of one side of the triangle: ");
		a= scan.nextInt();
		
		System.out.print("enter the length of one side of the triangle: ");
		b= scan.nextInt();
		
		System.out.print("enter the length of one side of the triangle: ");
		c = scan.nextInt();
		
		//--------------------------------------------------------------------------------------------
		// Formula (Heron's Formula) 
		s = (a + b + c)/ 2; // formula of A of a triangle
		area = Math.sqrt( s*(s - a)*(s - b)*(s-c)); // formula of A of a triangle
		//--------------------------------------------------------------------------------------------
		
		DecimalFormat fmt = new DecimalFormat ("0.####");
		System.out.println ("area of the triangle: " + fmt.format(area));
		
	}
	
	public static void Box_2() 
	
	{
		//area of a square (rectangle)
		
		double a, b, s;
		double area;
		
		Scanner scan = new Scanner (System.in);
		System.out.print("enter the length of the rectangle: ");
		a= scan.nextInt();
		
		System.out.print("enter the width of the rectangle: ");
		b= scan.nextInt();
		//------------------------------------------------------------------------------------------
		// formula
		s = (a * b);
		area =(s);
		//------------------------------------------------------------------------------------------
		
		System.out.println ("area of the rectangle: " + area);	
	}
	
	public static void Volume_of_box_3() 
	
	{
		//volume of a box 
		double a, b, c, s; 
		double area;
		
		Scanner scan = new Scanner (System.in);
		System.out.print("enter the length of the box: ");
		a= scan.nextInt();
		
		System.out.print("enter the width of the box: ");
		b= scan.nextInt();
		
		System.out.print("enter the height of the box: ");
		c= scan.nextInt();
		
		s = (a * b * c);
		area =(s);
		
		System.out.println ("volume : " + area);	
	}
	
	public static void Volume_of_cyl_5() 
	
	{
		//volume of cylinder
		double radius;
		double height;
		double area, volume;
		
		Scanner scan = new Scanner (System.in);
		System.out.print("enter the cylinder radius" );
		radius = scan.nextInt();
		
		System.out.print("enter the cylinder height" );
		height = scan.nextInt();
		
	
		area = Math.PI * Math.pow(radius, 2);
		volume = area * height;
		
		DecimalFormat fmt = new DecimalFormat ("0.####");
		System.out.println ("the circle's volume: " + fmt.format(volume));
		
	}

	public static void IceCream() 
	
	{
		Flavor cone1, cone2, cone3;
		cone1 = Flavor.rockyRoad;
		cone2 = Flavor.chocolate;
		
		System.out.println ("cone value is "  + cone1);
		System.out.println ("cone ordinal is "  + cone1.ordinal());
		System.out.println ("cone name is "  + cone1.name());
		
		
		System.out.println (); 
	
		System.out.println ("cone value is "  + cone2);
		System.out.println ("cone ordinal is "  + cone2.ordinal());
		System.out.println ("cone name is "  + cone2.name());
		
		cone3 = cone1;
		
		System.out.println (); 
		
		System.out.println ("cone value is "  + cone3);
		System.out.println ("cone ordinal is "  + cone3.ordinal());
		System.out.println ("cone name is "  + cone3.name());
	}
	

	
	
	
}
