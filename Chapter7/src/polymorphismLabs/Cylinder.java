package polymorphismLabs;

public class Cylinder extends Shape {
	
	private double radius;
	private double height;

	public Cylinder(double r, double h) {
		super("Cylinder");
		radius = r;
		height = h;
	}

	@Override
	public double area() {
		return Math.PI*Math.pow(radius, 2)*height;
	}
	
	@Override
	public String toString()
	   {
	       return super.toString() + " of radius " + radius + " of height " + height;
	   }

}