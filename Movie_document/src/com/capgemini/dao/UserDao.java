package com.capgemini.dao;

import com.capgemini.dto.Customer;

public interface UserDao {
	
	public  Customer registerNewUser(Customer details);
	
}
