package in.co.rays.basics.OOP;

public class SavingAccountsTest {

	public static void main(String[] args) {
	
		SavingAccounts s = new SavingAccounts();
		
		AccountsOne a = new AccountsOne();
		
		AccountsOne as = new SavingAccounts();
		
		a.setDeposit(50);
		as.setAmount(5);
		
		
		System.out.println(s.getAmount());
		System.out.println(a.getDeposit());
		System.out.println(as.getDeposit());
		
		a.setName("Ashwit");
		a.setId(25112023);
		a.setDeposit(62000);
		a.setWithdrawal(42000);
		
		System.out.println( "Name="+ a.getName()+ "\n" + "ID=" +a.getId()+ "\n"+ "Deposit=" +a.getDeposit()+ "\n" +"Withdrawal" +a.getWithdrawal());
		
	}
}
