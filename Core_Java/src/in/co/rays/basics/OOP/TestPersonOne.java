package in.co.rays.basics.OOP;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestPersonOne  {
	public static void main(String[] args) throws ParseException {
		
		PersonOne a = new PersonOne();
		a.setName("Ashwini");
		a.setAge(30);
		a.setDob(new SimpleDateFormat("dd/MM/yyyy").parse("12/11/9876") );
		a.setAddress("Pipaliana");
		System.out.println(a.getName());
		System.out.println(a.getAge());
		System.out.println(new SimpleDateFormat("dd/MM/yyyy").format(a.getDob()));
		
	}

}
