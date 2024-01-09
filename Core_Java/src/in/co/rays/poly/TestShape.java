package in.co.rays.poly;

public class TestShape {

	

	public static void main(String[] args) {
		
		Shape [] s = new Shape[3];
		
		s[0] = new Rectangle(12, 16);
		s[1] = new Triangle (10, 12);
		s[2] = new Circle(20);
	
		for (int i = 0; i < s.length; i++) {
			
			s[i].area();
		}	
		
	}
}
