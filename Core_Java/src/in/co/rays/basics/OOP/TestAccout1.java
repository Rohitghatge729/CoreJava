package in.co.rays.basics.OOP;

public class TestAccout1 {
	private static double amount;

	public static void main(String[] args) {
		

		Account1 a = new Account1("Rohit", 007, 100000, 20000, amount );
	
		System.out.print("Name="+a.getName()+"\n"+"ID="+a.getId()+"\n"+"Deposit="+a.getDeposit()+"\n"+"Withdrawal="+a.getWithdrawal()+"\n"+"Amount="+a.getAmount());
		
	
	}

}
