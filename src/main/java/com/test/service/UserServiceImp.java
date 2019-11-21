package com.test.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.*;
import com.test.entity.User;

@Service
public class UserServiceImp implements UserService{
	@Autowired
    private UserDao userDao;
	
	public User findByUsername(String username){
		User user = userDao.findByUsername(username);
		return user;
	}
	
}
