package Secret;

/**
 * Author Cody Schaffer
 * 
 *  The purpose of this class is to create a cipher program that uses both the password and secret classes.
 *  In this class, we show that we can use multiple inheritence, as well as pull methods from different classes.  
 */
public class PasswordDriver {

   public static void main (String[] args)
   {
      Password p1 = new Password("The hungryHippo");
      System.out.println("The password design: \n");
      System.out.println(p1);
      
      p1.encrypt();
      System.out.println(p1);
      
      p1.decrypt();
      System.out.println(p1);
      
      System.out.println("\n");
      
      Secret p2 = new Secret("This is the end");
      System.out.println("The secret design: \n");
      System.out.println(p2);
      
      p2.encrypt();
      System.out.println(p2);
      
      p2.decrypt();
      System.out.println(p2);
      
   }
}

	
		
	


