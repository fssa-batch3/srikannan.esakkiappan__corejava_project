package day04.practice;

abstract class Polygon {
	protected int numberOfSides;
	
	public Polygon (int numberOfSides) throws Exception {
		if (numberOfSides < 3) {
			throw new Exception("Invalid number of sides to create a polygon ");
		}
		else {
			this.numberOfSides = numberOfSides;
		}
	}
	public abstract double calculateArea();
	
	public abstract double circumference();
}


class Rectangle extends Polygon {
	
	protected double length;
	protected double breadth;
	
	public Rectangle(double length, double breadth) throws Exception {
		super(4);
		if(length <= 0 || breadth <= 0) {
			throw new Exception("Invalid dimensions for a rectangle");
		}
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public double calculateArea() {
		return  1/2 * (this.length * this.breadth);
	}
	
	public int getNumberOfSides() {
		return super.numberOfSides;
	}
	
	public double circumference() {
		double c = Math.round(Math.sqrt(Math.pow(length, 2) + Math.pow(breadth, 2)));

		double circumference = length + breadth + c;

		return circumference;
	}

}
