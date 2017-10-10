package com.yang.service;

import java.util.List;

import com.yang.bean.User;

/**
 * 注册的服务接口
 * @author Yang
 *
 */
public interface UserService {
	public void register(User user);
	public List<User> getUsers();
}
