package com.kashit.service;

import java.util.List;

import com.kashit.domain.User;

public interface UserService {
	public void addUser(User user);

	public List<User> getUser();
}
