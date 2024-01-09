package in.co.rays.basics;

import java.util.*;

public class ScannerClass {
	public static void main(String[] args) {
		// input
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.println(name);

		Scanner pc = new Scanner(System.in);
		int a = pc.nextInt();
		int b = pc.nextInt();
		int sum = a + b;
		System.out.println(sum);

		Scanner bc = new Scanner(System.in);
		int d = bc.nextInt();
		int e = bc.nextInt();
		int f = e * d;
		System.out.println(f);
	}
}
