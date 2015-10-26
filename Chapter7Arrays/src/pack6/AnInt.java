package pack6;

public class AnInt {

	public int i;
	
	public AnInt(int ii)
	{
		i = ii;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
	
	public String toString()
	{
	return ("<" + i + ">");
	}
	
}
