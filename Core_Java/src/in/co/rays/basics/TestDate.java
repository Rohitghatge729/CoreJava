package in.co.rays.basics;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate {
	public static void main(String[] args) throws Exception {
	Date d = new Date();
		//System.out.print(d);
		
	//SimpleDateFormat qrs = new SimpleDateFormat(" dd/MM/yyyy ");
		//String s = qrs.format(d);
		//System.out.println("" +s);
		
	String ros = "08/12/2023";
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			d  = sdf.parse(ros);
		System.out.println(d);
		
	

	}
}
