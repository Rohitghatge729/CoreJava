package in.co.rays.Exception;

public class Accounts {

	 private int balance;
	 private String accountnumber;
	 
	 public Accounts() {
	 System.out.println("Default Cons");
	 }
	 
	 public Accounts( int balance, String accountnumber) {
		 this.balance = balance;
		 this.accountnumber = accountnumber;
	 }
	 
	 public int getBalance() {
		 return balance;
	 }
	 
	 public void setBalance(int balance) {
		 this.balance = balance;
	 }
	 
	 public String getAccountnumber() {
		 return accountnumber;
	 }
	 public void setAccountnumber(String accountnumber) {
		 this.accountnumber = accountnumber;
	 }
	 
	 public void deposit(int amount) {
		 int total = getBalance()+ amount;
		 setBalance(total);
		 System.out.println("After Deposit =" + amount);
	 }
	 
	 public void withdrawal(int amount) throws InsufficientBalance{
		 int total = getBalance() - amount;
		 setBalance(total);
		 if (total<2000) {
			 throw new InsufficientBalance();
		}
		 else {
			 setBalance(total);
			 System.out.println("After Withdrawal =" + getBalance());
		 }
	 }
}
