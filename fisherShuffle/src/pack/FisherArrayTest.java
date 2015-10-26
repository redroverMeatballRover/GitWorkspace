package pack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class FisherArrayTest {
	
	public static String SuitValue[] = { "Diamonds", "Hearts", "Clubs", "Spades" };
	public static String CardValue[] = { "Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
	
	public static String ultClub1 = (CardValue[0] + " of " + SuitValue[2]);
	public static String ultClub2 = (CardValue[1] + " of " + SuitValue[2]);
	public static String ultClub3 = (CardValue[2] + " of " + SuitValue[2]);
	public static String ultClub4 = (CardValue[3] + " of " + SuitValue[2]);
	public static String ultClub5 = (CardValue[4] + " of " + SuitValue[2]);
	public static String ultClub6 = (CardValue[5] + " of " + SuitValue[2]);
	public String ultClub7 = (CardValue[6] + " of " + SuitValue[2]);
	public String ultClub8 = (CardValue[7] + " of " + SuitValue[2]);
	public String ultClub9 = (CardValue[8] + " of " + SuitValue[2]);
	public String ultClub10 = (CardValue[9] + " of " + SuitValue[2]);
	public String ultClub11 = (CardValue[10] + " of " + SuitValue[2]);
	public String ultClub12 = (CardValue[11] + " of " + SuitValue[2]);
	public String ultClub13 = (CardValue[12] + " of " + SuitValue[2]);

		public static void main(String[] args) {

//			String cardDrawn[] = {"one", "two", "three" "four","five", "six"};
//			for (String s : )
			
			
			//EXAMPLE ONE - ARRAY LIST
			//first one prints an order
			List<String> sl = new ArrayList<String>();
			sl.add(ultClub1);
			sl.add(ultClub2);
			sl.add(ultClub3);
			sl.add(ultClub4);
			sl.add(ultClub5);
			sl.add(ultClub6);
			for (String s : sl) {
				System.out.println(s);
				
			}
			//second one prints out unordered. 
			System.out.println();
			Collections.shuffle(sl);
			for (String s : sl) {
				System.out.println(s);
			}

		}

		public void testingTheory()
		{
			// Create a list
			List list = new ArrayList();
			 
			// Add elements to list
			 
			// Shuffle the elements in the list
			Collections.shuffle(list);
			 
			// Create an array
			String[] testArray = new String[]{ultClub1, ultClub2, ultClub3, ultClub4,
					ultClub5};
			 
			// Shuffle the elements in the array
			Collections.shuffle(Arrays.asList(testArray));
		
			
		}
		
		public void clubString()
		{
		
			String[] ultimateClub = { ultClub1, ultClub2, ultClub3, ultClub4,
				ultClub5, ultClub6, ultClub7, ultClub8, ultClub9, ultClub10,
				ultClub11, ultClub12, ultClub13 };
		}

		public static class ShuffleArray {
			  public static void shuffleArray(int[] a) {
			    int n = a.length;
			    Random random = new Random();
			    random.nextInt();
			    for (int i = 0; i < n; i++) {
			      int change = i + random.nextInt(n - i);
			      swap(a, i, change);
			    }
			  }

			  private static void swap(int[] a, int i, int change) {
			    int helper = a[i];
			    a[i] = a[change];
			    a[change] = helper;
			  }

			  public static void main(String[] args) {
			    int[] a = new int[] { 1, 2, 3, 4, 5, 6, 7 };
			    shuffleArray(a);
			    for (int i : a) {
			      System.out.println(i);
			    }
			  }
			} 
		
		
		
		
		
		
		
		

}





