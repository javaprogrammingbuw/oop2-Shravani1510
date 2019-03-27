package oop2;

public class Circle extends Shape{
	private double  radius;
	
	public  Circle(double radius) {
		this.radius=radius;
	}
	
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return  Math.PI*radius*radius;
	}

	@Override
	public double circumference() {
		// TODO Auto-generated method stub
		return 2*Math.PI* radius;
	}
}
