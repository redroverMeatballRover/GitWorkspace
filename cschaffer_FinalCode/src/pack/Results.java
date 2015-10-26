package pack;

import java.util.ArrayList;
import java.util.List;

public class Results extends CoinTrials {

	
	String coinDes;
	double countH;
	double countT;
	
	
	public Results(int numCoins, int numFlips) {
		
		super(numCoins, numFlips);
		
	}

	@Override
	void doTrial() {
		
		Coin c1 = new Coin();
		Coin c2 = new Coin();
		Coin c3 = new Coin();
		Coin c4 = new Coin();
		
		
		for (int i = 0; i < 1; i++)
		{
//		c1.makeList();
//		c2.makeList();
//		c3.makeList();
//		c4.makeList();
			c1.test();
			c2.test();
			c3.test();
			c4.test();
		
		if (c1.test() == "Heads")
			{
				//coinRes.add(result);
				countH++;
			}
		else if (c2.test() == "Heads")
		{
			//coinRes.add(result);
			countH++;
		}
		else if (c3.test() == "Heads")
		{
			//coinRes.add(result);
			countH++;
		}
		else if (c4.test() == "Heads")
		{
			//coinRes.add(result);
			countH++;
		}
			
		
			
		System.out.println(countH);
		
		
		}
		
//		String result;
//		//List<String> coinRes = new ArrayList<String>();
//	
////		for (int i = 0; i == 1; i++)
//		for (int i = 0; i < 1; i++)
//		{
//			result = test();
//			
//			if (result == "Heads")
//			{
//				//coinRes.add(result);
//				countH++;
//				//System.out.println("Heads: " + countH + "    " + i + "      " + countH/i);
//			}
//			else 
//			{
//				//coinRes.add(result);
//				//countT++;
//			}
//			
//			
//			
//		}
		
		
		
		}
		
	

	@Override
	void reportTrial() 
	{
		
		
	}

	
	
}

//public class  {
//
//	
//	 
//	//public class Factorial {
//	    public static void main (String[ ] args) {
//	      System.out.println("Enter the number for factorial calculations : "); 
//	 
//	      Scanner scanner = new Scanner(System.in);
//	       
//	      int a = scanner.nextInt();
//	      double fact= 1;
//	 
//	      System.out.println("Factorial of " +a+ ":");
//	      
//	      for (int i= 1; i<=a; i++)
//	      {
//	        fact=fact*i;
//	      }
//	      System.out.println(fact);
//	   }
//	} 
////}