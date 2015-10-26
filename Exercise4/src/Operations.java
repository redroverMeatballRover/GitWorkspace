import java.lang.reflect.Array;
import java.sql.ResultSet;
import java.util.Arrays;
import java.util.Collections;


public class Operations {

	public static void main(String[] args)
	{
	      Integer[] intArray = { 1, 2, 3, 4, 5 };   // should output [1, 2, 3, 4, 5]
	      System.out.println(java.util.Arrays.toString(intArray));

	     // Operations.swap(intArray, 1, 3); // should output [1, 4, 3, 2, 5]

	     
	    //  System.out.println(java.util.Arrays.toString(intArray));
	      Operations.reverse(intArray); // should output [5, 2, 3, 4, 1]  
	      System.out.println(java.util.Arrays.toString(intArray));

//	      Integer[] subArray = Operations.subset(intArray, 2, 3);
//	      // should output [3, 4]
//	      System.out.println(java.util.Arrays.toString(subArray));
	}

	public static<T> void swap(T[] a,  int i, int j)
	{
		 T temp = a[i];
	        a[i] = a[j];
	        a[j] = temp;	
	}
	
	public static<T> void reverse (T[] a)
	{
//		for (int i = 0; i < a.length; i++ )
//		{
//			swap(a, i + 1, 0);
//		}
		//swap(a, 0, 4);
		
		
		for (int i = 0; i < 1; i++ )	// needs to swap 0 and 4, 1 and 3
			{
				swap(a,  0, 4);
				swap(a,  1, 3);
//				for (int j = 1; j < 1; j++ )
//				{
//				swap(a,  1, 3);
//				}
			}
		
		
//		Collections.reverse(Arrays.asList(a));
		//T = { 5,4,3,2,1,0 };
		
		//return new T[] = {a[4], a[3], a[2], a[1], a[0]};
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
	
//	public static<T> T[] subset (T[] a,  int i, int j)
//	{
////		Integer[] intArray = { 1, 2, 3, 4, 5 };
////		Array.getInt(a, i);
////		return a;
//		
////		Collections.copy(Arrays.asList(a), a[i]);
////		return a;
//		
////		//Arrays.copyOfRange( a, i, a.length);	
////		Arrays.copyOfRange(a, i, j);
////		return a;
//		
//		T TempObj = a[i];
//		T TempObj2 = a[j];
//		int[] az = new int[1];
//		az[0] = (Integer) TempObj;
//		az[1] = (Integer) TempObj2;
//		
//		T[] a = az;
//		
//		return a;
//		
//	}
	
	
	
}

