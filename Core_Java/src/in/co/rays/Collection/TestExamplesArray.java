package in.co.rays.Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class TestExamplesArray {
	public static void main(String[] args) {
	
	ArrayList a = new ArrayList();

	a.add("one");
	a.add("two");
	a.add("three");
	a.add("four");
	
	Iterator it = a.iterator();
	while (it.hasNext()) {
		Object object = (Object) it.next();
		System.out.println(object);
	}
	
}
}