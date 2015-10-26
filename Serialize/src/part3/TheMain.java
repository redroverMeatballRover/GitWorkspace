package part3;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import pack2.MyFile;

public class TheMain {

	  public void writeObject(ArrayList<Object> listContact) throws IOException {
	       
	    	//Create FileOutputStream to write file
	        FileOutputStream fos = new FileOutputStream("Serializable2.txt");
	        //Create ObjectOutputStream to write object
	        ObjectOutputStream objOutputStream = new ObjectOutputStream(fos);
	        //Write object to file
	        for (Object obj : listContact) 
	        {
	            objOutputStream.writeObject(obj);
	            objOutputStream.reset();
	        }
	        objOutputStream.close();
	    }
 
	  public ArrayList<Contact> readObject() throws ClassNotFoundException, IOException 
	  {      
		  ArrayList<Contact> listContact = new ArrayList<Contact>();  
	      //Create new FileInputStream object to read file
	       FileInputStream fis = new FileInputStream("Serializable2.txt");//---------
	      //FileInputStream fis = new FileInputStream("Contacts.csv");
	        //Create new ObjectInputStream object to read object from file
	        ObjectInputStream obj = new ObjectInputStream(fis);
	        try {
	            while (fis.available() != -1) {
	                //Read object from file
	                Contact cc = (Contact) obj.readObject();
	                listContact.add(cc);
	            }
	        } catch (EOFException ex) {
	        }
	        return listContact;
	    }
	  
//own------------------------------------------------------------	  
//	  public static ArrayList<Contact> readContacts(String file) {
//			ArrayList<Contact> results = new ArrayList<Contact>();
//			MyFile myFile = new MyFile();
//			String input = myFile.readTextFile("Contacts.csv");
//			Pattern p1 = Pattern
//					.compile("(\\b[A-Z][a-z]+ [A-Z]?[.]? ?[A-Z\']{1,3}[a-z]+\\b),([0-9 ()-]{3,6}[0-9-]{3,4}\\d{4}),(\\b[a-zA-Z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}\\b),(([0-9/]{1,4}){3})");
//			Matcher m1 = p1.matcher(input);
//
//			while (m1.find()) {
//				results.add(new Contact(m1.group(1), m1.group(2), m1.group(3), m1
//						.group(4)));
//			}
//			return results;
//		}
	  
	  //MAIN----------------------------------------------------------------------------------------------------
	  
	  public static void main(String[] args) throws ClassNotFoundException, IOException {
	        
		  ArrayList<Object> listAcc = new ArrayList<Object>();
		  listAcc.add(new Account(1, "John", 1000));
	      listAcc.add(new Account(2, "Smith", 2000));
	      listAcc.add(new Account(3, "Tom", 3000));
	      Main main = new Main();
	      main.writeObject(listAcc);
	      ArrayList<Account> listAccount = main.readObject();
	      System.out.println("listisze:" + listAccount.size());
	      if (listAccount.size() > 0) 
	      {
	          for (Account account : listAccount) 
	          {
	              System.out.println(((Account) account).toString());
	          }
	      }
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
//		  //-------------------------------------------------------------------------------------------------------------------------------//
////	            ArrayList<Object> listAcc = new ArrayList<Object>();
//	        	 ArrayList<Contact> listAcc = new ArrayList<Contact>();
//			  	MyFile myFile = new MyFile();
//				String input = myFile.readTextFile("Contacts.csv");
//				Pattern p1 = Pattern.compile("(\\b[A-Z][a-z]+ [A-Z]?[.]? ?[A-Z\']{1,3}[a-z]+\\b),([0-9 ()-]{3,6}[0-9-]{3,4}\\d{4}),(\\b[a-zA-Z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}\\b),(([0-9/]{1,4}){3})");
//				Matcher m1 = p1.matcher(input);
//	
//				while (m1.find()) 
//				{
//					listAcc.add(new Contact(m1.group(1), m1.group(2), m1.group(3), m1.group(4)));
//					System.out.println(listAcc);
//				}	        
//		//-------------------------------------------------------------------------------------------------------------------------------//
	    }
	  
}






//
//public class TheMain {
//
//	  public void writeObject(ArrayList<Object> listContact) throws IOException {
//	       
//	    	//Create FileOutputStream to write file
//	        FileOutputStream fos = new FileOutputStream("Serializable2.txt");
//	        //Create ObjectOutputStream to write object
//	        ObjectOutputStream objOutputStream = new ObjectOutputStream(fos);
//	        //Write object to file
//	        for (Object obj : listContact) {
//
//	            objOutputStream.writeObject(obj);
//	            objOutputStream.reset();
//	        }
//	        objOutputStream.close();
//	    }
//
//	  //provided---------------------------------------------------//
//	  
//	  public ArrayList<Contact> readObject() throws ClassNotFoundException, IOException {
//	        ArrayList<Contact> listContact = new ArrayList();
//	        
//	        //Create new FileInputStream object to read file
//	       // FileInputStream fis = new FileInputStream("Serializable2.txt");---------
//	        FileInputStream fis = new FileInputStream("Contacts.csv");
//	        //Create new ObjectInputStream object to read object from file
//	        ObjectInputStream obj = new ObjectInputStream(fis);
//	        try {
//	            while (fis.available() != -1) {
//	                //Read object from file
//	                Contact cc = (Contact) obj.readObject();
////	                listContact.add(cc);
//	                listContact.add(cc);
//	            }
//	        } catch (EOFException ex) {
//	            //ex.printStackTrace();
//	        }
//	        return listContact;
//	    }
//	  
//	  //own------------------------------------------------------------
//	  
////	  public static ArrayList<Contact> readContacts(String file) {
////			ArrayList<Contact> results = new ArrayList<Contact>();
////			MyFile myFile = new MyFile();
////			String input = myFile.readTextFile("Contacts.csv");
////			Pattern p1 = Pattern
////					.compile("(\\b[A-Z][a-z]+ [A-Z]?[.]? ?[A-Z\']{1,3}[a-z]+\\b),([0-9 ()-]{3,6}[0-9-]{3,4}\\d{4}),(\\b[a-zA-Z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}\\b),(([0-9/]{1,4}){3})");
////			Matcher m1 = p1.matcher(input);
////
////			while (m1.find()) {
////				results.add(new Contact(m1.group(1), m1.group(2), m1.group(3), m1
////						.group(4)));
////			}
////			return results;
////		}
//	  
//	  //MAIN----------------------------------------------------------------------------------------------------
//	  
//	  public static void main(String[] args) throws ClassNotFoundException {
////	        try {
//	            // TODO code application logic here
////	            ArrayList<Object> listAcc = new ArrayList<Object>();
//	//		  	MyFile myFile = new MyFile();
//	//			String input = myFile.readTextFile("Contacts.csv");
//	//			Pattern p1 = Pattern.compile("(\\b[A-Z][a-z]+ [A-Z]?[.]? ?[A-Z\']{1,3}[a-z]+\\b),([0-9 ()-]{3,6}[0-9-]{3,4}\\d{4}),(\\b[a-zA-Z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}\\b),(([0-9/]{1,4}){3})");
//	//			Matcher m1 = p1.matcher(input);
//	//
//	//			while (m1.find()) {
//	//				results.add(new Contact(m1.group(1), m1.group(2), m1.group(3), m1.group(4)));
//	//			}
//		  
////	            listAcc.add(new Account(1, "John", 1000));
////	            listAcc.add(new Account(2, "Smith", 2000));
////	            listAcc.add(new Account(3, "Tom", 3000));
////	            Main main = new Main();
////	            main.writeObject(listAcc);
////	            ArrayList<Account> listAccount = main.readObject();
////	            System.out.println("listisze:" + listAccount.size());
////	            if (listAccount.size() > 0) {
////	                for (Account account : listAccount) {
////	                    System.out.println(((Account) account).toString());
////	                }
////	            }
////	        } catch (IOException ex) {
////	            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
////	        }
////	        	ArrayList<Contact> results = new ArrayList<Contact>();
////	        	MyFile myFile = new MyFile();
////				String input = myFile.readTextFile("Contacts.csv");
////				Pattern p1 = Pattern.compile("(\\b[A-Z][a-z]+ [A-Z]?[.]? ?[A-Z\']{1,3}[a-z]+\\b),([0-9 ()-]{3,6}[0-9-]{3,4}\\d{4}),(\\b[a-zA-Z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}\\b),(([0-9/]{1,4}){3})");
////				Matcher m1 = p1.matcher(input);
////	
////				while (m1.find()) {
////					results.add(new Contact(m1.group(1), m1.group(2), m1.group(3), m1.group(4)));
////				}
//	        
//	        
//	    }
//	  
//}






