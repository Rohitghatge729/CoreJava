package in.co.rays.Exception;

public class CallStackTest {
	
	public static void main(String[] args) throws Mistake {
		
		dad();
	}
		public static void dad() throws Mistake{
			mom();
		}
		
		public static void mom() throws Mistake{
			son();
		}
		
		public static void son()  throws Mistake{
			try {
				throw new Mistake();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
			
	}