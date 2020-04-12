package com.capgemini.service;


import com.capgemini.dao.UserDaoImpl;
import com.capgemini.dto.Customer;
import com.capgemini.dto.Ticket;

public class UserServiceImpl implements UserService {
	
	
	Customer customer;
	UserDaoImpl udl = new UserDaoImpl();
	UserDaoImpl udi= new UserDaoImpl();
	
	@Override
	public Customer registerNewUser(Customer details) {
		
		customer=udl.registerNewUser(details);
		
		
		
		
		return customer;
	}

	@Override
	public Boolean signIn(Integer userId, String passWord) {
		boolean result = udi.signIn(userId, passWord);
				return result;
	}

	@Override
	public Boolean signOut() {
	
		return null;
	}
	
}
