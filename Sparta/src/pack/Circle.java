package pack;

public class Circle implements Shape {

	double radius;
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public Circle (double radius)
	{
		this.radius = radius;
	}
	
	public double computeArea()
	{
		return Math.PI * radius * radius;
	}
	
	

}
