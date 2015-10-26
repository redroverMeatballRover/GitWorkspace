package example1;


	public class SomeInt 
	{
		
		int thisIsTheInt;
		SomeInt(int i)
		{
			thisIsTheInt = i;
		}

	public String toString()
	{
		return Integer.toString(thisIsTheInt);
		return "" + thisIsTheInt;
	}
	
	public boolean equals(SomeInt i)
	{
		return thisIsTheInt == i.thisIsTheInt;
	}
	
	}


