package pack;

public class InvalidNumberOfXToRemove extends Exception {

	 private String message = null;
	 
	    public InvalidNumberOfXToRemove() {
	        super();
	    }
	 
	    public InvalidNumberOfXToRemove(String message) {
	        super(message);
	        this.message = message;
	    }
	 
	    public InvalidNumberOfXToRemove(Throwable cause) {
	        super(cause);
	    }
	 
	    @Override
	    public String toString() {
	        return message;
	    }
	 
	    @Override
	    public String getMessage() {
	        return message;
	    }
	
}
