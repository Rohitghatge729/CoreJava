package in.co.rays.basics;

public class Armstrong {
 public static void main(String[] args) {
//	 int number = 370;
//	 int sum = 0;
//	 int r;
//	 int n = number;
//	 while (n>0) {
//	 r=n%10;
//	 sum= sum+(r*r*r);
//	 n= n/10;
//	}
//	 if (sum == number) {
//		 System.out.print("Yes");
//	 }
//		 else {
//			 
//			System.out.println("No");
//		}
	
	 int n = 153;
	 int sum = 0;
	 int r;
	 int num=n;
	 	while (num>0) {
	 	
	 		r = num%10;	
	 		sum = sum+(r*r*r);
	 		num = num/10;}
	 	
	 if (sum == n) {
		 System.out.println("Yes it is an Armstrong number.");}
	 else {
		System.out.println("No it is not an Armstrong number");
	}
	}
 }
