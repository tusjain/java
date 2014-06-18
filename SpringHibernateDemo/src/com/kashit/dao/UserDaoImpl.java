package com.kashit.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kashit.domain.User;

@Repository("userDao")
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sessionfactory;

	@Override
	public void saveUser(User user) {
		sessionfactory.getCurrentSession().saveOrUpdate(user);
	}

	@Override
	public List<User> getUser() {
		@SuppressWarnings("unchecked")
		List<User> userlist = sessionfactory.getCurrentSession().createCriteria(User.class).list();
		return userlist;
	}

}
