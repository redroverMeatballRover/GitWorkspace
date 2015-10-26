package pack;

public class Square implements Shape {

	double side;
	
	public Square (double side)
	{
		this.side = side;
	}

	@Override
	public double computeArea() {
		// TODO Auto-generated method stub
		return Math.PI * side * side;
	}


}
