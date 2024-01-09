package in.co.rays.basics.OOP;

public class Shape {

	private String color;
	private int Borderwidth;

	public Shape() {
		System.out.println("default constructor");
	}

	public Shape(String color, int Borderwidth) {
		this.color = color;
		this.Borderwidth = Borderwidth;
	}

//	public void setcolor(String color) {
//		this.color = color;
//	}

	public String getcolor() {
		return color;
	}

//	public void setBorderwidth(int Borderwidth) {
//		this.Borderwidth = Borderwidth;
//	}

	public int getBorderwidth() {
		return Borderwidth;
	}
}
