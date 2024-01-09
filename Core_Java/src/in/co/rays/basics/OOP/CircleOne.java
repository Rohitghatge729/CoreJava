package in.co.rays.basics.OOP;

public class CircleOne {

	private double pi = 3.14;
	private int radius;

	public void setPi(double pi) {
		this.pi = 3.14;
	}

	public double getPi() {
		return pi;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void area() {
		double area = getPi() * getRadius() * getRadius();
		System.out.println("Area of Circle =" + area);
	}

}
