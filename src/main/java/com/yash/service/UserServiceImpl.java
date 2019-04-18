package com.yash.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import com.yash.dao.UserDAO;
import com.yash.dao.UserDAOImpl;
import com.yash.model.Login;
import com.yash.model.User;


@Service("userService")
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserDAOImpl userDao;
	
	@Override
	
	public String registerUser(User user) {
		String insertStatus=userDao.registerUser(user);
		return insertStatus;
		
	}
	
	public Login validateUser(String userName) {
		
		Login logincredentials=userDao.validateUser(userName);
		return logincredentials;
		
	}

}
