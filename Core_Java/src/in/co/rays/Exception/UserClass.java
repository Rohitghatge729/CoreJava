package in.co.rays.Exception;

import javax.security.auth.login.LoginException;

public class UserClass {
	
	public static void main(String[] args) {
		
//		String s = "User1";
//		
//		if (s.equals("User")) {
//			System.out.println("Valid");
//		}
//		else {
//			try {
//				throw new LoginException();
//			} catch (Exception e) {
//				System.out.println("Invalid");
//			}
//			}
		String s = "Rohit Ghatge";
		
		if (s.contentEquals("Rohit GHatge")) {
			
		} else {
			try {
				throw new Exception();
			} catch (Exception e) {
				System.out.println("Invalid User");
			}

		}
	
	
	}
	}
