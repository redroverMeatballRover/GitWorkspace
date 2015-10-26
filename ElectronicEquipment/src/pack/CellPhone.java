package pack;
/**
 * 
 * @author cody schaffer
 *
 *this represents a cellphone
 */
public class CellPhone extends Pager {

	private String text;
	private int calls;
	//CONSTRUCTOR//
	public CellPhone(int weigh, double costs, String powerUsage,
			String manufactuers, String title, int userInt, int compButtons,
			int dataTerraBytes, int progNum, int textNum, String textText, int call)
	
	{
		super(weigh, costs, powerUsage, manufactuers, title, userInt, compButtons,
				dataTerraBytes, progNum, textNum);
		text =textText;
		calls = call;
		
	}
	//message call
	public void call()
	{
		System.out.println("Make or recieve a call.");
	}
	//text alert
	public void texts()
	{
		System.out.println("Send or recieve a text.");
	}
	
	//reads text
	public void setTextString(String textText)
	{
		text = textText;
	}
	//GET PAGE
	public String getTextString()
	{
		return text;
	}
	
	public void setCalls(int call)
	{
		calls = call;
	}
	//GET PAGE
	public int getCalls()
	{
		return calls;
	}
	

}
