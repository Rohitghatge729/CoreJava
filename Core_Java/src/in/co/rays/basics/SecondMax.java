package in.co.rays.basics;

public class SecondMax {
	public static void main(String [] args) {
		int [] a = {2,3,4,5,6,7,8,9};
		int b = 0;
		int c = 0;
	for (int i = 0; i < a.length; i++) {
		if (a[i]>b)  {
			c = b;
			b = a[i];}
		if (a[i]> b && a[i]<c) {
		}
		}
		System.out.println(c);
	}
	}


