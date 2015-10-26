package pack2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Test {

	//public static final String[] SET_VALUES = new String[] { "a", "b" };
	//public static final Set<String> MY_SET = new HashSet<String>(Arrays.asList(SET_VALUES));
	
	public static void main(String[] args) {

//		 Set<String> h = new HashSet<String>();
//		    h.add("a");
//		    h.add("b");
//		
//		  System.out.println(h);
		
		//Set<String> h = new HashSet<String>(Arrays.asList("a", "b"));
		
		Set<String> h = new HashSet<String>() {{
		    add("a");
		    add("b");
		}};
		
		Set<String> j = new HashSet<String>() {{
		    add("z");
		    add("y");
		    add("g");
		    add("x");
		}};
		
		System.out.println(h);
		System.out.println(j);
	}

}
