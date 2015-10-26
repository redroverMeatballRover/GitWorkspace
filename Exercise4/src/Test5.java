import java.lang.reflect.Array;
import java.sql.ResultSet;
import java.util.Arrays;
import java.util.Collections;


public class Test5 {

	public static void main(String[] args)
	{
	      Integer[] intArray = { 1, 2, 3, 4, 5 };   // should output [1, 2, 3, 4, 5]
	      System.out.println(java.util.Arrays.toString(intArray));
//
//	      Operations.swap(intArray, 1, 3); // should output [1, 4, 3, 2, 5]
//
//	     
//	      System.out.println(java.util.Arrays.toString(intArray));
//	      Operations.reverse(intArray); // should output [5, 2, 3, 4, 1]  
//	      System.out.println(java.util.Arrays.toString(intArray));

	      Integer[] subArray = Operations.subset(intArray, 2, 3);
	      // should output [3, 4]
	      System.out.println(java.util.Arrays.toString(subArray));
	}

	public static<T> void swap(T[] a,  int i, int j)
	{
		 T temp = a[i];
	        a[i] = a[j];
	        a[j] = temp;	
	}
	
	public static<T> void reverse (T[] a)
	{
		Collections.reverse(Arrays.asList(a));
	}

	
	public static<T> T[] subset (T[] t,  int start, int end)  //public static<T extends Object> T[] subset (T[] t,  int start, int end) &&    public static Object[] subset (Object[] t,  int start, int end)
	{
		int size = end - start;
		T[] sub = Arrays.copyOfRange(t, start, end + 1);
		
		//Object t = new Object();
		
		for (int i = 0; i <size; ++i)
		{
			sub[i] = t[start + i];
		}
		
		
		
		return sub;
	}
	
	
	
}