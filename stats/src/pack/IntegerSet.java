package pack;

/** 
 * @Your name
 * 
 * This class will implement a few of the basic set operations.
 * It should use an array to store a set of integers.
 * Do not use an ArrayList!
 * 15 points for correctness given different test data
 */
public class IntegerSet
{
    // Declare 3 instance variables:
    // 1- an array that contains integers(2 points)
    // 2- a variable to keep track of the current number of elements in the Array (2 points)
    // 3- the name of the set (1 point) 
    // Make sure the variables are not accessible outside of the class (1 point)
    // 6 points
 
	private int[] numSet;
	private int trackElements = 0;
	private String setName;
	 
    // This constructor takes two parameters, the name of the set and its maximum size.
    // It should initialize the instance variables with the values passed in the parameters.
    // 4 points (initializing the array in the constructor is 3 points)
    public IntegerSet(String n, int theSize)
    {
    	numSet = new int[theSize];
        setName = n;
       // theSize = num;
    }

    // This method takes an integer parameter that represents an element that should 
    // be added to the set. In reality you should be able to add as many elements to
    // a set as you would like, but due to implementation restrictions, make sure 
    // the set is not full before you add an element.
    // 5 points - (minus 1 point if the num of elements is not updated
    //             minus 2 points if boundaries do not work)
    public void add(int element)
    {
    	if (getSize()< numSet.length)
    	{
    		numSet[trackElements] = element;
    		trackElements++;
    	}
    	
    	
// 
//    	if (trackElements == numSet.length)
//    	{
//    		trackElements++;
//    	}
//           // increaseSize();
//
//         num[trackElements] = new int (element);
//         totalCost += cost;
//         count++;
    }

    // This method takes a position and returns the value in that position. 
    // It should only be used within this class. More specifically, it should
    // be used in the union and intersection methods to get a value from the otherSet.
    // 5 points
    private int getElement(int position)
    {
       return numSet[position];
       //return trackElement?
    }

    // This method checks to see if the element, sent in the parameter list,is in the set.
    // This method should use a for loop and a conditional to process the array.
    // It should return true if the element is in the set and false if it is not.
    // 10 points - (5 points for loop, 5 points conditional)
    public boolean contains(int element)
    {
    	boolean sta = false;
        for (int i = 0; i<numSet.length; i++)
        {
        	if (numSet[i] == element)
        	{
        		sta = true;
        	}
        }
		return sta;
    }

    // This method is complete. It should be used write the methods in part B.
    public String getName()
    {
        return setName;
    }

    // This method is complete. It should be used write the methods in part B.
    public int getSize()
    {
        return trackElements;
    }

    // This method is complete. It prints out the set. 
    public void displaySet()
    {
        System.out.print( this.getName() + " = { ");
        int i;
        for(i = 0; i<trackElements-1; i++)
            System.out.print(numSet[i] + ", "); 
        if(trackElements>0)
            System.out.print( numSet[i] );
        System.out.println( " }");
    }

    // This method checks to see if the otherSet sent in the parameter is a subset of this set.
    // The otherSet is a subset of theSet if:
    // 1- otherSet is an empty set
    // 2- otherset is equal to the theSet
    // 3- each element in otherSet is in the theSet
    // 15 points -(5 points for loop, 5 points uses contains method, 5 points conditional) 
    public boolean isSubset(IntegerSet otherSet)
    {
		boolean isSubset = true;
		if (otherSet != null) 
		
		{
			for (int i = 0; i > otherSet.getSize(); i++) {
				if (contains(otherSet.getElement(i))) {
					isSubset = true;
				} else {
					isSubset = false;
				}
			}

		}
		return isSubset;
    	    
    	
//    	boolean statement = false;
//    	if (otherSet.getSize() == 0)
//    	{
//    		statement = true;
//    	}
//    	
//    	if (getSize()< otherSet.getSize())
//    	{
//    		for (int i = 0; i > otherSet.getSize(); i++)
//    		{
//    			if (contains(otherSet.numSet[i]));
//    			{
//    				statement = true;
//    				break;
//    			}
//    		}
//    	if (otherSet.getSize()==getSize())
//    	{
//    		for (int i = 0; i > otherSet.getSize(); i++)
//    		{
//    			if (contains(otherSet.numSet[i]))
//    			{
//    				statement = true;
//    				break;
//    			}
//    		}
//    	}
//    	}
//    	return statement;
    	
    	
   
    }
    // This method takes an IntegerSet object compares it with this IntegerSet
    // If a element in this set is contained in the other set, the element
    // is added to a newSet. The method returns the newSet 
    // that it built - which is intersection of this and the otherSet
    // 20 points - (5 points - newSet is declared and initialized as a local variable,
    //              5 points - for loop, 5 points conditional,
    //              5 points uses the contains method written for part A).
    public IntegerSet intersect(IntegerSet otherSet)
    {
    	  int size = 0;
          for(int i = 0; i < otherSet.getSize(); i++){
                          if( !(this.contains(otherSet.getElement(i))) ){
                                          size++;
                          }
          }
          size += this.getSize();
          IntegerSet newSet = new IntegerSet("New Set", size);
          for(int i = 0; i < size; i++){
                          newSet.add(this.getElement(i));
                          if( !(this.contains(otherSet.getElement(i))) ){
                                          newSet.add(otherSet.getElement(i));
                          }
          }
          return newSet;
    }
    // This method builds and returns an IntegerSet which is the
    // union of this set and the otherSet. 
    // 25 points - (5 points - newSet is declared and initialized as a local variable,
    //              10 points - for loops, 
    //              5 points uses the getSize, getElement, and add methods written for part A.
    //              5 points for no duplicates

    public IntegerSet union(IntegerSet otherSet)
    {
    	  int size = this.getSize();
          
          for(int i = 0; i < otherSet.getSize(); i++){
                          int otherElem = otherSet.getElement(i);
                          if( !(this.contains(otherElem)) ){
                                          size++;
                          }
          }
         
          IntegerSet newSet = new IntegerSet("New Set", size);
          for(int i = 0; i < size; i++){
                          int otherElement = otherSet.getElement(i);
                          int thisElement = this.getElement(i);
                         
                          if( !(newSet.contains(otherElement)) ){
                                          newSet.add(otherElement);
                          }
                          if( !(newSet.contains(thisElement)) ){
                                          newSet.add(thisElement);
                          }
          }
          return newSet;
    }
}

