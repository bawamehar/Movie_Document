package com.capgemini.service;

import com.capgemini.dto.Customer;

public interface UserService {
	public  Customer registerNewUser(Customer details);
	public Boolean signIn(Integer userId,String passWord);
	public Boolean signOut();
}
