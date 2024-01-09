package in.co.rays.basics;

public class Palindrome {
	public static void main(String[] args) {
	int num = 343;
	int r,s=0, n;
	n = num;
	
	while (num>0) {
		r=num%10;
		s=(s*10)+r;
		num=num/10;
	}
	if (n==s){
System.out.println("Palindrome number");	}
		else { 
			System.out.print("Not Palindrome");}
			
}
}
