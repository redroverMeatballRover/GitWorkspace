package pack;

import java.util.Random;

public class RandomNum {

	public static void main(String[] args) 
	{
		for (int i = 0; i < 10; i++)
		{
//			Random rand = new Random();
//			int randomNumber = rand.nextInt(1);
//			System.out.println(randomNumber);
			
			int num;
			
			double d = Math.random();
			if (d > 0.5)
				num = 1;
			else
				num = 0;
			System.out.println(num);
		}
	}

}
