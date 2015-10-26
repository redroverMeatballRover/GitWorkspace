import java.util.Arrays;
import java.util.Collections;


public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
	      Integer[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};   // should output [1, 2, 3, 4, 5]
	     
	      System.out.println(java.util.Arrays.toString(intArray));
	      Test.reverse(intArray); // should output [5, 2, 3, 4, 1]
	      System.out.println(java.util.Arrays.toString(intArray));

	}
	
//	public static int[] reverse3(Integer[] intArray) {
//	    return new int[] { intArray[8], intArray[7], intArray[6], intArray[5], intArray[4], intArray[3], intArray[2], intArray[1], intArray[0] };
//	}
	
	public static <T> T[] reverse(T[] array) {
	  //  T[] copy = array.clone();
		T[] copy = array.clone();
//	    Collections.reverse(Arrays.asList(copy));
		Collections.reverse(Arrays.asList(copy));
	    return copy;
	}
	
//	public static <T> void reverse(T[] a) 
//	{
//	    Collections.reverse(Arrays.asList(a));
//	}

//	public static <T> T[] reverse(T[] intArray) {
//	    T[] copy = intArray.clone();
//	    Collections.reverse(Arrays.asList(copy));
//	    return copy;
//	}
	
}
