package day04.practice;


class RightAngledTriangle extends Polygon { 

	
	protected double base; 
	protected double height;

	
	public RightAngledTriangle(double base, double height) throws Exception { 

		super(3);
		if (base <= 0 || height <= 0) {
			throw new Exception("Invalid value for a Triangle");
		}
		this.base = base;
		this.height = height;
	}

	@Override
	public double calculateArea() {

		return  1/2 * (this.base * this.height);
	}

	@Override
	public double circumference() {
		double c = Math.round(Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2)));

		double circumference = base + height + c;

		return circumference;
	}

}

public class PolygonTest {
	public static void main(String[] args) {
		try {
			
			Polygon rec = new Rectangle (10, 5);
			System.out.println(rec.calculateArea());
			System.out.println(rec.circumference());
			
			
			RightAngledTriangle ratt = new RightAngledTriangle(20, 10);
			System.out.println(ratt.calculateArea());
			System.out.println(ratt.circumference());	
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}






