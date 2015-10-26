package pack2;

public class Advice extends Thought {

	public void message()
	{
		System.out.println("Warning! Hello!");
		System.out.println();
		super.message();
	}

}
