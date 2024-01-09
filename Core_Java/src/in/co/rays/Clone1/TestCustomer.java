package in.co.rays.Clone1;
public class TestCustomer {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Customer c1 = new Customer("Bhavi", 5000);
		Customer c2 = (Customer)c1.clone();
		
		c2.name = "Sanju baba";
		c2.acc.balance = 10000;
		
		System.out.println("Customer Name = "+ c1.name);
		System.out.println("Customer bal =" + c1.acc.balance);
		System.out.println("Customer Name =" + c2.name);
		System.out.println("Customer Balance =" + c2.acc.balance);
	}

}
