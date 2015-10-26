package pack;

import java.util.Random;

public class Enums {

	
	public enum WindowSize{
		LARGE(10,9) // ordinal 0
		{
			// anoymous class
			public int computeArea()
			{
				return 4;
			}
		},
		MEDUIUM(5,6),//ordinal 1
		SMALL(2,3);//ordinal 2
		
		
		public int width;
		public int height;
		
		private WindowSize(int w, int s)
		{
		width = w;
		height = s;
		//System.out.println(w + " : " + s);
		}
		
		public int computeArea()
		{
			System.out.println(width + "" + height);
			return width * height;
		}
	}
	
	public static void main(String[] args) 
	{
		System.out.println("here");
		WindowSize size = WindowSize.LARGE;
		WindowSize size2 = WindowSize.SMALL;
		
		System.out.println(WindowSize.SMALL.computeArea());
		size2.ordinal();
		System.out.println(size2 + " is at position " + size2.ordinal());

		int area = size.computeArea();
		System.out.println(size.computeArea());
	}

}
