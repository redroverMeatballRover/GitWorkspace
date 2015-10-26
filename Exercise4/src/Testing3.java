
//import java.io.IOException;
//import java.util.Arrays;
//import java.util.List;
//
//public class Testing3 {
//    
//	
//	public static void main(String[] args) throws Exception {
//	
//		testSubarray();
//		
//	}	
//		    public static void testSubarray() throws Exception {
//		    	Integer[] array = {1, 2, 3, 4, 5};
//		    	List<Integer> list = Arrays.asList(array);
//		    	List<Integer> subList = list.subList(2, 4);
//		    	assertEquals(2, subList.size());
//		    	assertEquals((Integer) 3, subList.get(0));
//		    	list.set(2, 7);
//		    	assertEquals((Integer) 7, subList.get(0));
//		    
//		
//		  
//		//List.subList(int startIndex, int endIndex)
//		//You would first need to wrap the Array as a List: Arrays.asList(...).sublist(...);  	
//		
//	}
//
//	
//	
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public static void test() throws IOException
//	{
//		String s = "Copy a subset of one array to another examples";
//
//		// copy bytes with range
//		byte[] bytes = s.getBytes();
//		System.out.write(Arrays.copyOfRange(bytes, 7, 20));
//		System.out.println();
//
//		// copy char with range
//		char[] chars = s.toCharArray();
//		System.out.println(Arrays.copyOfRange(chars, 30, 45));
//	    }
//	
//	public static void test2() throws IOException
//	{
//		int[] s = {1,2,3,4,5};
//	
//		// copy bytes with range
//		Class<? extends int[]> num = s.getClass();
//		System.out.println(Arrays.copyOfRange(s, 2, 3));
//		System.out.println();
//	
//		// copy char with range
////		char[] chars = s.toCharArray();
////		System.out.println(Arrays.copyOfRange(chars, 30, 45));
//	    }
//	}