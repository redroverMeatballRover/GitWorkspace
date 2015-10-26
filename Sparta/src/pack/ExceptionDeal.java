package pack;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionDeal {


	public static void main(String[] args) {
		
		try
		{
			int t = 1/ 0;
			
			FileReader reader = new FileReader(new File("test.txt"));
		}
		catch(ArithmeticException e)
		{
			System.out.println("gotcha");
		}
		catch(FileNotFoundException e)
		{
			System.out.println("no File");
		}
		finally 
		{
			System.out.println("mwahahahahahha");
		}
		
		
	}

}

//art appreciate find some art that shows for subjugation and oppression