package com.yang.controller;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yang.bean.User;
import com.yang.service.UserService;

/**
 * 用户注册入口
 * @author Yang
 *
 */
@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userServcie;
	/**用户登录方法
	 * @param user
	 * @return
	 */
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String register(User user){
		userServcie.register(user);
		return "success";
		
	}
	@ResponseBody
	@RequestMapping(value = "/getUserInfo", method = RequestMethod.GET)
	public Map<String,Object> register(){
		Map<String,Object> map=new HashMap<String, Object>();
		List<User> list=userServcie.getUsers();
		map.put("list", list);
		return map;
		
	}
}
