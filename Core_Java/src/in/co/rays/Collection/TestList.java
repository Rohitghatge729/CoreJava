package in.co.rays.Collection;

import java.awt.List;
import java.util.ArrayList;

public class TestList {
	public static void main(String[] args) {

		ArrayList l1 = new ArrayList();

		l1.add("one");
//		System.out.println(l1);

		l1.add("Sanju");

		l1.add("sanju baba");

		l1.add("rishendra - late comer");

		l1.add("Rohit");

		System.out.println("l1 ater adding elements =" + l1);
		System.out.println();

		System.out.println("index 0 Element =" + l1.get(0));
		System.out.println();

		System.out.println("index 4 element = " + l1.get(4));
		System.out.println();

		System.out.println("index 3rd element =" + l1.get(3));
		System.out.println();

		System.out.println("remove index 1st element =" + l1.remove(1));
		System.out.println();

		System.out.println("after removing 1st element =" + l1);
		System.out.println();

		System.out.println("remove index 3rd element =" + l1.remove(3));
		System.out.println();

		l1.set(0, "sush");
		System.out.println("l1 after set command =" + l1);
		System.out.println();

		l1.set(2, "Rish");
		System.out.println("l1 after set command =" + l1);
		System.out.println();

		System.out.println("1l index of = " + l1.indexOf("sanju baba"));
		System.out.println();

		l1.add("sanju baba");
		l1.add("bhavesh");
		l1.add("Suraj");

		System.out.println("l1 after adding elements =" + l1);
		System.out.println();

		System.out.println("Last index no. of sanju baba =" + l1.lastIndexOf("sanju baba"));
		System.out.println();

		System.out.println(l1);
		System.out.println("Last index no. of sush =" + l1.lastIndexOf("sush"));
		System.out.println();

		System.out.println("l1 sublist(0,2) =" + l1.subList(0,2));
		System.out.println();
		
		System.out.println("l1 sublist(3,6) =" + l1.subList(3,6));
		System.out.println();
		
	}

}
