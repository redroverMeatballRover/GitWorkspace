package coins;

/**
 * Author Cody Schaffer
 */
public class MonetaryCoin extends Coin {

	//store a value in here that represents its value
	//add a method that returns value
	protected int moneyCoin = 5;
	
	public void setValue(int coinValue)
	{
		moneyCoin = coinValue;
	}

	public int getValue() {
		return moneyCoin;
	}	
}



