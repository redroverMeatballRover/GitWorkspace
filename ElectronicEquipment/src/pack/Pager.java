package pack;
/**
 * 
 * @author cody schaffer
 *
 *this represents a pager
 */
public class Pager extends Computers {

	private int texts;
	//CONSTRUCTOR//
	public Pager(double weigh, double costs, String powerUsage, String manufactuers, String title,
			int userInt, int compButtons, int dataTerraBytes, int progNum, int textNum) 
	
	{
		super(weigh, costs, powerUsage, manufactuers, title, userInt, compButtons,
				dataTerraBytes, progNum);
		texts = textNum;
	}

	//message alert
	public void beep()
	{
		System.out.println("BEEP BEEP BEEP YOU'VE RECIEVED A MESSAGE BEEP BEEP");
	}
	
	public void seeMessage()
	{
		System.out.println("Check Message");
	}
	
	public void setTexts(int textNum)
	{
		texts = textNum;
	}
	//GET PAGE
	public int getText()
	{
		return texts;
	}

}
