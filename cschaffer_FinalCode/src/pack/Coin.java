package pack;

//
//
//public class Coin 
//{
//	private final int HEADS = 0; // tails is 1
//	private int face; // current side showing
//
//	
//	public Coin ()
//	{
//		
//		flip();
//	}
//	
//	public void flip ()
//	{
//		face = (int) (Math.random() * 2);
//	}
//
//	public boolean isHeads ()
//	{
//		return (face == HEADS);
//	}
//
//	public String toString()
//	{
//		return (face == HEADS) ? "Heads" : "Tails";
//	}
//
//}




import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Coin {

	String coinDes;
	int countH;
	double countT;
	
	public Coin ()
	{
		
		flip();
	}
	
	
	public String test()
	{	
	Random rand = new Random();
	int coin = rand.nextInt(2) + 1;
	//System.out.println(coin);
	
	if (coin == 1)
		coinDes = "Heads";
	else
		coinDes = "Tails";
	
	return coinDes;
	}
	
	public void flip()
	{
		test();
		//System.out.println(test());
	}
	
	
	public void makeList()
	{
		String result;
		//List<String> coinRes = new ArrayList<String>();
	
//		for (int i = 0; i == 1; i++)
		for (int i = 0; i < 1; i++)
		{
			result = test();
			
			if (result == "Heads")
			{
				//coinRes.add(result);
				countH++;
				//System.out.println("Heads: " + countH + "    " + i + "      " + countH/i);
			}
			else 
			{
				//coinRes.add(result);
				//countT++;
			}
			
			
			
		}
		
		//System.out.println("------------------------------------");
		//System.out.println(coinRes);
		
		System.out.println("Number of Heads: " + countH);
		
		
		//System.out.println("Number of Tails: " + countT);
		//double compute = (countH / countT);
		
		
		//System.out.println("The fraction of heads over tails is: " + compute);
		
		// System.out.println("---------------------------------");
		 
//		 double factorial = 1;
//		 for (int i = 1; i <= countH; i++)
//		 {
//			 factorial = factorial*i;
//		 } 
//		 System.out.println("\n Factorial of heads: " + factorial);
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//public void makeList()
//{
//	String result;
//	List<String> coinRes = new ArrayList<String>();
//	
//	
//	
//	for (double i = 0; i < 40; i++)
//	{
//		result = test();
//		
//		if (result == "Heads")
//		{
//			coinRes.add(result);
//			countH++;
//			System.out.println("Heads: " + countH + "    " + i + "      " + countH/i);
//		}
//		else 
//		{
//			coinRes.add(result);
//			countT++;
//		}
//		
//		
//		
//	}
//	
//	//System.out.println("------------------------------------");
//	//System.out.println(coinRes);
//	
//	//System.out.println("Number of Heads: " + countH);
//	
//	
//	//System.out.println("Number of Tails: " + countT);
//	//double compute = (countH / countT);
//	
//	
//	//System.out.println("The fraction of heads over tails is: " + compute);
//	
//	// System.out.println("---------------------------------");
//	 
////	 double factorial = 1;
////	 for (int i = 1; i <= countH; i++)
////	 {
////		 factorial = factorial*i;
////	 } 
////	 System.out.println("\n Factorial of heads: " + factorial);
//
//}
	



}