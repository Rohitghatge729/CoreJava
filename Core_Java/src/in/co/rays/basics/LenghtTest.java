package in.co.rays.basics;

public class LenghtTest {
	public static void main(String[] args) {
		String name = "Vijay Dinanath Chauhan";
		System.out.println("String Lenght -" + name.length());
		System.out.println("7th Character is -"+ name.charAt(6));
		System.out.println("Dina index is -" + name.indexOf("Dina"));
		System.out.println("First i position -" + name.indexOf("i"));
		System.out.println("Last n position -" + name.lastIndexOf("n"));
		System.out.println("a is Replaced by b- "+ name.replace("a", "b"));
		System.out.println("Chhota vijay -"+ name.toLowerCase());
		System.out.println("bada vijay -"+ name.toUpperCase());
		System.out.println("Starts with vijay -"+ name.startsWith("Vijay"));
		System.out.println("name end with -" + name.endsWith("han"));
		System.out.println("substring -" + name.charAt(6));
	}
}
