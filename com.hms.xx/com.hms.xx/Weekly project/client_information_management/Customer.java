package client_information_management;

import java.util.Scanner;

public class Customer {
	private String name;
	private String gender;
	private String age;
	private String phone;
	private String email;

	public Customer() {
		
	}

	public Customer(String name, String gender, String age, String phone, String email) {
		super();
		this.setName(name);
		this.setGender(gender);
		this.setAge(age);
		this.setPhone(phone);
		this.setEmail(email);
	}

	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public String getAge() {
		return age;
	}

	public String getPhone() {
		return phone;
	}

	public String getEmail() {
		return email;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setAge(String c) {
				this.age = c;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
