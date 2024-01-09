package in.co.rays.basics;

import java.util.Arrays;

public class ParallelSorting {
	public static void main(String[] args) {

		int[] a = { 12, 11, 14, 7, 16, 21, 36, 1 };

		Arrays.parallelSort(a);
		for (int i : a) {
			System.out.println(i);
		}

	}
}
