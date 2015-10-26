package pck5;

/** NAME: your name
02
    FILE: CSC151 Ch05Ex04.java
03
    NOTE: Any comments that you wish to include.
04
 
05
    Ch05Ex04.java.  In Ch02Ex07, your wrote a program that generated a business password. The program below asks the user for a password, then calls a method
06
    called getCorrectPassword() to get the business password, then calls a method named isCorrectPassword() to see if the user's input matches the correct password.
07
     A suitable response is generated based on the true or false value returned by this method.
08
     
09
    Create the getCorrectPassword() method using the code that you created in Ch02Ex07. This method should create and return the business password the same as
10
    before. Now create the isCorrectPassword() method. This method should receive the user's input, and also the correct password. The method should compare them
11
    and return true if the two passwords are the same, false otherwise.
12
 
13
*/

 

import javax.swing.JOptionPane;

public class Testerbug

{

    /** Obtains a password from the user, tests it, and provides
19
        a suitable response
20
    */

     

    public static void main (String [] args)

    {
     

        String userInput =

                JOptionPane.showInputDialog("Please enter your password: ");

        String correctPassword = getCorrectPassword();             

        if (isCorrectPassword(userInput, correctPassword))

            JOptionPane.showMessageDialog(null, "Welcome! All doors are opened!");

        else

            JOptionPane.showMessageDialog(null, "Sorry that passsword is not correct.");

    }

     

    /** getCorrectPassword creates the business password
36
        @return The business password
37
    */

    public static String getCorrectPassword()

    {

         

         String businessName = "Pump Fitness";

         //pwm12p

        char letter = businessName.charAt(2);
        int stringSize = businessName.length();

        char letterOne = businessName.charAt(0);

        String password = "pw" + letter + stringSize + letterOne;

        String correctPassword = password.toUpperCase();

  
        return correctPassword;

    }

    /** isCorrectPassword tests a password to see if it correct
52
        @param testP - the password to be tested
53
        @param correctP - the correct password
54
        @return a boolean value true or false
55
        */

//        public boolean isCorrectPassword()
//
//        {
//
//            correctPassword = true;
//
//            if(userInput.equals(correctPassword))
//
//            return true;
//
//            else
//
//            return false;

                 
            public static boolean isCorrectPassword(String input, String password){
            	
            	   return(input.equals(password));
            	
            	}

            

}
