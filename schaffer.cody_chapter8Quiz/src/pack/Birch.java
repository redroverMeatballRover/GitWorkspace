package pack;

public class Birch extends Broadleaf {

	protected int howSkinnyIsIt;

	public Birch(int numLeaf, String title, int skinny)
	
	{
		super(numLeaf, title);
		howSkinnyIsIt = skinny;
	}

	
	
	public void whiteWood() {
		System.out.println("This tree has very white wood.");
	}

	
	
	
	
	public void setSkinny(int skinny) {
		howSkinnyIsIt = skinny;
	}

	public int getSkinny() {
		return howSkinnyIsIt;
	}

}
