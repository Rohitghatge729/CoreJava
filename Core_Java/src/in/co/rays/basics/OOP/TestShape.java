package in.co.rays.basics.OOP;

public class TestShape {

	public static void main(String[] args) {
		
		Shape s1 = new Shape();
		System.out.println(s1);
		
		Shape s2 = new Shape("Blue", 20);
		
		System.out.println(s2.getcolor());
		System.out.println(s2.getBorderwidth());
		
	}

}
