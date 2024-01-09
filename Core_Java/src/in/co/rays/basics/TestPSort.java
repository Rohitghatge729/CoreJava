package in.co.rays.basics;

import java.util.Arrays;

public class TestPSort {
	public static void main(String[] args) {
		int [] a = {12,23,43,54,34,21};
		Arrays.parallelSort(a);
		for (int i : a) {
			System.out.println(i);
			
		}
				
	}
}
