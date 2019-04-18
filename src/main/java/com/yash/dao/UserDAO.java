package com.yash.dao;

import com.yash.model.Login;
import com.yash.model.User;

public interface UserDAO {
	
	
	public String registerUser(User user);
	
	public Login validateUser(String userName);

}
