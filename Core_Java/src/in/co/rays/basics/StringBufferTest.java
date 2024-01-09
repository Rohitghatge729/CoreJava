package in.co.rays.basics;

public class StringBufferTest {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Vijay ");
		sb.append("Dinanath Chauhan");
		
//		System.out.println("Lenght -"+ sb.length());
//		System.out.println("Capacity -" + sb.capacity());
//		System.out.println("Char at: "+ sb.charAt(1));
//		System.out.println("Index of:"+ sb.lastIndexOf("Dinanath"));
//		System.out.println("Replace:"+ sb.replace(0,5,"Jay "));
		System.out.println("Reverse -" + sb.reverse());
		
	}
}
