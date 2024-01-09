package in.co.rays.basics.OOP;

public class Account1 {

	private String name;
	private int id;
	private double deposit;
	private double withdrawal;
	private double amount;

	public Account1(String name, int id, double deposit, double withdrawal, double amount) {
		this.name = name;
		this.id = id;
		this.deposit = deposit;
		this.withdrawal = withdrawal;
		this.amount = (deposit - withdrawal);
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public double getDeposit() {
		return deposit;
	}

	public double getWithdrawal() {
		return withdrawal;
	}

	public double getAmount() {
		return amount;
	}

}
