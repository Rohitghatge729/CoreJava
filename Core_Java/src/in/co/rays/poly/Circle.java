package in.co.rays.poly;

public class Circle extends Shape {

	private int radius;
	private static double pi = 3.14;

	public Circle(int radius) {
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public void area() {
		double area = pi * radius * radius;
		System.out.println("Area of Circle =" + area);
	}
}
