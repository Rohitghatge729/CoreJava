package in.co.rays.poly;

public class Triangle extends Shape{

	private int height;
	private int base;
	
	public Triangle(int height, int base) {
		this.base = base;
		this.height = height;	
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setHeight() {
		this.height = height;
	}
	
	public int getBase() {
		return base;
	}
	
	public void setBase() {
		this.base = base;
	}

	public void area() {
		double area = (base*height)/2;
		System.out.println("Area of Triangle =" + area);
	}

}

