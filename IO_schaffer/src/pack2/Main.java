package pack2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        MyFile myFile = new MyFile();
//        String input = myFile.readTextFile("Contacts.txt");
        String input = myFile.readTextFile("infoEmps.txt");
      //  System.out.println(input);
        // myFile.writeTextFile("Testing2.txt", input);
    
        System.out.println("---------------------------------------------------");
      
		//Pattern p1 = Pattern.compile("[A-Z][a-z]+");	//for all names
//        Pattern p1 = Pattern.compile("[J-S][a-u]+");
//		Matcher m = p1.matcher(input);
//		
//		Pattern p2 = Pattern.compile("[A-B][a-u]+");
//		Matcher m2 = p2.matcher(input);
//		
//		Pattern p3 = Pattern.compile("[E-F][a-y]+");
//		Matcher m3 = p3.matcher(input);
		
//		Pattern p4 = Pattern.compile("[A-Z][a-z]+");
//		Matcher m4 = p4.matcher(input);
		
		Pattern p4 = Pattern.compile("(.*),(.*),(.*)");
		Matcher m4 = p4.matcher(input);
		
		
		
		
		
		
		
		
//		while (m.find())
//		{
////			System.out.println("Match: " + m.group());
////			System.out.println("Name: " + m.group());
//		}
		
//		//PATTERN 1//--------------------------------//
//		for (int i = 0; i < 2; i++)
//		{
//			m.find();
//			System.out.print(m.group() + " ");
//		}
//		
//		System.out.println();
//		
//		//PATTERN 2//--------------------------------//
//		for (int i = 0; i < 2; i++)
//		{
//			m2.find();
//			System.out.print(m2.group() + " ");
//		}
//		
//		System.out.println();
//		
//		//PATTERN 3//--------------------------------//
//		for (int i = 0; i < 2; i++)
//		{
//			m3.find();
//			System.out.print(m3.group() + " ");
//		}
//		
//		System.out.println();
//		
		//TEST//
	
		
		for (int i = 0; i < 1; i++) 
		{
			for (int j = 0; j < 3; j++) 
			{
				for (int k = 0; k < 2; k++) 
				{
					m4.find();
					System.out.print(m4.group() + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
		System.out.println();
	}
}