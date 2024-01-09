package in.co.rays.basics.OOP;

public class RectangleOne {
	private int lenght;
	private int breadth;

	public void setLenght(int lenght) {
		this.lenght = lenght;
	}

	public int getLenght() {
		return lenght;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	public int getBreadth() {
		return breadth;
	}

	public void area() {
		int area = getLenght()* getBreadth();
		System.out.println("Rectangle area =" + area);
	}

}