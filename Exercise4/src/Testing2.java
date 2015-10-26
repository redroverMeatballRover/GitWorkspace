//import java.util.Scanner;
//
//
//public class Testing2 {
//
//	public static void main(String[] args) {
//		
//		
//	}
//	
//	public static<R> void test()
//	{
//		/**
//		 * Testing 1: Generic R instantiated in concrete String
//		 */
//		System.out.println("Enter a sentence, and I'll reverse it:");
//		Scanner scan = new Scanner(System.in);
//		String sentence = scan.nextLine();
//		
//		String[] words = sentence.split(" ");
//		
//		R reversed = new R<String>(words);
//		
//		System.out.println("Reversed: ");
//		for(int i=0; i<((String) reversed).length(); ++i)
//			System.out.print(" "+((Object) reversed).get(i));
//		
//		/**
//		 * f) Testing 2: Generic R instantiated in concrete Integer
//		 */
//	}
//
//}

class MainClass {  
  public static void main(String args[]) {  
    byte ascii[] = { 65, 66, 67, 68, 69, 70 };  
  
    String s1 = new String(ascii);  
    System.out.println(s1);  
  
    String s2 = new String(ascii, 2, 3);  
    System.out.println(s2);  
  }  
}  