package com.yash.service;


import com.yash.model.Login;
import com.yash.model.User;

public interface UserService {
	
	public String registerUser(User user);
	public Login validateUser(String userName);
	
	

}
