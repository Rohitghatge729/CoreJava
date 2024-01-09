package in.co.rays.abstractinterface;

public class Mobile implements Ios, Android {

	public void Vediocalling() {
		System.out.println("Vedio Calling = " + "Is an Android Phone function");

	}

	public void playstore() {
		System.out.println("Play Store = " + "Is only available on Google");

	}

	public void Gmail() {
		System.out.println("Gmail = " + "Is a Google mailing service");

	}

	public void facetime() {
		System.out.println("Facetime = "+"Is an Apple Iphone function");

	}

	public void applestore() {
		System.out.println("Apple Store = "+"Is available only on Iphone");

	}

	public void imail() {
		System.out.println("Imail = "+"Is the mailing service of an Iphone");

	}

	public void messages() {
		System.out.print("Message function is available on all kinds of phones");

	}

}
