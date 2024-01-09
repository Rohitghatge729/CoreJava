package in.co.rays.basics;

public class TestAccount {

	public static void main(String [] args) {
		
		Accounts s1 = new Accounts() ;

		s1.setName("baba");
		s1.setAge(10);
		System.out.println(s1.getAge()+"  " +s1.getName());
		
	}
}
