package Chapter10prog4;

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
 *the program throws an exception.  
 */

public class DocumentsDriver {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws InvalidDocumentCodeException {

		InvalidDocumentCodeException problem = new InvalidDocumentCodeException(
				"This is not a valid document type.");

		final String personal = "P Document";//valid
		final String confidential = "C Document";//valid
		final String undent = "U Document";//valid
		final String xDoc = "X Document";//invalid

		List docList = new ArrayList(5);

		docList.add(personal);
		docList.add(undent);
		docList.add(confidential);
		docList.add("P Document");
		docList.add("ZD"); // exceptions
		docList.add(xDoc); // exceptions

		// Collections.sort(docList);
		Iterator it = docList.iterator();
		System.out.println(docList);

		while (it.hasNext()) {

			Object element = it.next();
			if (((String) element).contains(personal)|| ((String) element).contains(confidential)|| ((String) element).contains(undent))
			{
				System.out.println(element + "\n");
			} 
			
			else {
				System.out.println("\n");
				throw problem;
			}
		}
		System.out.println("End of Main Method.");//never reaches this. 
	}
}
