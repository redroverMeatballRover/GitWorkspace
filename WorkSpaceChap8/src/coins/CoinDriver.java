package coins;

public class CoinDriver {

	/**
	 * Author Cody Schaffer
	 * 
	 * The purpose of this class is to use inheritence to link all the classes together. 
	 * In this class, we show that a class called coin has the ability to be flipped. The 
	 * monetary coin class inherits the coin class's ability to be flipped. In the monetary 
	 * coin class, we give the coin a value. Finally, the driver class makes and adds the moneycoin
	 * together for a value. 
	 */
	
	public static void main(String[] args) {
		
		MonetaryCoin moneyCoin = new MonetaryCoin();
		
		moneyCoin.getValue(); 	
		System.out.println("this is the coin value: " + moneyCoin.getValue());
		//ADDS COINS TOGETHER.
		System.out.println("The sum of five coins: " + (moneyCoin.getValue()  + moneyCoin.getValue() + moneyCoin.getValue() + moneyCoin.getValue() + moneyCoin.getValue()));
		moneyCoin.coinFlipped();
		
	

	}

}
