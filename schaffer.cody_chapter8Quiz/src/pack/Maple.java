package pack;

public class Maple extends Broadleaf {

	protected int daysTilLeavesTurnRed;
	
	public Maple(int numLeaf, String title,  int daysTilFall)
	
	{
		super(numLeaf, title);
		daysTilLeavesTurnRed = daysTilFall;
	}


	public void makeMapleSyrup()
	{
		System.out.println("This tree makes maple syrup.");
	}
	
	
	
	
	public void setDaysTilFall(int daysTilFall)
	{
		daysTilLeavesTurnRed = daysTilFall;
	}
	
	public int getDaysTilFall()
	{
		return daysTilLeavesTurnRed;
	}



}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	