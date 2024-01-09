package in.co.rays.Exception;

public class TestAccounts {

	public static void main(String[] args) throws InsufficientBalance {
		
		Accounts s = new Accounts();
		s.deposit(4000);
		try {
			s.withdrawal(2001);	
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
}
