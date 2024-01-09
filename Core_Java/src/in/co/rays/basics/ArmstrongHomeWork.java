package in.co.rays.basics;

public class ArmstrongHomeWork {
	public static void main(String[] args) {
		int number = 371;
		int sum = 0;
		int r;
		int n = number;
		
		while (n>0) {
			r=n%10;
			sum=sum+(r*r*r);
			n=n/10;	}
		if (sum==number) 
		{System.out.println("Yes");}
		else {System.out.println("No");}
		}
	}