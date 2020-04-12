package com.capgemini.dao;

import java.util.ArrayList;
import java.util.HashMap;

import com.capgemini.dto.Customer;

public class UserDaoImpl implements UserDao {

	//private HashMap<Integer, String> registerAdmin =new HashMap<Integer, String>();
	private HashMap<Integer, Object> registerCustomer =new HashMap();
	//Customer customer;
	private ArrayList<Object> arr = new ArrayList<>();
	
	@Override
	public Customer registerNewUser(Customer details) {
		arr.add(details.getUserId());
		arr.add(details.getPassword());
		arr.add(details.getCustomerName());
		arr.add(details.getCustomerContact());
		arr.add(details.getDateOfBirth());
		registerCustomer.put(details.getUserId()  , arr);
		
		//registerCustomer.put(details.getUserId()  , details.getPasword);
		/* for(String key: registerCustomer.values()) {
			System.out.println(key);
		}
		registerCustomer.entrySet().forEach(entry->{
			    System.out.println(entry.getKey() + " " + entry.getValue());  
			 }); */
		
		return details;
	} 
	
	public Boolean signIn(Integer userId,String passWord) {
		
		System.out.println("check");
		boolean result =registerCustomer.containsKey(userId);
		if(result) {
			String pass = (String) arr.get(1);
			System.out.println(pass);
			if(pass==passWord)
				return true;
			else 
				return false;
		}
		return false;
	}

}
