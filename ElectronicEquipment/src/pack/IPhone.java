package pack;
/**
 * 
 * @author cody schaffer
 *
 *this represents a iphone
 */
public class IPhone extends CellPhone {

	private String dataPlan;
	private String internet;
	private int multitasking;
	
	//CONSTRUCTOR//
	public IPhone(int weigh, double costs, String powerUsage, String manufactuers, String title,
			int userInt, int compButtons, int dataTerraBytes, int progNum,
			int textNum, String textText, int call, String datas, String internetAcc, int multi)

	{
		super(weigh, costs, powerUsage, manufactuers, title, userInt, compButtons,
				dataTerraBytes, progNum, textNum, textText, call);
		dataPlan = datas;
		internet = internetAcc;
		multitasking = multi;
	}
	//uses camera
	public void camera()
	{
		System.out.println("use the iPhone camera");
	}
	//focuses cam
	public void focusIphoneCam()
	{
		System.out.println("focus the camera");
	}
	//takes pic with camera
	public void takeIphoneCam()
	{
		System.out.println("Take the picture.");
	}
	
	//uses ipod
	public void iPod()
	{
		System.out.println("This equipment plays music");
	}
	//shuffles ipod
	public void iPodShuffle()
	{
		System.out.println("shuffle the songs");
	}
	
	//plays games
	public void gamesIphone()
	{
		System.out.println("This electronics system plays games.");
	}
	
	public void setDataPlan(String datas)
	{
		dataPlan = datas;
	}
	//GET PAGE
	public String getDataPlan()
	{
		return dataPlan;
	}
	
	public void setInternet(String internetAcc)
	{
		internet = internetAcc;
	}
	//GET PAGE
	public String getInternet()
	{
		return internet;
	}
	
	public void setMultitasking(int multi)
	{
		multitasking = multi;
	}
	//GET PAGE
	public int getMultitasking()
	{
		return multitasking;
	}

	
}
