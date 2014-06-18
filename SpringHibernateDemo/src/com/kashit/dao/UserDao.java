package com.kashit.dao;

import java.util.List;

import com.kashit.domain.User;

public interface UserDao {
public void saveUser ( User user );
public List<User> getUser();
}
