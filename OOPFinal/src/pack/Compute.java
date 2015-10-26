package pack;
import java.util.Scanner;

public class Compute {

	
	 
	//public class Factorial {
	    public static void main (String[ ] args) {
	      System.out.println("Enter the number for factorial calculations : "); 
	 
	      Scanner scanner = new Scanner(System.in);
	       
	      int a = scanner.nextInt();
	      double fact= 1;
	 
	      System.out.println("Factorial of " +a+ ":");
	      
	      for (int i= 1; i<=a; i++)
	      {
	        fact=fact*i;
	      }
	      System.out.println(fact);
	   }
	} 
//}
