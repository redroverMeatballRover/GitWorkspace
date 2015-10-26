package test2;

import java.util.ArrayList;
import java.util.Scanner;

public class Process{

public static void main(String[] args){

   ArrayList<Key> key = new ArrayList<Key>();
   String choice;
   String cipher;
   String plain;


   Scanner scan = new Scanner(System.in);


   //asks user for file name with cipher key
   System.out.print("Enter a file name containing your key: ");
   String fileName = scan.next();



   // ask user to encrypt or decrypt using the key
   System.out.print("Would you like to encrypt or decrypt? ");
   choice = scan.next();

   // ask for name of file containing message
   System.out.println("Enter a file name containing your message: ");  
   String fileName2 = scan.next();

   //perform the appropriate substitution on the message
   if (choice.equals("encrypt"))
   {

   }

   else if (choice.equals("decrypt"))
   {

   }

   //display both text and cipher
   for(Key ke : key)
   System.out.println(ke.getCipher() + "\n" + ke.getPlain());

   }
}