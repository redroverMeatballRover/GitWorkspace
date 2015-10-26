package pack2;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import pack.MyFile;

public class Quantum2 {
  public static void main (String[] args) throws Exception {
    //Matcher m = Pattern.compile("^([^:]+):\\s*(.*)$").matcher("foo: a b c d");
	  MyFile myFile = new MyFile();
	  String input = myFile.readTextFile("Contacts.csv");
	  Matcher m = Pattern.compile("^([^:]+):\\s*(.*)$").matcher("foo: a b c d");
   
    if(m.find()) 
    {
      String key = m.group(1);
      String[] values = m.group(2).split("\\s+");
      System.out.printf("key=%s, values=%s", key, Arrays.toString(values));
     
      System.out.println(key);
      System.out.println(Arrays.toString(values));
    }
  }
}
