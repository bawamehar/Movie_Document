package com.capgemini.service;

import com.capgemini.dto.Customer;

public interface UserService {
	public  Customer registerNewUser();
	public Boolean signIn(String userId,String passWord);
	public Boolean signOut();
}
