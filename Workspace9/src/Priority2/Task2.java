package Priority2;

/**
 * @author cschaffer
 * 
 * Task implements priority2 and comparable object in this multiple inheritence.
 * we set an int so that we can give the strings an order of importance. 
 */

public class Task2 implements Priority2, Comparable<Object> {


	 String descriptions;
	    int prior;
	    //constructor//
	    public Task2(String description, int p) {
	        descriptions = description;
	        prior = p;
	    }
	    //passes the string and the int value
	    public String toString() {
	        return "Chore Description: " + descriptions + "\n" + "Priority: " + prior;
	    }
	    //sets the required
		@Override
		public void setPriority2(String description, int p) {
			descriptions = description;
			prior = p;
			
		}
		//gets the string
		@Override
		public String getPriority2() {
			
			return descriptions;
		}
		//gets the int value
		@Override
		public int getPriority2One() {
			
			return prior;
		}
		//puts chores through a  comparable object in order to order them from importance level. 
		public int compareTo(Object tsk) {
	        if (this.prior == ((Task2) tsk).prior)
	            return 0;
	        else if ((this.prior) > ((Task2) tsk).prior)
	            return 1;
	        else
	            return -1;
	    }
		
}	
	
//ALSO WORKING CODE
	
//    String descriptions;
//    int prior;
//    
//    public Task2(String description, int p) {
//        descriptions = description;
//        prior = p;
//    }
//
//    public String toString() {
//        return "Chore Description: " + descriptions + "\n" + "Priority: " + prior;
//    }
//
//	@Override
//	public void setPriority2(String description) {
//		descriptions = description;
//		
//	}
//	
//	@Override
//	public String getPriority2() {
//		
//		return descriptions;
//	}
//
//	public int compareTo(Object tsk) {
//        if (this.prior == ((Task2) tsk).prior)
//            return 0;
//        else if ((this.prior) > ((Task2) tsk).prior)
//            return 1;
//        else
//            return -1;
//    }









