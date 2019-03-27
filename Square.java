

public class Square extends Shape {
	private double width;
	private double height;
	
	public Square(double width, double height) {
		this.width=width;
		this.height=height;
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return width*height;
	}

	@Override
	public double circumference() {
		// TODO Auto-generated method stub
		return 4*width*height*width*height;
	}
}
