package pack;

import java.util.Random;

public class IceCreamVotes {

	private int[] iceCreamCount;
	Random random = new Random();
	
	
	public IceCreamVotes()
	{
		iceCreamCount = new int[10];
		for (int i = 0; i < iceCreamCount.length; i++ )
		{
			iceCreamCount[i] = 0;
		}
	}
	
	public void printArray()
	{
		
		for (int i = 0; i < iceCreamCount.length; i++ )
		{
			System.out.println(iceCreamCount[i]);
		}
	}
	
	public void fillArray()
	{
		
		
		for (int x = 0; x < iceCreamCount.length; x++)
	
		{
			int i = random.nextInt(10);
			iceCreamCount[x] = i;
		}
	}
	
	
	
	public static void main(String[] args) {
		
		IceCreamVotes voteArray = new IceCreamVotes();
		voteArray.fillArray();
		voteArray.printArray();
	
	}

}
