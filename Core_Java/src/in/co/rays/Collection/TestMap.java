package in.co.rays.Collection;

import java.util.HashMap;
import java.util.Map;

public class TestMap {

	public static void main(String[] args) {
		
		Map m = new HashMap();
		
		m.put(1,  "Sanju");
		System.out.println(m);
		m.put(2, "sanju baba");
		m.put(3, "bawa");
		System.out.println("size of map =" +m.size());
	}
}
