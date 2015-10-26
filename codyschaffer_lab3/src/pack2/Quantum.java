package pack2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import pack.MyFile;


/**
 * Demonstrates how to extract multiple "groups" from a given string
 * using regular expressions and the Pattern and Matcher classes.
 * 
 * Note: "\\S" means "A non-whitespace character".
 * @see http://java.sun.com/j2se/1.5.0/docs/api/java/util/regex/Pattern.html
 */
public class Quantum
{
  public static void main(String[] args)
  {
//	MyFile myFile = new MyFile();
//	String input = myFile.readTextFile("Contacts.csv");
	String stringToSearch = "Four score and seven years ago our fathers ...";

    // specify that we want to search for two groups in the string
    //Pattern p = Pattern.compile("([A-Za-z]+ [A-Za-z]+) .* (\\d+{1,2}[/-]\\d{1,2}[/-]\\d{1,4})");
	// Pattern p = Pattern.compile("(\\S+or\\S+) .* (\\S+the\\S+)");
	Pattern p = Pattern.compile("(\\b[A-Z][a-z]+ [A-Z]?[.]? ?[A-Z\']{1,3}[a-z]+\\b),([0-9 ()-]{3,6}[0-9-]{3,4}\\d{4}),(\\b[a-zA-Z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}\\b),(([0-9/]{1,4}){3})");
    Matcher m = p.matcher(stringToSearch);

    // if our pattern matches the string, we can try to extract our groups
    if (m.find())
    {
      // get the two groups we were looking for
      String group1 = m.group(1);
      String group2 = m.group(2);
      String group3 = m.group(3);
      String group4 = m.group(4);
      
      // print the groups, with a wee bit of formatting
//      System.out.format("'%s', '%s'\n", group1, group2);
      System.out.println(group1);
      System.out.println(group2);
      System.out.println(group3);
      System.out.println(group4);
    }

  }
}