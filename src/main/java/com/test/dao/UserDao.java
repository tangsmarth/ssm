package com.test.dao;

import com.test.entity.News;
import com.test.entity.User;

public interface UserDao {
    public abstract User findByUsername(String username);
}
