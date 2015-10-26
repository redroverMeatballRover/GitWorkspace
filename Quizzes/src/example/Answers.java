/**
 * 
 */
package example;

import java.util.Scanner;

/**
 * @author dmaldonado
 *
 */
public class Answers 
{
	Scanner scan = new Scanner(System.in);
	private String responce;
	protected int totalScore = 0;
	protected int add=0;
	
	private String[] responces={"utah","USA","yes","Luigi","yes","green","yellow","Eclipse","Skillet","desmond","Zero","IS","Soccer","Maka","D","Lancelot","Prim","The Genetic Opera","35","150 million","Itami",
								"Karen","FLAG","Coffin Princess","Shutter Eye"};
	
	/**
	 * add responce to a question on the quiz
	 */
	public void question()
	{
		responce = scan.nextLine();
		if (responce.equalsIgnoreCase(responces[add]))
		{
			totalScore++;
			System.out.println(totalScore);
		}
		add++;
	}
}
