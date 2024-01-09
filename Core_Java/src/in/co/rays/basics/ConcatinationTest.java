package in.co.rays.basics;

public class ConcatinationTest {
	
	public static void main(String[] args) {
		String a = "Roshni ";
		String b = "Sharma";
		System.out.println(a+b);
		String c = a.concat(b);
		System.out.println(c);
		String s= 20+2+"Rohit"+02+22;// After a string literal, all the + will be treated as string concatenation operator
				System.out.println(s);
		
		
	}
}
