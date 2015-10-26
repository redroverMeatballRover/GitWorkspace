package pack;

abstract class Tree {
	
	protected int leafNum;
	protected String name;
	
	abstract void leaves();
	abstract void trunk();
	abstract void branches();
	

	public Tree(int numLeaf, String title)
	{
		leafNum = numLeaf;
		name = title;
	}
	
	

}
