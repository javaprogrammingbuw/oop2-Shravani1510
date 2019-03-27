

public class Driver {
	public static void main(String[] args) {
		Circle o = new Circle(2);
		Square s = new Square(4,4);
		Triangle t = new Triangle(16,4);
		System.out.println("area of circle :"+  o.area() +"\n"+ "circumference of Circle :"+ o.circumference());
		System.out.println("area of Square :"+ s.area() +"\n"+"circumference of Square :"+s.circumference());
		System.out.println("area of Triangle :"+ t.area() +"\n"+"circumference of Triangle :"+t.circumference()+"\n"+"pythagoras of Triangle :"+t.pythagoras());
	}
}
