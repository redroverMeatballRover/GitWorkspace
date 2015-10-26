package Priority;
import java.util.List;
	  
/**
 * @author cschaffer
 *
 * The class task implements priority. It creates a description and passes 
 * it to the getters/setters before it is sent to the toString.
 */
public class Task implements Priority {

	String description;
	//Task[] taskList = new Task[5];

	/**
	 * Constructor 
	 * @param i 
	 */
	public Task(String desc) {

		description = desc;
	
	}
	//setter
	@Override
	public void setPriority(String desc) {
		description = desc;

	}
	//getter
	@Override
	public String getPriority() {
		return description;
	}
	//toString
	public String toString() {
		return "Chore Description: " + description;
	}

}
		
//--------------------------------------------------------------------------------------------------------------
	//WORKS//
//	public class Task implements Priority {
//
//	    
//	    String description;
//	    
//	    public Task(String desc) {
//	       
//	    	description = desc;
//	        
//	    }
//
//	    @Override
//		public void setPriority(String desc) {
//			description = desc;
//			
//		}
//	    
//		@Override
//		public String getPriority() 
//		{
//			return description;
//		}
//
//		public String toString() {
//	        return "Chore Description: " + description;
//	    }

