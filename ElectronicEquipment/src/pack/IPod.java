package pack;
/**
 * 
 * @author cody schaffer
 *
 *this represents an ipod
 */
public class IPod extends Computers {

	private int songs;
	//CONSTRUCTOR//
	public IPod(double weigh, double costs, String powerUsage, String manufactuers,String title,
			int userInt, int compButtons, int dataTerraBytes, int progNum, int songNum) 
	
	{
		super(weigh, costs, powerUsage, manufactuers, title, userInt, compButtons,
				dataTerraBytes, progNum);
		songs = songNum;
	}
	//plays songs on the computer
	public void playSongs()
	{
		System.out.println("This equipment plays music");
	}
	//shuffles songs
	public void shuffle()
	{
		System.out.println("shuffle the songs");
	}
	
	
	public void setSongs(int songNum)
	{
		songs = songNum;
	}
	//GET PAGE
	public int getSongs()
	{
		return songs;
	}

}
