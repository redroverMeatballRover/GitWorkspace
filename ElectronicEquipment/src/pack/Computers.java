package pack;
/**
 * 
 * @author cody schaffer
 *
 *This represents a computer. It inherits from ElectronicEquipment and sets the second base layer for all other equipment.
 */
public class Computers extends ElectronicEquipment {

	private int userInterface;
	private int buttons;
	private int dataTB;
	private int programs;
	//CONSTRUCTOR//
	public Computers(double weigh, double costs, String powerUsage,
			String manufactuers, String title, int userInt, int compButtons, int dataTerraBytes, int progNum) 
	
	{
		super(weigh, costs, powerUsage, manufactuers, title);
		userInterface = userInt;
		buttons = compButtons;
		dataTB = dataTerraBytes;
		programs = progNum;
	}
	//METHODS
	//says if the computer uses data
	public void processesData()
	{
		System.out.println("This equipment stores data.");
	}
	//sees if the computer has programs
	public void hasPrograms()
	{
		System.out.println("This equipment uses many programs.");
	}
	
	//GETTERS & SETTERS
	public void setUserInterface(int userInt)
	{
		userInterface = userInt;
	}
	//GET PAGE
	public int getUserInterface()
	{
		return userInterface;
	}

	public void setButtons(int compButtons)
	{
		buttons = compButtons;
	}
	//GET PAGE
	public int getButtons()
	{
		return buttons;
	}
	
	public void setData(int dataTerraBytes)
	{
		dataTB = dataTerraBytes;
	}
	//GET PAGE
	public int getData()
	{
		return dataTB;
	}
	
	public void setProg(int progNum)
	{
		programs = progNum;
	}
	//GET PAGE
	public int getProg()
	{
		return programs;
	}
}
