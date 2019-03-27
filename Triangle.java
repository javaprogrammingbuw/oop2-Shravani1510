

public class Triangle extends Shape implements iRightAngled{
	private double a;
	private double b;
	
	public Triangle(double a, double b) {
		this.a=a;
		this.b=b;
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return (1/2)*a*b;
	}
	@Override
	public double circumference() {
		// TODO Auto-generated method stub
		double c =pythagoras();
		return a+b+c;
	}

	@Override
	public double pythagoras() {
		// TODO Auto-generated method stub
		double c= Math.sqrt(a*a+b*b);
		return c;
	}
	
}
