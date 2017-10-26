package com.yang.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.yang.bean.User;

/**
 * 用户登录数据层
 * @author Yang
 *
 */
@Mapper
public interface UserDao {
	/**
	 * 注册用户
	 * @param user
	 * @return
	 */
	int addUser(User user);
	
	/**
	 *模糊查询用户
	 * @param user
	 * @return
	 */
	List<User> getUser(User user);

	
}
