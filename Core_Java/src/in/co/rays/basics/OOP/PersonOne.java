package in.co.rays.basics.OOP;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PersonOne {

	private String name = null;
	private int age = 0;
	private Date dob;
	private String address = null;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Date getDob() {
		return dob;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress() {
		return address;

	}

	
}
