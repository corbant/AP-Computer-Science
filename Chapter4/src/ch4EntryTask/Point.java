package ch4EntryTask;

public class Point {
	private double x;
	private double y;
	
	
	public Point() {
		x = 0;
		y = 0;
	}
	
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public void setX(double x) {
		this.x = x;
	}
	
	public void setY(double y) {
		
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public double getDistanceFromOrigin() {
		return Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
	}
	
	public double getDistanceToPoint(Point other) {
		return Math.sqrt((Math.pow(x - other.x,2)) + (Math.pow(y - other.y,2)));
	}
	
	@Override
	public boolean equals(Object o) {
		if(!(o instanceof Point)) {
			return false;
		}
		
		Point p = (Point) o;
		return Double.compare(x, p.x) == 0 && Double.compare(y, p.y) == 0;
	}
	
	@Override
	public String toString() {
		return "The coordinate of this point is (" + x + ", " + y + ")";
	}

}
