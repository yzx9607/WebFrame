package com.yang.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yang.bean.User;
import com.yang.dao.UserDao;
import com.yang.service.UserService;
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao userDao;
	@Override
	public User login(User user) {
		User users=userDao.login(user);
		return users;
	}

}
