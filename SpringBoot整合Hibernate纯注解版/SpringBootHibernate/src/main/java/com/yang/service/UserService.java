package com.yang.service;

import java.util.List;

import com.yang.bean.User;

/**
 * 
 * @author yzx96
 *
 */
public interface UserService {
	/**
	 * 查询所有用户
	 * @return
	 */
	public List<User> getAllUser();
}
