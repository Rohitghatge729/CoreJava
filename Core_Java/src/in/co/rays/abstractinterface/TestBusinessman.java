package in.co.rays.abstractinterface;

public class TestBusinessman {

	public static void main(String[] args) {
		
		Richman R = new Businessman();
		Socialworker S = new Businessman();
		
		R.earnmoney();
		R.donation();
		R.party();
		S.helptoother();
		S.socialservice();
	}
}
