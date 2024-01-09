package in.co.rays.IO;

import java.util.Scanner;

public class Calci {

	public static void main(String[] args) {
		
		String operator = null;
		double result = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter value of a = ");
		double a = sc.nextDouble();
		
		System.out.println("Enter value of b = ");
		double b = sc.nextDouble();
		
		System.out.println("operator = ");
		operator  = sc.next();
		
		switch (operator) {
		case "+":
			result = a+b;
			System.out.println(result);
			break;

		case "-":
			result = a-b;
			System.out.println(result);
			break;
			
		case "/":
			result = a/b;
			System.out.println(result);
			break;
			
		case "*":
			result = a*b;
			System.out.println(result);
			break;
		default:
			System.out.println("operator error");
			break;
		}
		
	}
}
