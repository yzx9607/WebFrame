package com.yang.service;

import java.util.List;

import com.yang.bean.User;

/**
 * 用户服务接口
 * @author Yang
 *
 */
public interface IUserService {
	/**
	 * 注册用户
	 * @param user
	 * @return
	 */
	int addUser(User user);
	
	/**
	 *模糊查询所有用户
	 * @param user
	 * @return
	 */
	List<User> getUser(User user);

}
