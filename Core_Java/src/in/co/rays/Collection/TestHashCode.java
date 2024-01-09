package in.co.rays.Collection;

public class TestHashCode {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(1, "Sanjana", 1000);
		Employee e2 = new Employee(2, "Sanju baba", 2000);
		
		System.out.println(e1.equals(e2));
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
	}
}
