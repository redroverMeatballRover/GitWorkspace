package Chapter10prog5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * 
 * @author cschaffer
 *
 *This class runs a program that checks for exceptions. A certain company orders its documents as
 *U,C, or P docs. The program checks that all of the documents are of this nature. If they are not, 
 *the program throws an exception. the exception is picked up by a try-catch. This try-catch sees the error, 
 *but does not print out the rest of the documents in the array list. We use a finally clause to let the user know of 
 * why the rest of the list does not print. 
 */


public class DocumentsDriver2 {
	//driver uses try-catch on risky method. The program dies once the exception is caught.
	public static void main(String[] args) {
		
		try 
		{
			checkingStuff();
		} 
		catch (InvalidDocumentCodeException2 e) 
		{	
			System.out.println("This is an invalid document entry in the code.");
			System.out.println("The call stack trace: ");
			e.printStackTrace();
		}
		finally
		{
			System.out.println("\nINCOMPLETE PROGRAM-----------------------------------------------------------------");
			System.out.println("The arraylist terminates at the exception point, the full array is not listed. dFull program does not run.");
		}
	}
	
	//this class is a risky method. It uses a throws to catch its exception. 
	@SuppressWarnings("unchecked")
	public static void checkingStuff() throws InvalidDocumentCodeException2 {

		InvalidDocumentCodeException2 problem = new InvalidDocumentCodeException2(
				"This is not a valid document type.");

		final String personal = "P Document";
		final String confidential = "C Document";
		final String undent = "U Document";
		final String xDoc = "X Document";
	
		List docList = new ArrayList(8);

		docList.add(personal);
		docList.add(undent);
		docList.add(confidential);
		docList.add("P Document");
		docList.add("Z Document"); // exceptions
		docList.add(xDoc); // exceptions
		docList.add(personal);
		docList.add(undent);
		docList.add(confidential);

		
		Iterator it = docList.iterator();

		System.out.println(docList);
		

		while (it.hasNext()) {

			Object element = it.next();
			if (((String) element).contains(personal)|| ((String) element).contains(confidential)|| ((String) element).contains(undent))
			{
				System.out.println(element + "\n");
			} 
			
			else 
			{
				System.out.println("\n");
				throw problem;
			}
		

		}
		System.out.println("End of Main Method.");
	}
	
}
