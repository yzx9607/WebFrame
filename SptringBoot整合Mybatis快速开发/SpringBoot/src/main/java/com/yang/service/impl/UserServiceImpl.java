package com.yang.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yang.bean.User;
import com.yang.dao.UserDao;
import com.yang.service.IUserService;

/**
 * 服务实现
 * @author Yang
 *
 */
@Service
public class UserServiceImpl implements IUserService {
	@Autowired
	private UserDao userDao;
	@Override
	public int addUser(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<User> getUser(User user) {
		return userDao.getUser(user);
	}

}
