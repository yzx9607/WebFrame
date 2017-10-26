package com.yang.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yang.bean.User;
import com.yang.service.IUserService;

@RestController
public class Controller {
	@Autowired
	private IUserService userService;
	
	
    @RequestMapping("/helloworld")
    public String helloWorld() {
        return "helloworld";
    }
    @RequestMapping("/user")
    public List<User> getUsers() {
    	User user=new User();
    	user.setUserName("");
    	List<User> list= userService.getUser(user);
        return list;
    }
}
