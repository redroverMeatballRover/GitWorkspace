package pack;

public abstract class CoinTrials {

	protected int numberCoins;
	protected int numberFlips;
	
		public CoinTrials(int numCoins, int numFlips) 
		{
			numberCoins = numCoins;
			numberFlips = numFlips;
		}
		
		abstract void doTrial();
		
//		public void reportTrial() 
//		{
//			
//		}	

		abstract void reportTrial();
}
