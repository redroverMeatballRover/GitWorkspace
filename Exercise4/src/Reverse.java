
import java.util.Scanner;
import java.util.Stack;

/**
 * Generics and the use of stack:
 * 
 * 1) Finish the generic class of R, so when the main program runs, it produce the reversed 
 * words from the user entered sentence 
 * 
 * 2) In the main, add a second block which
 *   - generate 10 random integers
 *   - instantiate a new R object in the concrete type of Integer
 *   - and display the original and reversed versions of the random numbers 
 * 
 */

public class Reverse {
	
	public static void main(String[] args) {
		/**
		 * Testing 1: Generic R instantiated in concrete String
		 */
		System.out.println("Enter a sentence, and I'll reverse it:");
		Scanner scan = new Scanner(System.in);
		String sentence = scan.nextLine();
		
		String[] words = sentence.split(" ");
		
		R<String> reversed = new R<String>(words);
		
		System.out.println("Reversed: ");
		for(int i=0; i<reversed.length(); ++i)
			System.out.print(" "+reversed.get(i));
		
		/**
		 * f) Testing 2: Generic R instantiated in concrete Integer
		 */
		
	}

}

/**
 * Generic R class to stores the reversed version 
 * given an generic array
 * @author jxue
 *
 * @param <T>
 */
class R<T> {
	/**
	 * a) Declare a private generic array
	 */

	/**
	 * b) A private method which reverse the order of the current 
	 * generic array
	 * 
	 * User Java's generic stack to finish the implementation
	 * 
	 */
	private void reverse(){
		
	}


	/**
	 * c) Generic constructor
	 * Make use the private method you have implemented in b)
	 */
	public R(T[] original){
		
	}

	/**
	 * d) Get a specific item from the internal array
	 * @param index
	 * @return
	 */
	public T get(int index){
		return null;
	}
	
	/**
	 * e) Return the length of the array
	 * @return
	 */
	public int length() {
		return 0;
	}
	
}