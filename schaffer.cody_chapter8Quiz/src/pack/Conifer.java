package pack;

public class Conifer extends Tree {

	
	protected String styleLeaf = "skinny leaves";
	protected String styleTree = "coniferous";
	
	//CONSTRUCTOR----------------------------------------------------------------------------------
	
	public Conifer(int numLeaf, String title) {
		super(numLeaf, title);

	}

	//ABSTRACT METHODS//----------------------------------------------------------------------------
	@Override
	void leaves() {
		System.out.println("This tree has leaves.");	
	}

	@Override
	void trunk() {
		System.out.println("This tree has a trunk.");		
	}

	@Override
	void branches() {
		System.out.println("This tree has branches.");
	}

	//METHOD
	public void smallLeaves()
	{
		System.out.println("This type of tree has skinny leaves.");
	}
	
	public void hardWood()//THIS METHOD GETS OVERRIDDED BY THE SIMILIAR NAMED METHOD IN PINE
	{
		System.out.println("Coniferous trees are hard-wood trees.");
	}
	
	
	//GETTERS AND SETTERS//----------------------------------------------------------------------------	
	//GET PAGE
	public String getStyleLeaf()
	{
		return styleLeaf;
	}
	
	public String getStyleTree()
	{
		return styleTree;
	}
	

}
