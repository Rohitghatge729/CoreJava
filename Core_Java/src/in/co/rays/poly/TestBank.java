package in.co.rays.poly;

public class TestBank {

	public static void main(String[] args) {
		
		Bank[] banks = new Bank[2];
		
		banks [0]  = new Icicibank();
		banks [1] = new HdcBank();

		for (int i = 0; i < banks.length; i++){
				System.out.println( banks[i].getName()+"="+banks[i].getInterest());
		}
		
			
	}

		
	}
	
	

