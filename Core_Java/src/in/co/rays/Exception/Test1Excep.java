package in.co.rays.Exception;

public class Test1Excep {

	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		String s = null;
		
		try {
			System.out.println(s.length());
			int c = a/b;
			System.out.println(c);
			}
		catch (Exception e) {
			System.out.println(e);
			}
		try {
			int c = a/b;
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
	}
}
