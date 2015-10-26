package Chapter10prog4;


/** 
 * @author cschaffer
 *
 *this class is an exception.
 */

public class InvalidDocumentCodeException extends Exception {

	/**
	 * creating a exception object with a message.
	 */
	private static final long serialVersionUID = 1L;

	InvalidDocumentCodeException(String message)
	{
		super(message);
	}

}
