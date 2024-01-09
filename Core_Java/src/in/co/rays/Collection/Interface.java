package in.co.rays.Collection;

import java.util.ArrayList;

public class Interface {

	public static void main(String[] args) {

		ArrayList c = new ArrayList();

		c.add(100);
//		System.out.println(c);
		c.add(200);
		c.add(300);
		c.add(400);
		c.add(500);
//		System.out.println("c = " + c);
		
		ArrayList c1 = new ArrayList();
		c1.add("rohit");
		c1.add("bhav");
		c1.add(400);
		c1.add("Rishi");
		c1.add("suraj");
//		System.out.println("c1 = " + c1);
		
//		c.add(c1);
//		System.out.println(c);
		
//		c.clear();
//		System.out.println(c);
		
		c.contains(c1);
		System.out.println(c.contains(c1));
//		System.out.println(c1);
		
		c.containsAll(c1);
		System.out.println(c.containsAll(c1));
		
		
//		System.out.println(c.isEmpty());

			
		
	}
}
