
public class RandomPro {

	
	//Write code that uses a for loop that counts from 0 to 100 (inclusive). If a number is even print it.
	
	public static void main(String[] args) {
		
		//double codyNumber = 0.0;
		double count = 0;
		double tempCount = 0;
		
		for (count = 0; count <= 100; count++)
		{
			System.out.println(count);
			
			count++;
			if (tempCount ==(count/2) && count <= 200)
			{
				System.out.println(tempCount);
			}
		}
	}

}
