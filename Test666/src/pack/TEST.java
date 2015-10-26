package pack;

import java.util.Date;

public class TEST {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		 System.out.println(agefinder());
	}
	
	 public static int agefinder()
     {
         int currentYear = 2003;
         int birthdayYear = 1955;
         int currentAge = currentYear - birthdayYear;
         return currentAge;
     }

}
