package in.co.rays.basics;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarTest {
	
	public static void main(String[] args) throws Exception {
//		String s="25/12/2023";
//	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//	   
//		Date d = sdf.parse(s);
//	Calendar C = Calendar.getInstance();
//		 
//		C.setTime(d);
//		for (int i = 0; i < 12; i++) {
//		C.add(Calendar.DATE, 31);
//			 System.out.println(C.getTime());}
		String s = "25/12/2023";
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Date d = sdf.parse(s);
		Calendar C = Calendar.getInstance();
		
		C.setTime(d);
		for (int i = 0; i < 12; i++) {
			C.add(Calendar.DATE, 31);
			System.out.println(C.getTime());
			
		}
		
		
		
		}
}
