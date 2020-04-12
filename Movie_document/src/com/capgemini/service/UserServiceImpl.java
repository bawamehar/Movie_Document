package com.capgemini.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import com.capgemini.dao.UserDaoImpl;
import com.capgemini.dto.Customer;
import com.capgemini.dto.Ticket;

public class UserServiceImpl implements UserService {
	
	
	Customer customer;
	UserDaoImpl udl = new UserDaoImpl();
	
	@Override
	public Customer registerNewUser() {
		Scanner sc = new Scanner(System.in);
		Integer userId= 100000;
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
		
		Customer details = new Customer(userId, name, password, contact, dob, myTicket);
		
		customer =udl.registerNewUser(details);
		if(customer!=null)
			System.out.println("Customer details added");
		else
			System.out.println("Customer details not added");
		
		return customer;
	}

	@Override
	public Boolean signIn(String userId, String passWord) {
				return null;
	}

	@Override
	public Boolean signOut() {
	
		return null;
	}
	
}
