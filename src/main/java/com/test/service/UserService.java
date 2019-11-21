package com.test.service;

import com.test.entity.User;

public interface UserService {
	public User findByUsername(String username);
}
