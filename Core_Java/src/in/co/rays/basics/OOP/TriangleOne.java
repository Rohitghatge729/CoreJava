package in.co.rays.basics.OOP;

public class TriangleOne {

	private int height;
	private int base;
	

	public void setHeight(int height) {
		this.height = height;
	}

	public int getHeight() {
		return height;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getBase() {
		return base;
	}

	public void area() {
		int area = getHeight()*(getBase()/2);
		System.out.println("Area of Triangle =" + area);
		
	}
}
