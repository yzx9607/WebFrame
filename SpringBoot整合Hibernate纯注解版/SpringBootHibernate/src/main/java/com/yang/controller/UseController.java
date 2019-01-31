package com.yang.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.yang.bean.ResultObject;
import com.yang.bean.User;
import com.yang.service.UserService;
@RestController
@RequestMapping("/user")
public class UseController {
	
	@Autowired
    private UserService userService;

	
	@RequestMapping("/getAllUser")
	public ResultObject<List<User>> getAllUser(){
		List<User> list=userService.getAllUser();
		ResultObject<List<User>> rs=new ResultObject<List<User>>();
		rs.setCode(0);
		rs.setData(list);
		return rs;
	}
}
