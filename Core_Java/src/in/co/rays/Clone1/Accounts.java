package in.co.rays.Clone1;
public class Accounts implements Cloneable{

	int balance = 0;
	public Accounts() {		
	}
	
	public Accounts(int balance) {
		this.balance = balance;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
