package in.co.rays.poly;

public class Shape {

	private int borderwidth;
	private String color;

	public Shape() {
	}
	
	public Shape(int borderwidth, String color) {
		this.borderwidth = borderwidth;
		this.color = color;
	}
	

	public int getBorderwidth() {
		return borderwidth;
	}

	public void setBorderwidth(int borderwidth) {
		this.borderwidth = borderwidth;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void area() {
		System.out.println();
	}
	
	
	
	
}
