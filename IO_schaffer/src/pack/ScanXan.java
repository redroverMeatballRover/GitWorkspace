package pack;


//array option

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;

public class ScanXan {
    public static void main(String[] args) throws IOException {

    	List<String> contact = new ArrayList<String>();
    	
        Scanner s = null;

        try {
            s = new Scanner(new BufferedReader(new FileReader("infoEmps.txt")));

            while (s.hasNext()) 
            {
            	contact.add(s.next());
              //  System.out.println(s.nextLine());
            }
            
        } finally {
            if (s != null) {
                s.close();
                
                System.out.println(contact.get(2) + " " + contact.get(3));
               // Collections.sort(contact);
                
                
                
                
                
                
            }
        }
    }
}



















//import java.io.*;
//import java.util.Scanner;
//
//public class ScanXan {
//    public static void main(String[] args) throws IOException {
//
//        Scanner s = null;
//
//        try {
//            s = new Scanner(new BufferedReader(new FileReader("infoEmps.txt")));
//
////            while (s.hasNextLine()) {
////                System.out.println(s.nextLine());
////            }
//            
//           for (int i = 0; i < 2; i++) {
//               
//        	   System.out.println(s.nextLine());
//            }
//            
//        } finally {
//            if (s != null) {
//            	//s.useDelimiter(",\\s:*");
//                s.close();
//            }
//        }
//    }
//}