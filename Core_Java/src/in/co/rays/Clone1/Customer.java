package in.co.rays.Clone1;
public class Customer implements Cloneable {

	String name = null;
	Accounts acc = new Accounts();

	public Customer(String name, int bal) {
		this.name = name;
		this.acc.balance = bal;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Customer c = (Customer) super.clone();
		c.acc = (Accounts) acc.clone();
		return c;
	}

}
