package com.yang.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yang.bean.User;
import com.yang.dao.UserDao;
import com.yang.service.UserService;

/**
 * 服务实现
 * @author yzx96
 *
 */
@Service
public class UserServiceImpl implements UserService {
	/**
	 * 注入数据层接口
	 */
	@Autowired
	UserDao userDao;
	
	@Override
	public List<User> getAllUser() {
		return userDao.findAll();
	}

}
