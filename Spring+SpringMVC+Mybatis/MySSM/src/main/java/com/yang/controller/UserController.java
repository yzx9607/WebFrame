package com.yang.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yang.bean.User;
import com.yang.service.UserService;

/**
 * 用户登录入口
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
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(User user){
		User users = userServcie.login(user);
		if(null==users){
			return "error";
		}else{
			return "success";
		}
	}
	@RequestMapping(value = "/getInfo", method = RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> getInfo(){
		Map<String,Object> map=new HashMap<String, Object>();
		map.put("name", "yang");
		map.put("age", 21);
		return map;
	}
}
