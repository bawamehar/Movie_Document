package com.capgemini.dao;

import java.util.ArrayList;
import java.util.HashMap;

import com.capgemini.dto.Customer;

public class UserDaoImpl implements UserDao {

	//private HashMap<Integer, String> registerAdmin =new HashMap<Integer, String>();
	private HashMap<Integer, String> registerCustomer =new HashMap<Integer, String>();
	//Customer customer;
	private ArrayList<Object> arr = new ArrayList<>();
	
	@Override
	public Customer registerNewUser(Customer details) {
		arr.add(details.getUserId());
		arr.add(details.getPassword());
		arr.add(details.getCustomerName());
		arr.add(details.getCustomerContact());
		arr.add(details.getDateOfBirth());
		registerCustomer.put(details.getUserId()  , details.getPassword());
		for(String key: registerCustomer.values()) {
			System.out.println(key);
		}
		registerCustomer.entrySet().forEach(entry->{
			    System.out.println(entry.getKey() + " " + entry.getValue());  
			 });
		return details;
	}

}
