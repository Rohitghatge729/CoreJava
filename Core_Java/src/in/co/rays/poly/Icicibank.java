package in.co.rays.poly;

public class Icicibank extends Bank {
	
	private String name;
	private double interest;
	
	public String getName() {
		return "Icici Bank";
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getInterest() {
		return 10.8;
	}
	public void setInterest(double interest) {
		this.interest = interest;
	}

}
