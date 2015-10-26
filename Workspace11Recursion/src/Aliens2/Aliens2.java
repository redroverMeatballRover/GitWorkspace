package Aliens2;
import java.util.Random;
/** 
 * @author cschaffer
 *
 *This code builds an alien language which is composed of blurbs. the blurbs are built out of whozits and whatzits. 
 *Recursive code: once the count becomes more than 3, the recursion ends. 
 */
public class Aliens2 {

	protected String blurb = "";
	protected String whozit = "";
	protected String whatzit = "";
	private int count = 0;
	Random gen = new Random();
	int decider = gen.nextInt(2) + 1;
		
	//creates the blurb, made out of the whozit method. 
	protected String blurb()
	{
		blurb = whozit();
		return blurb;
	}

	// The whozit creates the XY.
	// there is a count that counts through the amount of times the loop has been used, 
	// once that count has been reached, the recursion ends. 
	protected String whozit()
	{
		String xy = "xy";

			count++;
			if (count > 3)
			{
				
			}
			else
			{					
				whozit = xy + numberOfYs() + whatzit() + numberOfWhatzits();	
			}	
			return whozit;
	}
	// creates a whatzit, uses a random generator to choose between the QZ and the QD
	protected String whatzit() 
	{
		Random randGen = new Random();
		int decider2 = randGen.nextInt(2)+1;
		String qz = "qz";
		String qd = "qd";	
		String q = "";
		
		if (decider2 == 1)
		{	
			count++;
			if (count > 3)
			{
				
			}
			else
			{
			whatzit = qz + whozit();
			}
		}

		else
		{	
			count++;
			if (count > 3)
			{
				
			}
			else
			{
			whatzit = qd + whozit();
			}
		}
	return whatzit;
	}
	
	// determines number of whatzits to follow the whozit
	protected String numberOfWhatzits()
	{
	String length = "";
	Random huh = new Random();
	int numWhat = huh.nextInt(5) + 2;
	
	if (numWhat == 2)
		length = " " + whatzit();
	if (numWhat == 3)
		length = " " + whatzit() + " " + whatzit();
	if (numWhat == 4)
		length = " " + whatzit() + " " + whatzit() + " " + whatzit();
	if (numWhat == 5)
		length = " " + whatzit() + " " + whatzit() + " " + whatzit() + " " + whatzit();
	return length;
	}
	
	// determines number of y's in the whozit
	protected String numberOfYs()
	{
		String y = "";
		Random rand = new Random();
		int numY = rand.nextInt(5);
		
		//FIND A WAY THAT THE INT NUM REPRESENTS THE NUMBER OF TIMES Y APPEARS
		if (numY == 0)
			y = "";
		if (numY == 1)
			y = "y";
		if (numY == 2)
			y = "yy";
		if (numY == 3)
			y.equals("yyy");
		if (numY == 4);
			y = "yyyy";
		if (numY == 5)
			y = "yyyyy";
		return y;
	}
}

