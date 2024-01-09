package in.co.rays.poly;

public class HdcBank extends Bank {
	
	private String name;
	private double interest;
	
	public String getName() {
		return "Hdfc Bank";
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getInterest() {
		return 9.9;
	}
	public void setInterest(double interest) {
		this.interest = interest;
	}
	
}
