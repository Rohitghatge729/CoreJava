package in.co.rays.Clone1;
public class TestAccounts {
	public static void main(String[] args)throws CloneNotSupportedException {
		Accounts a1 = new Accounts(1000);
		Accounts a2 = (Accounts) a1.clone();
		
		a2.balance = 2000;
		System.out.println(a2.balance);
		
	}

}
