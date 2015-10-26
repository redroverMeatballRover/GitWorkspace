package pack;
/**
 * 
 * @author cody schaffer
 *
 *this represents a digital camera
 */
public class DigiCamera extends Computers {

	private int pics;
	//CONSTRUCTOR//
	public DigiCamera(double weigh, double costs, String powerUsage,
			String manufactuers, String title, int userInt, int compButtons,
			int dataTerraBytes, int progNum, int pictures) 
	
	{
		super(weigh, costs, powerUsage, manufactuers, title, userInt, compButtons,
				dataTerraBytes, progNum);
		pics = pictures;
	}
	//focuses camera
	public void focus()
	{
		System.out.println("focus the camera");
	}
	//takes pic
	public void takePic()
	{
		System.out.println("Take the picture.");
	}
	//sends pics to computer
	public void picsToComputer()
	{
		System.out.println("Transfer pictures to the computer");
	}

	public void setPics(int pictures)
	{
		pics = pictures;
	}
	//GET PAGE
	public int getPics()
	{
		return pics;
	}
	

}
