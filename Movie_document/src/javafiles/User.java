package javafiles;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class User {
	private Integer userId;
	private String password;
	private HashMap<Integer, String> registerAdmin =new HashMap<Integer, String>();
	private HashMap<Integer, String> registerCustomer =new HashMap<Integer, String>();
	
	public User() {
	}

	public User(Integer userId, String password) {
		super();
		this.userId = userId;
		this.password = password;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

	public Customer registerNewUser() {
		Scanner sc = new Scanner(System.in);
		userId= 100000;
		userId++;
		
		System.out.println("Enter your Name");
		String name= sc.next();
		
		System.out.println("Enter the password");
		String password = sc.next();
		while(password.length()<8) {
			System.out.println("enter 8 digit password");
			password = sc.next();
		}
		
		System.out.println("Enter date of birth in YYYY-MM-DD");
		String date = sc.next();
		LocalDate dob = LocalDate.parse(date);
		
		System.out.println("Enter the Contact Number");
		String contact= sc.next();
		while (contact.length() !=10) {
			System.out.println("Contact Number should be 10 digit");
			contact= sc.next();
		}
		
		ArrayList<Ticket> myTicket = new ArrayList<Ticket>();
		
		registerCustomer.put(userId, password);
		
		Customer details = new Customer(userId, name, password, dob, contact, myTicket);
		return details;
	}
	
	public boolean signIn(String userId, String password) {
		return false;
	}
	
	public boolean signOut() {
		return false;
	}
	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", password=" + password + "]";
	}
}	
