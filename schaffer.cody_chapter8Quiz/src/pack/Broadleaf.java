package pack;

public class Broadleaf extends Tree {

	protected String styleLeaf = "huge leaves";
	protected final String styleTree = "decidious";
	
	
	//CONSTRUCTOR----------------------------------------------------------------------------------
	public Broadleaf(int numLeaf, String title) //String leafStyle, String treeStyle
	{
		super(numLeaf, title);
//		styleLeaf = leafStyle;
//		styleTree = treeStyle;
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
	public void broadLeaves()
	{
		System.out.println("This type of tree has broad leaves.");
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
