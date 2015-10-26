package pack;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CoinToss {

	String coinDes;
	double countH;
	double countT;
	
	
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
	
public void makeList()
{
	String result;
	
//	ArrayList<String> typeCoinFlips;
//	typeCoinFlips = new ArrayList<String>();

	List<String> coinRes = new ArrayList<String>();
	
	
	for (int i = 0; i < 10; i++)
	{
		result = test();
		
		if (result == "Heads")
		{
			coinRes.add(result);
			countH++;
		}
		else 
		{
			coinRes.add(result);
			countT++;
		}
	}
	
	System.out.println("------------------------------------");
	System.out.println(coinRes);
	System.out.println("Number of Heads: " + countH);
	System.out.println("Number of Tails: " + countT);
	
	double compute = (countH / countT);
	 System.out.println("The fraction of heads over tails is: " + compute);
	
	 System.out.println("---------------------------------");
	 
	 double factorial = 1;
	 for (int i = 1; i <= countH; i++)
	 {
		 factorial = factorial*i;
	 } 
	 System.out.println("\n Factorial of heads: " + factorial);
	
}


}
