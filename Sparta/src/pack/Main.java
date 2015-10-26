package pack;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Shape[] shapes = new Shape[3];
		shapes[0] = new Square(5d);
		shapes[1] = new Circle(3d);
		shapes[2] = new Square(1d);

		for(int i = 0; i < shapes.length; ++i)
		{
			Shape shape = shapes[i];
		}
		
		//this is a for each loop
		for (Shape shape : shapes)
		{
			System.out.println(shape.computeArea());
		}
	}

}


//READ PAGES 32-43 IN THE TEXT "RESUING IMPLEMENTATION"