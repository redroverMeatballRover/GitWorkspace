package pack;
/**
 * 
 * @author cody schaffer
 *this class sets up the base layer for every piece of electronic equipment.
 */
public class ElectronicEquipment {

	private double weight;
	private double cost;
	private String power;
	private String manufactuer;
	private String name;
	//CONSTRUCTOR//
	public ElectronicEquipment(double weigh, double costs, String powerUsage, String manufactuers, String title)
	{
		weight = weigh;
		cost = costs;
		power = powerUsage;
		manufactuer = manufactuers;
		name = title;
	}
	
	
	
	//METHODS---------------------------------------------------------------------//
	//says if system is on or off
	public boolean onOrOff()
	{
		return true;
	}
	//says if it needs to be charged
	public boolean needsToBeCharged()
	{
		return true;
	}
	//---------------------------------------------------------------------------//
	//GETTERS AND SETTERS//
	public void setWeight(double weigh)
	{
		weight = weigh;
	}
	//GET PAGE
	public double getWeight()
	{
		return weight;
	}

	public void setCost(double costs)
	{
		cost = costs;
	}
	//GET PAGE
	public double getCost()
	{
		return cost;
	}
	
	public void setPower(String powerUsage)
	{
		power = powerUsage;
	}
	//GET PAGE
	public String getPower()
	{
		return power;
	}
	
	public void setManu(String manufactuers)
	{
		manufactuer = manufactuers;
	}
	//GET PAGE
	public String getManu()
	{
		return manufactuer;
	}
	
	public void setName(String title)
	{
		name = title;
	}
	//GET PAGE
	public String getName()
	{
		return name;
	}
	
	
}